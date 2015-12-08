// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;

public final class feb
    implements fdz, fen
{

    final fed a;
    boolean b;
    private final fec c;
    private few d;
    private final fdy e;

    public feb(fed fed1, fdy fdy1, few few1, fec fec1)
    {
        a = fed1;
        c = fec1;
        e = fdy1;
        e.a(this);
        d = few1;
        d.c = new fez() {

            private feb a;

            public final void a(Uri uri)
            {
                a.a.a(uri);
            }

            
            {
                a = feb.this;
                super();
            }
        };
        d.d = new ffb() {

            private feb a;

            public final void a()
            {
                a.a.f();
            }

            public final void b()
            {
                a.a.c(true);
                a.b = false;
            }

            
            {
                a = feb.this;
                super();
            }
        };
        d.a();
    }

    public final void a()
    {
        fdy fdy1 = e;
        fdy1.a(fdy1.a(), true);
    }

    public final void a(int i)
    {
        boolean flag1 = true;
        a.a(i);
        fed fed1 = a;
        boolean flag;
        if (!e.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fed1.d(flag);
        fed1 = a;
        if (!e.d())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fed1.b(flag);
        c.a(i);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.putInt("saved_manual_tempo", e.a);
        }
    }

    public final void b()
    {
        fdy fdy1 = e;
        fdy1.a(fdy1.b(), true);
    }

    public final void b(Bundle bundle)
    {
        if (bundle == null)
        {
            int i = c.a();
            e.a(i, true);
            return;
        } else
        {
            e.a(bundle.getInt("saved_manual_tempo", 160), true);
            return;
        }
    }

    public final void c()
    {
        if (!b)
        {
            b = true;
            a.c(false);
            d.a(e.a);
        }
    }

    public final int d()
    {
        return e.a;
    }

    public final void e()
    {
        d.b();
        d = null;
    }
}
