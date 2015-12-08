// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            InternalCodes, CSMAKEYS

public static class 
{

    static final int CONFIG_POLLING_COUNT = 40;
    static final int CONFIG_POLLING_INTERVAL = 500;
    static final int DEFAULT_NO_START_TIME = 0xdbba0;
    static final CSMAKEYS iSLineKeysForPending[];

    static 
    {
        iSLineKeysForPending = (new CSMAKEYS[] {
            CSMAKEYS.hostname, CSMAKEYS.appname, CSMAKEYS.streamname, CSMAKEYS.port, CSMAKEYS.protocol, CSMAKEYS.playerreferrer, CSMAKEYS.pageurl, CSMAKEYS.pagereferrer, CSMAKEYS.pagehost, CSMAKEYS.pagereferrerhost, 
            CSMAKEYS.useragent, CSMAKEYS.playerversion, CSMAKEYS.playertype, CSMAKEYS.os, CSMAKEYS.format, CSMAKEYS.connecttime, CSMAKEYS.bufferingtime, CSMAKEYS.startuptime, CSMAKEYS.streamlength, CSMAKEYS.bytestotal, 
            CSMAKEYS.encodedfps, CSMAKEYS.browser, CSMAKEYS.browsersize, CSMAKEYS.videosize, CSMAKEYS.streamurl, CSMAKEYS.deliverytype, CSMAKEYS.pluginversion, CSMAKEYS.beaconversion, CSMAKEYS.bucketlength, CSMAKEYS.serverip, 
            CSMAKEYS.playerformat, CSMAKEYS.cdn, CSMAKEYS.connectivity, CSMAKEYS.segmentlength, CSMAKEYS.ismediaencrypted, CSMAKEYS.isallowcache, CSMAKEYS.outlierstartuptime, CSMAKEYS.startupwaittime, CSMAKEYS.clientdns, CSMAKEYS.currentclocktime, 
            CSMAKEYS.adsession, CSMAKEYS.adcount, CSMAKEYS.adplayclocktime, CSMAKEYS.adstartcount, CSMAKEYS.adabandoncount, CSMAKEYS.fullos, CSMAKEYS.isfirsttitle
        });
    }

    public ()
    {
    }
}
