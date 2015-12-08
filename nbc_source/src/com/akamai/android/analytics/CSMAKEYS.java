// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


final class CSMAKEYS extends Enum
{

    private static final CSMAKEYS ENUM$VALUES[];
    public static final CSMAKEYS adabandoncount;
    public static final CSMAKEYS adcount;
    public static final CSMAKEYS adplayclocktime;
    public static final CSMAKEYS adsession;
    public static final CSMAKEYS adstartcount;
    public static final CSMAKEYS adstartuptime;
    public static final CSMAKEYS appname;
    public static final CSMAKEYS asmsession;
    public static final CSMAKEYS attemptid;
    public static final CSMAKEYS audiobandwidth;
    public static final CSMAKEYS audiobufferlength;
    public static final CSMAKEYS availablebandwidth;
    public static final CSMAKEYS averagedbitrate;
    public static final CSMAKEYS averagefps;
    public static final CSMAKEYS averagefpspercent;
    public static final CSMAKEYS backgroundtime;
    public static final CSMAKEYS bandwidthpercent;
    public static final CSMAKEYS beaconid;
    public static final CSMAKEYS beaconversion;
    public static final CSMAKEYS bitratebuckettimes;
    public static final CSMAKEYS bitratebytesloaded;
    public static final CSMAKEYS bitratedroppedframes;
    public static final CSMAKEYS bitrateinterval;
    public static final CSMAKEYS bitraterebuffercount;
    public static final CSMAKEYS browser;
    public static final CSMAKEYS browsersessionid;
    public static final CSMAKEYS browsersize;
    public static final CSMAKEYS bucketbackwardseeks;
    public static final CSMAKEYS bucketcount;
    public static final CSMAKEYS bucketforwardseeks;
    public static final CSMAKEYS bucketfullscreentimes;
    public static final CSMAKEYS bucketlength;
    public static final CSMAKEYS bucketpausecounts;
    public static final CSMAKEYS bucketpausetimes;
    public static final CSMAKEYS bucketplays;
    public static final CSMAKEYS bucketrebuffercounts;
    public static final CSMAKEYS bucketrebuffertimes;
    public static final CSMAKEYS bucketresumebuffercounts;
    public static final CSMAKEYS bucketresumebuffertimes;
    public static final CSMAKEYS bucketseeks;
    public static final CSMAKEYS bucketseektimes;
    public static final CSMAKEYS bufferingtime;
    public static final CSMAKEYS bufferlength;
    public static final CSMAKEYS buffertime;
    public static final CSMAKEYS bytesloaded;
    public static final CSMAKEYS bytesplayed;
    public static final CSMAKEYS bytestotal;
    public static final CSMAKEYS category;
    public static final CSMAKEYS cdn;
    public static final CSMAKEYS clientdns;
    public static final CSMAKEYS clientid;
    public static final CSMAKEYS connectivity;
    public static final CSMAKEYS connecttime;
    public static final CSMAKEYS contentlength;
    public static final CSMAKEYS contenttype;
    public static final CSMAKEYS currentclocktime;
    public static final CSMAKEYS currentstreamtime;
    public static final CSMAKEYS databandwidth;
    public static final CSMAKEYS databufferlength;
    public static final CSMAKEYS deliverytype;
    public static final CSMAKEYS device;
    public static final CSMAKEYS downswitchreasoncounts;
    public static final CSMAKEYS droppedframes;
    public static final CSMAKEYS encodedbitrate;
    public static final CSMAKEYS encodedfps;
    public static final CSMAKEYS endofstream;
    public static final CSMAKEYS endreasoncode;
    public static final CSMAKEYS epochtime;
    public static final CSMAKEYS errorcode;
    public static final CSMAKEYS eventcode;
    public static final CSMAKEYS eventname;
    public static final CSMAKEYS format;
    public static final CSMAKEYS formatversion;
    public static final CSMAKEYS fullos;
    public static final CSMAKEYS fullscreenclocktime;
    public static final CSMAKEYS heartbeatinterval;
    public static final CSMAKEYS hostname;
    public static final CSMAKEYS isallowcache;
    public static final CSMAKEYS isasmenabled;
    public static final CSMAKEYS isfirsttitle;
    public static final CSMAKEYS ismediaencrypted;
    public static final CSMAKEYS issessionwithrebuffer;
    public static final CSMAKEYS issessionwithrebufferh;
    public static final CSMAKEYS issessionwithrebufferlimit;
    public static final CSMAKEYS isview;
    public static final CSMAKEYS isvisitend;
    public static final CSMAKEYS isvisitstart;
    public static final CSMAKEYS lasthtime;
    public static final CSMAKEYS livedelay;
    public static final CSMAKEYS loginterval;
    public static final CSMAKEYS logtype;
    public static final CSMAKEYS logversion;
    public static final CSMAKEYS maxbandwidth;
    public static final CSMAKEYS maxpersistentbitrate;
    public static final CSMAKEYS os;
    public static final CSMAKEYS outlierstartuptime;
    public static final CSMAKEYS pagehost;
    public static final CSMAKEYS pagereferrer;
    public static final CSMAKEYS pagereferrerhost;
    public static final CSMAKEYS pageurl;
    public static final CSMAKEYS partnumber;
    public static final CSMAKEYS pausecount;
    public static final CSMAKEYS pauseduration;
    public static final CSMAKEYS pauseintervalsasstring;
    public static final CSMAKEYS pauseseeksession;
    public static final CSMAKEYS playbackbitrate;
    public static final CSMAKEYS playclocktime;
    public static final CSMAKEYS playerformat;
    public static final CSMAKEYS playerid;
    public static final CSMAKEYS playerreferrer;
    public static final CSMAKEYS playerstate;
    public static final CSMAKEYS playertype;
    public static final CSMAKEYS playerversion;
    public static final CSMAKEYS playstreamtime;
    public static final CSMAKEYS pluginversion;
    public static final CSMAKEYS port;
    public static final CSMAKEYS protocol;
    public static final CSMAKEYS qualityofexperience;
    public static final CSMAKEYS rebuffercount;
    public static final CSMAKEYS rebuffersession;
    public static final CSMAKEYS rebuffersessionh;
    public static final CSMAKEYS rebuffertime;
    public static final CSMAKEYS resumebuffercount;
    public static final CSMAKEYS resumebuffertime;
    public static final CSMAKEYS rtt;
    public static final CSMAKEYS seekcount;
    public static final CSMAKEYS seekintervalsasstring;
    public static final CSMAKEYS seektime;
    public static final CSMAKEYS segmentlength;
    public static final CSMAKEYS sequenceid;
    public static final CSMAKEYS sequenceidh;
    public static final CSMAKEYS serverip;
    public static final CSMAKEYS sessionid;
    public static final CSMAKEYS show;
    public static final CSMAKEYS socialsharing;
    public static final CSMAKEYS startuptime;
    public static final CSMAKEYS startupwaittime;
    public static final CSMAKEYS streamlength;
    public static final CSMAKEYS streamname;
    public static final CSMAKEYS streamurl;
    public static final CSMAKEYS subcategory;
    public static final CSMAKEYS title;
    public static final CSMAKEYS totaladabandoncount;
    public static final CSMAKEYS totaladplayclocktime;
    public static final CSMAKEYS totaladstartcount;
    public static final CSMAKEYS totalbandwidth;
    public static final CSMAKEYS totalparts;
    public static final CSMAKEYS totalplayclocktime;
    public static final CSMAKEYS totalplaystreamtime;
    public static final CSMAKEYS totalrebuffercount;
    public static final CSMAKEYS totalrebuffertime;
    public static final CSMAKEYS transitioncount;
    public static final CSMAKEYS transitiondownswitchcount;
    public static final CSMAKEYS transitionstreamtimes;
    public static final CSMAKEYS transitionstreamtimesession;
    public static final CSMAKEYS transitiontime;
    public static final CSMAKEYS transitionupswitchcount;
    public static final CSMAKEYS upswitchreasoncounts;
    public static final CSMAKEYS useragent;
    public static final CSMAKEYS videobandwidth;
    public static final CSMAKEYS videobufferlength;
    public static final CSMAKEYS videosize;
    public static final CSMAKEYS viewerdiagnosticsid;
    public static final CSMAKEYS viewerid;
    public static final CSMAKEYS visitadabandoncount;
    public static final CSMAKEYS visitadplayclocktime;
    public static final CSMAKEYS visitadstartcount;
    public static final CSMAKEYS visitattempts;
    public static final CSMAKEYS visiterrors;
    public static final CSMAKEYS visitid;
    public static final CSMAKEYS visitinterval;
    public static final CSMAKEYS visitmaxpersistentbitratebucket;
    public static final CSMAKEYS visitplayclocktime;
    public static final CSMAKEYS visitplays;
    public static final CSMAKEYS visitplaystreamtime;
    public static final CSMAKEYS visitrebuffercount;
    public static final CSMAKEYS visitrebuffertime;
    public static final CSMAKEYS visitstartuperrors;
    public static final CSMAKEYS visituniquetitles;
    public static final CSMAKEYS visitviews;
    public static final CSMAKEYS xviewerid;
    public static final CSMAKEYS xvieweridversion;

    private CSMAKEYS(String s, int i)
    {
        super(s, i);
    }

    public static CSMAKEYS valueOf(String s)
    {
        return (CSMAKEYS)Enum.valueOf(com/akamai/android/analytics/CSMAKEYS, s);
    }

    public static CSMAKEYS[] values()
    {
        CSMAKEYS acsmakeys[] = ENUM$VALUES;
        int i = acsmakeys.length;
        CSMAKEYS acsmakeys1[] = new CSMAKEYS[i];
        System.arraycopy(acsmakeys, 0, acsmakeys1, 0, i);
        return acsmakeys1;
    }

    static 
    {
        eventcode = new CSMAKEYS("eventcode", 0);
        beaconid = new CSMAKEYS("beaconid", 1);
        attemptid = new CSMAKEYS("attemptid", 2);
        viewerid = new CSMAKEYS("viewerid", 3);
        viewerdiagnosticsid = new CSMAKEYS("viewerdiagnosticsid", 4);
        heartbeatinterval = new CSMAKEYS("heartbeatinterval", 5);
        issessionwithrebufferlimit = new CSMAKEYS("issessionwithrebufferlimit", 6);
        sessionid = new CSMAKEYS("sessionid", 7);
        clientid = new CSMAKEYS("clientid", 8);
        sequenceid = new CSMAKEYS("sequenceid", 9);
        sequenceidh = new CSMAKEYS("sequenceidh", 10);
        logtype = new CSMAKEYS("logtype", 11);
        endofstream = new CSMAKEYS("endofstream", 12);
        logversion = new CSMAKEYS("logversion", 13);
        formatversion = new CSMAKEYS("formatversion", 14);
        browsersessionid = new CSMAKEYS("browsersessionid", 15);
        epochtime = new CSMAKEYS("epochtime", 16);
        playerid = new CSMAKEYS("playerid", 17);
        title = new CSMAKEYS("title", 18);
        show = new CSMAKEYS("show", 19);
        category = new CSMAKEYS("category", 20);
        subcategory = new CSMAKEYS("subcategory", 21);
        contenttype = new CSMAKEYS("contenttype", 22);
        contentlength = new CSMAKEYS("contentlength", 23);
        device = new CSMAKEYS("device", 24);
        errorcode = new CSMAKEYS("errorcode", 25);
        partnumber = new CSMAKEYS("partnumber", 26);
        totalparts = new CSMAKEYS("totalparts", 27);
        hostname = new CSMAKEYS("hostname", 28);
        appname = new CSMAKEYS("appname", 29);
        streamname = new CSMAKEYS("streamname", 30);
        eventname = new CSMAKEYS("eventname", 31);
        port = new CSMAKEYS("port", 32);
        protocol = new CSMAKEYS("protocol", 33);
        playerreferrer = new CSMAKEYS("playerreferrer", 34);
        pageurl = new CSMAKEYS("pageurl", 35);
        pagereferrer = new CSMAKEYS("pagereferrer", 36);
        pagehost = new CSMAKEYS("pagehost", 37);
        pagereferrerhost = new CSMAKEYS("pagereferrerhost", 38);
        useragent = new CSMAKEYS("useragent", 39);
        playerversion = new CSMAKEYS("playerversion", 40);
        playertype = new CSMAKEYS("playertype", 41);
        os = new CSMAKEYS("os", 42);
        format = new CSMAKEYS("format", 43);
        connecttime = new CSMAKEYS("connecttime", 44);
        bufferingtime = new CSMAKEYS("bufferingtime", 45);
        startuptime = new CSMAKEYS("startuptime", 46);
        streamlength = new CSMAKEYS("streamlength", 47);
        bytestotal = new CSMAKEYS("bytestotal", 48);
        encodedfps = new CSMAKEYS("encodedfps", 49);
        browser = new CSMAKEYS("browser", 50);
        browsersize = new CSMAKEYS("browsersize", 51);
        videosize = new CSMAKEYS("videosize", 52);
        streamurl = new CSMAKEYS("streamurl", 53);
        deliverytype = new CSMAKEYS("deliverytype", 54);
        pluginversion = new CSMAKEYS("pluginversion", 55);
        beaconversion = new CSMAKEYS("beaconversion", 56);
        bucketlength = new CSMAKEYS("bucketlength", 57);
        serverip = new CSMAKEYS("serverip", 58);
        playerformat = new CSMAKEYS("playerformat", 59);
        cdn = new CSMAKEYS("cdn", 60);
        connectivity = new CSMAKEYS("connectivity", 61);
        segmentlength = new CSMAKEYS("segmentlength", 62);
        ismediaencrypted = new CSMAKEYS("ismediaencrypted", 63);
        isallowcache = new CSMAKEYS("isallowcache", 64);
        outlierstartuptime = new CSMAKEYS("outlierstartuptime", 65);
        startupwaittime = new CSMAKEYS("startupwaittime", 66);
        clientdns = new CSMAKEYS("clientdns", 67);
        playerstate = new CSMAKEYS("playerstate", 68);
        playbackbitrate = new CSMAKEYS("playbackbitrate", 69);
        audiobandwidth = new CSMAKEYS("audiobandwidth", 70);
        videobandwidth = new CSMAKEYS("videobandwidth", 71);
        databandwidth = new CSMAKEYS("databandwidth", 72);
        audiobufferlength = new CSMAKEYS("audiobufferlength", 73);
        videobufferlength = new CSMAKEYS("videobufferlength", 74);
        databufferlength = new CSMAKEYS("databufferlength", 75);
        droppedframes = new CSMAKEYS("droppedframes", 76);
        currentstreamtime = new CSMAKEYS("currentstreamtime", 77);
        currentclocktime = new CSMAKEYS("currentclocktime", 78);
        playclocktime = new CSMAKEYS("playclocktime", 79);
        playstreamtime = new CSMAKEYS("playstreamtime", 80);
        rebuffercount = new CSMAKEYS("rebuffercount", 81);
        rebuffertime = new CSMAKEYS("rebuffertime", 82);
        averagefps = new CSMAKEYS("averagefps", 83);
        bytesloaded = new CSMAKEYS("bytesloaded", 84);
        pausecount = new CSMAKEYS("pausecount", 85);
        pauseduration = new CSMAKEYS("pauseduration", 86);
        pauseintervalsasstring = new CSMAKEYS("pauseintervalsasstring", 87);
        seekcount = new CSMAKEYS("seekcount", 88);
        seektime = new CSMAKEYS("seektime", 89);
        seekintervalsasstring = new CSMAKEYS("seekintervalsasstring", 90);
        pauseseeksession = new CSMAKEYS("pauseseeksession", 91);
        bandwidthpercent = new CSMAKEYS("bandwidthpercent", 92);
        bufferlength = new CSMAKEYS("bufferlength", 93);
        averagefpspercent = new CSMAKEYS("averagefpspercent", 94);
        totalbandwidth = new CSMAKEYS("totalbandwidth", 95);
        resumebuffercount = new CSMAKEYS("resumebuffercount", 96);
        resumebuffertime = new CSMAKEYS("resumebuffertime", 97);
        bytesplayed = new CSMAKEYS("bytesplayed", 98);
        availablebandwidth = new CSMAKEYS("availablebandwidth", 99);
        fullscreenclocktime = new CSMAKEYS("fullscreenclocktime", 100);
        encodedbitrate = new CSMAKEYS("encodedbitrate", 101);
        buffertime = new CSMAKEYS("buffertime", 102);
        isview = new CSMAKEYS("isview", 103);
        issessionwithrebuffer = new CSMAKEYS("issessionwithrebuffer", 104);
        loginterval = new CSMAKEYS("loginterval", 105);
        livedelay = new CSMAKEYS("livedelay", 106);
        rtt = new CSMAKEYS("rtt", 107);
        bucketcount = new CSMAKEYS("bucketcount", 108);
        bucketplays = new CSMAKEYS("bucketplays", 109);
        bucketpausecounts = new CSMAKEYS("bucketpausecounts", 110);
        bucketpausetimes = new CSMAKEYS("bucketpausetimes", 111);
        bucketseeks = new CSMAKEYS("bucketseeks", 112);
        bucketforwardseeks = new CSMAKEYS("bucketforwardseeks", 113);
        bucketbackwardseeks = new CSMAKEYS("bucketbackwardseeks", 114);
        bucketrebuffercounts = new CSMAKEYS("bucketrebuffercounts", 115);
        bucketrebuffertimes = new CSMAKEYS("bucketrebuffertimes", 116);
        bucketresumebuffercounts = new CSMAKEYS("bucketresumebuffercounts", 117);
        bucketresumebuffertimes = new CSMAKEYS("bucketresumebuffertimes", 118);
        bucketseektimes = new CSMAKEYS("bucketseektimes", 119);
        bucketfullscreentimes = new CSMAKEYS("bucketfullscreentimes", 120);
        transitioncount = new CSMAKEYS("transitioncount", 121);
        transitionupswitchcount = new CSMAKEYS("transitionupswitchcount", 122);
        transitiondownswitchcount = new CSMAKEYS("transitiondownswitchcount", 123);
        transitiontime = new CSMAKEYS("transitiontime", 124);
        upswitchreasoncounts = new CSMAKEYS("upswitchreasoncounts", 125);
        downswitchreasoncounts = new CSMAKEYS("downswitchreasoncounts", 126);
        transitionstreamtimesession = new CSMAKEYS("transitionstreamtimesession", 127);
        transitionstreamtimes = new CSMAKEYS("transitionstreamtimes", 128);
        bitratebuckettimes = new CSMAKEYS("bitratebuckettimes", 129);
        averagedbitrate = new CSMAKEYS("averagedbitrate", 130);
        bitrateinterval = new CSMAKEYS("bitrateinterval", 131);
        bitratebytesloaded = new CSMAKEYS("bitratebytesloaded", 132);
        bitratedroppedframes = new CSMAKEYS("bitratedroppedframes", 133);
        bitraterebuffercount = new CSMAKEYS("bitraterebuffercount", 134);
        backgroundtime = new CSMAKEYS("backgroundtime", 135);
        rebuffersession = new CSMAKEYS("rebuffersession", 136);
        adsession = new CSMAKEYS("adsession", 137);
        adcount = new CSMAKEYS("adcount", 138);
        adplayclocktime = new CSMAKEYS("adplayclocktime", 139);
        adstartuptime = new CSMAKEYS("adstartuptime", 140);
        asmsession = new CSMAKEYS("asmsession", 141);
        isasmenabled = new CSMAKEYS("isasmenabled", 142);
        endreasoncode = new CSMAKEYS("endreasoncode", 143);
        totalplayclocktime = new CSMAKEYS("totalplayclocktime", 144);
        totalplaystreamtime = new CSMAKEYS("totalplaystreamtime", 145);
        totalrebuffercount = new CSMAKEYS("totalrebuffercount", 146);
        totalrebuffertime = new CSMAKEYS("totalrebuffertime", 147);
        maxpersistentbitrate = new CSMAKEYS("maxpersistentbitrate", 148);
        totaladplayclocktime = new CSMAKEYS("totaladplayclocktime", 149);
        isvisitstart = new CSMAKEYS("isvisitstart", 150);
        isvisitend = new CSMAKEYS("isvisitend", 151);
        visitattempts = new CSMAKEYS("visitattempts", 152);
        visitplays = new CSMAKEYS("visitplays", 153);
        visitviews = new CSMAKEYS("visitviews", 154);
        visiterrors = new CSMAKEYS("visiterrors", 155);
        visitinterval = new CSMAKEYS("visitinterval", 156);
        visitplayclocktime = new CSMAKEYS("visitplayclocktime", 157);
        visitplaystreamtime = new CSMAKEYS("visitplaystreamtime", 158);
        visitrebuffercount = new CSMAKEYS("visitrebuffercount", 159);
        visitrebuffertime = new CSMAKEYS("visitrebuffertime", 160);
        visitmaxpersistentbitratebucket = new CSMAKEYS("visitmaxpersistentbitratebucket", 161);
        visitstartuperrors = new CSMAKEYS("visitstartuperrors", 162);
        visitadplayclocktime = new CSMAKEYS("visitadplayclocktime", 163);
        lasthtime = new CSMAKEYS("lasthtime", 164);
        visitid = new CSMAKEYS("visitid", 165);
        rebuffersessionh = new CSMAKEYS("rebuffersessionh", 166);
        issessionwithrebufferh = new CSMAKEYS("issessionwithrebufferh", 167);
        visituniquetitles = new CSMAKEYS("visituniquetitles", 168);
        maxbandwidth = new CSMAKEYS("maxbandwidth", 169);
        xviewerid = new CSMAKEYS("xviewerid", 170);
        xvieweridversion = new CSMAKEYS("xvieweridversion", 171);
        qualityofexperience = new CSMAKEYS("qualityofexperience", 172);
        totaladstartcount = new CSMAKEYS("totaladstartcount", 173);
        totaladabandoncount = new CSMAKEYS("totaladabandoncount", 174);
        visitadstartcount = new CSMAKEYS("visitadstartcount", 175);
        visitadabandoncount = new CSMAKEYS("visitadabandoncount", 176);
        adabandoncount = new CSMAKEYS("adabandoncount", 177);
        adstartcount = new CSMAKEYS("adstartcount", 178);
        socialsharing = new CSMAKEYS("socialsharing", 179);
        fullos = new CSMAKEYS("fullos", 180);
        isfirsttitle = new CSMAKEYS("isfirsttitle", 181);
        ENUM$VALUES = (new CSMAKEYS[] {
            eventcode, beaconid, attemptid, viewerid, viewerdiagnosticsid, heartbeatinterval, issessionwithrebufferlimit, sessionid, clientid, sequenceid, 
            sequenceidh, logtype, endofstream, logversion, formatversion, browsersessionid, epochtime, playerid, title, show, 
            category, subcategory, contenttype, contentlength, device, errorcode, partnumber, totalparts, hostname, appname, 
            streamname, eventname, port, protocol, playerreferrer, pageurl, pagereferrer, pagehost, pagereferrerhost, useragent, 
            playerversion, playertype, os, format, connecttime, bufferingtime, startuptime, streamlength, bytestotal, encodedfps, 
            browser, browsersize, videosize, streamurl, deliverytype, pluginversion, beaconversion, bucketlength, serverip, playerformat, 
            cdn, connectivity, segmentlength, ismediaencrypted, isallowcache, outlierstartuptime, startupwaittime, clientdns, playerstate, playbackbitrate, 
            audiobandwidth, videobandwidth, databandwidth, audiobufferlength, videobufferlength, databufferlength, droppedframes, currentstreamtime, currentclocktime, playclocktime, 
            playstreamtime, rebuffercount, rebuffertime, averagefps, bytesloaded, pausecount, pauseduration, pauseintervalsasstring, seekcount, seektime, 
            seekintervalsasstring, pauseseeksession, bandwidthpercent, bufferlength, averagefpspercent, totalbandwidth, resumebuffercount, resumebuffertime, bytesplayed, availablebandwidth, 
            fullscreenclocktime, encodedbitrate, buffertime, isview, issessionwithrebuffer, loginterval, livedelay, rtt, bucketcount, bucketplays, 
            bucketpausecounts, bucketpausetimes, bucketseeks, bucketforwardseeks, bucketbackwardseeks, bucketrebuffercounts, bucketrebuffertimes, bucketresumebuffercounts, bucketresumebuffertimes, bucketseektimes, 
            bucketfullscreentimes, transitioncount, transitionupswitchcount, transitiondownswitchcount, transitiontime, upswitchreasoncounts, downswitchreasoncounts, transitionstreamtimesession, transitionstreamtimes, bitratebuckettimes, 
            averagedbitrate, bitrateinterval, bitratebytesloaded, bitratedroppedframes, bitraterebuffercount, backgroundtime, rebuffersession, adsession, adcount, adplayclocktime, 
            adstartuptime, asmsession, isasmenabled, endreasoncode, totalplayclocktime, totalplaystreamtime, totalrebuffercount, totalrebuffertime, maxpersistentbitrate, totaladplayclocktime, 
            isvisitstart, isvisitend, visitattempts, visitplays, visitviews, visiterrors, visitinterval, visitplayclocktime, visitplaystreamtime, visitrebuffercount, 
            visitrebuffertime, visitmaxpersistentbitratebucket, visitstartuperrors, visitadplayclocktime, lasthtime, visitid, rebuffersessionh, issessionwithrebufferh, visituniquetitles, maxbandwidth, 
            xviewerid, xvieweridversion, qualityofexperience, totaladstartcount, totaladabandoncount, visitadstartcount, visitadabandoncount, adabandoncount, adstartcount, socialsharing, 
            fullos, isfirsttitle
        });
    }
}
