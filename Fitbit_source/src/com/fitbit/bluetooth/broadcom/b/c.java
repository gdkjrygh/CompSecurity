// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.b;

import com.fitbit.util.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class c
{

    private static final short a = 20;

    c()
    {
    }

    static List a(byte abyte0[])
    {
        if (d.b(abyte0))
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList((int)Math.ceil((double)abyte0.length / 20D));
        int i = 0;
        do
        {
label0:
            {
                if (i < abyte0.length)
                {
                    if (abyte0.length - i >= 20)
                    {
                        break label0;
                    }
                    arraylist.add(Arrays.copyOfRange(abyte0, i, abyte0.length));
                }
                return arraylist;
            }
            byte abyte1[] = Arrays.copyOfRange(abyte0, i, i + 20);
            i += 20;
            arraylist.add(abyte1);
        } while (true);
    }
}
