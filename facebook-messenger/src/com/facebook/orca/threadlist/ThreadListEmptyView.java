// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import com.facebook.c.s;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.widget.f;
import com.google.common.a.es;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.threadlist:
//            am, a, an

public class ThreadListEmptyView extends f
{

    private final View a;
    private final ViewStub b;
    private final s c;
    private final d d;
    private final TextView e;
    private a f;
    private View g;
    private es h;

    public ThreadListEmptyView(Context context)
    {
        this(context, null);
    }

    public ThreadListEmptyView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ThreadListEmptyView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        h = es.d();
        context = getInjector();
        ((LayoutInflater)context.a(android/view/LayoutInflater)).inflate(k.orca_thread_list_empty_view, this);
        c = (s)context.a(com/facebook/c/s);
        d = (d)context.a(com/facebook/prefs/shared/d);
        a = findViewById(i.orca_thread_list_empty_logo_and_message);
        b = (ViewStub)findViewById(i.user_grid_empty_thread_list_container_stub);
        e = (TextView)findViewById(i.start_conversation_text);
    }

    static es a(ThreadListEmptyView threadlistemptyview)
    {
        return threadlistemptyview.h;
    }

    static s b(ThreadListEmptyView threadlistemptyview)
    {
        return threadlistemptyview.c;
    }

    private boolean c()
    {
        return d.a(n.K, true);
    }

    private void d()
    {
        if (g != null)
        {
            return;
        } else
        {
            g = b.inflate();
            ((Button)g.findViewById(i.wildfire_empty_thread_close)).setOnClickListener(new am(this));
            f = new a(getContext(), es.d());
            GridView gridview = (GridView)findViewById(i.grid_view);
            gridview.setAdapter(f);
            gridview.setOnItemClickListener(new an(this));
            return;
        }
    }

    public void a()
    {
        if (g != null)
        {
            g.setVisibility(8);
        }
        d.b().a(n.K, false).a();
        a.setVisibility(0);
    }

    public void b()
    {
        if (h.size() > 0 && c())
        {
            d();
            Preconditions.checkNotNull(g);
            g.setVisibility(0);
            a.setVisibility(8);
            f.a(h);
            f.notifyDataSetChanged();
        }
    }

    public void setStartConversationTextVisibility(boolean flag)
    {
        if (flag)
        {
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    public void setSuggestedContacts(es es1)
    {
        h = es1;
        b();
    }
}
