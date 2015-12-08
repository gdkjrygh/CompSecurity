// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gi, gx

public final class gt extends gi
{

    public final void a(BitSet bitset, int i)
    {
        boolean flag = false;
        byte abyte0[] = new byte[(int)Math.ceil((double)i / 8D)];
        for (i = 0; i < bitset.length(); i++)
        {
            if (bitset.get(i))
            {
                int j = abyte0.length - i / 8 - 1;
                abyte0[j] = (byte)(abyte0[j] | 1 << i % 8);
            }
        }

        int k = abyte0.length;
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            a(abyte0[i]);
        }

    }

    public final BitSet b(int i)
    {
        boolean flag = false;
        int j = (int)Math.ceil((double)i / 8D);
        byte abyte0[] = new byte[j];
        for (i = 0; i < j; i++)
        {
            abyte0[i] = k();
        }

        BitSet bitset = new BitSet();
        for (i = ((flag) ? 1 : 0); i < abyte0.length * 8; i++)
        {
            if ((abyte0[abyte0.length - i / 8 - 1] & 1 << i % 8) > 0)
            {
                bitset.set(i);
            }
        }

        return bitset;
    }

    public final Class s()
    {
        return b/a/gx;
    }
}
