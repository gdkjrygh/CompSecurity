// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.SystemClock;
import android.view.View;

// Referenced classes of package kik.android.util:
//            cv

public static abstract class a
    implements android.view.OnClickListener
{

    private final int a;
    private long b;

    public abstract void a();

    public final void onClick(View view)
    {
        long l = SystemClock.elapsedRealtime();
        if (l - b > (long)a)
        {
            b = l;
            a();
        }
    }

    public ()
    {
        this((byte)0);
    }

    private <init>(byte byte0)
    {
        b = 0L;
        a = 1000;
    }
}
