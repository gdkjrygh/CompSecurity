// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ApplicationPerformanceMetricsLogging

public static final class  extends Enum
{

    private static final virtualRemote $VALUES[];
    public static final virtualRemote bannerAd;
    public static final virtualRemote dedicatedOnScreenIcon;
    public static final virtualRemote dial;
    public static final virtualRemote externalApp;
    public static final virtualRemote externalControlProtocol;
    public static final virtualRemote itemInApplicationList;
    public static final virtualRemote liveFolder;
    public static final virtualRemote metaDiscovery;
    public static final virtualRemote remoteButton;
    public static final virtualRemote searchContinuation;
    public static final virtualRemote searchResult;
    public static final virtualRemote touchGesture;
    public static final virtualRemote virtualRemote;
    public static final virtualRemote visualGesture;
    public static final virtualRemote voiceControl;
    public static final virtualRemote webBrowser;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/ApplicationPerformanceMetricsLogging$UiStartupTrigger, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        remoteButton = new <init>("remoteButton", 0);
        dedicatedOnScreenIcon = new <init>("dedicatedOnScreenIcon", 1);
        itemInApplicationList = new <init>("itemInApplicationList", 2);
        searchResult = new <init>("searchResult", 3);
        searchContinuation = new <init>("searchContinuation", 4);
        webBrowser = new <init>("webBrowser", 5);
        liveFolder = new <init>("liveFolder", 6);
        externalApp = new <init>("externalApp", 7);
        bannerAd = new <init>("bannerAd", 8);
        externalControlProtocol = new <init>("externalControlProtocol", 9);
        metaDiscovery = new <init>("metaDiscovery", 10);
        dial = new <init>("dial", 11);
        voiceControl = new <init>("voiceControl", 12);
        visualGesture = new <init>("visualGesture", 13);
        touchGesture = new <init>("touchGesture", 14);
        virtualRemote = new <init>("virtualRemote", 15);
        $VALUES = (new .VALUES[] {
            remoteButton, dedicatedOnScreenIcon, itemInApplicationList, searchResult, searchContinuation, webBrowser, liveFolder, externalApp, bannerAd, externalControlProtocol, 
            metaDiscovery, dial, voiceControl, visualGesture, touchGesture, virtualRemote
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
