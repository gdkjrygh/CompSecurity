// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

final class ang.Object
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
        e.b.a(a, b, new dmi() {

            private exr._cls2 a;

            public final void a(int i, Object obj)
            {
                obj = (String)obj;
                if (obj != null)
                {
                    a.c.a(i, obj);
                    return;
                } else
                {
                    a.c.a(new IllegalArgumentException("Response is null"), "Response is null");
                    return;
                }
            }

            public final void a(Throwable throwable, String s1)
            {
                if (s1 != null && a.d && a.e.a(s1))
                {
                    throwable = a.e;
                    ((exr) (throwable)).d.b().a(((exr) (throwable)).c).a();
                    a.e.a(a.a, a.b, a.c, false);
                    return;
                } else
                {
                    a.c.a(throwable, s1);
                    return;
                }
            }

            
            {
                a = exr._cls2.this;
                super();
            }
        });
    }

    public final void a(Throwable throwable, String s)
    {
        c.a(throwable, s);
    }

    (exr exr1, String s, HashMap hashmap, dmi dmi1, boolean flag)
    {
        e = exr1;
        a = s;
        b = hashmap;
        c = dmi1;
        d = flag;
        super();
    }
}
