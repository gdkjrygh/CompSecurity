// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import com.kik.android.a;
import com.kik.cache.ad;
import java.util.HashMap;
import java.util.Map;
import kik.a.e.r;

// Referenced classes of package com.kik.view.adapters:
//            ContactsCursorAdapter, u

public class MultiselectContactsCursorAdapter extends ContactsCursorAdapter
{

    private u d;
    private int e;
    private int f;
    private Map g;

    public MultiselectContactsCursorAdapter(Context context, Cursor cursor, boolean flag, boolean flag1, u u1, ad ad, r r, 
            a a1)
    {
        super(context, cursor, flag, flag1, ad, r, a1);
        g = new HashMap();
        d = u1;
        e = 0x7f020163;
        f = 0x7f020161;
    }

    protected final int a()
    {
        return 0x7f03006f;
    }

    public final void a(int i, int j)
    {
        f = i;
        e = j;
    }

    public final void a(ContactsCursorAdapter.a a1, Cursor cursor)
    {
        if (d != null && d.b())
        {
            a1.f.setVisibility(0);
            a1 = a1.f;
            int i;
            if (d.a(cursor))
            {
                i = f;
            } else
            {
                i = e;
            }
            a1.setBackgroundResource(i);
            return;
        } else
        {
            a1.f.setVisibility(8);
            return;
        }
    }

    public final void a(String s, boolean flag)
    {
        if (g.containsKey(s))
        {
            s = ((ContactsCursorAdapter.a)g.get(s)).f;
            int i;
            if (d != null && d.b())
            {
                s.setVisibility(0);
            } else
            {
                s.setVisibility(8);
            }
            if (flag)
            {
                i = f;
            } else
            {
                i = e;
            }
            s.setBackgroundResource(i);
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        super.bindView(view, context, cursor);
        view = (ContactsCursorAdapter.a)view.getTag();
        if (((ContactsCursorAdapter.a) (view)).a != null)
        {
            g.put(((ContactsCursorAdapter.a) (view)).a, view);
        }
        a(view, cursor);
    }
}
