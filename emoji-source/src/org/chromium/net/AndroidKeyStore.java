// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            AndroidPrivateKey

public interface AndroidKeyStore
{

    public abstract byte[] getDSAKeyParamQ(AndroidPrivateKey androidprivatekey);

    public abstract byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey);

    public abstract Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey);

    public abstract long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey);

    public abstract byte[] getPrivateKeyEncodedBytes(AndroidPrivateKey androidprivatekey);

    public abstract int getPrivateKeyType(AndroidPrivateKey androidprivatekey);

    public abstract byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey);

    public abstract byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[]);

    public abstract void releaseKey(AndroidPrivateKey androidprivatekey);
}
