// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements Runnable
{

    private RecyclerView a;

    public final void run()
    {
        if (a.m != null)
        {
            a.m.T_();
        }
        RecyclerView.d(a);
    }

    (RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
