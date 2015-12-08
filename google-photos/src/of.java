// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class of
    implements oo
{

    private ob a;

    of(ob ob1)
    {
        a = ob1;
    }

    public final void a(View view)
    {
        if (ob.c(a) >= 0)
        {
            mk.a(view, 2, null);
        }
        if (ob.a(a) != null)
        {
            ob.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof oo)
        {
            obj = (oo)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((oo) (obj)).a(view);
        }
    }

    public final void b(View view)
    {
        if (ob.c(a) >= 0)
        {
            mk.a(view, ob.c(a), null);
            ob.a(a, -1);
        }
        if (ob.b(a) != null)
        {
            ob.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof oo)
        {
            obj = (oo)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((oo) (obj)).b(view);
        }
    }

    public final void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof oo)
        {
            obj = (oo)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((oo) (obj)).c(view);
        }
    }
}
