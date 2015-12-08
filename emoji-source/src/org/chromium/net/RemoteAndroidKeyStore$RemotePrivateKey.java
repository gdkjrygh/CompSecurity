// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            AndroidPrivateKey, RemoteAndroidKeyStore, AndroidKeyStore

private static class mStore
    implements AndroidPrivateKey
{

    final int mHandle;
    final RemoteAndroidKeyStore mStore;

    public int getHandle()
    {
        return mHandle;
    }

    public AndroidKeyStore getKeyStore()
    {
        return mStore;
    }

    (int i, RemoteAndroidKeyStore remoteandroidkeystore)
    {
        mHandle = i;
        mStore = remoteandroidkeystore;
    }
}
