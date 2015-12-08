// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

final class af
    implements Runnable
{

    final SwipeRefreshLayout a;

    af(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }

    public final void run()
    {
        SwipeRefreshLayout.h(a);
        SwipeRefreshLayout.a(a, SwipeRefreshLayout.i(a) + a.getPaddingTop(), SwipeRefreshLayout.j(a));
    }
}
