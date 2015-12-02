// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.refreshablelistview;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.widget.refreshablelistview:
//            d

public class RefreshableListViewItem extends FrameLayout
{

    private View a;
    private View b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private List h;
    private RotateAnimation i;
    private RotateAnimation j;
    private d k;
    private int l;

    public RefreshableListViewItem(Context context)
    {
        super(context);
        l = -1;
        a();
    }

    public RefreshableListViewItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = -1;
        a();
    }

    public RefreshableListViewItem(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = -1;
        a();
    }

    private void a()
    {
        LayoutInflater.from(getContext()).inflate(k.orca_pull_to_refresh_item, this);
        a = findViewById(i.pull_to_refresh_action_container);
        b = findViewById(i.pull_to_refresh_refresh_container);
        d = (TextView)findViewById(i.pull_to_refresh_text_pull);
        e = (TextView)findViewById(i.pull_to_refresh_text_release);
        f = (TextView)findViewById(i.pull_to_refresh_text_push);
        h = Arrays.asList(new TextView[] {
            d, e, f
        });
        g = (TextView)findViewById(i.pull_to_refresh_last_loaded_time);
        c = (ImageView)findViewById(i.pull_to_refresh_image);
        c.setMinimumHeight(50);
        i = new RotateAnimation(0.0F, -180F, 1, 0.5F, 1, 0.5F);
        i.setInterpolator(new LinearInterpolator());
        i.setDuration(250L);
        i.setFillAfter(true);
        j = new RotateAnimation(-180F, 0.0F, 1, 0.5F, 1, 0.5F);
        j.setInterpolator(new LinearInterpolator());
        j.setDuration(250L);
        j.setFillAfter(true);
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

    public void setDirection(int i1)
    {
        if (i1 == l)
        {
            return;
        } else
        {
            l = i1;
            return;
        }
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

    public void setState(d d1)
    {
        d d2 = k;
        if (d2 == d.PULL_TO_REFRESH && d1 == d.RELEASE_TO_REFRESH)
        {
            a(e);
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            c.clearAnimation();
            c.startAnimation(i);
        } else
        if (d2 == d.PUSH_TO_REFRESH && d1 == d.RELEASE_TO_REFRESH)
        {
            a(e);
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            c.clearAnimation();
            c.startAnimation(i);
        } else
        if (d2 == d.RELEASE_TO_REFRESH && d1 == d.PULL_TO_REFRESH)
        {
            a(d);
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            c.clearAnimation();
            c.startAnimation(j);
        } else
        if (d2 == d.RELEASE_TO_REFRESH && d1 == d.PUSH_TO_REFRESH)
        {
            a(f);
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            c.clearAnimation();
            c.startAnimation(j);
        } else
        if (d1 == d.PULL_TO_REFRESH)
        {
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            a(d);
            c.clearAnimation();
        } else
        if (d1 == d.PUSH_TO_REFRESH)
        {
            c.setImageResource(h.orca_pull_to_refresh_arrow);
            a(f);
            c.clearAnimation();
        }
        if (d1 == d.LOADING)
        {
            a.setVisibility(8);
            b.setVisibility(0);
        } else
        {
            a.setVisibility(0);
            b.setVisibility(8);
        }
        k = d1;
    }
}
