// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.broadcast.j;
import com.facebook.c.s;
import com.facebook.contacts.picker.p;
import com.facebook.contacts.picker.q;
import com.facebook.debug.log.b;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.prefs.n;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ab, ac

public class aa
    implements p
{

    private static final Class a = com/facebook/orca/contacts/divebar/aa;
    private final d b;
    private final a c;
    private final av d;
    private final j e;
    private final s f;
    private final Resources g;
    private final com.facebook.common.time.a h;
    private ViewGroup i;
    private q j;
    private ViewGroup k;
    private View l;
    private TextView m;
    private TextView n;
    private boolean o;

    public aa(d d1, a a1, av av1, j j1, s s1, Resources resources, com.facebook.common.time.a a2)
    {
        b = d1;
        c = a1;
        d = av1;
        e = j1;
        f = s1;
        g = resources;
        h = a2;
    }

    static void a(aa aa1)
    {
        aa1.d();
    }

    static void b(aa aa1)
    {
        aa1.c();
    }

    private void c()
    {
        d();
        if (!o)
        {
            d.a((new cb("click")).f("button").g("divebar_groups_megaphone_action_button"));
            Intent intent = new Intent(i.getContext(), com/facebook/orca/creation/CreateThreadActivity);
            intent.putExtra(CreateThreadActivity.r, true);
            intent.putExtra("trigger", "divebar_groups_megaphone_action_button");
            f.a(intent, i.getContext());
        }
    }

    private void d()
    {
        b.b().a(n.P, -1).a();
        if (k != null)
        {
            i.removeView(k);
            j.a();
            e.a("com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED");
        }
    }

    public void a(ViewGroup viewgroup, q q1)
    {
        i = viewgroup;
        j = q1;
        int i1;
        boolean flag;
        if (b.a(com.facebook.orca.background.n.c, 0) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        if (k == null)
        {
            k = (ViewGroup)LayoutInflater.from(i.getContext()).inflate(k.orca_divebar_groups_nux, i, false);
            l = k.findViewById(i.divebar_groups_megaphone_dismiss_button);
            l.setOnClickListener(new ab(this));
            m = (TextView)k.findViewById(i.divebar_groups_megaphone_body);
            n = (TextView)k.findViewById(i.divebar_groups_megaphone_action_button);
            n.setOnClickListener(new ac(this));
        }
        if (o)
        {
            viewgroup = g.getString(o.groups_megaphone_body_see_groups);
            q1 = g.getString(o.see_groups_label);
            i1 = 0;
        } else
        {
            viewgroup = g.getString(o.groups_megaphone_body_create_group);
            q1 = g.getString(o.create_group_label);
            i1 = h.groups_megaphone_blue_button_plus;
        }
        m.setText(viewgroup);
        n.setText(q1);
        n.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
        i.addView(k);
        i1 = b.a(n.P, 0);
        if (i1 >= 0)
        {
            b.b().a(n.P, i1 + 1).a();
        }
    }

    public boolean a()
    {
        if (!((Boolean)c.b()).booleanValue())
        {
            return false;
        }
        long l1 = b.a(com.facebook.orca.background.n.b, 0L);
        if (h.a() - l1 > 0xf731400L)
        {
            return false;
        }
        int i1 = b.a(n.P, 0);
        com.facebook.debug.log.b.b(a, "show count: %d", new Object[] {
            Integer.valueOf(i1)
        });
        return i1 >= 0 && i1 < 3;
    }

    public boolean b()
    {
        return k != null && k.getParent() == i;
    }

}
