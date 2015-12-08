// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.mylzw;

import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.common.mylzw:
//            MyBitInputStream

public class BitsToByteInputStream extends InputStream
{

    private final MyBitInputStream a;
    private final int b;

    public int read()
    {
        int j = a.a();
        int i;
        if (8 < b)
        {
            i = j << b - 8;
        } else
        {
            i = j;
            if (8 > b)
            {
                return j >> 8 - b;
            }
        }
        return i;
    }
}
