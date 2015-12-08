// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView, a

private final class <init> extends <init>
{

    final RecyclerView a;

    public final void a()
    {
        a.a(null);
        if (RecyclerView.g(a).b())
        {
            a(a.e, true);
            RecyclerView.m(a);
        } else
        {
            a(a.e, true);
            RecyclerView.m(a);
        }
        if (!a.b.d())
        {
            a.requestLayout();
        }
    }

    private (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    <init>(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }
}
