// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

class <init>
    implements tener
{

    final RecyclerView a;

    public void a(tener tener)
    {
        tener.tener(true);
        if (!RecyclerView.access$5300(a, tener.a) && tener.a())
        {
            a.removeDetachedView(tener.a, false);
        }
    }

    public void b(a a1)
    {
        a1.a(true);
        if (!a(a1))
        {
            RecyclerView.access$5300(a, a1.a);
        }
    }

    public void c(a a1)
    {
        a1.a(true);
        if (!a(a1))
        {
            RecyclerView.access$5300(a, a1.a);
        }
    }

    public void d(a a1)
    {
        a1.a(true);
        if (a1.a != null && a1.a == null)
        {
            a1.a = null;
            a1.a(-65, a(a1));
        }
        a1.a = null;
        if (!a(a1))
        {
            RecyclerView.access$5300(a, a1.a);
        }
    }

    private tener(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    a(RecyclerView recyclerview, a a1)
    {
        this(recyclerview);
    }
}
