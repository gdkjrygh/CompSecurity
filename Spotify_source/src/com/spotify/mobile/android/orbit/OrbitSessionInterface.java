// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;


public interface OrbitSessionInterface
{

    public abstract void eraseOfflineUser();

    public abstract void flushCaches();

    public abstract void log(String s);

    public abstract void logABTesting(String s, String s1);

    public abstract void logAcceptUserTerms(boolean flag, long l, String s, String s1);

    public abstract void logAppStartupTimer(String s, boolean flag, long l);

    public abstract void logDeviceIdentifier(String s, String s1);

    public abstract void logDevicePowerStatus(String s, String s1, long l);

    public abstract void logEvent(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract void logView(String s, long l);

    public abstract void logViewLoadTimer(String s, String s1, boolean flag, boolean flag1, String s2, long l, 
            String s3);

    public abstract void login(String s, String s1);

    public abstract void loginWithAnonymousAccount(String s);

    public abstract void loginWithFacebookToken(String s, String s1, boolean flag);

    public abstract void loginWithSpotifyToken(String s, String s1);

    public abstract void loginWithStoredCredentials();

    public abstract void logout(boolean flag);

    public abstract void reportAdUrlClicked();

    public abstract void sendToInbox(String s, String s1, String s2);

    public abstract void setLanguage(String s);
}
