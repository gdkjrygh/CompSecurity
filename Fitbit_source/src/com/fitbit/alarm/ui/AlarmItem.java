// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.Alarm;
import com.fitbit.util.al;
import com.fitbit.util.ap;
import com.fitbit.util.b.a;
import com.fitbit.util.format.e;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Stack;

public class AlarmItem extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected TextView c;
    protected View d;
    protected View e;
    protected TextView f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    private Calendar j;

    public AlarmItem(Context context)
    {
        super(context);
        j = new GregorianCalendar(al.a());
        g = context.getResources().getDrawable(0x7f020072);
        h = context.getResources().getDrawable(0x7f020074);
    }

    public AlarmItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new GregorianCalendar(al.a());
    }

    public AlarmItem(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        j = new GregorianCalendar(al.a());
    }

    public void a(Alarm alarm)
    {
        c.setVisibility(8);
        setEnabled(alarm.a());
        a(false);
        if (!alarm.g() || alarm.l()) goto _L2; else goto _L1
_L1:
        if (alarm.h() == null)
        {
            a.setText(null);
            b.setText(null);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (alarm.l())
        {
            c.setVisibility(0);
            c.setText(0x7f080374);
        } else
        if (alarm.a())
        {
            c.setVisibility(0);
            c.setText(0x7f080375);
            a(true);
        } else
        if (!alarm.a() && !alarm.g())
        {
            c.setVisibility(0);
            c.setText(0x7f080375);
        }
        if (true) goto _L1; else goto _L3
_L3:
        a.setText(com.fitbit.util.format.e.n(getContext(), alarm.h()));
        if (alarm.c())
        {
            e.setVisibility(0);
            b.setText(com.fitbit.util.format.e.b(getContext(), alarm.j()));
            return;
        }
        e.setVisibility(8);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(alarm.b(new Date()));
        if (calendar.get(5) == j.get(5))
        {
            b.setText(0x7f080540);
            return;
        } else
        {
            b.setText(0x7f080542);
            return;
        }
    }

    public void a(boolean flag)
    {
        i = flag;
        Drawable drawable;
        if (i)
        {
            f.setTextColor(getResources().getColorStateList(0x7f0f0187));
        } else
        {
            f.setTextColor(getResources().getColorStateList(0x7f0f0188));
        }
        if (flag)
        {
            drawable = h;
        } else
        {
            drawable = g;
        }
        if (com.fitbit.util.b.a.a(16))
        {
            d.setBackground(g);
        } else
        {
            d.setBackgroundDrawable(drawable);
        }
        d.setPadding(ap.a(getContext(), 16F), ap.a(getContext(), 10F), ap.a(getContext(), 10F), ap.a(getContext(), 16F));
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        Stack stack;
        if (flag)
        {
            f.setText(0x7f080354);
        } else
        {
            f.setText(0x7f080353);
        }
        stack = new Stack();
        stack.push(this);
        do
        {
            if (stack.size() == 0)
            {
                break;
            }
            Object obj = (View)stack.pop();
            if (obj instanceof ViewGroup)
            {
                obj = (ViewGroup)obj;
                int k = 0;
                while (k < ((ViewGroup) (obj)).getChildCount()) 
                {
                    ((View)stack.push(((ViewGroup) (obj)).getChildAt(k))).setEnabled(flag);
                    k++;
                }
            }
        } while (true);
    }
}
