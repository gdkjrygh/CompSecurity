// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

final class g.Object
    implements dmi
{

    private g.String a;

    public final void a(int i, Object obj)
    {
        obj = (String)obj;
        if (obj != null)
        {
            a.a.a(i, obj);
            return;
        } else
        {
            a.a.a(new IllegalArgumentException("Response is null"), "Response is null");
            return;
        }
    }

    public final void a(Throwable throwable, String s)
    {
        if (s != null && a.a && a.a.a(s))
        {
            throwable = a.a;
            ((exr) (throwable)).d.b().a(((exr) (throwable)).c).a();
            a.a.a(a.a, a.a, a.a, false);
            return;
        } else
        {
            a.a.a(throwable, s);
            return;
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class exr$2

/* anonymous class */
    final class exr._cls2
        implements exs
    {

        final String a;
        final HashMap b;
        final dmi c;
        final boolean d;
        final exr e;

        public final void a(String s)
        {
            e.b.a("Authorization", (new StringBuilder("Bearer ")).append(s).toString());
            e.b.a(a, b, new exr._cls2._cls1(this));
        }

        public final void a(Throwable throwable, String s)
        {
            c.a(throwable, s);
        }

            
            {
                e = exr1;
                a = s;
                b = hashmap;
                c = dmi1;
                d = flag;
                super();
            }
    }

}
