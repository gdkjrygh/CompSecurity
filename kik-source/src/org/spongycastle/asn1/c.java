// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.InputStream;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1StreamParser, ASN1OctetStringParser

final class c extends InputStream
{

    private final ASN1StreamParser a;
    private boolean b;
    private InputStream c;

    c(ASN1StreamParser asn1streamparser)
    {
        b = true;
        a = asn1streamparser;
    }

    public final int read()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        if (b) goto _L4; else goto _L3
_L3:
        int i = -1;
_L6:
        return i;
_L4:
        ASN1OctetStringParser asn1octetstringparser = (ASN1OctetStringParser)a.a();
        if (asn1octetstringparser == null)
        {
            return -1;
        }
        b = false;
        c = asn1octetstringparser.c();
_L2:
        do
        {
            int j = c.read();
            i = j;
            if (j >= 0)
            {
                continue;
            }
            ASN1OctetStringParser asn1octetstringparser1 = (ASN1OctetStringParser)a.a();
            if (asn1octetstringparser1 == null)
            {
                c = null;
                return -1;
            }
            c = asn1octetstringparser1.c();
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int read(byte abyte0[], int i, int j)
    {
        int k;
        int l;
        l = 0;
        k = l;
        if (c != null) goto _L2; else goto _L1
_L1:
        if (b) goto _L4; else goto _L3
_L3:
        k = -1;
_L6:
        return k;
_L4:
        ASN1OctetStringParser asn1octetstringparser = (ASN1OctetStringParser)a.a();
        if (asn1octetstringparser == null)
        {
            return -1;
        }
        b = false;
        c = asn1octetstringparser.c();
        k = l;
_L2:
        l = c.read(abyte0, i + k, j - k);
        if (l < 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        l += k;
        k = l;
        if (l == j) goto _L6; else goto _L5
_L5:
        k = l;
          goto _L2
        ASN1OctetStringParser asn1octetstringparser1 = (ASN1OctetStringParser)a.a();
        if (asn1octetstringparser1 == null)
        {
            c = null;
            if (k <= 0)
            {
                return -1;
            } else
            {
                return k;
            }
        }
        c = asn1octetstringparser1.c();
          goto _L2
    }
}
