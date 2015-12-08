// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Wf
{

    public final ReentrantLock a = new ReentrantLock(true);
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    private boolean g;
    private boolean h;

    public Wf()
    {
        g = false;
        h = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
    }

    public final void a(boolean flag)
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            f = flag;
            return;
        }
    }

    public final boolean a()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            return g;
        }
    }

    public final void b()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            g = true;
            return;
        }
    }

    public final boolean c()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            return h;
        }
    }

    public final void d()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            h = true;
            return;
        }
    }

    public final boolean e()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            return b;
        }
    }

    public final void f()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            b = true;
            return;
        }
    }

    public final boolean g()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            return c;
        }
    }

    public final boolean h()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            return d;
        }
    }

    public final void i()
    {
        if (!a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        } else
        {
            a.unlock();
            return;
        }
    }

    public final String toString()
    {
        return (new ToStringBuilder(this)).append("AudioExtractorDone", g).append("AudioDecoderDone", h).append("AudioPlayerDone", b).append("VideoExtractorDone", d).append("VideoFilterDecoderDone", e).append("Aborted", c).build();
    }
}
