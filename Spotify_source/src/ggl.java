// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;

public abstract class ggl
{

    protected Context a;
    protected Verified b;
    public long c;

    protected ggl(Context context, Verified verified)
    {
        c = -1L;
        a = context.getApplicationContext();
        b = verified;
    }

    public final void a()
    {
        boolean flag;
        if (c < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.a(flag, "Trying to enter an already entered view.");
        if (c < 0L)
        {
            c = SystemClock.elapsedRealtime();
        }
    }

    protected abstract void a(long l);

    public final void b()
    {
        boolean flag1 = true;
        long l = SystemClock.elapsedRealtime() - c;
        boolean flag;
        if (c != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertion.c(flag, "Trying to leave a not entered view.");
        if (c != -2L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertion.c(flag, "Trying to leave an already left view.");
        if (l > 20L)
        {
            a(l);
        }
        c = -2L;
    }

    public final Verified c()
    {
        return b;
    }
}
