// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.fitbit.data.bl.av;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.home.ui.g;
import com.fitbit.ui.s;
import com.fitbit.util.ar;
import java.util.EnumSet;

public class b extends g
{
    public static class a
    {

        public void a()
        {
        }

        public void b()
        {
        }

        public a()
        {
        }
    }


    private EnumSet a;
    protected String b;
    protected com.fitbit.data.domain.Message.MessageType c;
    protected String d;
    protected String e;
    protected String f;
    private a g;

    public b(FragmentActivity fragmentactivity, String s1, String s2, com.fitbit.data.domain.Message.MessageType messagetype, String s3, String s4)
    {
        super(fragmentactivity, 47);
        a = EnumSet.noneOf(com/fitbit/data/domain/Message$MessageType);
        b = s1;
        c = messagetype;
        d = s3;
        e = s4;
        f = s2;
    }

    public final void a()
    {
        d();
    }

    public void a(a a1)
    {
        g = a1;
    }

    public final void a(Exception exception)
    {
        if (exception instanceof ServerCommunicationException)
        {
            c();
            if (((ServerCommunicationException)exception).f() == com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a)
            {
                f();
                return;
            }
            if (ar.c(m()) && !(exception instanceof NetworkTimeoutException))
            {
                h();
                return;
            } else
            {
                g();
                return;
            }
        } else
        {
            a();
            return;
        }
    }

    public final void a(EnumSet enumset)
    {
        if (enumset != null)
        {
            a = enumset;
        }
    }

    protected void c()
    {
        if (g != null)
        {
            g.b();
        }
    }

    protected void d()
    {
        if (g != null)
        {
            g.a();
        }
        if (!a.contains(c))
        {
            String s1;
            if (c == com.fitbit.data.domain.Message.MessageType.CHEER)
            {
                s1 = String.format(m().getString(0x7f0805b2), new Object[] {
                    f
                });
            } else
            if (c == com.fitbit.data.domain.Message.MessageType.TAUNT)
            {
                s1 = String.format(m().getString(0x7f0805b3), new Object[] {
                    f
                });
            } else
            {
                s1 = m().getString(0x7f0803cb);
            }
            Toast.makeText(m(), s1, 0).show();
        }
    }

    public void e()
    {
        a(av.a(m(), b, c, d, e));
    }

    protected void f()
    {
        s.a(m(), String.format(m().getString(0x7f080563), new Object[] {
            f
        }), 0).i();
    }

    protected void g()
    {
        s.a(m(), 0x7f080564, 0).i();
    }

    protected void h()
    {
        s.a(m(), 0x7f080565, 0).i();
    }
}
