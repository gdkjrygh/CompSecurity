// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.common:
//            b

static final class 
    implements Comparator
{

    public int c(byte abyte0[], byte abyte1[])
    {
        int j = Math.min(abyte0.length, abyte1.length);
        for (int i = 0; i < j; i++)
        {
            int k = abyte0[i] & 0xff;
            int l = abyte1[i] & 0xff;
            if (k != l)
            {
                return k - l;
            }
        }

        return abyte0.length - abyte1.length;
    }

    public int compare(Object obj, Object obj1)
    {
        return c((byte[])obj, (byte[])obj1);
    }

    ()
    {
    }
}
