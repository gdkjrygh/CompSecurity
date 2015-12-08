// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class u
    implements Runnable
{

    final RecyclerView a;

    u(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public final void run()
    {
        if (a.d != null)
        {
            a.d.a();
        }
        RecyclerView.d(a);
    }
}
