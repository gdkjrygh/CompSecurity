// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class jml
{

    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte f[];
    public byte g[];
    public byte h[];
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long n;
    String o;
    public jkq p;
    public int q;

    jml()
    {
        i = -1;
        j = -1;
        k = 1;
        l = 8000;
        m = 0L;
        n = 0L;
        o = "eng";
    }

    static Pair a(jnl jnl1)
    {
        boolean flag;
        int j1;
        flag = false;
        try
        {
            jnl1.b(4);
            j1 = (jnl1.d() & 3) + 1;
        }
        // Misplaced declaration of an exception variable
        catch (jnl jnl1)
        {
            throw new jjj("Error parsing AVC codec private");
        }
        if (j1 != 3)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        throw new jjj();
        ArrayList arraylist;
        int k1;
        arraylist = new ArrayList();
        k1 = jnl1.d();
        int i1 = 0;
_L2:
        if (i1 >= (k1 & 0x1f))
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jnj.a(jnl1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        k1 = jnl1.d();
        i1 = ((flag) ? 1 : 0);
_L4:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jnj.a(jnl1));
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        jnl1 = Pair.create(arraylist, Integer.valueOf(j1));
        return jnl1;
    }

    static List a(byte abyte0[])
    {
_L2:
        k1 = j1 + 1;
        j1 = abyte0[j1];
        if (abyte0[k1] == 1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        throw new jjj("Error parsing vorbis codec private");
        abyte1 = new byte[i2];
        System.arraycopy(abyte0, k1, abyte1, 0, i2);
        k1 = i2 + k1;
        if (abyte0[k1] == 3)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        throw new jjj("Error parsing vorbis codec private");
        i1 = i1 + j1 + k1;
        if (abyte0[i1] == 5)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        throw new jjj("Error parsing vorbis codec private");
        byte abyte2[] = new byte[abyte0.length - i1];
        System.arraycopy(abyte0, i1, abyte2, 0, abyte0.length - i1);
        abyte0 = new ArrayList(2);
        abyte0.add(abyte1);
        abyte0.add(abyte2);
        return abyte0;
        int k1 = 0;
        if (abyte0[0] != 2)
        {
            try
            {
                throw new jjj("Error parsing vorbis codec private");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new jjj("Error parsing vorbis codec private");
            }
        }
        int i1 = 0;
        byte abyte1[];
        int j1;
        int i2;
        for (j1 = 1; abyte0[j1] == -1;)
        {
            j1++;
            i1 += 255;
        }

        int l1 = j1 + 1;
        i2 = i1 + abyte0[j1];
        j1 = l1;
        i1 = k1;
        while (abyte0[j1] == -1) 
        {
            i1 += 255;
            j1++;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Pair b(jnl jnl1)
    {
        int i1;
        int j1;
        int k1;
        byte abyte0[];
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        try
        {
            jnl1.b(21);
            i2 = jnl1.d();
            j2 = jnl1.d();
            l1 = jnl1.b;
        }
        // Misplaced declaration of an exception variable
        catch (jnl jnl1)
        {
            throw new jjj("Error parsing HEVC codec private");
        }
        j1 = 0;
        i1 = 0;
_L10:
        if (j1 >= j2) goto _L2; else goto _L1
_L1:
        jnl1.c(1);
        k2 = jnl1.e();
        k1 = 0;
_L4:
        if (k1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = jnl1.e();
        i1 += l2 + 4;
        jnl1.c(l2);
        k1++;
        if (true) goto _L4; else goto _L3
_L2:
        jnl1.b(l1);
        abyte0 = new byte[i1];
        k1 = 0;
        j1 = 0;
_L11:
        if (k1 >= j2) goto _L6; else goto _L5
_L5:
        jnl1.c(1);
        k2 = jnl1.e();
        l1 = 0;
_L8:
        if (l1 >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = jnl1.e();
        System.arraycopy(jnj.a, 0, abyte0, j1, jnj.a.length);
        j1 += jnj.a.length;
        System.arraycopy(jnl1.a, jnl1.b, abyte0, j1, l2);
        j1 += l2;
        jnl1.c(l2);
        l1++;
        if (true) goto _L8; else goto _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L9:
        return Pair.create(jnl1, Integer.valueOf((i2 & 3) + 1));
_L13:
        jnl1 = Collections.singletonList(abyte0);
          goto _L9
_L3:
        j1++;
          goto _L10
        k1++;
          goto _L11
_L6:
        if (i1 != 0) goto _L13; else goto _L12
_L12:
        jnl1 = null;
          goto _L9
    }
}
