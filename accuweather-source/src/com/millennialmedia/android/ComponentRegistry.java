// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.util.Stack;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMBanner, BridgeMMCachedVideo, BridgeMMCalendar, BridgeMMDevice, 
//            ExampleComponent, BridgeMMInlineVideo, BridgeMMInterstitial, BridgeMMMedia, 
//            BridgeMMNotification, BridgeMMSpeechkit

class ComponentRegistry
{

    static Stack bannerBridges = new Stack();
    static Stack cachedVideoBridges = new Stack();
    static Stack calendarBridges = new Stack();
    static Stack deviceBridges = new Stack();
    static Stack examples = new Stack();
    static Stack inlineVideoBridges = new Stack();
    static Stack interstitialBridges = new Stack();
    static Stack loggingComponents = new Stack();
    static Stack mediaBridges = new Stack();
    static Stack notificationBridges = new Stack();
    static Stack speechkitBridges = new Stack();

    ComponentRegistry()
    {
    }

    static void addBannerBridge(BridgeMMBanner bridgemmbanner)
    {
        bannerBridges.push(bridgemmbanner);
    }

    static void addCachedVideoBridge(BridgeMMCachedVideo bridgemmcachedvideo)
    {
        cachedVideoBridges.push(bridgemmcachedvideo);
    }

    static void addCalendarBridge(BridgeMMCalendar bridgemmcalendar)
    {
        calendarBridges.push(bridgemmcalendar);
    }

    static void addDeviceBridge(BridgeMMDevice bridgemmdevice)
    {
        deviceBridges.push(bridgemmdevice);
    }

    static void addExample(ExampleComponent examplecomponent)
    {
        examples.push(examplecomponent);
    }

    static void addInlineVideoBridge(BridgeMMInlineVideo bridgemminlinevideo)
    {
        inlineVideoBridges.push(bridgemminlinevideo);
    }

    static void addInterstitialBridge(BridgeMMInterstitial bridgemminterstitial)
    {
        interstitialBridges.push(bridgemminterstitial);
    }

    static void addLoggingComponent(MMLog.LoggingComponent loggingcomponent)
    {
        loggingComponents.push(loggingcomponent);
    }

    static void addMediaBridge(BridgeMMMedia bridgemmmedia)
    {
        mediaBridges.push(bridgemmmedia);
    }

    static void addNotificationBridge(BridgeMMNotification bridgemmnotification)
    {
        notificationBridges.push(bridgemmnotification);
    }

    static void addSpeechkitBridge(BridgeMMSpeechkit bridgemmspeechkit)
    {
        speechkitBridges.push(bridgemmspeechkit);
    }

    static BridgeMMBanner getBannerBridge()
    {
        return (BridgeMMBanner)getComponent(bannerBridges);
    }

    static BridgeMMCachedVideo getCachedVideoBridge()
    {
        return (BridgeMMCachedVideo)getComponent(cachedVideoBridges);
    }

    static BridgeMMCalendar getCalendarBridge()
    {
        return (BridgeMMCalendar)getComponent(calendarBridges);
    }

    private static Object getComponent(Stack stack)
    {
        if (stack.isEmpty())
        {
            return null;
        } else
        {
            return stack.lastElement();
        }
    }

    static BridgeMMDevice getDeviceBridge()
    {
        return (BridgeMMDevice)getComponent(deviceBridges);
    }

    static ExampleComponent getExample()
    {
        return (ExampleComponent)getComponent(examples);
    }

    static BridgeMMInlineVideo getInlineVideoBridge()
    {
        return (BridgeMMInlineVideo)getComponent(inlineVideoBridges);
    }

    static BridgeMMInterstitial getInterstitialBridge()
    {
        return (BridgeMMInterstitial)getComponent(interstitialBridges);
    }

    static MMLog.LoggingComponent getLoggingComponent()
    {
        return (MMLog.LoggingComponent)getComponent(loggingComponents);
    }

    static BridgeMMMedia getMediaBridge()
    {
        return (BridgeMMMedia)getComponent(mediaBridges);
    }

    static BridgeMMNotification getNotificationBridge()
    {
        return (BridgeMMNotification)getComponent(notificationBridges);
    }

    static BridgeMMSpeechkit getSpeechkitBridge()
    {
        return (BridgeMMSpeechkit)getComponent(speechkitBridges);
    }

    static void removeBannerBridge(boolean flag)
    {
        removeComponent(flag, bannerBridges);
    }

    static void removeCachedVideoBridge(boolean flag)
    {
        removeComponent(flag, cachedVideoBridges);
    }

    static void removeCalendarBridge(boolean flag)
    {
        removeComponent(flag, calendarBridges);
    }

    private static void removeComponent(boolean flag, Stack stack)
    {
        while (stack.isEmpty() || stack.size() == 1 && !flag) 
        {
            return;
        }
        stack.pop();
    }

    static void removeDeviceBridge(boolean flag)
    {
        removeComponent(flag, deviceBridges);
    }

    static void removeExample(boolean flag)
    {
        removeComponent(flag, examples);
    }

    static void removeInlineVideoBridge(boolean flag)
    {
        removeComponent(flag, inlineVideoBridges);
    }

    static void removeInterstitialBridge(boolean flag)
    {
        removeComponent(flag, interstitialBridges);
    }

    static void removeLoggingComponent(boolean flag)
    {
        removeComponent(flag, loggingComponents);
    }

    static void removeMediaBridge(boolean flag)
    {
        removeComponent(flag, mediaBridges);
    }

    static void removeNotificationBridge(boolean flag)
    {
        removeComponent(flag, notificationBridges);
    }

    static void removeSpeechkitBridge(boolean flag)
    {
        removeComponent(flag, speechkitBridges);
    }

}
