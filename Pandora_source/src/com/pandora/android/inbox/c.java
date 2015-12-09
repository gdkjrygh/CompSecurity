// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.pandora.android.activity.f;
import com.pandora.android.data.l;
import com.pandora.android.provider.b;
import com.pandora.android.push.a;
import p.ca.m;
import p.cp.d;
import p.cr.k;

// Referenced classes of package com.pandora.android.inbox:
//            InboxNotification, InboxNotificationProcessor, a, b

public class c extends m
{

    private com.pandora.android.inbox.a j;
    private Long k;
    private TextView l;
    private android.support.v4.app.n.a m;

    public c()
    {
        m = new android.support.v4.app.n.a() {

            final c a;

            public void a(i i, Cursor cursor)
            {
                if (cursor == null || cursor.getCount() == 0)
                {
                    com.pandora.android.inbox.c.a(a).changeCursor(null);
                    com.pandora.android.inbox.c.a(a, true);
                    return;
                } else
                {
                    com.pandora.android.inbox.c.a(a, false);
                    com.pandora.android.inbox.c.a(a).changeCursor(cursor);
                    return;
                }
            }

            public i onCreateLoader(int i, Bundle bundle)
            {
                return new android.support.v4.content.f(b.a.h(), com.pandora.android.inbox.b.a, null, b.q, null, b.t);
            }

            public void onLoadFinished(i i, Object obj)
            {
                a(i, (Cursor)obj);
            }

            public void onLoaderReset(i i)
            {
                com.pandora.android.inbox.c.a(a, true);
                com.pandora.android.inbox.c.a(a).changeCursor(null);
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    static com.pandora.android.inbox.a a(c c1)
    {
        return c1.j;
    }

    static void a(c c1, boolean flag)
    {
        c1.c(flag);
    }

    private void c(boolean flag)
    {
        TextView textview = l;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public static f e()
    {
        return new f("notifications", b.a.h().getString(0x7f080270), com/pandora/android/inbox/c, null, null);
    }

    public void a(ListView listview, View view, int i, long l1)
    {
        super.a(listview, view, i, l1);
        listview = com.pandora.android.inbox.InboxNotification.a((Cursor)listview.getItemAtPosition(i));
        if (((InboxNotification) (listview)).d != null)
        {
            k = Long.valueOf(((InboxNotification) (listview)).a);
            if (p.cr.k.c(((InboxNotification) (listview)).d))
            {
                p.cr.k.a(((InboxNotification) (listview)).d);
            } else
            if (p.cp.d.a(((InboxNotification) (listview)).d))
            {
                view = new l(new com.pandora.radio.data.b(), ((InboxNotification) (listview)).d.toString(), null, -1, com.pandora.android.data.l.a.a, null);
                com.pandora.android.activity.a.a(getActivity(), view, true, 124);
            } else
            {
                try
                {
                    startActivity(new Intent("android.intent.action.VIEW", ((InboxNotification) (listview)).d));
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    p.df.a.b("InboxFragment", (new StringBuilder()).append("Invalid action Uri: ").append(((InboxNotification) (listview)).d.toString()).toString(), view);
                }
            }
            if (((InboxNotification) (listview)).k)
            {
                com.pandora.android.inbox.InboxNotificationProcessor.d(getActivity(), new long[] {
                    ((InboxNotification) (listview)).a
                });
            }
            if (!((InboxNotification) (listview)).l && !((InboxNotification) (listview)).j.booleanValue())
            {
                com.pandora.android.inbox.InboxNotificationProcessor.b(getActivity(), new long[] {
                    ((InboxNotification) (listview)).a
                });
            }
            com.pandora.android.push.a.a().a(String.valueOf(((InboxNotification) (listview)).a), p.cx.x.a.a, p.cx.x.b.b);
        }
    }

    public CharSequence d()
    {
        return getString(0x7f080270);
    }

    public void f()
    {
        if (k == null)
        {
            j.a();
        }
        k = null;
        j.b();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        j = new com.pandora.android.inbox.a(getActivity(), null);
        a(j);
        a(true);
        getLoaderManager().a(1, null, m);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        j = new com.pandora.android.inbox.a(getActivity(), null);
        a(j);
        getLoaderManager().b(1, null, m);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setBackgroundColor(getActivity().getResources().getColor(0x7f0b0062));
        l = (TextView)layoutinflater.findViewById(0xff0001);
        l.setText(0x7f0801e8);
        l.setTextSize(0, getResources().getDimension(0x7f0900fd));
        l.setTextColor(getResources().getColor(0x7f0b0053));
        return layoutinflater;
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.i;
    }
}
