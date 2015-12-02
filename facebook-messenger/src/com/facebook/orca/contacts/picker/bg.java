// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.contacts.picker.p;
import com.facebook.contacts.picker.q;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.prefs.o;
import com.facebook.prefs.shared.d;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bh

public class bg
    implements p
{

    private static final Class a = com/facebook/orca/contacts/picker/bg;
    private d b;
    private a c;
    private android.view.View.OnClickListener d;
    private android.view.View.OnClickListener e;
    private int f;
    private View g;
    private ViewGroup h;
    private q i;

    public bg(d d1, a a1)
    {
        b = d1;
        c = a1;
    }

    public void a(android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, int j)
    {
        d = onclicklistener;
        e = onclicklistener1;
        f = j;
    }

    public void a(ViewGroup viewgroup, q q1)
    {
        h = viewgroup;
        i = q1;
        g = LayoutInflater.from(h.getContext()).inflate(k.orca_divebar_invite_all_section, null);
        h.addView(g);
        viewgroup = (Button)g.findViewById(i.contact_picker_invite_all_invite_button);
        q1 = (Button)g.findViewById(i.contact_picker_invite_all_dismiss_button);
        viewgroup.setOnClickListener(d);
        q1.setOnClickListener(e);
        q1 = (TextView)g.findViewById(i.contact_picker_invite_all_title);
        TextView textview = (TextView)g.findViewById(i.contact_picker_invite_all_subtitle);
        if (b.a(o.F, 0) == 0 && f > 0)
        {
            if (f == 1)
            {
                q1.setText(com.facebook.o.divebar_invite_all_title_first_shown_one_contact);
            } else
            {
                q1.setText(h.getContext().getString(com.facebook.o.divebar_invite_all_title_first_shown, new Object[] {
                    Integer.valueOf(f)
                }));
            }
            textview.setText(com.facebook.o.divebar_invite_all_subtitle_first_shown);
            viewgroup.setText(com.facebook.o.divebar_invite_all_button_label_first_shown);
            return;
        } else
        {
            q1.setText(com.facebook.o.divebar_invite_all_title);
            textview.setText(com.facebook.o.divebar_invite_all_subtitle);
            viewgroup.setText(com.facebook.o.divebar_invite_all_button_label);
            return;
        }
    }

    public boolean a()
    {
        if (!((Boolean)c.b()).booleanValue())
        {
            return false;
        }
        if (d == null || e == null)
        {
            com.facebook.debug.log.b.e(a, "InviteAllViewController was not properly initialized!");
            return false;
        } else
        {
            return true;
        }
    }

    public void b()
    {
        Object obj = (TextView)g.findViewById(i.contact_picker_invite_all_title);
        TextView textview = (TextView)g.findViewById(i.contact_picker_invite_all_subtitle);
        ViewGroup viewgroup = (ViewGroup)g.findViewById(i.contact_picker_invite_all_buttons);
        ((TextView) (obj)).setText(com.facebook.o.divebar_invite_all_invites_sent);
        textview.setVisibility(4);
        viewgroup.setVisibility(4);
        obj = new bh(this);
        (new Handler()).postDelayed(((Runnable) (obj)), 2000L);
    }

    public void c()
    {
        g.setVisibility(8);
        h.removeAllViews();
        i.a();
    }

}
