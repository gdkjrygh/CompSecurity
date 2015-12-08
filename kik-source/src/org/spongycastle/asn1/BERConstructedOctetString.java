// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            BEROctetString, DEROctetString

public class BERConstructedOctetString extends BEROctetString
{

    private Vector b;

    public BERConstructedOctetString(byte abyte0[])
    {
        super(abyte0);
    }

    public final byte[] d()
    {
        return a;
    }

    public final Enumeration j()
    {
        if (b == null)
        {
            Vector vector = new Vector();
            int i = 0;
            while (i < a.length) 
            {
                byte abyte0[];
                int k;
                if (i + 1000 > a.length)
                {
                    k = a.length;
                } else
                {
                    k = i + 1000;
                }
                abyte0 = new byte[k - i];
                System.arraycopy(a, i, abyte0, 0, abyte0.length);
                vector.addElement(new DEROctetString(abyte0));
                i += 1000;
            }
            return vector.elements();
        } else
        {
            return b.elements();
        }
    }
}
