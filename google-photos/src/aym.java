// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Map;

public class aym
    implements Cloneable
{

    float a;
    apa b;
    public amb c;
    Drawable d;
    int e;
    Drawable f;
    int g;
    boolean h;
    public int i;
    public int j;
    ane k;
    boolean l;
    public boolean m;
    Drawable n;
    int o;
    public ani p;
    Map q;
    Class r;
    public boolean s;
    android.content.res.Resources.Theme t;
    private int u;
    private boolean v;

    public aym()
    {
        a = 1.0F;
        b = apa.d;
        c = amb.c;
        h = true;
        i = -1;
        j = -1;
        k = azv.a();
        m = true;
        p = new ani();
        q = new HashMap();
        r = java/lang/Object;
    }

    private aym a(Class class1, anl anl)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        b.a(class1, "Argument must not be null");
        b.a(anl, "Argument must not be null");
        aym1.q.put(class1, anl);
        aym1.u = aym1.u | 0x800;
        aym1.m = true;
        aym1.u = aym1.u | 0x10000;
        return aym1.d();
    }

    private aym b(Context context, anl anl)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.a(android/graphics/Bitmap, anl);
        aym1.a(android/graphics/drawable/BitmapDrawable, new avc(context, anl));
        aym1.a(awr, new awv(context, anl));
        return aym1.d();
    }

    private static boolean b(int i1, int j1)
    {
        return (i1 & j1) != 0;
    }

    private aym d()
    {
        if (s)
        {
            throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
        } else
        {
            return this;
        }
    }

    public final aym a()
    {
        aym aym1;
        try
        {
            aym1 = (aym)super.clone();
            aym1.p = new ani();
            aym1.p.a(p);
            aym1.q = new HashMap();
            aym1.q.putAll(q);
            aym1.s = false;
            aym1.v = false;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return aym1;
    }

    public final aym a(int i1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.g = i1;
        aym1.u = aym1.u | 0x80;
        return aym1.d();
    }

    public final aym a(int i1, int j1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.j = i1;
        aym1.i = j1;
        aym1.u = aym1.u | 0x200;
        return aym1.d();
    }

    public final aym a(amb amb1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.c = (amb)b.a(amb1, "Argument must not be null");
        aym1.u = aym1.u | 8;
        return aym1.d();
    }

    public final aym a(ana ana)
    {
        return a(avp.a, b.a(ana, "Argument must not be null"));
    }

    public final aym a(Context context)
    {
        return b(context, avk.b, new avi(context));
    }

    public final aym a(Context context, anl anl)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.b(context, anl);
        aym1.l = true;
        aym1.u = aym1.u | 0x20000;
        return aym1.d();
    }

    public final aym a(Context context, avk avk1, anl anl)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.a(avk1);
        return aym1.b(context, anl);
    }

    public final aym a(Drawable drawable)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.f = drawable;
        aym1.u = aym1.u | 0x40;
        return aym1.d();
    }

    public final aym a(ane ane1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.k = (ane)b.a(ane1, "Argument must not be null");
        aym1.u = aym1.u | 0x400;
        return aym1.d();
    }

    public final aym a(anf anf, Object obj)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        b.a(anf, "Argument must not be null");
        b.a(obj, "Argument must not be null");
        aym1.p.b.put(anf, obj);
        return aym1.d();
    }

    public final aym a(apa apa1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.b = (apa)b.a(apa1, "Argument must not be null");
        aym1.u = aym1.u | 4;
        return aym1.d();
    }

    public final aym a(avk avk1)
    {
        return a(avp.b, b.a(avk1, "Argument must not be null"));
    }

    public final aym a(aym aym1)
    {
        aym aym2;
        for (aym2 = this; aym2.v; aym2 = aym2.a()) { }
        if (b(aym1.u, 2))
        {
            aym2.a = aym1.a;
        }
        if (b(aym1.u, 4))
        {
            aym2.b = aym1.b;
        }
        if (b(aym1.u, 8))
        {
            aym2.c = aym1.c;
        }
        if (b(aym1.u, 16))
        {
            aym2.d = aym1.d;
        }
        if (b(aym1.u, 32))
        {
            aym2.e = aym1.e;
        }
        if (b(aym1.u, 64))
        {
            aym2.f = aym1.f;
        }
        if (b(aym1.u, 128))
        {
            aym2.g = aym1.g;
        }
        if (b(aym1.u, 256))
        {
            aym2.h = aym1.h;
        }
        if (b(aym1.u, 512))
        {
            aym2.j = aym1.j;
            aym2.i = aym1.i;
        }
        if (b(aym1.u, 1024))
        {
            aym2.k = aym1.k;
        }
        if (b(aym1.u, 4096))
        {
            aym2.r = aym1.r;
        }
        if (b(aym1.u, 8192))
        {
            aym2.n = aym1.n;
        }
        if (b(aym1.u, 16384))
        {
            aym2.o = aym1.o;
        }
        if (b(aym1.u, 32768))
        {
            aym2.t = aym1.t;
        }
        if (b(aym1.u, 0x10000))
        {
            aym2.m = aym1.m;
        }
        if (b(aym1.u, 0x20000))
        {
            aym2.l = aym1.l;
        }
        if (b(aym1.u, 2048))
        {
            aym2.q.putAll(aym1.q);
        }
        if (!aym2.m)
        {
            aym2.q.clear();
            aym2.u = aym2.u & 0xfffff7ff;
            aym2.l = false;
            aym2.u = aym2.u & 0xfffdffff;
        }
        aym2.u = aym2.u | aym1.u;
        aym2.p.a(aym1.p);
        return aym2.d();
    }

    public final aym a(Class class1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.r = (Class)b.a(class1, "Argument must not be null");
        aym1.u = aym1.u | 0x1000;
        return aym1.d();
    }

    public final aym a(boolean flag)
    {
        boolean flag1 = true;
        aym aym1;
        for (aym1 = this; aym1.v;)
        {
            aym1 = aym1.a();
            flag = true;
        }

        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        aym1.h = flag;
        aym1.u = aym1.u | 0x100;
        return aym1.d();
    }

    public final aym b()
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.a(awo.a, Boolean.valueOf(true));
        aym1.a(axc.a, Boolean.valueOf(true));
        return aym1.d();
    }

    public final aym b(int i1)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.e = i1;
        aym1.u = aym1.u | 0x20;
        return aym1.d();
    }

    public final aym b(Context context)
    {
        return b(context, avk.a, ((anl) (new avs(context))));
    }

    public final aym b(Context context, avk avk1, anl anl)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.a(avk1);
        return aym1.a(context, anl);
    }

    public final aym b(Drawable drawable)
    {
        aym aym1;
        for (aym1 = this; aym1.v; aym1 = aym1.a()) { }
        aym1.d = drawable;
        aym1.u = aym1.u | 0x10;
        return aym1.d();
    }

    public final aym c()
    {
        if (s && !v)
        {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        } else
        {
            v = true;
            s = true;
            return this;
        }
    }

    public boolean c(int i1)
    {
        return b(u, i1);
    }

    public Object clone()
    {
        return a();
    }
}
