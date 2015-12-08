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

    private final int a;
    private final boolean b;
    private final List c;

    public AndroidCertVerifyResult(int i)
    {
        a = i;
        b = false;
        c = Collections.emptyList();
    }

    public AndroidCertVerifyResult(int i, boolean flag, List list)
    {
        a = 0;
        b = flag;
        c = new ArrayList(list);
    }

    public byte[][] getCertificateChainEncoded()
    {
        Object obj = new byte[c.size()][];
        int i = 0;
        do
        {
            try
            {
                if (i >= c.size())
                {
                    break;
                }
                obj[i] = ((X509Certificate)c.get(i)).getEncoded();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return new byte[0][];
            }
            i++;
        } while (true);
        return ((byte [][]) (obj));
    }

    public int getStatus()
    {
        return a;
    }

    public boolean isIssuedByKnownRoot()
    {
        return b;
    }
}
