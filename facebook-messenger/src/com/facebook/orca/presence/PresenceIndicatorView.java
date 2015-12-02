// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.presence;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.f;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.orca.presence:
//            i, d, h, g, 
//            f

public class PresenceIndicatorView extends f
{

    private final TextView a;
    private final ImageView b;
    private int c;
    private com.facebook.orca.presence.i d;
    private String e;
    private int f;
    private boolean g;
    private com.facebook.orca.presence.f h;
    private Map i;
    private boolean j;
    private d k;

    public PresenceIndicatorView(Context context)
    {
        this(context, null);
    }

    public PresenceIndicatorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PresenceIndicatorView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        d = i.NONE;
        i = ik.a();
        j = true;
        attributeset = context.obtainStyledAttributes(attributeset, q.PresenceIndicatorView);
        g = attributeset.getBoolean(q.ThreadTitleView_chatStyle, false);
        int i1;
        if (g)
        {
            setContentView(k.orca_chat_pop_up_presence_indicator);
            a(i.ONLINE, h.orca_online_icon_chat_head_title);
            a(i.PUSHABLE, h.orca_mobile_icon_chat_head_title);
        } else
        {
            setContentView(k.orca_presence_indicator);
        }
        a = (TextView)getView(i.presence_short_status);
        b = (ImageView)getView(i.presence_indicator_image);
        if (attributeset.getInteger(q.PresenceIndicatorView_alignment, 0) == 1)
        {
            ViewGroup viewgroup = (ViewGroup)a.getParent();
            viewgroup.removeView(a);
            viewgroup.addView(a, 0);
        }
        i1 = attributeset.getColor(q.PresenceIndicatorView_textColor, -1);
        l = i1;
        if (i1 == -1)
        {
            l = getResources().getColor(com.facebook.f.default_contacts_contact_status_text);
        }
        setTextColor(l);
        attributeset.recycle();
        k = (d)t.a(context).a(com/facebook/orca/presence/d);
    }

    private int a(g g1)
    {
        switch (h.a[g1.ordinal()])
        {
        default:
            return h.orca_mobile_icon;

        case 1: // '\001'
            return h.orca_mobile_green_stroke_icon;

        case 2: // '\002'
            return h.orca_mobile_yellow_dot_icon;

        case 3: // '\003'
            return h.orca_mobile_blue_dot_icon;

        case 4: // '\004'
            return h.orca_mobile_green_phone_icon;

        case 5: // '\005'
            return h.orca_mobile_white_phone_icon;
        }
    }

    private void a()
    {
        a.setVisibility(8);
        b.setAlpha(255);
        h = k.a();
        if (d == i.ONLINE)
        {
            if (h.a == g.NOT_SPECIFIED)
            {
                b(i.ONLINE, h.orca_online_icon);
                return;
            } else
            {
                b(i.ONLINE, h.orca_mobile_green_dot_icon);
                return;
            }
        }
        if (d == i.PUSHABLE)
        {
            b();
            return;
        }
        if (d == i.NEARBY)
        {
            b(i.NEARBY, h.orca_nearby_icon);
            b.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(4);
            return;
        }
    }

    private void a(int l)
    {
        if (j)
        {
            b.setImageResource(l);
            b.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(4);
            return;
        }
    }

    private void a(com.facebook.orca.presence.i l, int i1)
    {
        i.put(l, Integer.valueOf(i1));
    }

    private void b()
    {
        if (h.b && !n.a(e))
        {
            a.setText(e);
            a.setVisibility(0);
        }
        if (h.a == g.GONE)
        {
            b.setVisibility(8);
        } else
        {
            int l = a(h.a);
            b(i.PUSHABLE, l);
            b.setVisibility(0);
            if (h.c)
            {
                int i1 = (Math.max(3, 24 - f) * 255) / 24;
                b.setAlpha(i1);
                return;
            }
        }
    }

    private void b(com.facebook.orca.presence.i l, int i1)
    {
        if (i.containsKey(l))
        {
            a(((Integer)i.get(l)).intValue());
            return;
        } else
        {
            a(i1);
            return;
        }
    }

    public void a(com.facebook.orca.presence.i l, String s)
    {
        a(l, s, 0);
    }

    public void a(com.facebook.orca.presence.i l, String s, int i1)
    {
        d = l;
        e = s;
        f = i1;
        a();
    }

    public int getTextColor()
    {
        return c;
    }

    public void setShowIcon(boolean flag)
    {
        j = flag;
        a();
    }

    public void setStatus(com.facebook.orca.presence.i l)
    {
        a(l, null, 0);
    }

    public void setTextColor(int l)
    {
        c = l;
        a.setTextColor(l);
    }
}
