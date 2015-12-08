// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import java.util.Locale;

public final class oby
    implements mru
{

    public final int a;
    public String b;
    private final long c;
    private long d;

    public oby(int i, long l)
    {
        d = 0L;
        a = i;
        c = l;
    }

    public static long c()
    {
        return SystemClock.elapsedRealtime();
    }

    public final String a(Context context, mrw mrw1)
    {
        if (b != null)
        {
            return b;
        } else
        {
            return mrw1.a(context);
        }
    }

    public void a()
    {
        if (d == 0L)
        {
            d = SystemClock.elapsedRealtime();
        }
    }

    public final void a(Context context)
    {
        a();
    }

    public final long b()
    {
        return d - c;
    }

    public final void b(Context context)
    {
        ((mrv)olm.a(context, mrv)).a(context, this);
    }

    public final String toString()
    {
        return String.format(Locale.getDefault(), "DurationEvent Code: %d & Duration: %d ms", new Object[] {
            Integer.valueOf(a), Long.valueOf(d - c)
        });
    }
}
