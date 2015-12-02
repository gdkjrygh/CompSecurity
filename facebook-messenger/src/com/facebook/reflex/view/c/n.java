// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.reflex.Container;
import com.facebook.reflex.animation.Change;
import com.facebook.reflex.animation.PropertyName;
import com.facebook.reflex.animation.System;
import com.facebook.reflex.animation.SystemConfig;
import com.facebook.reflex.animation.Transition;
import com.facebook.reflex.animation.a;
import com.facebook.reflex.animation.b;
import com.facebook.reflex.view.ContainerView;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.reflex.view.c:
//            m

public class n extends ContainerView
{

    private final View a;
    private final View c;
    private final ContainerView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final List h;
    private final System i;
    private final Change j;
    private final Change k;
    private final Change l;
    private m m;

    public n(Context context)
    {
        this(context, null);
    }

    public n(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public n(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        m = m.Normal;
        LayoutInflater.from(getContext()).inflate(k.refreshable_list_view_header, this);
        a = findViewById(i.pull_to_refresh_action_container);
        c = findViewById(i.pull_to_refresh_refresh_container);
        e = (TextView)findViewById(i.pull_to_refresh_text_pull);
        f = (TextView)findViewById(i.pull_to_refresh_text_release);
        h = Arrays.asList(new TextView[] {
            e, f
        });
        g = (TextView)findViewById(i.pull_to_refresh_last_loaded_time);
        d = (ContainerView)findViewById(i.pull_to_refresh_image_container);
        d.setMinimumHeight(50);
        context = new SystemConfig();
        attributeset = new PropertyName("arrow.rotation");
        PropertyName propertyname = new PropertyName("array.anchorX");
        PropertyName propertyname1 = new PropertyName("array.anchorY");
        context.declareVariable(propertyname, 0.5F);
        context.declareVariable(propertyname1, 0.5F);
        context.declareVariable(attributeset, 0.0F);
        context.declareWidget("arrow");
        context.a("arrow", b.RotationZ, attributeset);
        context.a("arrow", b.AnchorX, propertyname);
        context.a("arrow", b.AnchorY, propertyname1);
        i = new System(context);
        i.bindWidget("arrow", d.getBackingWidget());
        j = new Change();
        j.a(attributeset).a(-180F).a(Transition.a(250000000D));
        k = new Change();
        k.a(attributeset).a(0.0F).a(Transition.a(250000000D));
        l = new Change();
        l.a(attributeset).a(0.0F);
    }

    private void a(TextView textview)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            TextView textview1 = (TextView)iterator.next();
            if (textview1 == textview)
            {
                textview1.setVisibility(0);
            } else
            {
                textview1.setVisibility(4);
            }
        }

    }

    public m getState()
    {
        return m;
    }

    public void setLastLoadedTime(long l1)
    {
        if (l1 >= 0L)
        {
            Object obj = getContext();
            Object obj1 = new Date(l1);
            String s = DateFormat.getDateFormat(((Context) (obj))).format(((Date) (obj1)));
            obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
            obj = ((Context) (obj)).getString(o.pull_to_refresh_last_updated_date, new Object[] {
                s, obj1
            });
            g.setText(((CharSequence) (obj)));
            g.setVisibility(0);
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    public void setState(m m1)
    {
        if (m1 == m)
        {
            return;
        }
        if (m1 == m.Loading)
        {
            a.setVisibility(8);
            if (b.a().b(d.getBackingWidget()))
            {
                b.a().c(d.getBackingWidget());
            }
            c.setVisibility(0);
        } else
        {
            a.setVisibility(0);
            if (!b.a().b(d.getBackingWidget()))
            {
                b.a().a(d.getBackingWidget());
            }
            c.setVisibility(8);
        }
        if (m1 == m.ReleaseToRefresh)
        {
            a(f);
        } else
        {
            a(e);
        }
        e();
        if (m1 == m.ReleaseToRefresh)
        {
            i.applyChange(j);
        } else
        {
            i.applyChange(k);
        }
        m = m1;
    }
}
