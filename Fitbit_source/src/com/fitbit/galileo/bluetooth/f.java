// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import android.content.Intent;
import android.os.ParcelUuid;
import com.fitbit.e.a;
import java.util.UUID;

public abstract class f
{
    public static interface a
    {

        public abstract void a(f f1);

        public abstract void b(f f1);

        public abstract void c(f f1);

        public abstract void d(f f1);

        public abstract void e(f f1);
    }


    private final ParcelUuid a = new ParcelUuid(UUID.randomUUID());
    private a b;
    private boolean c;
    private boolean d;
    private Intent e;

    public f()
    {
    }

    public void a(Intent intent)
    {
        e = intent;
    }

    public void a(a a1)
    {
        b = a1;
    }

    protected abstract void b();

    protected abstract String c();

    protected abstract void d();

    protected abstract void e();

    public ParcelUuid h()
    {
        return a;
    }

    public UUID i()
    {
        return a.getUuid();
    }

    protected final a j()
    {
        return b;
    }

    public final boolean k()
    {
        return c;
    }

    public final boolean l()
    {
        return d;
    }

    protected final void m()
    {
        if (!c && !d)
        {
            c = true;
            com.fitbit.e.a.a(c(), "Executing %s", new Object[] {
                this
            });
            if (b != null)
            {
                b.a(this);
            }
            d();
            return;
        } else
        {
            com.fitbit.e.a.a(c(), "Unable to execute %s: Task is executing or canceled", new Object[] {
                this
            });
            return;
        }
    }

    protected final void n()
    {
        com.fitbit.e.a.a(c(), "Canceling %s", new Object[] {
            this
        });
        d = true;
        if (c)
        {
            e();
            return;
        } else
        {
            q();
            return;
        }
    }

    protected final void o()
    {
        com.fitbit.e.a.a(c(), "Completed %s", new Object[] {
            this
        });
        b();
        if (b != null)
        {
            b.b(this);
        }
    }

    protected final void p()
    {
        com.fitbit.e.a.a(c(), "Suspended %s", new Object[] {
            this
        });
        if (b != null)
        {
            b.e(this);
        }
    }

    protected final void q()
    {
        com.fitbit.e.a.a(c(), "Cancelled %s", new Object[] {
            this
        });
        b();
        if (b != null)
        {
            b.c(this);
        }
    }

    protected final void r()
    {
        com.fitbit.e.a.a(c(), "Failed %s", new Object[] {
            this
        });
        b();
        if (b != null)
        {
            b.d(this);
        }
    }

    public Intent s()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append(c()).append("(").append(a).append(")").toString();
    }
}
