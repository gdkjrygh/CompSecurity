// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AndroidCertVerifyResult
{

    private final List mCertificateChain;
    private final boolean mIsIssuedByKnownRoot;
    private final int mStatus;

    public AndroidCertVerifyResult(int i)
    {
        mStatus = i;
        mIsIssuedByKnownRoot = false;
        mCertificateChain = Collections.emptyList();
    }

    public AndroidCertVerifyResult(int i, boolean flag, List list)
    {
        mStatus = i;
        mIsIssuedByKnownRoot = flag;
        mCertificateChain = new ArrayList(list);
    }

    public byte[][] getCertificateChainEncoded()
    {
        byte abyte0[][];
        int i;
        abyte0 = new byte[mCertificateChain.size()][];
        i = 0;
_L2:
        Object obj = abyte0;
        if (i >= mCertificateChain.size())
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = ((X509Certificate)mCertificateChain.get(i)).getEncoded();
        i++;
        if (true) goto _L2; else goto _L1
        obj;
        obj = new byte[0][];
_L1:
        return ((byte [][]) (obj));
    }

    public int getStatus()
    {
        return mStatus;
    }

    public boolean isIssuedByKnownRoot()
    {
        return mIsIssuedByKnownRoot;
    }
}
