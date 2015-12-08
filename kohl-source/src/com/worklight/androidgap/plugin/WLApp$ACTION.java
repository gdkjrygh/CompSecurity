// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            WLApp

public static final class  extends Enum
{

    private static final deleteCookie $VALUES[];
    public static final deleteCookie broadcastNativeNotification;
    public static final deleteCookie clearHistory;
    public static final deleteCookie clearSessionCookies;
    public static final deleteCookie clearSharedToken;
    public static final deleteCookie copyToClipboard;
    public static final deleteCookie deleteCookie;
    public static final deleteCookie getAvailableSpace;
    public static final deleteCookie getCookies;
    public static final deleteCookie getDeviceLocale;
    public static final deleteCookie getInitParameters;
    public static final deleteCookie getSDKVersion;
    public static final deleteCookie getScreenHeight;
    public static final deleteCookie getScreenSize;
    public static final deleteCookie getScreenWidth;
    public static final deleteCookie getServerUrl;
    public static final deleteCookie getSharedToken;
    public static final deleteCookie getSkinPath;
    public static final deleteCookie openURL;
    public static final deleteCookie readUserPref;
    public static final deleteCookie reload;
    public static final deleteCookie reloadApp;
    public static final deleteCookie setCookie;
    public static final deleteCookie setServerUrl;
    public static final deleteCookie setSharedToken;
    public static final deleteCookie setWLClientConfig;
    public static final deleteCookie toast;
    public static final deleteCookie writeUserPref;

    public static  fromString(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/worklight/androidgap/plugin/WLApp$ACTION, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    static 
    {
        writeUserPref = new <init>("writeUserPref", 0);
        readUserPref = new <init>("readUserPref", 1);
        getSkinPath = new <init>("getSkinPath", 2);
        getScreenHeight = new <init>("getScreenHeight", 3);
        getScreenWidth = new <init>("getScreenWidth", 4);
        getScreenSize = new <init>("getScreenSize", 5);
        openURL = new <init>("openURL", 6);
        getDeviceLocale = new <init>("getDeviceLocale", 7);
        clearSessionCookies = new <init>("clearSessionCookies", 8);
        copyToClipboard = new <init>("copyToClipboard", 9);
        toast = new <init>("toast", 10);
        clearHistory = new <init>("clearHistory", 11);
        reload = new <init>("reload", 12);
        getAvailableSpace = new <init>("getAvailableSpace", 13);
        getInitParameters = new <init>("getInitParameters", 14);
        reloadApp = new <init>("reloadApp", 15);
        broadcastNativeNotification = new <init>("broadcastNativeNotification", 16);
        setSharedToken = new <init>("setSharedToken", 17);
        getSharedToken = new <init>("getSharedToken", 18);
        clearSharedToken = new <init>("clearSharedToken", 19);
        setWLClientConfig = new <init>("setWLClientConfig", 20);
        setServerUrl = new <init>("setServerUrl", 21);
        getServerUrl = new <init>("getServerUrl", 22);
        getSDKVersion = new <init>("getSDKVersion", 23);
        getCookies = new <init>("getCookies", 24);
        setCookie = new <init>("setCookie", 25);
        deleteCookie = new <init>("deleteCookie", 26);
        $VALUES = (new .VALUES[] {
            writeUserPref, readUserPref, getSkinPath, getScreenHeight, getScreenWidth, getScreenSize, openURL, getDeviceLocale, clearSessionCookies, copyToClipboard, 
            toast, clearHistory, reload, getAvailableSpace, getInitParameters, reloadApp, broadcastNativeNotification, setSharedToken, getSharedToken, clearSharedToken, 
            setWLClientConfig, setServerUrl, getServerUrl, getSDKVersion, getCookies, setCookie, deleteCookie
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
