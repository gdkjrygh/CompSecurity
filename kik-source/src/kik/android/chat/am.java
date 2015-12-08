// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.view.View;
import android.widget.AbsListView;

// Referenced classes of package kik.android.chat:
//            al

public final class am
    implements android.widget.AbsListView.OnScrollListener
{

    private al a;
    private int b;
    private int c;

    public am(al al1)
    {
        b = -1;
        c = -1;
        a = al1;
    }

    public final void a()
    {
        b = -1;
        c = -1;
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (abslistview == null)
        {
            return;
        }
        View view = abslistview.getChildAt(0);
        if (view != null && view.getTop() < 0)
        {
            k = i + 1;
        } else
        {
            k = i;
        }
        j = i + j;
        view = abslistview.getChildAt(abslistview.getChildCount() - 1);
        i = j;
        if (view != null)
        {
            i = j;
            if (view.getBottom() > abslistview.getHeight())
            {
                i = j - 1;
            }
        }
        if (b != k || c != i)
        {
            if (b > 0 && c > 0)
            {
                if (k > b)
                {
                    for (j = b; j < k; j++)
                    {
                        a.a(j);
                    }

                } else
                if (k < b)
                {
                    for (j = k; j < b; j++)
                    {
                        a.b(j);
                    }

                }
                if (i > c)
                {
                    for (j = c; j < i; j++)
                    {
                        a.b(j);
                    }

                } else
                if (i < c)
                {
                    for (j = i; j < c; j++)
                    {
                        a.a(j);
                    }

                }
            } else
            {
                for (j = k; j < i; j++)
                {
                    a.b(j);
                }

            }
        }
        b = k;
        c = i;
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
