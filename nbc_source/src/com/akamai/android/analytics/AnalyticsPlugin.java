// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.akamai.android.analytics.security.BinTools;
import com.akamai.android.analytics.security.PBKDF2Engine;
import com.akamai.android.analytics.security.PBKDF2Parameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.akamai.android.analytics:
//            CSMAKEYS, InternalCodes, PluginInfoHandler, PluginConfigInfo, 
//            Utils, VisitMetrics, PluginEvent, PluginCallBackSnapShot, 
//            PluginMetricsSnapShot, StateTimerInputPacketType, PluginCallBacks, EndReasonCodes, 
//            StateTimer, StateTimerOutputPacket, LineSender, StateTimerInputPacket, 
//            StateTimerOutputPacketType

public class AnalyticsPlugin
{
    public static interface PluginEventListener
    {

        public abstract void event(PluginEvent pluginevent, String s);
    }


    private static int $SWITCH_TABLE$com$akamai$android$analytics$CSMAKEYS[];
    private static boolean enableDebug = false;
    private static HashMap listOfActivePlugins = new HashMap();
    private static Object setDataStoreLock = new Object();
    private static HashMap setDataStoreStatic = new HashMap();
    private static Object staticFieldLock = new Object();
    private static String viewerIdByPlugin = null;
    private static VisitMetrics visitMetrics = null;
    private static Timer visitMetricsTimer = null;
    private static int visitTimeOut;
    PluginCallBackSnapShot _currentPluginCallBackSnapShot;
    PluginMetricsSnapShot _currentPluginMetricsSnapshot;
    float _strHead;
    private HashMap alreadySendList;
    private float averageFpsSum500ms;
    private ArrayList bandwidthInWindow;
    private long beaconTriggerTime;
    private Object bucket500msLock;
    private long bytesLoadedAtLast500ms;
    private PluginCallBacks callBacks;
    private String configXML;
    private long currentMaxBandwidth;
    private boolean ecLineSent;
    private PluginEventListener eventListener;
    private boolean firstTitleSent;
    private boolean hLineEnabled;
    private int heartBeatInterval;
    private boolean iLineSent;
    private boolean isLinesPendingForXML;
    private boolean isLoading;
    private boolean isPendingCELine;
    private boolean isPendingILine;
    private boolean isPendingSLine;
    private int isSessionWithRebufferLimit;
    private Context mContext;
    private int noHLinetoPLine;
    private int noHTimerFiring;
    int noOfFeedBackLinesSent;
    HashMap packetMetricsOfLastLine;
    private ArrayList packetsWaitingForXML;
    private PluginConfigInfo.ParserEventListener parserListener;
    private float playBackBitRateSum500ms;
    private PluginInfoHandler plugInfoHandler;
    private Object pluginLock;
    private boolean sLineSent;
    private String sessionId;
    private HashMap setDataStore;
    private StateTimer stateMachine;
    private StateTimer.StateTimerOutputListener stateMachineOutputListener;
    private volatile boolean stopPlugin;
    private Timer t500msTimer;
    private int total500msCount;
    private long totalBandwidthSum500ms;
    private boolean xmlLoadSuccess;

    static int[] $SWITCH_TABLE$com$akamai$android$analytics$CSMAKEYS()
    {
        int ai[] = $SWITCH_TABLE$com$akamai$android$analytics$CSMAKEYS;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[CSMAKEYS.values().length];
        try
        {
            ai[CSMAKEYS.adabandoncount.ordinal()] = 178;
        }
        catch (NoSuchFieldError nosuchfielderror181) { }
        try
        {
            ai[CSMAKEYS.adcount.ordinal()] = 139;
        }
        catch (NoSuchFieldError nosuchfielderror180) { }
        try
        {
            ai[CSMAKEYS.adplayclocktime.ordinal()] = 140;
        }
        catch (NoSuchFieldError nosuchfielderror179) { }
        try
        {
            ai[CSMAKEYS.adsession.ordinal()] = 138;
        }
        catch (NoSuchFieldError nosuchfielderror178) { }
        try
        {
            ai[CSMAKEYS.adstartcount.ordinal()] = 179;
        }
        catch (NoSuchFieldError nosuchfielderror177) { }
        try
        {
            ai[CSMAKEYS.adstartuptime.ordinal()] = 141;
        }
        catch (NoSuchFieldError nosuchfielderror176) { }
        try
        {
            ai[CSMAKEYS.appname.ordinal()] = 30;
        }
        catch (NoSuchFieldError nosuchfielderror175) { }
        try
        {
            ai[CSMAKEYS.asmsession.ordinal()] = 142;
        }
        catch (NoSuchFieldError nosuchfielderror174) { }
        try
        {
            ai[CSMAKEYS.attemptid.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror173) { }
        try
        {
            ai[CSMAKEYS.audiobandwidth.ordinal()] = 71;
        }
        catch (NoSuchFieldError nosuchfielderror172) { }
        try
        {
            ai[CSMAKEYS.audiobufferlength.ordinal()] = 74;
        }
        catch (NoSuchFieldError nosuchfielderror171) { }
        try
        {
            ai[CSMAKEYS.availablebandwidth.ordinal()] = 100;
        }
        catch (NoSuchFieldError nosuchfielderror170) { }
        try
        {
            ai[CSMAKEYS.averagedbitrate.ordinal()] = 131;
        }
        catch (NoSuchFieldError nosuchfielderror169) { }
        try
        {
            ai[CSMAKEYS.averagefps.ordinal()] = 84;
        }
        catch (NoSuchFieldError nosuchfielderror168) { }
        try
        {
            ai[CSMAKEYS.averagefpspercent.ordinal()] = 95;
        }
        catch (NoSuchFieldError nosuchfielderror167) { }
        try
        {
            ai[CSMAKEYS.backgroundtime.ordinal()] = 136;
        }
        catch (NoSuchFieldError nosuchfielderror166) { }
        try
        {
            ai[CSMAKEYS.bandwidthpercent.ordinal()] = 93;
        }
        catch (NoSuchFieldError nosuchfielderror165) { }
        try
        {
            ai[CSMAKEYS.beaconid.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror164) { }
        try
        {
            ai[CSMAKEYS.beaconversion.ordinal()] = 57;
        }
        catch (NoSuchFieldError nosuchfielderror163) { }
        try
        {
            ai[CSMAKEYS.bitratebuckettimes.ordinal()] = 130;
        }
        catch (NoSuchFieldError nosuchfielderror162) { }
        try
        {
            ai[CSMAKEYS.bitratebytesloaded.ordinal()] = 133;
        }
        catch (NoSuchFieldError nosuchfielderror161) { }
        try
        {
            ai[CSMAKEYS.bitratedroppedframes.ordinal()] = 134;
        }
        catch (NoSuchFieldError nosuchfielderror160) { }
        try
        {
            ai[CSMAKEYS.bitrateinterval.ordinal()] = 132;
        }
        catch (NoSuchFieldError nosuchfielderror159) { }
        try
        {
            ai[CSMAKEYS.bitraterebuffercount.ordinal()] = 135;
        }
        catch (NoSuchFieldError nosuchfielderror158) { }
        try
        {
            ai[CSMAKEYS.browser.ordinal()] = 51;
        }
        catch (NoSuchFieldError nosuchfielderror157) { }
        try
        {
            ai[CSMAKEYS.browsersessionid.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror156) { }
        try
        {
            ai[CSMAKEYS.browsersize.ordinal()] = 52;
        }
        catch (NoSuchFieldError nosuchfielderror155) { }
        try
        {
            ai[CSMAKEYS.bucketbackwardseeks.ordinal()] = 115;
        }
        catch (NoSuchFieldError nosuchfielderror154) { }
        try
        {
            ai[CSMAKEYS.bucketcount.ordinal()] = 109;
        }
        catch (NoSuchFieldError nosuchfielderror153) { }
        try
        {
            ai[CSMAKEYS.bucketforwardseeks.ordinal()] = 114;
        }
        catch (NoSuchFieldError nosuchfielderror152) { }
        try
        {
            ai[CSMAKEYS.bucketfullscreentimes.ordinal()] = 121;
        }
        catch (NoSuchFieldError nosuchfielderror151) { }
        try
        {
            ai[CSMAKEYS.bucketlength.ordinal()] = 58;
        }
        catch (NoSuchFieldError nosuchfielderror150) { }
        try
        {
            ai[CSMAKEYS.bucketpausecounts.ordinal()] = 111;
        }
        catch (NoSuchFieldError nosuchfielderror149) { }
        try
        {
            ai[CSMAKEYS.bucketpausetimes.ordinal()] = 112;
        }
        catch (NoSuchFieldError nosuchfielderror148) { }
        try
        {
            ai[CSMAKEYS.bucketplays.ordinal()] = 110;
        }
        catch (NoSuchFieldError nosuchfielderror147) { }
        try
        {
            ai[CSMAKEYS.bucketrebuffercounts.ordinal()] = 116;
        }
        catch (NoSuchFieldError nosuchfielderror146) { }
        try
        {
            ai[CSMAKEYS.bucketrebuffertimes.ordinal()] = 117;
        }
        catch (NoSuchFieldError nosuchfielderror145) { }
        try
        {
            ai[CSMAKEYS.bucketresumebuffercounts.ordinal()] = 118;
        }
        catch (NoSuchFieldError nosuchfielderror144) { }
        try
        {
            ai[CSMAKEYS.bucketresumebuffertimes.ordinal()] = 119;
        }
        catch (NoSuchFieldError nosuchfielderror143) { }
        try
        {
            ai[CSMAKEYS.bucketseeks.ordinal()] = 113;
        }
        catch (NoSuchFieldError nosuchfielderror142) { }
        try
        {
            ai[CSMAKEYS.bucketseektimes.ordinal()] = 120;
        }
        catch (NoSuchFieldError nosuchfielderror141) { }
        try
        {
            ai[CSMAKEYS.bufferingtime.ordinal()] = 46;
        }
        catch (NoSuchFieldError nosuchfielderror140) { }
        try
        {
            ai[CSMAKEYS.bufferlength.ordinal()] = 94;
        }
        catch (NoSuchFieldError nosuchfielderror139) { }
        try
        {
            ai[CSMAKEYS.buffertime.ordinal()] = 103;
        }
        catch (NoSuchFieldError nosuchfielderror138) { }
        try
        {
            ai[CSMAKEYS.bytesloaded.ordinal()] = 85;
        }
        catch (NoSuchFieldError nosuchfielderror137) { }
        try
        {
            ai[CSMAKEYS.bytesplayed.ordinal()] = 99;
        }
        catch (NoSuchFieldError nosuchfielderror136) { }
        try
        {
            ai[CSMAKEYS.bytestotal.ordinal()] = 49;
        }
        catch (NoSuchFieldError nosuchfielderror135) { }
        try
        {
            ai[CSMAKEYS.category.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror134) { }
        try
        {
            ai[CSMAKEYS.cdn.ordinal()] = 61;
        }
        catch (NoSuchFieldError nosuchfielderror133) { }
        try
        {
            ai[CSMAKEYS.clientdns.ordinal()] = 68;
        }
        catch (NoSuchFieldError nosuchfielderror132) { }
        try
        {
            ai[CSMAKEYS.clientid.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror131) { }
        try
        {
            ai[CSMAKEYS.connectivity.ordinal()] = 62;
        }
        catch (NoSuchFieldError nosuchfielderror130) { }
        try
        {
            ai[CSMAKEYS.connecttime.ordinal()] = 45;
        }
        catch (NoSuchFieldError nosuchfielderror129) { }
        try
        {
            ai[CSMAKEYS.contentlength.ordinal()] = 24;
        }
        catch (NoSuchFieldError nosuchfielderror128) { }
        try
        {
            ai[CSMAKEYS.contenttype.ordinal()] = 23;
        }
        catch (NoSuchFieldError nosuchfielderror127) { }
        try
        {
            ai[CSMAKEYS.currentclocktime.ordinal()] = 79;
        }
        catch (NoSuchFieldError nosuchfielderror126) { }
        try
        {
            ai[CSMAKEYS.currentstreamtime.ordinal()] = 78;
        }
        catch (NoSuchFieldError nosuchfielderror125) { }
        try
        {
            ai[CSMAKEYS.databandwidth.ordinal()] = 73;
        }
        catch (NoSuchFieldError nosuchfielderror124) { }
        try
        {
            ai[CSMAKEYS.databufferlength.ordinal()] = 76;
        }
        catch (NoSuchFieldError nosuchfielderror123) { }
        try
        {
            ai[CSMAKEYS.deliverytype.ordinal()] = 55;
        }
        catch (NoSuchFieldError nosuchfielderror122) { }
        try
        {
            ai[CSMAKEYS.device.ordinal()] = 25;
        }
        catch (NoSuchFieldError nosuchfielderror121) { }
        try
        {
            ai[CSMAKEYS.downswitchreasoncounts.ordinal()] = 127;
        }
        catch (NoSuchFieldError nosuchfielderror120) { }
        try
        {
            ai[CSMAKEYS.droppedframes.ordinal()] = 77;
        }
        catch (NoSuchFieldError nosuchfielderror119) { }
        try
        {
            ai[CSMAKEYS.encodedbitrate.ordinal()] = 102;
        }
        catch (NoSuchFieldError nosuchfielderror118) { }
        try
        {
            ai[CSMAKEYS.encodedfps.ordinal()] = 50;
        }
        catch (NoSuchFieldError nosuchfielderror117) { }
        try
        {
            ai[CSMAKEYS.endofstream.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror116) { }
        try
        {
            ai[CSMAKEYS.endreasoncode.ordinal()] = 144;
        }
        catch (NoSuchFieldError nosuchfielderror115) { }
        try
        {
            ai[CSMAKEYS.epochtime.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror114) { }
        try
        {
            ai[CSMAKEYS.errorcode.ordinal()] = 26;
        }
        catch (NoSuchFieldError nosuchfielderror113) { }
        try
        {
            ai[CSMAKEYS.eventcode.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror112) { }
        try
        {
            ai[CSMAKEYS.eventname.ordinal()] = 32;
        }
        catch (NoSuchFieldError nosuchfielderror111) { }
        try
        {
            ai[CSMAKEYS.format.ordinal()] = 44;
        }
        catch (NoSuchFieldError nosuchfielderror110) { }
        try
        {
            ai[CSMAKEYS.formatversion.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror109) { }
        try
        {
            ai[CSMAKEYS.fullos.ordinal()] = 181;
        }
        catch (NoSuchFieldError nosuchfielderror108) { }
        try
        {
            ai[CSMAKEYS.fullscreenclocktime.ordinal()] = 101;
        }
        catch (NoSuchFieldError nosuchfielderror107) { }
        try
        {
            ai[CSMAKEYS.heartbeatinterval.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror106) { }
        try
        {
            ai[CSMAKEYS.hostname.ordinal()] = 29;
        }
        catch (NoSuchFieldError nosuchfielderror105) { }
        try
        {
            ai[CSMAKEYS.isallowcache.ordinal()] = 65;
        }
        catch (NoSuchFieldError nosuchfielderror104) { }
        try
        {
            ai[CSMAKEYS.isasmenabled.ordinal()] = 143;
        }
        catch (NoSuchFieldError nosuchfielderror103) { }
        try
        {
            ai[CSMAKEYS.isfirsttitle.ordinal()] = 182;
        }
        catch (NoSuchFieldError nosuchfielderror102) { }
        try
        {
            ai[CSMAKEYS.ismediaencrypted.ordinal()] = 64;
        }
        catch (NoSuchFieldError nosuchfielderror101) { }
        try
        {
            ai[CSMAKEYS.issessionwithrebuffer.ordinal()] = 105;
        }
        catch (NoSuchFieldError nosuchfielderror100) { }
        try
        {
            ai[CSMAKEYS.issessionwithrebufferh.ordinal()] = 168;
        }
        catch (NoSuchFieldError nosuchfielderror99) { }
        try
        {
            ai[CSMAKEYS.issessionwithrebufferlimit.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror98) { }
        try
        {
            ai[CSMAKEYS.isview.ordinal()] = 104;
        }
        catch (NoSuchFieldError nosuchfielderror97) { }
        try
        {
            ai[CSMAKEYS.isvisitend.ordinal()] = 152;
        }
        catch (NoSuchFieldError nosuchfielderror96) { }
        try
        {
            ai[CSMAKEYS.isvisitstart.ordinal()] = 151;
        }
        catch (NoSuchFieldError nosuchfielderror95) { }
        try
        {
            ai[CSMAKEYS.lasthtime.ordinal()] = 165;
        }
        catch (NoSuchFieldError nosuchfielderror94) { }
        try
        {
            ai[CSMAKEYS.livedelay.ordinal()] = 107;
        }
        catch (NoSuchFieldError nosuchfielderror93) { }
        try
        {
            ai[CSMAKEYS.loginterval.ordinal()] = 106;
        }
        catch (NoSuchFieldError nosuchfielderror92) { }
        try
        {
            ai[CSMAKEYS.logtype.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror91) { }
        try
        {
            ai[CSMAKEYS.logversion.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror90) { }
        try
        {
            ai[CSMAKEYS.maxbandwidth.ordinal()] = 170;
        }
        catch (NoSuchFieldError nosuchfielderror89) { }
        try
        {
            ai[CSMAKEYS.maxpersistentbitrate.ordinal()] = 149;
        }
        catch (NoSuchFieldError nosuchfielderror88) { }
        try
        {
            ai[CSMAKEYS.os.ordinal()] = 43;
        }
        catch (NoSuchFieldError nosuchfielderror87) { }
        try
        {
            ai[CSMAKEYS.outlierstartuptime.ordinal()] = 66;
        }
        catch (NoSuchFieldError nosuchfielderror86) { }
        try
        {
            ai[CSMAKEYS.pagehost.ordinal()] = 38;
        }
        catch (NoSuchFieldError nosuchfielderror85) { }
        try
        {
            ai[CSMAKEYS.pagereferrer.ordinal()] = 37;
        }
        catch (NoSuchFieldError nosuchfielderror84) { }
        try
        {
            ai[CSMAKEYS.pagereferrerhost.ordinal()] = 39;
        }
        catch (NoSuchFieldError nosuchfielderror83) { }
        try
        {
            ai[CSMAKEYS.pageurl.ordinal()] = 36;
        }
        catch (NoSuchFieldError nosuchfielderror82) { }
        try
        {
            ai[CSMAKEYS.partnumber.ordinal()] = 27;
        }
        catch (NoSuchFieldError nosuchfielderror81) { }
        try
        {
            ai[CSMAKEYS.pausecount.ordinal()] = 86;
        }
        catch (NoSuchFieldError nosuchfielderror80) { }
        try
        {
            ai[CSMAKEYS.pauseduration.ordinal()] = 87;
        }
        catch (NoSuchFieldError nosuchfielderror79) { }
        try
        {
            ai[CSMAKEYS.pauseintervalsasstring.ordinal()] = 88;
        }
        catch (NoSuchFieldError nosuchfielderror78) { }
        try
        {
            ai[CSMAKEYS.pauseseeksession.ordinal()] = 92;
        }
        catch (NoSuchFieldError nosuchfielderror77) { }
        try
        {
            ai[CSMAKEYS.playbackbitrate.ordinal()] = 70;
        }
        catch (NoSuchFieldError nosuchfielderror76) { }
        try
        {
            ai[CSMAKEYS.playclocktime.ordinal()] = 80;
        }
        catch (NoSuchFieldError nosuchfielderror75) { }
        try
        {
            ai[CSMAKEYS.playerformat.ordinal()] = 60;
        }
        catch (NoSuchFieldError nosuchfielderror74) { }
        try
        {
            ai[CSMAKEYS.playerid.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror73) { }
        try
        {
            ai[CSMAKEYS.playerreferrer.ordinal()] = 35;
        }
        catch (NoSuchFieldError nosuchfielderror72) { }
        try
        {
            ai[CSMAKEYS.playerstate.ordinal()] = 69;
        }
        catch (NoSuchFieldError nosuchfielderror71) { }
        try
        {
            ai[CSMAKEYS.playertype.ordinal()] = 42;
        }
        catch (NoSuchFieldError nosuchfielderror70) { }
        try
        {
            ai[CSMAKEYS.playerversion.ordinal()] = 41;
        }
        catch (NoSuchFieldError nosuchfielderror69) { }
        try
        {
            ai[CSMAKEYS.playstreamtime.ordinal()] = 81;
        }
        catch (NoSuchFieldError nosuchfielderror68) { }
        try
        {
            ai[CSMAKEYS.pluginversion.ordinal()] = 56;
        }
        catch (NoSuchFieldError nosuchfielderror67) { }
        try
        {
            ai[CSMAKEYS.port.ordinal()] = 33;
        }
        catch (NoSuchFieldError nosuchfielderror66) { }
        try
        {
            ai[CSMAKEYS.protocol.ordinal()] = 34;
        }
        catch (NoSuchFieldError nosuchfielderror65) { }
        try
        {
            ai[CSMAKEYS.qualityofexperience.ordinal()] = 173;
        }
        catch (NoSuchFieldError nosuchfielderror64) { }
        try
        {
            ai[CSMAKEYS.rebuffercount.ordinal()] = 82;
        }
        catch (NoSuchFieldError nosuchfielderror63) { }
        try
        {
            ai[CSMAKEYS.rebuffersession.ordinal()] = 137;
        }
        catch (NoSuchFieldError nosuchfielderror62) { }
        try
        {
            ai[CSMAKEYS.rebuffersessionh.ordinal()] = 167;
        }
        catch (NoSuchFieldError nosuchfielderror61) { }
        try
        {
            ai[CSMAKEYS.rebuffertime.ordinal()] = 83;
        }
        catch (NoSuchFieldError nosuchfielderror60) { }
        try
        {
            ai[CSMAKEYS.resumebuffercount.ordinal()] = 97;
        }
        catch (NoSuchFieldError nosuchfielderror59) { }
        try
        {
            ai[CSMAKEYS.resumebuffertime.ordinal()] = 98;
        }
        catch (NoSuchFieldError nosuchfielderror58) { }
        try
        {
            ai[CSMAKEYS.rtt.ordinal()] = 108;
        }
        catch (NoSuchFieldError nosuchfielderror57) { }
        try
        {
            ai[CSMAKEYS.seekcount.ordinal()] = 89;
        }
        catch (NoSuchFieldError nosuchfielderror56) { }
        try
        {
            ai[CSMAKEYS.seekintervalsasstring.ordinal()] = 91;
        }
        catch (NoSuchFieldError nosuchfielderror55) { }
        try
        {
            ai[CSMAKEYS.seektime.ordinal()] = 90;
        }
        catch (NoSuchFieldError nosuchfielderror54) { }
        try
        {
            ai[CSMAKEYS.segmentlength.ordinal()] = 63;
        }
        catch (NoSuchFieldError nosuchfielderror53) { }
        try
        {
            ai[CSMAKEYS.sequenceid.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror52) { }
        try
        {
            ai[CSMAKEYS.sequenceidh.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror51) { }
        try
        {
            ai[CSMAKEYS.serverip.ordinal()] = 59;
        }
        catch (NoSuchFieldError nosuchfielderror50) { }
        try
        {
            ai[CSMAKEYS.sessionid.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror49) { }
        try
        {
            ai[CSMAKEYS.show.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror48) { }
        try
        {
            ai[CSMAKEYS.socialsharing.ordinal()] = 180;
        }
        catch (NoSuchFieldError nosuchfielderror47) { }
        try
        {
            ai[CSMAKEYS.startuptime.ordinal()] = 47;
        }
        catch (NoSuchFieldError nosuchfielderror46) { }
        try
        {
            ai[CSMAKEYS.startupwaittime.ordinal()] = 67;
        }
        catch (NoSuchFieldError nosuchfielderror45) { }
        try
        {
            ai[CSMAKEYS.streamlength.ordinal()] = 48;
        }
        catch (NoSuchFieldError nosuchfielderror44) { }
        try
        {
            ai[CSMAKEYS.streamname.ordinal()] = 31;
        }
        catch (NoSuchFieldError nosuchfielderror43) { }
        try
        {
            ai[CSMAKEYS.streamurl.ordinal()] = 54;
        }
        catch (NoSuchFieldError nosuchfielderror42) { }
        try
        {
            ai[CSMAKEYS.subcategory.ordinal()] = 22;
        }
        catch (NoSuchFieldError nosuchfielderror41) { }
        try
        {
            ai[CSMAKEYS.title.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror40) { }
        try
        {
            ai[CSMAKEYS.totaladabandoncount.ordinal()] = 175;
        }
        catch (NoSuchFieldError nosuchfielderror39) { }
        try
        {
            ai[CSMAKEYS.totaladplayclocktime.ordinal()] = 150;
        }
        catch (NoSuchFieldError nosuchfielderror38) { }
        try
        {
            ai[CSMAKEYS.totaladstartcount.ordinal()] = 174;
        }
        catch (NoSuchFieldError nosuchfielderror37) { }
        try
        {
            ai[CSMAKEYS.totalbandwidth.ordinal()] = 96;
        }
        catch (NoSuchFieldError nosuchfielderror36) { }
        try
        {
            ai[CSMAKEYS.totalparts.ordinal()] = 28;
        }
        catch (NoSuchFieldError nosuchfielderror35) { }
        try
        {
            ai[CSMAKEYS.totalplayclocktime.ordinal()] = 145;
        }
        catch (NoSuchFieldError nosuchfielderror34) { }
        try
        {
            ai[CSMAKEYS.totalplaystreamtime.ordinal()] = 146;
        }
        catch (NoSuchFieldError nosuchfielderror33) { }
        try
        {
            ai[CSMAKEYS.totalrebuffercount.ordinal()] = 147;
        }
        catch (NoSuchFieldError nosuchfielderror32) { }
        try
        {
            ai[CSMAKEYS.totalrebuffertime.ordinal()] = 148;
        }
        catch (NoSuchFieldError nosuchfielderror31) { }
        try
        {
            ai[CSMAKEYS.transitioncount.ordinal()] = 122;
        }
        catch (NoSuchFieldError nosuchfielderror30) { }
        try
        {
            ai[CSMAKEYS.transitiondownswitchcount.ordinal()] = 124;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            ai[CSMAKEYS.transitionstreamtimes.ordinal()] = 129;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            ai[CSMAKEYS.transitionstreamtimesession.ordinal()] = 128;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        try
        {
            ai[CSMAKEYS.transitiontime.ordinal()] = 125;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            ai[CSMAKEYS.transitionupswitchcount.ordinal()] = 123;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            ai[CSMAKEYS.upswitchreasoncounts.ordinal()] = 126;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            ai[CSMAKEYS.useragent.ordinal()] = 40;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            ai[CSMAKEYS.videobandwidth.ordinal()] = 72;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            ai[CSMAKEYS.videobufferlength.ordinal()] = 75;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            ai[CSMAKEYS.videosize.ordinal()] = 53;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            ai[CSMAKEYS.viewerdiagnosticsid.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            ai[CSMAKEYS.viewerid.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            ai[CSMAKEYS.visitadabandoncount.ordinal()] = 177;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            ai[CSMAKEYS.visitadplayclocktime.ordinal()] = 164;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            ai[CSMAKEYS.visitadstartcount.ordinal()] = 176;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            ai[CSMAKEYS.visitattempts.ordinal()] = 153;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            ai[CSMAKEYS.visiterrors.ordinal()] = 156;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[CSMAKEYS.visitid.ordinal()] = 166;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[CSMAKEYS.visitinterval.ordinal()] = 157;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[CSMAKEYS.visitmaxpersistentbitratebucket.ordinal()] = 162;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[CSMAKEYS.visitplayclocktime.ordinal()] = 158;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[CSMAKEYS.visitplays.ordinal()] = 154;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[CSMAKEYS.visitplaystreamtime.ordinal()] = 159;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[CSMAKEYS.visitrebuffercount.ordinal()] = 160;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[CSMAKEYS.visitrebuffertime.ordinal()] = 161;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[CSMAKEYS.visitstartuperrors.ordinal()] = 163;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[CSMAKEYS.visituniquetitles.ordinal()] = 169;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[CSMAKEYS.visitviews.ordinal()] = 155;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[CSMAKEYS.xviewerid.ordinal()] = 171;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[CSMAKEYS.xvieweridversion.ordinal()] = 172;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$akamai$android$analytics$CSMAKEYS = ai;
        return ai;
    }

    public AnalyticsPlugin(Context context, PluginEventListener plugineventlistener, String s)
    {
        noHTimerFiring = -1;
        hLineEnabled = false;
        noHLinetoPLine = 1;
        heartBeatInterval = 0;
        beaconTriggerTime = 0L;
        sessionId = null;
        isSessionWithRebufferLimit = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
        noOfFeedBackLinesSent = 0;
        total500msCount = 0;
        playBackBitRateSum500ms = 0.0F;
        totalBandwidthSum500ms = 0L;
        bytesLoadedAtLast500ms = 0L;
        averageFpsSum500ms = 0.0F;
        bandwidthInWindow = null;
        currentMaxBandwidth = 0L;
        _strHead = 0.0F;
        stopPlugin = false;
        initWithContextListenerConfig(context, plugineventlistener, s);
        plugInfoHandler = new PluginInfoHandler(configXML, parserListener);
    }

    public AnalyticsPlugin(Context context, String s)
    {
        this(context, null, s);
    }

    private static void applyAttributes(PluginConfigInfo pluginconfiginfo, HashMap hashmap, String s, HashMap hashmap1)
    {
        if (pluginconfiginfo.statInfo == null || !pluginconfiginfo.statInfo.containsKey(s)) goto _L2; else goto _L1
_L1:
        pluginconfiginfo = (PluginConfigInfo.PluginStatistics)pluginconfiginfo.statInfo.get(s);
_L15:
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        Iterator iterator = ((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesWithAttrib.keySet().iterator();
_L7:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s = ((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesWithAttrib.keySet().iterator();
_L12:
        if (!s.hasNext())
        {
            return;
        }
          goto _L5
_L4:
        Object obj1;
        Object obj2;
        obj2 = (String)iterator.next();
        obj1 = ((String) (obj2)).toLowerCase();
        if (!hashmap.containsKey(obj1)) goto _L7; else goto _L6
_L6:
        obj2 = (PluginConfigInfo.DataKeyAttrib)((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesWithAttrib.get(obj2);
        if (((PluginConfigInfo.DataKeyAttrib) (obj2)).doLog)
        {
            if (hashmap1 == null)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            Object obj;
            String s1;
            boolean flag;
            try
            {
                if (!hashmap1.containsKey(s))
                {
                    break MISSING_BLOCK_LABEL_185;
                }
                flag = ((HashSet)hashmap1.get(s)).contains(obj1);
            }
            // Misplaced declaration of an exception variable
            catch (PluginConfigInfo pluginconfiginfo)
            {
                return;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_185;
            }
        }
        try
        {
            ((HashSet)hashmap1.get(s)).add(obj1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
          goto _L7
        if (((PluginConfigInfo.DataKeyAttrib) (obj2)).fallback != null && hashmap.containsKey(((PluginConfigInfo.DataKeyAttrib) (obj2)).fallback.toLowerCase()))
        {
            hashmap.put(obj1, (String)hashmap.get(((PluginConfigInfo.DataKeyAttrib) (obj2)).fallback.toLowerCase()));
        }
        if (((PluginConfigInfo.DataKeyAttrib) (obj2)).value != null)
        {
            hashmap.put(obj1, ((PluginConfigInfo.DataKeyAttrib) (obj2)).value);
        }
        if (((PluginConfigInfo.DataKeyAttrib) (obj2)).size <= 0) goto _L7; else goto _L8
_L8:
        s1 = (String)hashmap.get(obj1);
        if (s1 == null) goto _L7; else goto _L9
_L9:
        if (s1.length() <= ((PluginConfigInfo.DataKeyAttrib) (obj2)).size) goto _L7; else goto _L10
_L10:
        hashmap.put(obj1, s1.substring(0, ((PluginConfigInfo.DataKeyAttrib) (obj2)).size));
          goto _L7
_L5:
        obj = (String)s.next();
        hashmap1 = ((String) (obj)).toLowerCase();
        if (!hashmap.containsKey(hashmap1)) goto _L12; else goto _L11
_L11:
        obj = (PluginConfigInfo.DataKeyAttrib)((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesWithAttrib.get(obj);
        if (((PluginConfigInfo.DataKeyAttrib) (obj)).regExpJVPattern == null) goto _L12; else goto _L13
_L13:
        obj1 = ((PluginConfigInfo.DataKeyAttrib) (obj)).regExpJVReplace;
        if (obj1 != null)
        {
            try
            {
                obj1 = (String)hashmap.get(hashmap1);
                hashmap.put(hashmap1, Pattern.compile(((PluginConfigInfo.DataKeyAttrib) (obj)).regExpJVPattern).matcher(((CharSequence) (obj1))).replaceAll(((PluginConfigInfo.DataKeyAttrib) (obj)).regExpJVReplace));
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap1) { }
        }
          goto _L12
        return;
_L2:
        pluginconfiginfo = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    private static void applyMatchRules(PluginConfigInfo pluginconfiginfo, HashMap hashmap, String s)
    {
        if (pluginconfiginfo.statInfo == null || !pluginconfiginfo.statInfo.containsKey(s)) goto _L2; else goto _L1
_L1:
        pluginconfiginfo = (PluginConfigInfo.PluginStatistics)pluginconfiginfo.statInfo.get(s);
_L9:
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        s = ((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesMatchRule.keySet().iterator();
_L3:
        if (!s.hasNext())
        {
            return;
        }
        String s1;
        Object obj;
        PluginConfigInfo.MatchRules matchrules;
        String s2;
        try
        {
label0:
            {
                obj = (String)s.next();
                s1 = ((String) (obj)).toLowerCase();
                if (hashmap.containsKey(s1))
                {
                    if (!s1.equalsIgnoreCase(CSMAKEYS.bitratebuckettimes.toString()))
                    {
                        break label0;
                    }
                    hashmap.put(s1, Utils.getBitRateBucketInfo((ArrayList)((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesMatchRule.get(obj), hashmap));
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (PluginConfigInfo pluginconfiginfo)
        {
            return;
        }
          goto _L3
        obj = ((ArrayList)((PluginConfigInfo.PluginStatistics) (pluginconfiginfo)).namesMatchRule.get(obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L3; else goto _L4
_L4:
        matchrules = (PluginConfigInfo.MatchRules)((Iterator) (obj)).next();
        if (!matchrules.type.equalsIgnoreCase("pattern")) goto _L6; else goto _L5
_L5:
        s2 = matchrules.name.toLowerCase();
        if (!hashmap.containsKey(s2) || !matchRulesPattern((String)hashmap.get(s2), matchrules.value)) goto _L6; else goto _L7
_L7:
        hashmap.put(s1, matchrules.key);
          goto _L3
        return;
_L2:
        pluginconfiginfo = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void clearAnyActiveSessions()
    {
        int i = 10;
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = listOfActivePlugins.keySet().iterator();
_L6:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (i <= 0) goto _L4; else goto _L3
_L3:
        Exception exception1;
        boolean flag;
        try
        {
            flag = isThereAnyActivePlugin();
        }
        catch (Exception exception)
        {
            return;
        }
        if (flag) goto _L5; else goto _L4
_L4:
        return;
_L2:
        ((AnalyticsPlugin)iterator.next()).handleSessionApplicationClose();
          goto _L6
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
_L5:
        obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        exception1 = listOfActivePlugins.keySet().iterator();
_L7:
        if (exception1.hasNext())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i--;
        try
        {
            Thread.sleep(500L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L1
        AnalyticsPlugin analyticsplugin = (AnalyticsPlugin)exception1.next();
        if (((Boolean)listOfActivePlugins.get(analyticsplugin)).booleanValue())
        {
            analyticsplugin.handleSessionApplicationClose();
        }
          goto _L7
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
          goto _L6
    }

    private static void createVisitMetrics(Context context)
    {
        if (visitMetrics != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        visitMetrics = new VisitMetrics();
        synchronized (visitMetrics.visitLock)
        {
            visitMetrics.visitId = Utils.generateUniqueId(context, true);
            setDataAllSessions(CSMAKEYS.visitid.toString(), visitMetrics.visitId);
            setDataAllSessions(CSMAKEYS.browsersessionid.toString(), visitMetrics.visitId);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
    }

    private void debug(String s)
    {
        dispatchEventByListener(PluginEvent.DEBUG, (new StringBuilder(String.valueOf(s))).append("\n").toString());
    }

    private void debugException(Exception exception)
    {
        debug(getExceptionMessage(exception));
    }

    public static void dispatchEvent(PluginEvent pluginevent, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            if (pluginevent == PluginEvent.LOGLINE)
            {
                Log.v(InternalCodes.logLineTAG, s);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (PluginEvent pluginevent)
        {
            return;
        }
        if (pluginevent != PluginEvent.DEBUG || !enableDebug) goto _L1; else goto _L3
_L3:
        Log.d(InternalCodes.debugTAG, s);
        return;
    }

    private void dispatchEventByListener(PluginEvent pluginevent, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (pluginevent != PluginEvent.LOGLINE) goto _L4; else goto _L3
_L3:
        Log.v(InternalCodes.logLineTAG, s);
_L6:
        if (eventListener != null)
        {
            eventListener.event(pluginevent, s);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            if (pluginevent == PluginEvent.DEBUG && enableDebug)
            {
                Log.d(InternalCodes.debugTAG, s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (PluginEvent pluginevent)
        {
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void doItEvery500ms()
    {
        handle500msMetrics();
        if (!sLineSent && !isPendingSLine || ecLineSent || System.currentTimeMillis() <= beaconTriggerTime) goto _L2; else goto _L1
_L1:
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            hPLineLogIntervalHandler();
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public static void enableDebug()
    {
        enableDebug = true;
    }

    private static String formSendableLine(PluginConfigInfo pluginconfiginfo, HashMap hashmap, String s, HashMap hashmap1, HashMap hashmap2, HashMap hashmap3)
    {
        PluginConfigInfo.PluginStatistics pluginstatistics;
        ArrayList arraylist;
        String s5;
        String s6;
        HashMap hashmap4;
        Iterator iterator;
        boolean flag;
        String s1;
        Object obj1;
        if (pluginconfiginfo.statInfo != null && pluginconfiginfo.statInfo.containsKey(s))
        {
            pluginstatistics = (PluginConfigInfo.PluginStatistics)pluginconfiginfo.statInfo.get(s);
        } else
        {
            pluginstatistics = null;
        }
        if (pluginstatistics != null)
        {
            arraylist = pluginstatistics.keysList;
        } else
        {
            arraylist = null;
        }
        s1 = "";
        obj1 = s1;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        flag = pluginconfiginfo.statUseKey;
        s5 = pluginconfiginfo.logTo.urlParamSeparator;
        s6 = pluginconfiginfo.logTo.encodedParamSeparator;
        hashmap4 = pluginconfiginfo.keyNamePairs;
        arraylist = (ArrayList)arraylist.clone();
        if (hashmap3 == null) goto _L4; else goto _L3
_L3:
        hashmap3 = hashmap3.keySet().iterator();
_L6:
        if (hashmap3.hasNext()) goto _L5; else goto _L4
_L4:
        iterator = arraylist.iterator();
        hashmap3 = s1;
_L7:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        obj1 = hashmap3;
_L2:
        return ((String) (obj1));
_L5:
        String s3 = (String)hashmap3.next();
        if (s3.startsWith("_cd_"))
        {
            arraylist.add(s3);
        }
          goto _L6
        String s4 = (String)iterator.next();
        String s2;
        Object obj;
        String s7;
        String s8;
        if (hashmap4.containsKey(s4.toLowerCase()))
        {
            s2 = (String)pluginconfiginfo.keyNamePairs.get(s4);
        } else
        {
            s2 = s4.toLowerCase();
        }
        s7 = s2.toLowerCase();
        if (flag)
        {
            obj = s4;
        } else
        {
            obj = s2;
        }
        s8 = (String)hashmap.get(s7);
        if (s8 != null && !hashmap2.containsKey(s4) && (!hashmap1.containsKey(s) || !((HashSet)hashmap1.get(s)).contains(s7)) && !s8.equalsIgnoreCase("-") && !s8.equalsIgnoreCase(""))
        {
            s8 = s8.replace(s5, s6);
            hashmap3 = (new StringBuilder(String.valueOf(hashmap3))).append(((String) (obj))).append("=").append(Uri.encode(s8)).append(s5).toString();
            obj = (PluginConfigInfo.DataKeyAttrib)pluginstatistics.namesWithAttrib.get(s7);
            if (obj != null && ((PluginConfigInfo.DataKeyAttrib) (obj)).sendOnce && hashmap1 != null)
            {
                if (!hashmap1.containsKey(s))
                {
                    hashmap1.put(s, new HashSet());
                }
                ((HashSet)hashmap1.get(s)).add(s7);
            }
            hashmap2.put(s4, "1");
            hashmap.remove(s2.toLowerCase());
        }
          goto _L7
    }

    private String getData(String s)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (setDataStore == null || !setDataStore.containsKey(s.toLowerCase()))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        s = (String)setDataStore.get(s.toLowerCase());
        return s;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return "-";
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String getDataAllSessions(String s)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (!setDataStoreStatic.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s = (String)setDataStoreStatic.get(s);
        return s;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return "-";
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String getExceptionMessage(Exception exception)
    {
        if (exception != null)
        {
            return (new StringBuilder("Cause:")).append(exception.getCause()).append(":Message:").append(exception.getLocalizedMessage()).append(":Exception:").append(exception.toString()).toString();
        } else
        {
            return "";
        }
    }

    private static boolean getSetDataMetrics(HashMap hashmap, HashMap hashmap1)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (hashmap != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        Iterator iterator = hashmap.keySet().iterator();
_L2:
        boolean flag = iterator.hasNext();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        String s = (String)iterator.next();
        int i;
        CSMAKEYS csmakeys = CSMAKEYS.valueOf(s.toLowerCase());
        i = $SWITCH_TABLE$com$akamai$android$analytics$CSMAKEYS()[csmakeys.ordinal()];
        i;
        JVM INSTR lookupswitch 19: default 236
    //                   4: 236
    //                   18: 236
    //                   19: 236
    //                   20: 236
    //                   21: 236
    //                   22: 236
    //                   23: 236
    //                   24: 236
    //                   25: 236
    //                   32: 236
    //                   36: 236
    //                   37: 236
    //                   55: 236
    //                   61: 236
    //                   80: 24
    //                   82: 24
    //                   83: 24
    //                   137: 24
    //                   171: 236;
           goto _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L2 _L2 _L2 _L2 _L1
_L1:
        hashmap1.put(s.toLowerCase(), (String)hashmap.get(s));
          goto _L2
        hashmap;
        obj;
        JVM INSTR monitorexit ;
        return false;
        hashmap;
        obj;
        JVM INSTR monitorexit ;
        throw hashmap;
        Exception exception;
        exception;
          goto _L1
    }

    private PluginCallBackSnapShot givePluginCallBackSnapShot()
    {
        return new PluginCallBackSnapShot(callBacks);
    }

    private PluginMetricsSnapShot givePluginMetricsSnapShot()
    {
        PluginMetricsSnapShot pluginmetricssnapshot;
        synchronized (bucket500msLock)
        {
            pluginmetricssnapshot = new PluginMetricsSnapShot(total500msCount, playBackBitRateSum500ms, totalBandwidthSum500ms, averageFpsSum500ms, currentMaxBandwidth, heartBeatInterval, isSessionWithRebufferLimit);
        }
        return pluginmetricssnapshot;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void hPLineLogIntervalHandler()
    {
        Long long1 = Long.valueOf(System.currentTimeMillis());
        PluginConfigInfo pluginconfiginfo;
        if (plugInfoHandler != null)
        {
            pluginconfiginfo = plugInfoHandler.plugInfo;
        } else
        {
            pluginconfiginfo = null;
        }
        while (isLoading || pluginconfiginfo == null || pluginconfiginfo.statInfo == null || long1.longValue() < beaconTriggerTime) 
        {
            return;
        }
        if (noHTimerFiring == -1)
        {
            beaconTriggerTime = long1.longValue() + (long)(pluginconfiginfo.logTo.secondLogTime * 1000);
        } else
        if (noHTimerFiring == 0)
        {
            initiateBeacon(StateTimerInputPacketType.GIVEMEAPLAYBEACONRESET);
            long l = long1.longValue();
            int i;
            if (hLineEnabled)
            {
                i = pluginconfiginfo.logTo.heartBeatInterval;
            } else
            {
                i = pluginconfiginfo.logTo.logInterval;
            }
            beaconTriggerTime = (long)((i - pluginconfiginfo.logTo.secondLogTime) * 1000) + l;
        } else
        {
            if (hLineEnabled)
            {
                initiateBeacon(StateTimerInputPacketType.GIVEMEAHEARTBEATBEACON);
            }
            if (noHTimerFiring % noHLinetoPLine == 0)
            {
                initiateBeacon(StateTimerInputPacketType.GIVEMEAPLAYBEACONRESET);
            }
            long l1 = long1.longValue();
            int j;
            if (hLineEnabled)
            {
                j = pluginconfiginfo.logTo.heartBeatInterval;
            } else
            {
                j = pluginconfiginfo.logTo.logInterval;
            }
            beaconTriggerTime = (long)(j * 1000) + l1;
        }
        noHTimerFiring = noHTimerFiring + 1;
    }

    private void handle500msMetrics()
    {
        Object obj = bucket500msLock;
        obj;
        JVM INSTR monitorenter ;
        if (callBacks == null) goto _L2; else goto _L1
_L1:
        total500msCount = total500msCount + 1;
        Object obj1;
        int i;
        long l;
        long l1;
        long l2;
        try
        {
            playBackBitRateSum500ms = playBackBitRateSum500ms + callBacks.playBackRate();
        }
        catch (Exception exception) { }
        l1 = 0L;
        l = callBacks.bytesLoaded();
        l1 = l;
_L7:
        totalBandwidthSum500ms = totalBandwidthSum500ms + (l1 - bytesLoadedAtLast500ms);
        l = ((l1 - bytesLoadedAtLast500ms) * 1000L) / 500L;
        bandwidthInWindow.add(new Long(l));
        l = 0L;
        i = 0;
_L5:
        if (i < bandwidthInWindow.size()) goto _L4; else goto _L3
_L3:
        l2 = l;
        try
        {
            if (bandwidthInWindow.size() > 10)
            {
                l2 = l - ((Long)bandwidthInWindow.get(0)).longValue();
                bandwidthInWindow.remove(0);
            }
            l = l2 / (long)bandwidthInWindow.size();
            if (currentMaxBandwidth < l)
            {
                currentMaxBandwidth = l;
            }
            if (bandwidthInWindow.size() < 10)
            {
                currentMaxBandwidth = l;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        bytesLoadedAtLast500ms = l1;
        try
        {
            averageFpsSum500ms = averageFpsSum500ms + callBacks.getFps();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        l2 = ((Long)bandwidthInWindow.get(i)).longValue();
        l += l2;
        i++;
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void handleApplicationClose()
    {
        toggleVLineTimer(false, visitTimeOut);
        toggleVLineTimer(true, 0);
    }

    private void handleFeedBackSetData(String s, String s1)
    {
        synchronized (setDataStoreLock)
        {
            setDataStore.put(Utils.stripPrefix(s, (new StringBuilder(String.valueOf(InternalCodes.SETDATA_FEEDBACK_PFX))).append(":").toString()).toLowerCase(), s1.trim());
            pushStateMachinePacket(StateTimerInputPacketType.SETDATAFEEDBACK, null);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void handlePluginConstantSetData()
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (viewerIdByPlugin == null)
        {
            viewerIdByPlugin = Utils.generateUniqueId(mContext, false);
        }
        setDataAllSessionsIfNot(CSMAKEYS.viewerid.toString(), viewerIdByPlugin);
        setDataAllSessionsIfNot(CSMAKEYS.clientid.toString(), viewerIdByPlugin);
        setDataAllSessionsIfNot(CSMAKEYS.playertype.toString(), "Android");
        setDataAllSessionsIfNot(CSMAKEYS.pluginversion.toString(), InternalCodes.pluginVersion);
        String s = Build.DISPLAY;
        s = (new StringBuilder("Android-")).append(android.os.Build.VERSION.RELEASE).toString();
        setDataAllSessionsIfNot(CSMAKEYS.os.toString(), "Android");
        setDataAllSessionsIfNot(CSMAKEYS.fullos.toString(), (new StringBuilder(String.valueOf(System.getProperty("os.name")))).append("-").append(s).toString());
        createVisitMetrics(mContext);
        setDataAllSessionsIfNot(CSMAKEYS.device.toString(), Uri.encode(Build.MODEL));
_L1:
        return;
        Object obj1;
        obj1;
        debugException(((Exception) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    private void handlePluginSessionSetData()
    {
        int i = 1;
        Object obj1 = setDataStoreLock;
        obj1;
        JVM INSTR monitorenter ;
        updateViewerDiagnosticsId();
        String s1;
        if (plugInfoHandler == null || plugInfoHandler.plugInfo == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        setDataAllSessions(CSMAKEYS.beaconid.toString(), plugInfoHandler.plugInfo.beaconId);
        setDataAllSessions(CSMAKEYS.beaconversion.toString(), plugInfoHandler.plugInfo.beaconVersion);
        if (plugInfoHandler.plugInfo.logTo == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        s1 = CSMAKEYS.logtype.toString();
        String s;
        if (plugInfoHandler.plugInfo.logTo.logType)
        {
            s = "R";
        } else
        {
            s = "C";
        }
        setDataAllSessions(s1, s);
        setDataAllSessions(CSMAKEYS.logversion.toString(), plugInfoHandler.plugInfo.logTo.logVersion);
        setDataAllSessions(CSMAKEYS.formatversion.toString(), plugInfoHandler.plugInfo.logTo.formatVersion);
        setDataIfNot(CSMAKEYS.sessionid.toString(), Utils.generateUniqueId(mContext, true));
        s = CSMAKEYS.isfirsttitle.toString();
        if (firstTitleSent)
        {
            i = 0;
        }
        setData(s, Integer.toString(i));
        setData(CSMAKEYS.attemptid.toString(), (String)setDataStore.get(CSMAKEYS.sessionid.toString()));
        setDataAllSessionsIfNot(CSMAKEYS.connectivity.toString(), Utils.connectivityType(mContext));
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        debugException(((Exception) (obj)));
          goto _L1
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private void handleSessionApplicationClose()
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = pluginLock;
        obj1;
        JVM INSTR monitorenter ;
        if (!listOfActivePlugins.containsKey(this) || !((Boolean)listOfActivePlugins.get(this)).booleanValue())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        handlePlayEnd(EndReasonCodes.Application_Close.toString());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        stopPlugin("Application Close has been called");
          goto _L1
        Exception exception2;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void handleSocialSharingSetData(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            i = 1;
        }
        hashmap.put(Utils.stripPrefix(s, (new StringBuilder(String.valueOf(InternalCodes.SETDATA_SOCIAL_SHARE_PFX))).append(":").toString()), Integer.valueOf(i));
        try
        {
            pushStateMachinePacket(StateTimerInputPacketType.SETDATAFEEDBACK, hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static String httpRequestPrefix(PluginConfigInfo pluginconfiginfo)
    {
        pluginconfiginfo = pluginconfiginfo.logTo;
        return (new StringBuilder(String.valueOf(((PluginConfigInfo.PlugLogTo) (pluginconfiginfo)).host))).append(((PluginConfigInfo.PlugLogTo) (pluginconfiginfo)).path).append("?").toString();
    }

    private void initListeners()
    {
        parserListener = new PluginConfigInfo.ParserEventListener() {

            final AnalyticsPlugin this$0;

            public void event(InternalCodes.PARSER_EVENT parser_event, String s)
            {
                interpretXMLParserEvent(parser_event, s);
            }

            
            {
                this$0 = AnalyticsPlugin.this;
                super();
            }
        };
        stateMachineOutputListener = new StateTimer.StateTimerOutputListener() {

            boolean enable;
            final AnalyticsPlugin this$0;

            public void disable()
            {
                Object obj = AnalyticsPlugin.staticFieldLock;
                obj;
                JVM INSTR monitorenter ;
                synchronized (pluginLock)
                {
                    enable = false;
                }
                obj;
                JVM INSTR monitorexit ;
                return;
                exception1;
                obj1;
                JVM INSTR monitorexit ;
                throw exception1;
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void event(StateTimerOutputPacket statetimeroutputpacket)
            {
                Object obj = AnalyticsPlugin.staticFieldLock;
                obj;
                JVM INSTR monitorenter ;
                synchronized (pluginLock)
                {
                    if (enable)
                    {
                        break MISSING_BLOCK_LABEL_28;
                    }
                }
                obj;
                JVM INSTR monitorexit ;
                return;
                managePacketInfo(statetimeroutputpacket);
                if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.DEBUG) goto _L2; else goto _L1
_L1:
                debug((String)statetimeroutputpacket.auxInfo);
_L3:
                obj1;
                JVM INSTR monitorexit ;
                obj;
                JVM INSTR monitorexit ;
                return;
                statetimeroutputpacket;
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    throw statetimeroutputpacket;
                }
                // Misplaced declaration of an exception variable
                catch (StateTimerOutputPacket statetimeroutputpacket)
                {
                    return;
                }
_L2:
                if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDINITLINE)
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                sendOutIline(statetimeroutputpacket);
                  goto _L3
                statetimeroutputpacket;
                obj1;
                JVM INSTR monitorexit ;
                throw statetimeroutputpacket;
label0:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDFIRSTPLAYLINE)
                    {
                        break label0;
                    }
                    sendOutSline(statetimeroutputpacket);
                }
                  goto _L3
label1:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDPLAYLINE)
                    {
                        break label1;
                    }
                    sendOutPline(statetimeroutputpacket);
                }
                  goto _L3
label2:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDHEARTBEATLINE)
                    {
                        break label2;
                    }
                    sendOutHline(statetimeroutputpacket);
                }
                  goto _L3
label3:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDSTOPLINE)
                    {
                        break label3;
                    }
                    sendOutCEline(statetimeroutputpacket);
                }
                  goto _L3
label4:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDERRORLINE)
                    {
                        break label4;
                    }
                    sendOutCEline(statetimeroutputpacket);
                }
                  goto _L3
label5:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.WAITINGFORPOSTROLL)
                    {
                        break label5;
                    }
                    waitingForPostRoll(statetimeroutputpacket);
                }
                  goto _L3
label6:
                {
                    if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDFEEDBACKLINE)
                    {
                        break label6;
                    }
                    sendOutFline(statetimeroutputpacket);
                }
                  goto _L3
                if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.INTERNALERROR) goto _L5; else goto _L4
_L4:
                stopPlugin("State Timer Internal Error");
                  goto _L3
_L5:
                if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.TITLE_SWITCHED) goto _L3; else goto _L6
_L6:
                updateStateOnTitleSwitch((HashMap)statetimeroutputpacket.auxInfo);
                  goto _L3
            }

            
            {
                this$0 = AnalyticsPlugin.this;
                super();
                enable = true;
            }
        };
    }

    private void initStateTimer()
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            createVisitMetrics(mContext);
            if (stateMachine == null)
            {
                stateMachine = new StateTimer(stateMachineOutputListener, visitMetrics);
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void initWithContextListenerConfig(Context context, PluginEventListener plugineventlistener, String s)
    {
        if (pluginLock == null)
        {
            pluginLock = new Object();
        }
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            configXML = s;
            setContext(context);
            setPluginEventListener(plugineventlistener);
            pluginInitialize();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj1;
        JVM INSTR monitorexit ;
        throw context;
        context;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private void initiateBeacon(StateTimerInputPacketType statetimerinputpackettype)
    {
        pushStateMachinePacket(statetimerinputpackettype);
        if (statetimerinputpackettype == StateTimerInputPacketType.GIVEMEAPLAYBEACONRESET)
        {
            reset500msBucket();
        }
    }

    private void interpretXMLParserEvent(InternalCodes.PARSER_EVENT parser_event, String s)
    {
        boolean flag;
        flag = false;
        debug((new StringBuilder("Parser has thrown an event :")).append(parser_event.toString()).append(":Message:").append(s).toString());
        if (parser_event == InternalCodes.PARSER_EVENT.DEBUG)
        {
            debug(s);
            return;
        }
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = pluginLock;
        obj1;
        JVM INSTR monitorenter ;
        isLoading = false;
        if (parser_event == InternalCodes.PARSER_EVENT.XML_LOADED)
        {
            flag = true;
        }
        xmlLoadSuccess = flag;
        obj1;
        JVM INSTR monitorexit ;
        if (parser_event != InternalCodes.PARSER_EVENT.XML_LOADED)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (plugInfoHandler.plugInfo != null && plugInfoHandler.plugInfo.isDebug)
        {
            enableDebug();
        }
        dispatchEventByListener(PluginEvent.DEBUG, printXMLDeviceDebug(0));
        pluginReadyToSendLines();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        parser_event;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw parser_event;
        }
        // Misplaced declaration of an exception variable
        catch (InternalCodes.PARSER_EVENT parser_event)
        {
            return;
        }
        parser_event;
        obj1;
        JVM INSTR monitorexit ;
        throw parser_event;
        dispatchEventByListener(PluginEvent.ERROR, (new StringBuilder(String.valueOf(parser_event.toString()))).append(s).toString());
        stopPlugin((new StringBuilder("PARSER_ERROR:")).append(parser_event.toString()).append(s).toString());
          goto _L1
    }

    private static boolean isThereAnyActivePlugin()
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = listOfActivePlugins.keySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        AnalyticsPlugin analyticsplugin = (AnalyticsPlugin)iterator.next();
        if (!((Boolean)listOfActivePlugins.get(analyticsplugin)).booleanValue()) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception) { }
        return false;
    }

    private void managePacketInfo(StateTimerOutputPacket statetimeroutputpacket)
    {
        float f;
        _currentPluginCallBackSnapShot = statetimeroutputpacket.pluginCallBack;
        _currentPluginMetricsSnapshot = statetimeroutputpacket.pluginMetrics;
        if (_currentPluginCallBackSnapShot == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        f = _currentPluginCallBackSnapShot.streamHeadPosition;
_L1:
        _strHead = f;
        return;
        f = 0.0F;
          goto _L1
        statetimeroutputpacket;
    }

    private static boolean matchRulesPattern(String s, String s1)
    {
        s1 = new StringTokenizer(s1, ",");
_L2:
        if (!s1.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        int i;
        String s2 = s1.nextToken().trim().toLowerCase();
        i = s.toLowerCase().indexOf(s2);
        if (i != -1)
        {
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
        s;
        return false;
    }

    private void pluginInitialize()
    {
        listOfActivePlugins.put(this, Boolean.valueOf(false));
        resetVariablesForIndSession();
        handlePluginConstantSetData();
    }

    private void pluginReadyToSendLines()
    {
        PluginConfigInfo pluginconfiginfo;
        handlePluginSessionSetData();
        if (plugInfoHandler == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        pluginconfiginfo = plugInfoHandler.plugInfo;
_L1:
        if (pluginconfiginfo != null)
        {
            try
            {
                if (pluginconfiginfo.statInfo != null && pluginconfiginfo.statInfo.containsKey("heartbeat") && pluginconfiginfo.logTo != null)
                {
                    hLineEnabled = true;
                    noHLinetoPLine = (int)Math.ceil((float)pluginconfiginfo.logTo.logInterval / (float)pluginconfiginfo.logTo.heartBeatInterval);
                    heartBeatInterval = plugInfoHandler.plugInfo.logTo.heartBeatInterval * 1000;
                    visitTimeOut = pluginconfiginfo.logTo.visitTimeOut;
                }
            }
            catch (Exception exception)
            {
                return;
            }
        }
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (pluginconfiginfo.logTo != null)
        {
            isSessionWithRebufferLimit = pluginconfiginfo.logTo.isSessionWithRebufferLimit;
        }
        if (isLinesPendingForXML)
        {
            sendOutPendingLines();
        }
        return;
        pluginconfiginfo = null;
          goto _L1
    }

    private static void prepareAndSendLines(PluginConfigInfo pluginconfiginfo, HashMap hashmap, HashMap hashmap1, String s, String s1, HashMap hashmap2)
    {
        if (pluginconfiginfo == null || pluginconfiginfo.logTo == null || hashmap1 == null || s == null && s1 == null)
        {
            return;
        } else
        {
            Vector vector = new Vector();
            updateWithXMLInfo(pluginconfiginfo, hashmap1, s);
            updateWithXMLInfo(pluginconfiginfo, hashmap1, s1);
            getSetDataMetrics(setDataStoreStatic, hashmap1);
            getSetDataMetrics(hashmap, hashmap1);
            applyAttributes(pluginconfiginfo, hashmap1, s, hashmap2);
            applyAttributes(pluginconfiginfo, hashmap1, s1, hashmap2);
            applyMatchRules(pluginconfiginfo, hashmap1, s);
            applyMatchRules(pluginconfiginfo, hashmap1, s1);
            HashMap hashmap3 = new HashMap();
            vector.add((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(httpRequestPrefix(pluginconfiginfo)))).append(formSendableLine(pluginconfiginfo, hashmap1, s, hashmap2, hashmap3, setDataStoreStatic)).toString()))).append(formSendableLine(pluginconfiginfo, hashmap1, s1, hashmap2, hashmap3, hashmap)).toString());
            new LineSender(vector);
            return;
        }
    }

    private static void prepareAndSendMergedLines(PluginConfigInfo pluginconfiginfo, HashMap hashmap, HashMap hashmap1, String s, String s1, String s2, HashMap hashmap2)
    {
        if (pluginconfiginfo == null || pluginconfiginfo.logTo == null || hashmap1 == null || s == null && s1 == null && s2 == null)
        {
            return;
        } else
        {
            Vector vector = new Vector();
            updateWithXMLInfo(pluginconfiginfo, hashmap1, s);
            updateWithXMLInfo(pluginconfiginfo, hashmap1, s1);
            updateWithXMLInfo(pluginconfiginfo, hashmap1, s2);
            getSetDataMetrics(setDataStoreStatic, hashmap1);
            getSetDataMetrics(hashmap, hashmap1);
            applyAttributes(pluginconfiginfo, hashmap1, s, hashmap2);
            applyAttributes(pluginconfiginfo, hashmap1, s1, hashmap2);
            applyAttributes(pluginconfiginfo, hashmap1, s2, hashmap2);
            applyMatchRules(pluginconfiginfo, hashmap1, s);
            applyMatchRules(pluginconfiginfo, hashmap1, s1);
            applyMatchRules(pluginconfiginfo, hashmap1, s2);
            HashMap hashmap3 = new HashMap();
            vector.add((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(httpRequestPrefix(pluginconfiginfo)))).append(formSendableLine(pluginconfiginfo, hashmap1, s, hashmap2, hashmap3, setDataStoreStatic)).toString()))).append(formSendableLine(pluginconfiginfo, hashmap1, s2, hashmap2, hashmap3, hashmap)).toString()))).append(formSendableLine(pluginconfiginfo, hashmap1, s1, hashmap2, hashmap3, hashmap)).toString());
            new LineSender(vector);
            return;
        }
    }

    private String printXMLDeviceDebug(int i)
    {
        Object obj;
        PluginConfigInfo pluginconfiginfo;
        obj = null;
        pluginconfiginfo = obj;
        if (plugInfoHandler == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        pluginconfiginfo = obj;
        if (plugInfoHandler.plugInfo != null)
        {
            pluginconfiginfo = plugInfoHandler.plugInfo;
        }
        Object obj3 = mContext.getApplicationContext();
        Object obj2;
        obj2 = "";
        Object obj1 = obj2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        TelephonyManager telephonymanager;
        try
        {
            telephonymanager = (TelephonyManager)((Context) (obj3)).getSystemService("phone");
        }
        catch (Exception exception)
        {
            return null;
        }
        obj1 = obj2;
        if (telephonymanager == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("DeviceId:").append(telephonymanager.getDeviceId()).toString()))).append("SimNo:").append(telephonymanager.getSimSerialNumber()).toString()))).append("AndroidID:").append(android.provider.Settings.Secure.getString(mContext.getContentResolver(), "android_id")).toString();
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("Build Board:").append(Build.BOARD).toString()))).append("DISPLAY:").append(Build.DISPLAY).toString()))).append("ID:").append(Build.ID).toString()))).append("MODEL:").append(Build.MODEL).toString()))).append("TAGS:").append(Build.TAGS).toString()))).append("USER:").append(Build.USER).toString()))).append("Device:").append(Build.DEVICE).toString();
        obj2 = (new StringBuilder(String.valueOf(""))).append(((String) (obj1))).append("\n").toString();
        obj1 = obj2;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_861;
        }
        obj1 = obj2;
        telephonymanager = (TelephonyManager)((Context) (obj3)).getSystemService("phone");
        obj1 = obj2;
        if (telephonymanager == null)
        {
            break MISSING_BLOCK_LABEL_861;
        }
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("DeviceId:").append(telephonymanager.getDeviceId()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("Device soft vers:").append(telephonymanager.getDeviceSoftwareVersion()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("netwrk country iso:").append(telephonymanager.getNetworkCountryIso()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("netwrk oper:").append(telephonymanager.getNetworkOperator()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("netwk oper name:").append(telephonymanager.getNetworkOperatorName()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("sim country iso:").append(telephonymanager.getSimCountryIso()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("sim operator:").append(telephonymanager.getSimOperator()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("sim opera name:").append(telephonymanager.getSimOperatorName()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("subscrib id:").append(telephonymanager.getSubscriberId()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("netwk type:").append(telephonymanager.getNetworkType()).append("\n").toString();
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("phone type:").append(telephonymanager.getPhoneType()).append("\n").toString();
        obj1 = obj2;
        obj3 = (WifiManager)((Context) (obj3)).getSystemService("wifi");
        obj1 = obj2;
        obj2 = (new StringBuilder(String.valueOf(obj2))).append("dhcp info:").append(((WifiManager) (obj3)).getDhcpInfo()).append("\n").toString();
        obj1 = obj2;
_L4:
        obj2 = obj1;
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_1346;
        }
        obj2 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("Debug:").append(pluginconfiginfo.isDebug).append("\n").toString()))).append("Exception:").append(pluginconfiginfo.isException).append("\n").toString()))).append("log Window:").append(pluginconfiginfo.isLogWindow).append("\n").toString()))).append("Beacon Id:").append(pluginconfiginfo.beaconId).append("\n").toString()))).append("Beacon Version:").append(pluginconfiginfo.beaconVersion).append("\n").toString()))).append("isActive:").append(pluginconfiginfo.isActive).append("\n").toString()))).append("Session ID:").append(sessionId).append("\n").toString()))).append("Client Id:").append(viewerIdByPlugin).append("\n").toString();
        obj1 = obj2;
        if (pluginconfiginfo.logTo == null)
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        obj1 = obj2;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        obj1 = (new StringBuilder(String.valueOf(obj2))).append(pluginconfiginfo.logTo.debug()).append("\n").toString();
        obj1 = (new StringBuilder(String.valueOf(obj1))).append("UseKey:").append(pluginconfiginfo.statUseKey).append("\n").toString();
        obj2 = obj1;
        if (pluginconfiginfo.statInfo == null)
        {
            break MISSING_BLOCK_LABEL_1346;
        }
        obj2 = obj1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_1346;
        }
        obj2 = pluginconfiginfo.statInfo.keySet().iterator();
_L2:
        if (!((Iterator) (obj2)).hasNext())
        {
            return ((String) (obj1));
        }
        obj3 = (String)((Iterator) (obj2)).next();
        obj1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(obj1))).append("metricName:").append(((String) (obj3))).append("\n").toString()))).append(((PluginConfigInfo.PluginStatistics)pluginconfiginfo.statInfo.get(obj3)).debug()).append("\n").toString();
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        return ((String) (obj2));
    }

    private void pushStateMachinePacket(StateTimerInputPacketType statetimerinputpackettype)
    {
        pushStateMachinePacket(statetimerinputpackettype, givePluginCallBackSnapShot(), givePluginMetricsSnapShot(), null);
    }

    private void pushStateMachinePacket(StateTimerInputPacketType statetimerinputpackettype, float f)
    {
        PluginCallBackSnapShot plugincallbacksnapshot = givePluginCallBackSnapShot();
        plugincallbacksnapshot.streamHeadPosition = f;
        pushStateMachinePacket(statetimerinputpackettype, plugincallbacksnapshot, givePluginMetricsSnapShot(), null);
    }

    private void pushStateMachinePacket(StateTimerInputPacketType statetimerinputpackettype, PluginCallBackSnapShot plugincallbacksnapshot, PluginMetricsSnapShot pluginmetricssnapshot, Object obj)
    {
        try
        {
            if (stateMachine != null && !stopPlugin)
            {
                statetimerinputpackettype = new StateTimerInputPacket(statetimerinputpackettype, Long.valueOf(System.currentTimeMillis()), plugincallbacksnapshot, pluginmetricssnapshot, obj);
                stateMachine.queueInputPacket(statetimerinputpackettype);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerInputPacketType statetimerinputpackettype)
        {
            return;
        }
    }

    private void pushStateMachinePacket(StateTimerInputPacketType statetimerinputpackettype, Object obj)
    {
        pushStateMachinePacket(statetimerinputpackettype, givePluginCallBackSnapShot(), givePluginMetricsSnapShot(), obj);
    }

    private void queueStateMachineOutputPackets(StateTimerOutputPacket statetimeroutputpacket)
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            if (packetsWaitingForXML == null)
            {
                packetsWaitingForXML = new ArrayList();
            }
            packetsWaitingForXML.add(statetimeroutputpacket);
            isLinesPendingForXML = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        statetimeroutputpacket;
        obj1;
        JVM INSTR monitorexit ;
        throw statetimeroutputpacket;
        statetimeroutputpacket;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw statetimeroutputpacket;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputPacket statetimeroutputpacket)
        {
            return;
        }
    }

    private void reset500msBucket()
    {
        synchronized (bucket500msLock)
        {
            total500msCount = 0;
            playBackBitRateSum500ms = 0.0F;
            totalBandwidthSum500ms = 0L;
            averageFpsSum500ms = 0.0F;
        }
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void reset500msMetricRelatedVariables()
    {
        toggle500msTimer(false);
        total500msCount = 0;
        playBackBitRateSum500ms = 0.0F;
        totalBandwidthSum500ms = 0L;
        bytesLoadedAtLast500ms = 0L;
        averageFpsSum500ms = 0.0F;
        bandwidthInWindow = new ArrayList();
        currentMaxBandwidth = 0L;
        bucket500msLock = new Object();
    }

    private void resetLogLineRelatedVariables()
    {
        try
        {
            noHTimerFiring = -1;
            hLineEnabled = false;
            noHLinetoPLine = 1;
            beaconTriggerTime = 0L;
            sessionId = null;
            alreadySendList = new HashMap();
            reset500msMetricRelatedVariables();
            isSessionWithRebufferLimit = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
            _strHead = 0.0F;
            _currentPluginCallBackSnapShot = null;
            _currentPluginMetricsSnapshot = null;
            isLinesPendingForXML = false;
            isPendingCELine = false;
            isPendingSLine = false;
            isPendingILine = false;
            packetsWaitingForXML = new ArrayList();
            stopPlugin = false;
            ecLineSent = false;
            sLineSent = false;
            iLineSent = false;
            packetMetricsOfLastLine = null;
            noOfFeedBackLinesSent = 0;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void resetMyMetrics()
    {
        try
        {
            reset500msBucket();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void resetStateMachineXMLVariables()
    {
        try
        {
            if (stateMachineOutputListener != null)
            {
                stateMachineOutputListener.disable();
            }
            if (stateMachine != null)
            {
                pushStateMachinePacket(StateTimerInputPacketType.REMOVELISTENER);
            }
            stateMachine = null;
            stateMachineOutputListener = null;
            parserListener = null;
            initListeners();
            initStateTimer();
            if (plugInfoHandler != null)
            {
                plugInfoHandler.close();
            }
            plugInfoHandler = null;
            xmlLoadSuccess = false;
            isLoading = true;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void resetVariablesForIndSession()
    {
        try
        {
            setDataStore = new HashMap();
            firstTitleSent = false;
            resetStateMachineXMLVariables();
            resetLogLineRelatedVariables();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static void scheduleVLineTimer()
    {
        toggleVLineTimer(true, visitTimeOut);
    }

    private void sendOutCEline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (stopPlugin || !iLineSent && !isPendingILine || ecLineSent)
        {
            return;
        }
        if (!isLoading) goto _L2; else goto _L1
_L1:
        if (!isPendingCELine)
        {
            queueStateMachineOutputPackets(statetimeroutputpacket);
            isPendingCELine = true;
            resetMyMetrics();
            toggle500msTimer(false);
        }
_L4:
        scheduleVLineTimer();
        return;
_L2:
        HashMap hashmap;
        if (!xmlLoadSuccess)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap = (HashMap)statetimeroutputpacket.auxInfo;
        packetMetricsOfLastLine = (HashMap)hashmap.clone();
        if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && hashmap != null)
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDSTOPLINE)
            {
                break; /* Loop/switch isn't completed */
            }
            prepareAndSendMergedLines(plugInfoHandler.plugInfo, setDataStore, hashmap, "common", "playing", "complete", alreadySendList);
        }
_L6:
        ecLineSent = true;
        isPendingCELine = false;
        listOfActivePlugins.put(this, Boolean.valueOf(false));
        resetMyMetrics();
        toggle500msTimer(false);
        if (hashmap.containsKey(CSMAKEYS.endreasoncode.toString()) && ((String)hashmap.get(CSMAKEYS.endreasoncode.toString())).equalsIgnoreCase(EndReasonCodes.Application_Close.toString()) || hashmap.containsKey(CSMAKEYS.errorcode.toString()) && ((String)hashmap.get(CSMAKEYS.errorcode.toString())).equalsIgnoreCase(EndReasonCodes.Application_Close.toString()))
        {
            stopPlugin("Application Close has been Called");
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDERRORLINE) goto _L6; else goto _L5
_L5:
        prepareAndSendMergedLines(plugInfoHandler.plugInfo, setDataStore, hashmap, "common", "playing", "error", alreadySendList);
          goto _L6
    }

    private void sendOutFline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (!stopPlugin) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        HashMap hashmap;
        Iterator iterator;
        if (isLoading)
        {
            queueStateMachineOutputPackets(statetimeroutputpacket);
            return;
        }
        s = getData(CSMAKEYS.socialsharing.toString());
        if (statetimeroutputpacket == null || statetimeroutputpacket.auxInfo == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap = (HashMap)statetimeroutputpacket.auxInfo;
        iterator = hashmap.keySet().iterator();
_L4:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_232;
        }
        if (!ecLineSent || !xmlLoadSuccess || getData(CSMAKEYS.socialsharing.toString()).equals(s) && statetimeroutputpacket != null && statetimeroutputpacket.auxInfo != null || plugInfoHandler != null && plugInfoHandler.plugInfo != null && plugInfoHandler.plugInfo.logTo != null && noOfFeedBackLinesSent >= plugInfoHandler.plugInfo.logTo.feedback_limit) goto _L1; else goto _L3
_L3:
        statetimeroutputpacket = (HashMap)packetMetricsOfLastLine.clone();
        if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && statetimeroutputpacket != null)
        {
            prepareAndSendLines(plugInfoHandler.plugInfo, setDataStore, statetimeroutputpacket, "common", "feedback", alreadySendList);
        }
        noOfFeedBackLinesSent = noOfFeedBackLinesSent + 1;
        return;
        String s1 = (String)iterator.next();
        updateSocialSharing(s1, (Integer)hashmap.get(s1));
          goto _L4
    }

    private void sendOutHline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (!stopPlugin && iLineSent && sLineSent && !ecLineSent && !isPendingCELine)
        {
            statetimeroutputpacket = (HashMap)statetimeroutputpacket.auxInfo;
            if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && statetimeroutputpacket != null)
            {
                prepareAndSendLines(plugInfoHandler.plugInfo, setDataStore, statetimeroutputpacket, "common", "heartbeat", alreadySendList);
            }
        }
    }

    private void sendOutIline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (iLineSent || stopPlugin)
        {
            return;
        }
        listOfActivePlugins.put(this, Boolean.valueOf(true));
        if (!isLoading) goto _L2; else goto _L1
_L1:
        if (!isPendingILine)
        {
            queueStateMachineOutputPackets(statetimeroutputpacket);
            isPendingILine = true;
            resetMyMetrics();
        }
_L4:
        toggleVLineTimer(false, visitTimeOut);
        return;
_L2:
        if (xmlLoadSuccess)
        {
            if (!isPendingILine)
            {
                resetMyMetrics();
            }
            updateVisitAttempts(statetimeroutputpacket);
            statetimeroutputpacket = (HashMap)statetimeroutputpacket.auxInfo;
            if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && statetimeroutputpacket != null)
            {
                prepareAndSendLines(plugInfoHandler.plugInfo, setDataStore, statetimeroutputpacket, "common", "init", alreadySendList);
            }
            iLineSent = true;
            isPendingILine = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void sendOutPendingLines()
    {
        Iterator iterator = packetsWaitingForXML.iterator();
        do
        {
            StateTimerOutputPacket statetimeroutputpacket;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                statetimeroutputpacket = (StateTimerOutputPacket)iterator.next();
            } while (stateMachineOutputListener == null);
            stateMachineOutputListener.event(statetimeroutputpacket);
        } while (true);
    }

    private void sendOutPline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (!stopPlugin && (sLineSent || isPendingSLine) && (iLineSent || isPendingILine) && !ecLineSent && !isPendingCELine && xmlLoadSuccess)
        {
            if (isLoading)
            {
                queueStateMachineOutputPackets(statetimeroutputpacket);
                return;
            }
            if (xmlLoadSuccess)
            {
                statetimeroutputpacket = (HashMap)statetimeroutputpacket.auxInfo;
                if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && statetimeroutputpacket != null)
                {
                    prepareAndSendLines(plugInfoHandler.plugInfo, setDataStore, statetimeroutputpacket, "common", "playing", alreadySendList);
                    return;
                }
            }
        }
    }

    private void sendOutSline(StateTimerOutputPacket statetimeroutputpacket)
    {
        if (stopPlugin || sLineSent || !iLineSent && !isPendingILine || ecLineSent || isPendingCELine)
        {
            return;
        }
        if (!isLoading) goto _L2; else goto _L1
_L1:
        if (!isPendingSLine)
        {
            queueStateMachineOutputPackets(statetimeroutputpacket);
            isPendingSLine = true;
            resetMyMetrics();
        }
_L4:
        toggle500msTimer(true);
        return;
_L2:
        if (xmlLoadSuccess)
        {
            if (!isPendingSLine)
            {
                resetMyMetrics();
            }
            updateVisitPlays(statetimeroutputpacket);
            statetimeroutputpacket = (HashMap)statetimeroutputpacket.auxInfo;
            if (plugInfoHandler != null && plugInfoHandler.plugInfo != null && statetimeroutputpacket != null)
            {
                prepareAndSendLines(plugInfoHandler.plugInfo, setDataStore, statetimeroutputpacket, "common", "playstart", alreadySendList);
            }
            sLineSent = true;
            isPendingSLine = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void sendOutVlineAct()
    {
        clearAnyActiveSessions();
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        long l;
        l = System.currentTimeMillis();
        toggleVLineTimer(false, visitTimeOut);
        hashmap = new HashMap();
        hashmap.put(CSMAKEYS.isvisitend.toString(), "1");
        if (visitMetrics == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        synchronized (visitMetrics.visitLock)
        {
            if (visitMetrics.visitAttempts != 0)
            {
                break MISSING_BLOCK_LABEL_71;
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        visitMetrics.giveVisitMetrics(hashmap, Long.valueOf(l));
        obj1;
        JVM INSTR monitorexit ;
        if (PluginInfoHandler.plugInfoCache != null && !PluginInfoHandler.plugInfoCache.isLoading && PluginInfoHandler.plugInfoCache.xmlLoadSuccess)
        {
            prepareAndSendLines(PluginInfoHandler.plugInfoCache, null, hashmap, "common", "visit", null);
            visitMetrics = null;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        catch (Exception exception)
        {
            return;
        }
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public static void setDataAllSessions(String s, String s1)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (setDataStoreStatic != null)
        {
            setDataStoreStatic.put(s.toLowerCase(), s1.trim());
        }
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        dispatchEvent(PluginEvent.DEBUG, (new StringBuilder("SetData Failed:Key:")).append(s).append("Value:").append(s1).toString());
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void setDataAllSessionsIfNot(String s, String s1)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (setDataStoreStatic != null && !setDataStoreStatic.containsKey(s))
        {
            setDataStoreStatic.put(s.toLowerCase(), s1);
        }
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        dispatchEvent(PluginEvent.DEBUG, (new StringBuilder("SetData Failed:Key:")).append(s).append("Value:").append(s1).toString());
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void setDataIfNot(String s, String s1)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (setDataStore != null && !setDataStore.containsKey(s))
        {
            setDataStore.put(s.toLowerCase(), s1);
        }
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        debug((new StringBuilder("SetData Failed:Key:")).append(s).append("Value:").append(s1).toString());
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void setViewerDiagnosticsId(String s)
    {
        setDataAllSessions(CSMAKEYS.viewerdiagnosticsid.toString(), s);
    }

    public static void setViewerId(String s)
    {
        setDataAllSessions(CSMAKEYS.viewerid.toString(), s);
        setDataAllSessions(CSMAKEYS.clientid.toString(), s);
    }

    private void stopPlugin(String s)
    {
        s = ((String) (staticFieldLock));
        s;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            stopTimers();
            initWithContextListenerConfig(mContext, eventListener, configXML);
            stopPlugin = true;
        }
        s;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void stopTimers()
    {
        toggle500msTimer(false);
        debug("All timers cancelled");
    }

    private float streamHead()
    {
        float f;
        if (callBacks == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        f = callBacks.streamHeadPosition();
        return f;
        Exception exception;
        exception;
        return 0.0F;
    }

    private void toggle500msTimer(boolean flag)
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = pluginLock;
        obj1;
        JVM INSTR monitorenter ;
        Object obj2 = bucket500msLock;
        obj2;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (t500msTimer == null && !stopPlugin)
        {
            t500msTimer = new Timer("Akamai500msThread");
            t500msTimer.schedule(new TimerTask() {

                final AnalyticsPlugin this$0;

                public void run()
                {
                    try
                    {
                        doItEvery500ms();
                        return;
                    }
                    catch (Exception exception4)
                    {
                        return;
                    }
                }

            
            {
                this$0 = AnalyticsPlugin.this;
                super();
            }
            }, 500L, 500L);
        }
_L4:
        obj2;
        JVM INSTR monitorexit ;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (t500msTimer == null) goto _L4; else goto _L3
_L3:
        t500msTimer.cancel();
        t500msTimer.purge();
        t500msTimer = null;
          goto _L4
        Exception exception3;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
        Exception exception2;
        exception2;
        obj1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static void toggleVLineTimer(boolean flag, int i)
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (isThereAnyActivePlugin() && i != 0) goto _L2; else goto _L3
_L3:
        if (visitMetricsTimer == null)
        {
            visitMetricsTimer = new Timer("VisitMetricsThread");
            visitMetricsTimer.schedule(new TimerTask() {

                public void run()
                {
                    try
                    {
                        AnalyticsPlugin.sendOutVlineAct();
                        return;
                    }
                    catch (Exception exception2)
                    {
                        return;
                    }
                }

            }, i);
        }
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (flag) goto _L5; else goto _L4
_L4:
        if (visitMetricsTimer == null) goto _L5; else goto _L6
_L6:
        visitMetricsTimer.cancel();
        visitMetricsTimer.purge();
        visitMetricsTimer = null;
          goto _L5
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void updateSocialSharing(String s, Integer integer)
    {
        HashMap hashmap = Utils.splitStrToStrInt(getData(CSMAKEYS.socialsharing.toString()));
        if (plugInfoHandler == null || plugInfoHandler.plugInfo == null || plugInfoHandler.plugInfo.logTo == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = integer.intValue();
        if (!hashmap.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_146;
        }
        i = ((Integer)hashmap.get(s)).intValue();
_L3:
        Integer integer1 = Integer.valueOf(i + j);
        integer = integer1;
        if (integer1.intValue() > plugInfoHandler.plugInfo.logTo.feedback_socialShareLimit)
        {
            integer = Integer.valueOf(plugInfoHandler.plugInfo.logTo.feedback_socialShareLimit);
        }
        hashmap.put(s, integer);
_L2:
        setData(CSMAKEYS.socialsharing.toString(), Utils.hashMapStrIntToCommaSepStr(hashmap));
        return;
        i = 0;
          goto _L3
        s;
    }

    private void updateViewerDiagnosticsId()
    {
        String s1;
        String s = (String)setDataStoreStatic.get(CSMAKEYS.viewerid.toString());
        setDataIfNot(CSMAKEYS.viewerdiagnosticsid.toString(), s);
        if (setDataStore.get(CSMAKEYS.viewerdiagnosticsid.toString()) == viewerIdByPlugin)
        {
            setDataStore.put(CSMAKEYS.viewerdiagnosticsid.toString(), (String)setDataStoreStatic.get(CSMAKEYS.viewerid.toString()));
        }
        s1 = Uri.encode((String)setDataStore.get(CSMAKEYS.viewerdiagnosticsid.toString()));
        if (plugInfoHandler == null || plugInfoHandler.plugInfo == null) goto _L2; else goto _L1
_L1:
        PluginConfigInfo pluginconfiginfo = plugInfoHandler.plugInfo;
_L4:
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        Object obj;
        try
        {
            if (!pluginconfiginfo.isViewerDiagEnabled || setDataStoreStatic.containsKey(CSMAKEYS.xviewerid.toString()))
            {
                break MISSING_BLOCK_LABEL_275;
            }
            byte abyte0[] = pluginconfiginfo.viewerDiag.salt_value.getBytes();
            int i = pluginconfiginfo.viewerDiag.output_bytes;
            obj = new PBKDF2Parameters("HmacSHA1", "ISO-8859-1", abyte0, pluginconfiginfo.viewerDiag.no_of_iterations);
            ((PBKDF2Parameters) (obj)).setDerivedKey((new PBKDF2Engine(((PBKDF2Parameters) (obj)))).deriveKey(s1, i));
            obj = BinTools.bin2hex(((PBKDF2Parameters) (obj)).getDerivedKey());
        }
        catch (Exception exception)
        {
            debugException(exception);
            return;
        }
        s1 = ((String) (obj));
        if (((String) (obj)).length() > pluginconfiginfo.viewerDiag.output_bytes * 2)
        {
            s1 = ((String) (obj)).substring(0, pluginconfiginfo.viewerDiag.output_bytes * 2);
        }
        setDataIfNot(CSMAKEYS.xviewerid.toString(), s1);
        setDataIfNot(CSMAKEYS.xvieweridversion.toString(), pluginconfiginfo.viewerDiag.salt_version);
        return;
_L2:
        pluginconfiginfo = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateVisitAttempts(StateTimerOutputPacket statetimeroutputpacket)
    {
        createVisitMetrics(mContext);
        synchronized (visitMetrics.visitLock)
        {
            if (visitMetrics.visitAttempts == 0)
            {
                visitMetrics.firstILineTime = statetimeroutputpacket.currentTime.longValue();
                setData(CSMAKEYS.isvisitstart.toString(), "1");
            }
            visitMetrics.visitAttempts = visitMetrics.visitAttempts + 1;
        }
        return;
        statetimeroutputpacket;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw statetimeroutputpacket;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputPacket statetimeroutputpacket)
        {
            return;
        }
    }

    private void updateVisitPlays(StateTimerOutputPacket statetimeroutputpacket)
    {
        createVisitMetrics(mContext);
        synchronized (visitMetrics.visitLock)
        {
            VisitMetrics visitmetrics = visitMetrics;
            visitmetrics.visitPlays = visitmetrics.visitPlays + 1;
        }
        return;
        exception;
        statetimeroutputpacket;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputPacket statetimeroutputpacket)
        {
            return;
        }
    }

    private static void updateWithXMLInfo(PluginConfigInfo pluginconfiginfo, HashMap hashmap, String s)
    {
        if (pluginconfiginfo.statInfo == null || !pluginconfiginfo.statInfo.containsKey(s)) goto _L2; else goto _L1
_L1:
        s = (PluginConfigInfo.PluginStatistics)pluginconfiginfo.statInfo.get(s);
_L4:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        int i;
        try
        {
            if (((PluginConfigInfo.PluginStatistics) (s)).eventCode != null)
            {
                hashmap.put(CSMAKEYS.eventcode.toString(), ((PluginConfigInfo.PluginStatistics) (s)).eventCode);
            }
        }
        // Misplaced declaration of an exception variable
        catch (PluginConfigInfo pluginconfiginfo)
        {
            return;
        }
        try
        {
            if (!hashmap.containsKey(CSMAKEYS.startuptime.toString()))
            {
                break MISSING_BLOCK_LABEL_136;
            }
            s = (String)hashmap.get(CSMAKEYS.startuptime.toString());
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (PluginConfigInfo pluginconfiginfo)
        {
            return;
        }
        if (pluginconfiginfo == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (pluginconfiginfo.logTo != null && i > pluginconfiginfo.logTo.startUpTimeOutlierLimit)
        {
            hashmap.put(CSMAKEYS.outlierstartuptime.toString(), s);
            hashmap.put(CSMAKEYS.startuptime.toString(), "0");
        }
        return;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void waitingForPostRoll(StateTimerOutputPacket statetimeroutputpacket)
    {
        stopTimers();
    }

    public String getViewerId()
    {
label0:
        {
            String s;
            synchronized (setDataStoreLock)
            {
                if (!setDataStoreStatic.containsKey(CSMAKEYS.viewerid.toString()))
                {
                    break label0;
                }
                s = (String)setDataStoreStatic.get(CSMAKEYS.viewerid.toString());
            }
            return s;
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        return "";
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception) { }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void handleAdComplete()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_COMPLETE);
    }

    public void handleAdEnd(int i)
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_STOPPED, new Integer(i));
    }

    public void handleAdError(HashMap hashmap)
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_ERROR, hashmap);
    }

    public void handleAdFirstQuartile()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_FIRST_QUARTILE);
    }

    public void handleAdLoaded(HashMap hashmap)
    {
        HashMap hashmap1 = hashmap;
        if (hashmap == null)
        {
            hashmap1 = new HashMap();
        }
        pushStateMachinePacket(StateTimerInputPacketType.AD_LOADED, hashmap1);
    }

    public void handleAdMidPoint()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_MIDPOINT);
    }

    public void handleAdStarted()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_STARTED);
    }

    public void handleAdStopped()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_STOPPED);
    }

    public void handleAdThirdQuartile()
    {
        pushStateMachinePacket(StateTimerInputPacketType.AD_THIRD_QUARTILE);
    }

    public void handleBufferEnd()
    {
        pushStateMachinePacket(StateTimerInputPacketType.BUFFER_END);
    }

    public void handleBufferStart()
    {
        pushStateMachinePacket(StateTimerInputPacketType.BUFFER_START);
    }

    public void handleEnterBackground()
    {
        handlePlayEnd(EndReasonCodes.Application_Background.toString());
        handleApplicationClose();
    }

    public void handleError(String s)
    {
        s = s.replace("_", ".");
        pushStateMachinePacket(StateTimerInputPacketType.ERROR, s);
    }

    public void handleExitBackground()
    {
    }

    public void handleFullScreen(boolean flag)
    {
        pushStateMachinePacket(StateTimerInputPacketType.FULL_SCREEN, new Boolean(flag));
    }

    public void handlePause()
    {
        pushStateMachinePacket(StateTimerInputPacketType.PAUSE);
    }

    public void handlePlay()
    {
        pushStateMachinePacket(StateTimerInputPacketType.PLAY);
    }

    public void handlePlayEnd(String s)
    {
        s = s.replace("_", ".");
        pushStateMachinePacket(StateTimerInputPacketType.PLAY_END, s);
    }

    public void handlePlayEndWithPostRoll(String s)
    {
        s = s.replace("_", ".");
        pushStateMachinePacket(StateTimerInputPacketType.PLAY_END_POSTROLL, s);
    }

    public void handleResume(boolean flag)
    {
        if (flag)
        {
            pushStateMachinePacket(StateTimerInputPacketType.RESUME_BUFFER);
            return;
        } else
        {
            pushStateMachinePacket(StateTimerInputPacketType.PLAY);
            return;
        }
    }

    public void handleSeekEnd(float f)
    {
        pushStateMachinePacket(StateTimerInputPacketType.SEEK_END, new Float(f));
    }

    public void handleSeekStart(float f)
    {
        pushStateMachinePacket(StateTimerInputPacketType.SEEK_START, new Float(f));
    }

    public void handleSessionInit(PluginCallBacks plugincallbacks)
    {
        handleSessionInit(plugincallbacks, true);
    }

    public void handleSessionInit(PluginCallBacks plugincallbacks, boolean flag)
    {
        setPluginCallBack(plugincallbacks);
        pushStateMachinePacket(StateTimerInputPacketType.INIT);
        if (flag)
        {
            pushStateMachinePacket(StateTimerInputPacketType.BUFFER_START);
            return;
        } else
        {
            pushStateMachinePacket(StateTimerInputPacketType.CONNECT);
            return;
        }
    }

    public void handleSessionJustInit(PluginCallBacks plugincallbacks)
    {
        setPluginCallBack(plugincallbacks);
        pushStateMachinePacket(StateTimerInputPacketType.INIT);
    }

    public void handleSwitchRequested(int i)
    {
        pushStateMachinePacket(StateTimerInputPacketType.SWITCH_REQUESTED, new Integer(i));
    }

    public void handleSwitchedTo(int i)
    {
        pushStateMachinePacket(StateTimerInputPacketType.SWITCHED_TO, new Integer(i));
    }

    public void handleTitleSwitch(HashMap hashmap)
    {
        if (!sLineSent || !xmlLoadSuccess) goto _L2; else goto _L1
_L1:
        handlePlayEnd(EndReasonCodes.Title_Switched.toString());
        pushStateMachinePacket(StateTimerInputPacketType.TITLE_SWITCHED, hashmap);
_L4:
        return;
_L2:
        if (hashmap != null)
        {
            Iterator iterator = hashmap.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                setData(s, (String)hashmap.get(s));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setContext(Context context)
    {
        mContext = context;
    }

    public void setData(String s, String s1)
    {
        Object obj = setDataStoreLock;
        obj;
        JVM INSTR monitorenter ;
        if (s == null || s1 == null) goto _L2; else goto _L1
_L1:
        if (setDataStore == null) goto _L2; else goto _L3
_L3:
        if (!s.toLowerCase().startsWith(InternalCodes.SETDATA_SOCIAL_SHARE_PFX)) goto _L5; else goto _L4
_L4:
        handleSocialSharingSetData(s, s1);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        if (!s.toLowerCase().startsWith(InternalCodes.SETDATA_FEEDBACK_PFX))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        handleFeedBackSetData(s, s1);
          goto _L2
        Exception exception;
        exception;
        debug((new StringBuilder("SetData Failed:Key:")).append(s).append("Value:").append(s1).toString());
          goto _L2
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        setDataStore.put(s.toLowerCase(), s1.trim());
          goto _L2
    }

    public void setPluginCallBack(PluginCallBacks plugincallbacks)
    {
        Object obj = staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        synchronized (pluginLock)
        {
            callBacks = plugincallbacks;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        plugincallbacks;
        obj1;
        JVM INSTR monitorexit ;
        throw plugincallbacks;
        plugincallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw plugincallbacks;
    }

    public void setPluginEventListener(PluginEventListener plugineventlistener)
    {
        eventListener = plugineventlistener;
    }

    public void updateStateOnTitleSwitch(HashMap hashmap)
    {
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = hashmap.keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        firstTitleSent = true;
        setDataStore.remove(CSMAKEYS.sessionid.toString());
        stateMachine.setStateTimerOutputListener(null);
        stateMachine = null;
        initStateTimer();
        resetLogLineRelatedVariables();
        pluginReadyToSendLines();
        pushStateMachinePacket(StateTimerInputPacketType.INIT);
        pushStateMachinePacket(StateTimerInputPacketType.PLAY);
        return;
_L3:
        String s = (String)iterator.next();
        setData(s, (String)hashmap.get(s));
        if (true) goto _L5; else goto _L4
_L4:
    }

    static 
    {
        visitTimeOut = InternalCodes.visitTimeOut;
    }















}
