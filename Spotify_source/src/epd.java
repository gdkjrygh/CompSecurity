// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import com.spotify.mobile.android.util.Assertion;

public abstract class epd extends abf
    implements android.widget.AbsListView.OnScrollListener
{

    private int a;
    private int b;
    private int c;
    private boolean d;

    public epd()
    {
        b = 0;
    }

    public static boolean a(int i, int j, int k)
    {
        return i + j >= k - 1;
    }

    private void b(int i, int j, int k)
    {
        if (j != a)
        {
            a = j;
        }
        if (k != c)
        {
            int l = c;
            c = k;
            d = false;
        }
        if (b())
        {
            while (d || j == 0 || !a(i, a(), k)) 
            {
                return;
            }
            a(i);
            d = true;
            return;
        } else
        {
            d = false;
            return;
        }
    }

    public abstract int a();

    public void a(int i)
    {
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (b != i && i == 1)
        {
            c();
        }
        b = i;
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        recyclerview = recyclerview.d();
        if (recyclerview instanceof LinearLayoutManager)
        {
            recyclerview = (LinearLayoutManager)recyclerview;
            i = recyclerview.l();
            b(i, (i - recyclerview.k()) + 1, recyclerview.w());
            return;
        } else
        {
            Assertion.b((new StringBuilder("LayoutManager is not compatible: ")).append(recyclerview).toString());
            return;
        }
    }

    public abstract boolean b();

    public void c()
    {
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        b((i + j) - 1, j, k);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (b != i && i == 1)
        {
            c();
        }
        b = i;
    }
}
