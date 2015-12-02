// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.database.DataSetObserver;
import android.view.View;
import com.facebook.reflex.view.b.r;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.reflex.view.c:
//            s, k, i

public class j
    implements s
{

    private final i a;
    private final ArrayList b = hq.a();

    public j(i l)
    {
        a = l;
    }

    private k a(View view)
    {
        for (int l = 0; l < b.size(); l++)
        {
            if (((k)b.get(l)).getChildAt(0) == view)
            {
                return (k)b.remove(l);
            }
        }

        if (b.isEmpty())
        {
            return null;
        } else
        {
            return (k)b.remove(b.size() - 1);
        }
    }

    public int a()
    {
        return a.a();
    }

    public r a(int l)
    {
        View view = a.a(l);
        if (view instanceof r)
        {
            return (r)view;
        }
        k k2 = a(view);
        k k1 = k2;
        if (k2 == null)
        {
            k1 = new k(this, view.getContext());
        }
        k1.a(view);
        return k1;
    }

    public void a(DataSetObserver datasetobserver)
    {
        a.a(datasetobserver);
    }

    public void a(r r1)
    {
        if (r1 instanceof k)
        {
            a.a(((k)r1).getChildAt(0));
            b.add((k)r1);
            return;
        } else
        {
            a.a((View)r1);
            return;
        }
    }

    public void b()
    {
        a.b();
    }

    public void c()
    {
        a.c();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((k)iterator.next()).removeAllViewsInLayout()) { }
        b.clear();
    }
}
