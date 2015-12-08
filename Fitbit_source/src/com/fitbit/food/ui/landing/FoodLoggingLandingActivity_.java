// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.landing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import org.androidannotations.a.b;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.food.ui.landing:
//            FoodLoggingLandingActivity

public final class FoodLoggingLandingActivity_ extends FoodLoggingLandingActivity
    implements org.androidannotations.a.c.a
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
            b = new Intent(context, com/fitbit/food/ui/landing/FoodLoggingLandingActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/food/ui/landing/FoodLoggingLandingActivity_);
        }
    }


    private final c a = new c();

    public FoodLoggingLandingActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
    }

    public static a b(Context context)
    {
        return new a(context);
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(a);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
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
        a.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        a.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        a.a(this);
    }
}
