// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.ui.endless.a;
import com.fitbit.util.al;
import com.fitbit.util.be;
import com.fitbit.util.fonts.CustomTypefaceSpan;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityStickyHeaderView

public class b extends com.fitbit.ui.endless.a
{
    private static class a
    {

        public TextView a;
        public TextView b;
        public View c;
        public TextView d;

        private a()
        {
        }

    }


    private Context a;
    private Calendar b;
    private ActivityType c;
    private double d;
    private Double e;

    public b(Context context, ActivityType activitytype, double d1)
    {
        a = context;
        c = activitytype;
        d = d1;
    }

    private double a(Date date, Date date1)
    {
        Date date2 = o.a(o.b());
        Iterator iterator = iterator();
        double d1 = 0.0D;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TimeSeriesObject timeseriesobject = (TimeSeriesObject)iterator.next();
            if (o.b(timeseriesobject.a(), date, date1))
            {
                if (e != null && date2.equals(o.a(timeseriesobject.a())))
                {
                    d1 = e.doubleValue() + d1;
                } else
                {
                    d1 = timeseriesobject.b() + d1;
                }
            }
        } while (true);
        return d1;
    }

    private long a()
    {
        b();
        return (long)o.c(b, o.b());
    }

    private void b()
    {
        if (b == null)
        {
            b = o.c();
        }
    }

    public long a(int i)
    {
        Date date = ((TimeSeriesObject)getItem(i)).a();
        b();
        return (long)o.c(b, date);
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        double d1;
        Date date;
        Date date1;
        if (view == null)
        {
            view = com.fitbit.activity.ui.landing.ActivityStickyHeaderView.a(a);
        } else
        {
            view = (ActivityStickyHeaderView)view;
        }
        viewgroup = new Date(((TimeSeriesObject)getItem(i)).a().getTime());
        date = o.e(o.c(), viewgroup);
        date1 = o.f(o.c(), viewgroup);
        if (a(i) == a() && o.e() == o.a(Calendar.getInstance(), viewgroup))
        {
            String s = a.getString(0x7f08051e).toUpperCase(al.a());
            viewgroup = new be();
            viewgroup.append(s);
            viewgroup.setSpan(new CustomTypefaceSpan(FitbitFont.g.a(a, Typeface.DEFAULT)), 0, s.length(), 33);
        } else
        {
            viewgroup = com.fitbit.util.format.e.e(a, o.e(o.c(), viewgroup), o.f(o.c(), viewgroup));
        }
        view.a(viewgroup);
        d1 = a(date, date1);
        view.b(com.fitbit.util.a.a(a, c, Double.valueOf(d1)));
        return view;
    }

    public void a(double d1)
    {
        e = Double.valueOf(d1);
        notifyDataSetChanged();
    }

    public View b(int i, View view, ViewGroup viewgroup)
    {
        double d1;
        Object obj;
        TextView textview;
        View view1;
        TimeSeriesObject timeseriesobject;
        int j;
        if (view == null)
        {
            view = LayoutInflater.from(a).inflate(0x7f040114, viewgroup, false);
            viewgroup = new a();
            view.setTag(viewgroup);
            viewgroup.a = (TextView)view.findViewById(0x7f110371);
            viewgroup.b = (TextView)view.findViewById(0x7f110353);
            viewgroup.c = view.findViewById(0x7f11035b);
            viewgroup.d = (TextView)view.findViewById(0x7f11036c);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        obj = ((a) (viewgroup)).a;
        textview = ((a) (viewgroup)).b;
        view1 = ((a) (viewgroup)).c;
        viewgroup = ((a) (viewgroup)).d;
        timeseriesobject = (TimeSeriesObject)getItem(i);
        if (i == 0 && e != null)
        {
            d1 = e.doubleValue();
        } else
        {
            d1 = timeseriesobject.b();
        }
        ((TextView) (obj)).setText(com.fitbit.util.format.e.b(d1));
        if (d1 >= d)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        view1.setVisibility(j);
        textview.setText(com.fitbit.util.a.a(c, d1));
        obj = new SpannableStringBuilder();
        if (i == 0 && e != null || o.j(new Date(), timeseriesobject.a()))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            String s = a.getString(0x7f080540);
            ((SpannableStringBuilder) (obj)).append(s);
            ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(0xff000000), 0, s.length(), 0);
            ((SpannableStringBuilder) (obj)).setSpan(new StyleSpan(1), 0, s.length(), 0);
        } else
        if (a(i) == a())
        {
            ((SpannableStringBuilder) (obj)).append(com.fitbit.util.format.e.c(timeseriesobject.a().getTime()));
        } else
        {
            ((SpannableStringBuilder) (obj)).append(com.fitbit.util.format.e.u(a, timeseriesobject.a()));
        }
        viewgroup.setText(((CharSequence) (obj)));
        return view;
    }
}
