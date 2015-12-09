// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.Loader;
import java.io.IOException;

public final class bdw
    implements bdj
{

    public volatile Object a;
    public volatile long b;
    volatile long c;
    private bdq d;
    private bdo e;
    private volatile String f;
    private int g;

    public bdw(String s, bdo bdo, bdq bdq)
    {
        this(s, bdo, bdq, (byte)0);
    }

    private bdw(String s, bdo bdo, bdq bdq, byte byte0)
    {
        d = bdq;
        f = s;
        e = bdo;
    }

    public final void a(Looper looper, bdx bdx)
    {
        looper = new bdz(this, new bdp(f, e, d), looper, bdx);
        looper.d = SystemClock.elapsedRealtime();
        ((bdz) (looper)).c.a(((bdz) (looper)).b, ((bdz) (looper)).a, looper);
    }

    public final void a(bdl bdl)
    {
        if (bdl != null)
        {
            return;
        } else
        {
            throw new NullPointerException();
        }
    }

    public final void a(bdl bdl, IOException ioexception)
    {
        if (bdl != null)
        {
            return;
        } else
        {
            g = g + 1;
            SystemClock.elapsedRealtime();
            new IOException(ioexception);
            return;
        }
    }

    public final void i()
    {
    }
}
