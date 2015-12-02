// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.m;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.messages.threads.ui.name.g;
import com.facebook.o;
import com.facebook.widget.f;
import com.google.common.a.ax;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            az, av, aw, ba, 
//            bb

public class ay extends f
{

    private TextView a;
    private ThreadNameView b;
    private bb c;
    private av d;

    public ay(Context context)
    {
        this(context, null);
    }

    public ay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ay(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_divebar_nearby_friends_row);
        a = (TextView)getViewRequired(i.divebar_nearby_friends_row_title);
        b = (ThreadNameView)getViewRequired(i.divebar_nearby_friends_row_subtitle);
        setOnClickListener(new az(this));
    }

    static bb a(ay ay1)
    {
        return ay1.c;
    }

    private void a()
    {
        int j = d.c;
        Object obj = getResources();
        String s = ((Resources) (obj)).getQuantityString(m.divebar_nearby_friends_row_title, j, new Object[] {
            Integer.valueOf(j)
        });
        a.setText(s);
        if (d.a == aw.LIST)
        {
            obj = new g(false, null, es.a(ax.a(d.b, new ba(this))));
        } else
        {
            obj = new g(true, ((Resources) (obj)).getString(o.divebar_nearby_friends_row_subtitle_upsell), null);
        }
        b.setData(obj);
    }

    static av b(ay ay1)
    {
        return ay1.d;
    }

    public ay a(av av1)
    {
        d = av1;
        a();
        return this;
    }

    public ay a(bb bb)
    {
        c = bb;
        return this;
    }
}
