// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.fitbit.data.bl.af;
import com.fitbit.ui.l;
import com.fitbit.util.az;
import com.fitbit.util.chart.Filter;
import java.util.Date;

public abstract class a extends az
{

    private static af a = new af(20);
    protected static l d = new l(Color.rgb(154, 222, 17));
    protected static l e = new l(Color.rgb(255, 200, 7));
    protected static l g = new l(Color.rgb(255, 109, 67));
    protected static l h = new l(Color.rgb(255, 109, 67));
    protected Filter b;
    protected a c;
    private Date i;
    private Date j;
    private boolean k;

    public a(Context context, Date date, Date date1, IntentFilter intentfilter)
    {
        this(context, date, date1, null, intentfilter);
    }

    public a(Context context, Date date, Date date1, Filter filter, IntentFilter intentfilter)
    {
        super(context, intentfilter);
        k = true;
        i = date;
        j = date1;
        b = filter;
    }

    public static Drawable a(int i1)
    {
        switch (i1)
        {
        default:
            return h;

        case 3: // '\003'
            return d;

        case 2: // '\002'
            return e;

        case 1: // '\001'
            return g;
        }
    }

    public static void e()
    {
        a.clear();
    }

    protected String a(Date date, Date date1, Filter filter)
    {
        return (new StringBuilder()).append(af.a(date, date1)).append(":").append(filter.a().name()).append(":").append(getClass().getName()).toString();
    }

    public void a(a a1)
    {
        super.onCanceled(a1);
        if (isStarted() && a1 != null)
        {
            deliverResult(a1);
        }
    }

    protected boolean a(String s)
    {
        return false;
    }

    protected void b()
    {
    }

    public void b(String s)
    {
        a.clear();
        super.b(s);
    }

    protected void d()
    {
    }

    protected a g()
    {
    /* block-local class not found */
    class a {}

        c = (a)super.onLoadInBackground();
        if (c != null)
        {
            c.j = l().a();
            if (k)
            {
                a.a(a(i, j, b), c);
            }
        }
        return c;
    }

    public Date h()
    {
        this;
        JVM INSTR monitorenter ;
        Date date = i;
        this;
        JVM INSTR monitorexit ;
        return date;
        Exception exception;
        exception;
        throw exception;
    }

    public Date i()
    {
        this;
        JVM INSTR monitorenter ;
        Date date = j;
        this;
        JVM INSTR monitorexit ;
        return date;
        Exception exception;
        exception;
        throw exception;
    }

    public Filter l()
    {
        this;
        JVM INSTR monitorenter ;
        Filter filter = b;
        this;
        JVM INSTR monitorexit ;
        return filter;
        Exception exception;
        exception;
        throw exception;
    }

    public void onCanceled(Object obj)
    {
        a((a)obj);
    }

    protected Object onLoadInBackground()
    {
        return g();
    }

    protected void onReset()
    {
        super.onReset();
    }

    protected void onStartLoading()
    {
        boolean flag = takeContentChanged();
        if (f != null && !flag)
        {
            deliverResult(f);
        } else
        {
            a a1;
            if (k)
            {
                a1 = (a)a.get(a(h(), i(), l()));
            } else
            {
                a1 = null;
            }
            if (a1 != null && !flag)
            {
                a1.i = true;
                deliverResult(a1);
            } else
            {
                forceLoad();
            }
        }
        super.onStartLoading();
    }

    protected void onStopLoading()
    {
        super.onStopLoading();
    }

}
