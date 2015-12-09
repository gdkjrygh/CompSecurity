// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


// Referenced classes of package com.spotify.mobile.android.orbit:
//            OrbitSessionInterface

public final class OrbitSession
    implements OrbitSessionInterface
{

    private long nOrbitSessionPtr;

    private OrbitSession()
    {
    }

    public final native void eraseOfflineUser();

    public final native void flushCaches();

    public final native void log(String s);

    public final native void logABTesting(String s, String s1);

    public final native void logAcceptUserTerms(boolean flag, long l, String s, String s1);

    public final native void logAppStartupTimer(String s, boolean flag, long l);

    public final native void logDeviceIdentifier(String s, String s1);

    public final native void logDevicePowerStatus(String s, String s1, long l);

    public final native void logEvent(String s, String s1, String s2, String s3, String s4, String s5);

    public final native void logView(String s, long l);

    public final native void logViewLoadTimer(String s, String s1, boolean flag, boolean flag1, String s2, long l, 
            String s3);

    public final native void login(String s, String s1);

    public final native void loginWithAnonymousAccount(String s);

    public final native void loginWithFacebookToken(String s, String s1, boolean flag);

    public final native void loginWithSpotifyToken(String s, String s1);

    public final native void loginWithStoredCredentials();

    public final native void logout(boolean flag);

    public final native void reportAdUrlClicked();

    public final native void sendToInbox(String s, String s1, String s2);

    public final native void setLanguage(String s);
}
