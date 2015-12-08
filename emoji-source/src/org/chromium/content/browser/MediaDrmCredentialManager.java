// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


public class MediaDrmCredentialManager
{
    public static interface MediaDrmCredentialManagerCallback
    {

        public abstract void onCredentialResetFinished(boolean flag);
    }


    public MediaDrmCredentialManager()
    {
    }

    private static native void nativeResetCredentials(MediaDrmCredentialManagerCallback mediadrmcredentialmanagercallback);

    public static void resetCredentials(MediaDrmCredentialManagerCallback mediadrmcredentialmanagercallback)
    {
        nativeResetCredentials(mediadrmcredentialmanagercallback);
    }
}
