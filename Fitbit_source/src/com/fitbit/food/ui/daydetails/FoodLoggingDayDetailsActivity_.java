// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.daydetails;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import java.util.Date;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.food.ui.daydetails:
//            FoodLoggingDayDetailsActivity

public final class FoodLoggingDayDetailsActivity_ extends FoodLoggingDayDetailsActivity
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public a a(Date date)
        {
            b.putExtra("detailsDate", date);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/food/ui/daydetails/FoodLoggingDayDetailsActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/food/ui/daydetails/FoodLoggingDayDetailsActivity_);
        }
    }


    public static final String c = "detailsDate";
    private final c d = new c();

    public FoodLoggingDayDetailsActivity_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        org.androidannotations.a.c.c.a(this);
        f();
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("detailsDate"))
        {
            b = (Date)bundle.getSerializable("detailsDate");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = (ProgressBar)a1.findViewById(0x7f11009b);
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(d);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
        setContentView(0x7f04016c);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        d.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        d.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        d.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
