// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public final class a
    implements Runnable
{

    private RecyclerView a;

    public final void run()
    {
        if (!RecyclerView.a(a) || a.isLayoutRequested())
        {
            return;
        } else
        {
            RecyclerView.q();
            RecyclerView.b(a);
            return;
        }
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
