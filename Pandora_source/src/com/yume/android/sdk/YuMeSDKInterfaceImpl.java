// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import android.widget.FrameLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.yume.android.sdk:
//            YuMeSDKBSPInterface, YuMeSDKInterface, YuMeSDKPlayerInterface, M, 
//            YuMeAppInterface, YuMeException, YuMeAdParams, aj, 
//            U, T, YuMeBSPException, YuMePlayerException, 
//            YuMeBSPInterface, YuMePlayerInterface, ai, ah, 
//            p, Z, aF, ak, 
//            F, az, aH, E, 
//            YuMeDeviceInfo, B, q, aE, 
//            YuMeAdBlockType, YuMeConnectionType, YuMeDeviceType, YuMePlaybackStatus, 
//            YuMePlayerEventType, YuMePlayerInfo, YuMeTimelineEventType, YuMeDownloadStatus

public class YuMeSDKInterfaceImpl
    implements YuMeSDKBSPInterface, YuMeSDKInterface, YuMeSDKPlayerInterface
{

    static M a = M.a();
    static YuMeAdParams b;
    static YuMeAppInterface c;
    static YuMeBSPInterface d;
    static YuMePlayerInterface e;
    static F f;
    static aj g;
    static T h;
    static U i;
    static ah j;
    static p k;
    static Z l;
    static aF m;
    static az n;
    static ak o;
    static boolean p = false;
    private static ai q;
    private static boolean r = false;
    private static Context s = null;
    private static Context t = null;
    private BroadcastReceiver u;
    private boolean v;
    private boolean w;

    public YuMeSDKInterfaceImpl()
    {
        u = null;
        v = false;
        w = false;
    }

    static Context a()
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        a.c("getApplicationContextFromApp(): appSdkInterface is NULL.");
_L2:
        return s;
_L4:
        Context context = c.YuMeApp_GetApplicationContext();
        s = context;
        if (context == null)
        {
            a.c("getApplicationContextFromApp(): Invalid Application Context received from App.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private static String a(YuMeAdParams yumeadparams)
        throws YuMeException
    {
        Object obj = null;
        if (yumeadparams.adServerUrl == null || yumeadparams.adServerUrl.equals(""))
        {
            obj = "Invalid Ad Server Url.";
        } else
        {
            try
            {
                new URL(yumeadparams.adServerUrl);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((MalformedURLException) (obj)).printStackTrace();
                obj = "Malformed Ad Server Url.";
            }
        }
        if (yumeadparams.domainId == null || yumeadparams.domainId.equals(""))
        {
            obj = "Invalid Domain Id.";
        }
        if (obj != null)
        {
            return ((String) (obj));
        }
        if (b == null)
        {
            b = new YuMeAdParams();
        }
        if (b == null)
        {
            return "Error creating Ad Params Object.";
        } else
        {
            b.adServerUrl = yumeadparams.adServerUrl;
            b.domainId = yumeadparams.domainId;
            b.qsParams = yumeadparams.qsParams;
            b.bSupportMP4 = yumeadparams.bSupportMP4;
            b.bSupport3GPP = yumeadparams.bSupport3GPP;
            b.bSupportHighBitRate = yumeadparams.bSupportHighBitRate;
            b.bSupportAutoNetworkDetect = yumeadparams.bSupportAutoNetworkDetect;
            b.bEnableCaching = yumeadparams.bEnableCaching;
            b.bEnableAutoPrefetch = yumeadparams.bEnableAutoPrefetch;
            b.bEnableCBToggle = yumeadparams.bEnableCBToggle;
            b.bEnableLocationSupport = yumeadparams.bEnableLocationSupport;
            b.bEnableFileLogging = yumeadparams.bEnableFileLogging;
            b.bEnableConsoleLogging = yumeadparams.bEnableConsoleLogging;
            b.bRequireVastAds = yumeadparams.bRequireVastAds;
            a.a(b.bEnableFileLogging.booleanValue());
            a.b(b.bEnableConsoleLogging.booleanValue());
            a.b("********** YUME SDK PARAMS - BEGIN **********");
            a.b((new StringBuilder("adDomainUrl: ")).append(b.adServerUrl).toString());
            a.b((new StringBuilder("domainId: ")).append(b.domainId).toString());
            a.b((new StringBuilder("qsParams: ")).append(b.qsParams).toString());
            a.b((new StringBuilder("bSupportMP4: ")).append(b.bSupportMP4).toString());
            a.b((new StringBuilder("bSupport3GPP: ")).append(b.bSupport3GPP).toString());
            a.b((new StringBuilder("bSupportHighBitRate: ")).append(b.bSupportHighBitRate).toString());
            a.b((new StringBuilder("bSupportAutoNetworkDetect: ")).append(b.bSupportAutoNetworkDetect).toString());
            a.b((new StringBuilder("bEnableCaching: ")).append(b.bEnableCaching).toString());
            a.b((new StringBuilder("bEnableAutoPrefetch: ")).append(b.bEnableAutoPrefetch).toString());
            a.b((new StringBuilder("bEnableCBToggle: ")).append(b.bEnableCBToggle).toString());
            a.b((new StringBuilder("bEnableLocationSupport: ")).append(b.bEnableLocationSupport).toString());
            a.b((new StringBuilder("bEnableFileLogging: ")).append(b.bEnableFileLogging).toString());
            a.b((new StringBuilder("bEnableConsoleLogging: ")).append(b.bEnableConsoleLogging).toString());
            a.b((new StringBuilder("bRequireVastAds: ")).append(b.bRequireVastAds).toString());
            a.b("********** YUME SDK PARAMS - END **********");
            return ((String) (obj));
        }
    }

    static void a(YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        r = false;
        t = null;
        if (!flag)
        {
            try
            {
                g.b();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (YuMeAdBlockType yumeadblocktype)
            {
                yumeadblocktype.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_39;
        }
        i.n();
        h.a(yumeadblocktype, false);
        return;
    }

    private void a(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface, YuMeBSPInterface yumebspinterface, YuMePlayerInterface yumeplayerinterface)
        throws YuMeException
    {
        a.b("YuMeSDK_Init(): Invoked.");
        if (p)
        {
            a("YuMeSDK_Init(): YuMe SDK is already Initialized.");
        }
        if (yumeadparams == null)
        {
            a("YuMeSDK_Init(): Invalid Ad Param object.");
        }
        if (yumeappinterface == null)
        {
            a("YuMeSDK_Init(): Invalid YuMeAppInterface object.");
        }
        if (yumebspinterface == null)
        {
            a("YuMeSDK_Init(): Invalid YuMeBSPInterface object.");
        }
        if (yumeplayerinterface == null)
        {
            a("YuMeSDK_Init(): Invalid YuMePlayerInterface object.");
        }
        c = yumeappinterface;
        d = yumebspinterface;
        e = yumeplayerinterface;
        if (yumeadparams != null && yumeadparams.bEnableFileLogging.booleanValue())
        {
            a.a(a());
        }
        YuMeSDK_GetVersion();
        yumeappinterface = a(yumeadparams);
        if (yumeappinterface != null)
        {
            a((new StringBuilder("YuMeSDK_Init(): ")).append(yumeappinterface).toString());
        }
        boolean flag;
        if (yumeadparams != null)
        {
            try
            {
                d.YuMeBSP_Init(yumeadparams.adTimeout, yumeadparams.storageSize, yumeadparams.storageMode, yumeadparams.bEnableFileLogging.booleanValue(), yumeadparams.bEnableConsoleLogging.booleanValue(), this);
            }
            // Misplaced declaration of an exception variable
            catch (YuMeAppInterface yumeappinterface)
            {
                yumeappinterface.printStackTrace();
                a((new StringBuilder("YuMeSDK_Init(): ")).append(yumeappinterface.getMessage()).toString());
            }
        }
        if (yumeadparams != null)
        {
            try
            {
                e.YuMePlayer_Init(yumeadparams.videoTimeout, yumeadparams.bEnableFileLogging.booleanValue(), yumeadparams.bEnableConsoleLogging.booleanValue(), this);
            }
            // Misplaced declaration of an exception variable
            catch (YuMeAdParams yumeadparams)
            {
                yumeadparams.printStackTrace();
                a((new StringBuilder("YuMeSDK_Init(): ")).append(yumeadparams.getMessage()).toString());
            }
        }
        q = new ai();
        g = new aj();
        h = new T();
        i = new U();
        j = new ah();
        k = new p();
        l = new Z();
        if (!b.bRequireVastAds.booleanValue())
        {
            m = new aF();
        } else
        {
            n = new az();
        }
        o = new ak();
        f = new F();
        if (q == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null && n == null || o == null)
        {
            d();
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            a("YuMeSDK_Init(): Error Creating SDK Modules.");
        }
        a.b("SDK Modules Created.");
        if (a() == null)
        {
            a.c("Error Setting Broadcast Receiver.");
        } else
        {
            u = new aH();
            yumeadparams = new IntentFilter();
            yumeadparams.addAction("android.intent.action.MEDIA_SHARED");
            yumeadparams.addAction("android.intent.action.MEDIA_REMOVED");
            yumeadparams.addAction("android.intent.action.MEDIA_UNMOUNTED");
            yumeadparams.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            yumeadparams.addAction("android.intent.action.MEDIA_EJECT");
            yumeadparams.addAction("android.intent.action.MEDIA_MOUNTED");
            yumeadparams.addDataScheme("file");
            s.registerReceiver(u, yumeadparams);
            a.b("Broadcast Receiver Set Successfully.");
        }
        f.a();
        l.b();
        k.d();
        j.a();
        if (!i.p())
        {
            a.c("Assets Storage directories not accessible.");
        }
        l.a();
        p = true;
        a.b("YuMeSDK_Init(): Successful.");
    }

    private static void a(String s1)
        throws YuMeException
    {
        a.c(s1);
        throw new YuMeException(s1);
    }

    private YuMeBSPInterface b()
    {
        YuMeBSPInterface yumebspinterface;
        yumebspinterface = (YuMeBSPInterface)Class.forName("com.yume.android.bsp.YuMeBSPInterfaceImpl").newInstance();
        v = true;
        Log.i("YuMeAndroidSDK", "YuMe BSP instantiated by SDK.");
        return yumebspinterface;
        Object obj;
        obj;
        ((InstantiationException) (obj)).printStackTrace();
_L2:
        return null;
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        ((ClassNotFoundException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void b(YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        E.a = false;
        E.b = false;
        t = null;
        a(yumeadblocktype, flag);
    }

    private YuMePlayerInterface c()
    {
        YuMePlayerInterface yumeplayerinterface;
        yumeplayerinterface = (YuMePlayerInterface)Class.forName("com.yume.android.player.YuMePlayerInterfaceImpl").newInstance();
        w = true;
        Log.i("YuMeAndroidSDK", "YuMe Player instantiated by SDK.");
        return yumeplayerinterface;
        Object obj;
        obj;
        ((InstantiationException) (obj)).printStackTrace();
_L2:
        return null;
        obj;
        ((IllegalAccessException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        ((ClassNotFoundException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void d()
    {
        q = null;
        g = null;
        h = null;
        i = null;
        j = null;
        m = null;
        n = null;
        o = null;
        f = null;
        l = null;
        k = null;
    }

    private static Context e()
    {
        if (t != null) goto _L2; else goto _L1
_L1:
        if (c != null) goto _L4; else goto _L3
_L3:
        a.c("getActivityContextFromApp(): appInterface is NULL.");
_L2:
        return t;
_L4:
        Context context = c.YuMeApp_GetActivityContext();
        t = context;
        if (context == null)
        {
            a.c("getActivityContextFromApp(): Invalid Activity Context received from App.");
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public Context YuMeSDKBSP_GetActivityContext()
    {
        return e();
    }

    public Context YuMeSDKBSP_GetApplicationContext()
    {
        return a();
    }

    public void YuMeSDKBSP_GetPlaylistComplete(int i1, int j1, String s1, long l1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_GetPlaylistComplete(): YuMe SDK is not Initialized.");
        }
        k.a(i1, j1, s1);
    }

    public void YuMeSDKBSP_SendTrackerComplete(int i1, int j1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SendTrackerComplete(): YuMe SDK is not Initialized.");
        }
        k.a(i1, j1);
    }

    public void YuMeSDKBSP_SetCity(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetCity(): YuMe SDK is not Initialized.");
        }
        k.b().city = s1;
    }

    public void YuMeSDKBSP_SetConnectionType(YuMeConnectionType yumeconnectiontype)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetConnectionType(): YuMe SDK is not Initialized.");
        }
        k.c().a = yumeconnectiontype;
    }

    public void YuMeSDKBSP_SetCountryCode(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetCountryCode(): YuMe SDK is not Initialized.");
        }
        k.b().countryCode = s1;
    }

    public void YuMeSDKBSP_SetDeviceDisplayHeight(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceDisplayHeight(): YuMe SDK is not Initialized.");
        }
        k.b().displayHeight = i1;
    }

    public void YuMeSDKBSP_SetDeviceDisplayWidth(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceDisplayWidth(): YuMe SDK is not Initialized.");
        }
        k.b().displayWidth = i1;
    }

    public void YuMeSDKBSP_SetDeviceInfo(YuMeDeviceInfo yumedeviceinfo)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceInfo(): YuMe SDK is not Initialized.");
        }
        p p1 = k;
        if (p1.a != null)
        {
            p1.a = null;
        }
        p1.a = yumedeviceinfo;
    }

    public void YuMeSDKBSP_SetDeviceOrientation(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceOrientation(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKBSP_SetDeviceType(YuMeDeviceType yumedevicetype)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceType(): YuMe SDK is not Initialized.");
        }
        k.b().eType = yumedevicetype;
    }

    public void YuMeSDKBSP_SetDeviceUUID(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetDeviceUUID(): YuMe SDK is not Initialized.");
        }
        k.b().uuid = s1;
    }

    public void YuMeSDKBSP_SetFreeRAMSizeMB(float f1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetFreeRAMSizeMB(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKBSP_SetFreeStorageSizeMB(float f1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetFreeStorageSizeMB(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKBSP_SetLatitude(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetLatitude(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKBSP_SetLineSpeedKbps(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetLineSpeedKbps(): YuMe SDK is not Initialized.");
        }
        k.c().c = i1;
    }

    public void YuMeSDKBSP_SetLongitude(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetLongitude(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKBSP_SetMaxPersistentStorageMB(float f1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetMaxPersistentStorageMB(): YuMe SDK is not Initialized.");
        }
        p p1 = k;
        if (p1.c == null)
        {
            p1.c = new q((byte)0);
        }
        p1.c.b = f1;
        i.c(p1.c.b);
    }

    public void YuMeSDKBSP_SetPostalCode(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetPostalCode(): YuMe SDK is not Initialized.");
        }
        k.b().postalCode = s1;
    }

    public void YuMeSDKBSP_SetPublicIPAddress(String s1, String s2)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetPublicIPAddress(): YuMe SDK is not Initialized.");
        }
        B b1 = k.c();
        if (b1 != null)
        {
            if (b1.b == null)
            {
                b1.b = new ArrayList();
            } else
            {
                b1.b.clear();
            }
            b1.b.add(s1);
            b1.b.add(s2);
        }
    }

    public void YuMeSDKBSP_SetServiceProvider(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetServiceProvider(): YuMe SDK is not Initialized.");
        }
        k.b().serviceProvider = s1;
    }

    public void YuMeSDKBSP_SetState(String s1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetState(): YuMe SDK is not Initialized.");
        }
        k.b().state = s1;
    }

    public void YuMeSDKBSP_SetSupportedConnectionTypes(List list)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKBSP_SetSupportedConnectionTypes(): YuMe SDK is not Initialized.");
        }
        k.b().supportedConnectionTypes = list;
    }

    public void YuMeSDKPlayer_ClickEventOccured(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_ClickEventOccured(): YuMe SDK is not Initialized.");
        }
        l.a(i1);
    }

    public Context YuMeSDKPlayer_GetActivityContext()
    {
        return e();
    }

    public Context YuMeSDKPlayer_GetApplicationContext()
    {
        return a();
    }

    public String YuMeSDKPlayer_GetUserAgent()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_GetUserAgent(): YuMe SDK is not Initialized.");
        }
        return f.b();
    }

    public void YuMeSDKPlayer_PlaybackFinished(YuMePlaybackStatus yumeplaybackstatus, boolean flag)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_PlaybackFinished(): YuMe SDK is not Initialized.");
        }
        l.a(yumeplaybackstatus);
    }

    public void YuMeSDKPlayer_PlayerEventOccured(YuMePlayerEventType yumeplayereventtype)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_PlayerEventOccured(): YuMe SDK is not Initialized.");
        }
    }

    public void YuMeSDKPlayer_SetBaseAssetDuration(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_SetBaseAssetDuration(): YuMe SDK is not Initialized.");
        }
        l.b(i1);
    }

    public void YuMeSDKPlayer_SetPlayerInfo(YuMePlayerInfo yumeplayerinfo)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_SetPlayerInfo(): YuMe SDK is not Initialized.");
        }
        l.a(yumeplayerinfo);
    }

    public void YuMeSDKPlayer_SwipeEventOccured(int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_SwipeEventOccured(): YuMe SDK is not Initialized.");
        }
        l.e();
    }

    public void YuMeSDKPlayer_TimelineEventOccured(YuMeTimelineEventType yumetimelineeventtype, int i1)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_TimelineEventOccured(): YuMe SDK is not Initialized.");
        }
        l.a(yumetimelineeventtype, i1);
    }

    public void YuMeSDKPlayer_TransitionEffectShown()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_TransitionEffectShown(): YuMe SDK is not Initialized.");
        }
        l.d();
    }

    public void YuMeSDKPlayer_UserActionViewClosed()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDKPlayer_UserActionViewClosed(): YuMe SDK is not Initialized.");
        }
        l.f();
    }

    public void YuMeSDK_AbortDownload()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_AbortDownload(): YuMe SDK is not Initialized.");
        }
        i.a(false);
        h.a(false);
    }

    public void YuMeSDK_BackKeyPressed()
        throws YuMeException
    {
        a.b("YuMeSDK_BackKeyPressed(): Invoked.");
        if (!p)
        {
            return;
        }
        if (!r)
        {
            a.b("No Ad Operation in Progress.");
            return;
        } else
        {
            l.c();
            k.g();
            b(E.a(), E.b());
            a.b("YuMeSDK_BackKeyPressed(): Successful.");
            return;
        }
    }

    public void YuMeSDK_ClearCache()
        throws YuMeException
    {
        a.b("YuMeSDK_ClearCache(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_ClearCache(): YuMe SDK is not Initialized.");
        }
        if (r)
        {
            a("YuMeSDK_ClearCache(): Ad Operation in Progress.");
        }
        i.j();
        a.b("YuMeSDK_ClearCache(): Successful.");
    }

    public void YuMeSDK_ClearCookies()
        throws YuMeException
    {
        a.b("YuMeSDK_ClearCookies(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_ClearCookies(): YuMe SDK is not Initialized.");
        }
        p p1 = k;
        try
        {
            p1.b.YuMeBSP_ClearCookies();
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
        a.b("YuMeSDK_ClearCookies(): Successful.");
    }

    public void YuMeSDK_DeInit()
        throws YuMeException
    {
        a.b("YuMeSDK_DeInit(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_DeInit(): YuMe SDK is not Initialized.");
        }
        r = false;
        if (u != null)
        {
            if (a() == null)
            {
                a.c("Error Resetting Broadcast Receiver.");
            } else
            {
                s.unregisterReceiver(u);
                a.b("Broadcast Receiver Reset Successfully.");
            }
        }
        b = null;
        i.l();
        l.g();
        d();
        p = false;
        a.b("YuMeSDK_DeInit(): Successful.");
        a.b();
        try
        {
            d.YuMeBSP_DeInit();
        }
        catch (YuMeBSPException yumebspexception)
        {
            yumebspexception.printStackTrace();
        }
        if (v)
        {
            d = null;
            v = false;
        }
        try
        {
            e.YuMePlayer_DeInit();
        }
        catch (YuMePlayerException yumeplayerexception)
        {
            yumeplayerexception.printStackTrace();
        }
        if (w)
        {
            e = null;
            w = false;
        }
    }

    public YuMeAdParams YuMeSDK_GetAdParams()
        throws YuMeException
    {
        a.b("YuMeSDK_GetAdParams(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_GetAdParams(): YuMe SDK is not Initialized.");
        }
        YuMeAdParams yumeadparams = null;
        if (b != null)
        {
            yumeadparams = new YuMeAdParams();
            yumeadparams.adServerUrl = b.adServerUrl;
            yumeadparams.domainId = b.domainId;
            yumeadparams.qsParams = b.qsParams;
            yumeadparams.bSupportMP4 = b.bSupportMP4;
            yumeadparams.bSupport3GPP = b.bSupport3GPP;
            yumeadparams.bSupportHighBitRate = b.bSupportHighBitRate;
            yumeadparams.bSupportAutoNetworkDetect = b.bSupportAutoNetworkDetect;
            yumeadparams.bEnableCaching = b.bEnableCaching;
            yumeadparams.bEnableAutoPrefetch = b.bEnableAutoPrefetch;
            yumeadparams.bEnableCBToggle = b.bEnableCBToggle;
            yumeadparams.bEnableLocationSupport = b.bEnableLocationSupport;
            yumeadparams.bEnableFileLogging = b.bEnableFileLogging;
            yumeadparams.bEnableConsoleLogging = b.bEnableConsoleLogging;
            yumeadparams.bRequireVastAds = b.bRequireVastAds;
            try
            {
                yumeadparams.adTimeout = d.YuMeBSP_GetAdConnectionTimeoutSec();
                yumeadparams.storageSize = d.YuMeBSP_GetMaxPersistentStorageMB();
                yumeadparams.storageMode = d.YuMeBSP_GetStorageMode();
            }
            catch (YuMeBSPException yumebspexception)
            {
                yumebspexception.printStackTrace();
            }
            try
            {
                yumeadparams.videoTimeout = e.YuMePlayer_GetProgressiveDownloadTimeoutSec();
            }
            catch (YuMePlayerException yumeplayerexception)
            {
                yumeplayerexception.printStackTrace();
            }
        }
        a.b("YuMeSDK_GetAdParams(): Successful.");
        return yumeadparams;
    }

    public YuMeDownloadStatus YuMeSDK_GetDownloadStatus()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_GetDownloadStatus(): YuMe SDK is not Initialized.");
        }
        YuMeDownloadStatus yumedownloadstatus = i.b();
        a.b((new StringBuilder("YuMeSDK_GetDownloadStatus(): Successful, Download Status: ")).append(yumedownloadstatus).toString());
        return yumedownloadstatus;
    }

    public float YuMeSDK_GetDownloadedPercentage()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_GetDownloadedPercentage(): YuMe SDK is not Initialized.");
        }
        float f1 = i.m();
        a.b((new StringBuilder("YuMeSDK_GetDownloadedPercentage(): Successful, Downloaded %: ")).append(f1).toString());
        return f1;
    }

    public String YuMeSDK_GetVersion()
        throws YuMeException
    {
        String s1 = aE.a();
        a.b((new StringBuilder("YuMe SDK Version: ")).append(s1).toString());
        return s1;
    }

    public void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface)
        throws YuMeException
    {
        YuMeBSPInterface yumebspinterface = b();
        if (yumebspinterface == null)
        {
            a("YuMeSDK_Init(): Error instantiating YuMe BSP module.");
            return;
        }
        YuMePlayerInterface yumeplayerinterface = c();
        if (yumeplayerinterface == null)
        {
            a("YuMeSDK_Init(): Error instantiating YuMe Player module.");
            return;
        } else
        {
            a(yumeadparams, yumeappinterface, yumebspinterface, yumeplayerinterface);
            return;
        }
    }

    public void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface, YuMeBSPInterface yumebspinterface, YuMePlayerInterface yumeplayerinterface)
        throws YuMeException
    {
        a(yumeadparams, yumeappinterface, yumebspinterface, yumeplayerinterface);
    }

    public void YuMeSDK_Init(YuMeAdParams yumeadparams, YuMeAppInterface yumeappinterface, YuMePlayerInterface yumeplayerinterface)
        throws YuMeException
    {
        YuMeBSPInterface yumebspinterface = b();
        if (yumebspinterface == null)
        {
            a("YuMeSDK_Init(): Error instantiating YuMe BSP module.");
            return;
        } else
        {
            a(yumeadparams, yumeappinterface, yumebspinterface, yumeplayerinterface);
            return;
        }
    }

    public void YuMeSDK_InitAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException
    {
        a.b((new StringBuilder("********** YuMeSDK_InitAd(): Invoked with AdBlock: ")).append(yumeadblocktype).append(" **********").toString());
        if (!p)
        {
            a("YuMeSDK_InitAd(): YuMe SDK is not Initialized.");
        }
        if (r)
        {
            a("YuMeSDK_InitAd(): Previous Ad Operation in Progress.");
        }
        h.a(true);
        yumeadblocktype = h.a(yumeadblocktype);
        if (yumeadblocktype != null)
        {
            a((new StringBuilder("YuMeSDK_InitAd(): ")).append(yumeadblocktype).toString());
            h.a(false);
        }
        a.b("YuMeSDK_InitAd(): Successful.");
    }

    public boolean YuMeSDK_IsAutoPrefetchEnabled()
        throws YuMeException
    {
        boolean flag = false;
        if (!p)
        {
            a("YuMeSDK_IsAutoPrefetchEnabled(): YuMe SDK is not Initialized.");
        }
        if (b != null)
        {
            flag = b.bEnableAutoPrefetch.booleanValue();
        }
        a.b((new StringBuilder("YuMeSDK_IsAutoPrefetchEnabled(): Successful, Auto Prefetch Enabled: ")).append(flag).toString());
        return flag;
    }

    public boolean YuMeSDK_IsCacheEnabled()
        throws YuMeException
    {
        boolean flag = false;
        if (!p)
        {
            a("YuMeSDK_IsCacheEnabled(): YuMe SDK is not Initialized.");
        }
        if (b != null)
        {
            flag = b.bEnableCaching.booleanValue();
        }
        a.b((new StringBuilder("YuMeSDK_IsCacheEnabled(): Successful, Cache Enabled: ")).append(flag).toString());
        return flag;
    }

    public void YuMeSDK_ModifyAdParams(YuMeAdParams yumeadparams)
        throws YuMeException
    {
        a.b("YuMeSDK_ModifyAdParams(): Invoked.");
        if (yumeadparams == null)
        {
            a("YuMeSDK_ModifyAdParams(): Ad Param object is Invalid.");
        }
        if (!p)
        {
            a("YuMeSDK_ModifyAdParams(): YuMe SDK is not Initialized.");
        }
        String s1 = a(yumeadparams);
        if (s1 != null)
        {
            a((new StringBuilder("YuMeSDK_ModifyAdParams(): ")).append(s1).toString());
        }
        if (yumeadparams != null)
        {
            try
            {
                d.YuMeBSP_ModifyParams(yumeadparams.adTimeout, yumeadparams.storageSize, yumeadparams.storageMode, yumeadparams.bEnableFileLogging.booleanValue(), yumeadparams.bEnableConsoleLogging.booleanValue());
            }
            catch (YuMeBSPException yumebspexception)
            {
                yumebspexception.printStackTrace();
                a((new StringBuilder("YuMeSDK_ModifyAdParams(): ")).append(yumebspexception.getMessage()).toString());
            }
        }
        if (yumeadparams != null)
        {
            try
            {
                e.YuMePlayer_ModifyParams(yumeadparams.videoTimeout, yumeadparams.bEnableFileLogging.booleanValue(), yumeadparams.bEnableConsoleLogging.booleanValue());
            }
            // Misplaced declaration of an exception variable
            catch (YuMeAdParams yumeadparams)
            {
                yumeadparams.printStackTrace();
                a((new StringBuilder("YuMeSDK_ModifyAdParams(): ")).append(yumeadparams.getMessage()).toString());
            }
        }
        l.b();
        k.d();
        if (b.bEnableFileLogging.booleanValue())
        {
            a.a(a());
        }
        if (b.bRequireVastAds.booleanValue()) goto _L2; else goto _L1
_L1:
        n = null;
        if (m == null)
        {
            m = new aF();
        }
_L4:
        a.b("YuMeSDK_ModifyAdParams(): Successful.");
        return;
_L2:
        m = null;
        if (n == null)
        {
            n = new az();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void YuMeSDK_PauseDownload()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_PauseDownload(): YuMe SDK is not Initialized.");
        }
        i.h();
    }

    public void YuMeSDK_ResumeDownload()
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_ResumeDownload(): YuMe SDK is not Initialized.");
        }
        i.i();
    }

    public void YuMeSDK_SetAutoPrefetch(boolean flag)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_SetAutoPrefetch(): YuMe SDK is not Initialized.");
        }
        if (b != null)
        {
            b.bEnableAutoPrefetch = Boolean.valueOf(flag);
            a.b((new StringBuilder("Setting Auto-Prefetch mode to ")).append(b.bEnableAutoPrefetch).toString());
        }
    }

    public void YuMeSDK_SetCacheEnabled(boolean flag)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_SetCacheEnabled(): YuMe SDK is not Initialized.");
        }
        if (b != null)
        {
            b.bEnableCaching = Boolean.valueOf(flag);
            a.b((new StringBuilder("Setting Caching mode to ")).append(b.bEnableCaching).toString());
        }
    }

    public void YuMeSDK_SetControlBarToggle(boolean flag)
        throws YuMeException
    {
        if (!p)
        {
            a("YuMeSDK_SetControlBarToggle(): YuMe SDK is not Initialized.");
        }
        if (b != null)
        {
            b.bEnableCBToggle = Boolean.valueOf(flag);
            a.b((new StringBuilder("Setting Control Bar Toggle Mode to ")).append(b.bEnableCBToggle).toString());
        }
    }

    public void YuMeSDK_SetParentView(FrameLayout framelayout)
        throws YuMeException
    {
        a.b("YuMeSDK_SetParentView(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_SetParentView(): YuMe SDK is not Initialized.");
        }
        if (framelayout == null)
        {
            a("YuMeSDK_SetParentView(): fLayout is NULL.");
        }
        if (r)
        {
            a("YuMeSDK_SetParentView(): Previous Ad Operation in Progress.");
        }
        try
        {
            e.YuMePlayer_SetParentView(framelayout);
        }
        // Misplaced declaration of an exception variable
        catch (FrameLayout framelayout)
        {
            framelayout.printStackTrace();
            a((new StringBuilder("YuMeSDK_SetParentView(): ")).append(framelayout.getMessage()).toString());
        }
        a.b("YuMeSDK_SetParentView(): Successful.");
    }

    public void YuMeSDK_ShowAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException
    {
        YuMeConnectionType yumeconnectiontype;
        a.b((new StringBuilder("********** YuMeSDK_ShowAd(): Invoked with AdBlock: ")).append(yumeadblocktype).append(" **********").toString());
        if (!p)
        {
            a("YuMeSDK_ShowAd(): YuMe SDK is not Initialized.");
        }
        if (yumeadblocktype != YuMeAdBlockType.PREROLL && yumeadblocktype != YuMeAdBlockType.MIDROLL && yumeadblocktype != YuMeAdBlockType.POSTROLL)
        {
            a("YuMeSDK_ShowAd(): Invalid Ad Block Type.");
        }
        if (r)
        {
            a("YuMeSDK_ShowAd(): Previous Ad Operation in Progress.");
        }
        yumeconnectiontype = YuMeConnectionType.NONE;
        YuMeConnectionType yumeconnectiontype1 = d.YuMeBSP_GetConnectionType();
        yumeconnectiontype = yumeconnectiontype1;
_L1:
        if (yumeconnectiontype == YuMeConnectionType.NONE)
        {
            a("YuMeSDK_ShowAd(): No Network Connection Available.");
        }
        t = null;
        YuMeBSPException yumebspexception;
        if (i.c(yumeadblocktype))
        {
            E.a(yumeadblocktype);
            E.a(true);
            r = true;
        } else
        {
            a("YuMeSDK_ShowAd(): No Prefetched Ad Present.");
        }
        a.b("YuMeSDK_ShowAd(): Successful.");
        return;
        yumebspexception;
        yumebspexception.printStackTrace();
          goto _L1
    }

    public void YuMeSDK_StartAd(YuMeAdBlockType yumeadblocktype)
        throws YuMeException
    {
        YuMeConnectionType yumeconnectiontype;
        a.b((new StringBuilder("********** YuMeSDK_StartAd(): Invoked with AdBlock: ")).append(yumeadblocktype).append(" **********").toString());
        if (!p)
        {
            a("YuMeSDK_StartAd(): YuMe SDK is not Initialized.");
        }
        yumeconnectiontype = YuMeConnectionType.NONE;
        YuMeConnectionType yumeconnectiontype1 = d.YuMeBSP_GetConnectionType();
        yumeconnectiontype = yumeconnectiontype1;
_L2:
        if (yumeconnectiontype == YuMeConnectionType.NONE)
        {
            E.a(yumeadblocktype);
            E.e();
            return;
        }
        break; /* Loop/switch isn't completed */
        YuMeBSPException yumebspexception;
        yumebspexception;
        yumebspexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        if (r)
        {
            a("YuMeSDK_StartAd(): Previous Ad Operation in Progress.");
        }
        i.k();
        E.a(yumeadblocktype);
        E.a(false);
        t = null;
        yumeadblocktype = q.a(yumeadblocktype);
        if (yumeadblocktype != null)
        {
            a((new StringBuilder("YuMeSDK_StartAd(): ")).append(yumeadblocktype).toString());
        }
        r = true;
        a.b("YuMeSDK_StartAd(): Successful.");
        return;
    }

    public void YuMeSDK_StopAd()
        throws YuMeException
    {
        a.b("YuMeSDK_StopAd(): Invoked.");
        if (!p)
        {
            a("YuMeSDK_StopAd(): YuMe SDK is not Initialized.");
        }
        if (!r)
        {
            a.b("No Ad Operation in Progress.");
            return;
        } else
        {
            l.c();
            k.g();
            b(E.a(), E.b());
            a.b("YuMeSDK_StopAd(): Successful.");
            return;
        }
    }

}
