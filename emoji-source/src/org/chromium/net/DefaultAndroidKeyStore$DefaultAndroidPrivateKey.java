// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.security.PrivateKey;

// Referenced classes of package org.chromium.net:
//            AndroidPrivateKey, DefaultAndroidKeyStore, AndroidKeyStore

private static class mStore
    implements AndroidPrivateKey
{

    final PrivateKey mKey;
    final DefaultAndroidKeyStore mStore;

    PrivateKey getJavaKey()
    {
        return mKey;
    }

    public AndroidKeyStore getKeyStore()
    {
        return mStore;
    }

    (PrivateKey privatekey, DefaultAndroidKeyStore defaultandroidkeystore)
    {
        mKey = privatekey;
        mStore = defaultandroidkeystore;
    }
}
