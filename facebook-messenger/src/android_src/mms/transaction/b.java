// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.content.Context;

// Referenced classes of package android_src.mms.transaction:
//            a

public class b extends a
{

    private static final int b[] = {
        0, 60000, 0x493e0, 0x927c0, 0x1b7740
    };

    public b(Context context, int i)
    {
        super(i);
        if (a < 0)
        {
            i = 0;
        } else
        {
            i = a;
        }
        a = i;
        if (a >= b.length)
        {
            i = b.length - 1;
        } else
        {
            i = a;
        }
        a = i;
    }

    public int a()
    {
        return b.length;
    }

    public long b()
    {
        return (long)b[a];
    }

}
