// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class eno
{

    private static final List e;
    private static final gfp f;
    public final am a;
    public String b;
    public gfp c;
    public an d;
    private final Context g;
    private final enp h;
    private boolean i;
    private boolean j;

    public eno(Context context, am am1, enp enp)
    {
        d = new an() {

            private eno a;

            public final da a(Bundle bundle)
            {
                bundle = dti.a(eno.b(a), eno.c(a), eno.d(a));
                return new cu(eno.e(a), bundle, dnw.a, null, eno.f(a).a());
            }

            public final void a()
            {
                eno.a(a).a(null);
            }

            public final volatile void a(Object obj)
            {
                obj = (Cursor)obj;
                eno.a(a).a(((Cursor) (obj)));
            }

            
            {
                a = eno.this;
                super();
            }
        };
        g = context;
        a = am1;
        h = enp;
        b = "";
        c = f;
    }

    static enp a(eno eno1)
    {
        return eno1.h;
    }

    static String b(eno eno1)
    {
        return eno1.b;
    }

    public static void b()
    {
    }

    public static void c()
    {
    }

    static boolean c(eno eno1)
    {
        return eno1.i;
    }

    public static List d()
    {
        return e;
    }

    static boolean d(eno eno1)
    {
        return eno1.j;
    }

    static Context e(eno eno1)
    {
        return eno1.g;
    }

    public static gfp e()
    {
        return f;
    }

    static gfp f(eno eno1)
    {
        return eno1.c;
    }

    public static void f()
    {
    }

    public final void a()
    {
        a.a(0x7f11006e, null, d);
    }

    public final void a(boolean flag, boolean flag1)
    {
        i = flag;
        j = flag1;
    }

    static 
    {
        f = new gfp("artist_name", 0x7f08051e);
        ArrayList arraylist = new ArrayList();
        e = arraylist;
        arraylist.add(new gfp("name", 0x7f080524));
        e.add(f);
        e.add(new gfp("time_added", 0x7f080522));
        e.add(new gfp("most_played_rank", 0x7f080523, false));
    }
}
