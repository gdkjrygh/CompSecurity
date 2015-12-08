// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import java.util.zip.Inflater;

// Referenced classes of package com.google.android.m4b.maps.bw:
//            f

public final class d
{
    public static final class a
    {

        public final byte a[];
        public final int b;

        public a(byte abyte0[], int i)
        {
            a = abyte0;
            b = i;
        }
    }


    private static final byte a[] = {
        0
    };

    public static a a(byte abyte0[], int i, int j)
    {
        Inflater inflater;
        int k;
        k = 0;
        inflater = new Inflater(true);
        inflater.setInput(abyte0, i, j);
        i = j * 4;
        byte abyte1[] = f.a(i);
        abyte0 = abyte1;
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        abyte0 = new byte[i];
        i = inflater.inflate(abyte0);
        j = k;
_L5:
        if (inflater.finished()) goto _L2; else goto _L1
_L1:
        int l;
        abyte1 = new byte[abyte0.length * 2];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        l = inflater.inflate(abyte1, i, abyte1.length - i);
        k = j;
        if (l != 0) goto _L4; else goto _L3
_L3:
        if (!inflater.needsInput() || j != 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        inflater.setInput(a);
        k = 1;
          goto _L4
_L2:
        abyte0 = new a(abyte0, i);
        inflater.end();
        return abyte0;
        abyte0;
        inflater.end();
        throw abyte0;
_L4:
        i = l + i;
        abyte0 = abyte1;
        j = k;
          goto _L5
        abyte0 = abyte1;
          goto _L2
    }

}
