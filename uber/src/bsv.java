// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;
import java.util.Map;

public class bsv
    implements buk
{

    private static final String a = bsv.getSimpleName();
    private final bsx b;
    private bsw c;
    private bsu d;
    private final brb e = new brb();
    private buf f;

    public bsv(bsx bsx, bsu bsu1)
    {
        b = bsx;
        d = bsu1;
        c = new bsw(this);
    }

    static void a(bsv bsv1, buj buj1)
    {
        bsv1.e.a(buj1);
    }

    public final String a(buh buh1)
    {
        (new StringBuilder("environment:")).append(d).append(" environment.getEndpoints():").append(d.b());
        if (d != null && d.b() != null)
        {
            return (String)d.b().get(buh1.a());
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        f.a();
    }

    public final void a(brd brd)
    {
        e.a(brd);
    }

    public final void a(buf buf1)
    {
        if (f != null)
        {
            throw new IllegalStateException();
        } else
        {
            f = buf1;
            return;
        }
    }

    public final void a(buj buj1)
    {
        buj1.m();
        bqw.a().f();
        if (!buj1.a())
        {
            Message message = new Message();
            message.what = 2;
            message.obj = buj1;
            c.sendMessage(message);
        }
    }

    public final void b()
    {
        e.a();
    }

    public final void b(buj buj1)
    {
        f.a(buj1);
    }

    public final String c()
    {
        return d.a();
    }

    public final bsx d()
    {
        return b;
    }

}
