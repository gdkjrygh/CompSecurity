// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import android.content.Context;
import android.media.SoundPool;
import android.os.Vibrator;

// Referenced classes of package com.android.slyce.k:
//            d, e

public class c
{

    private SoundPool a;
    private Vibrator b;

    private c()
    {
        a = new SoundPool(10, 3, 0);
        a.setOnLoadCompleteListener(new d(this));
    }

    c(d d1)
    {
        this();
    }

    public static c a()
    {
        return e.a();
    }

    public void a(Context context, int i, boolean flag, boolean flag1)
    {
        if (flag)
        {
            a.load(context, i, 1);
        }
        if (flag1)
        {
            b = (Vibrator)context.getSystemService("vibrator");
            b.vibrate(new long[] {
                0L, 150L
            }, -1);
        }
    }
}
