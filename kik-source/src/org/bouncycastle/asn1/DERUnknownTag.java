// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            DERObject, DEROutputStream

public class DERUnknownTag extends DERObject
{

    private boolean a;
    private int b;
    private byte c[];

    public DERUnknownTag(boolean flag, int i, byte abyte0[])
    {
        a = flag;
        b = i;
        c = abyte0;
    }

    final void a(DEROutputStream deroutputstream)
    {
        byte byte0;
        if (a)
        {
            byte0 = 32;
        } else
        {
            byte0 = 0;
        }
        deroutputstream.a(byte0, b, c);
    }

    public final int e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DERUnknownTag)
        {
            if (a == ((DERUnknownTag) (obj = (DERUnknownTag)obj)).a && b == ((DERUnknownTag) (obj)).b && Arrays.a(c, ((DERUnknownTag) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final byte[] f()
    {
        return c;
    }

    public int hashCode()
    {
        byte byte0;
        if (a)
        {
            byte0 = -1;
        } else
        {
            byte0 = 0;
        }
        return byte0 ^ b ^ Arrays.b(c);
    }
}
