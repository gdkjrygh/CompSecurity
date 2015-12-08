// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gql
    implements nuc
{

    public final nud a = new ntz(this);
    public gqm b;
    private final noz c;

    gql(Context context)
    {
        c = noz.a(context, 3, "CastMediaManager", new String[0]);
        b = (new gqn()).a();
    }

    public final nud a()
    {
        return a;
    }

    final void a(ekp ekp)
    {
        gqn gqn1 = b();
        gqn1.b = ekp;
        b = gqn1.a();
        c(true);
    }

    final void a(boolean flag)
    {
        gqn gqn1;
        boolean flag1;
        if (b.e != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gqn1 = b();
        gqn1.c = flag;
        b = gqn1.a();
        c(flag1);
    }

    public gqn b()
    {
        return new gqn(b);
    }

    final void b(boolean flag)
    {
        gqn gqn1;
        boolean flag1;
        if (b.d != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gqn1 = b();
        gqn1.a = flag;
        b = gqn1.a();
        c(flag1);
    }

    public void c(boolean flag)
    {
        if (!flag)
        {
            return;
        }
        if (c.a())
        {
            noy.a("current state", b);
        }
        a.b();
    }
}
