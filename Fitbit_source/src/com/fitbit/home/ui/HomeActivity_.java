// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.home.ui:
//            HomeActivity, HomeNavigationItem

public final class HomeActivity_ extends HomeActivity
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

        public a a(HomeNavigationItem homenavigationitem)
        {
            b.putExtra("navigationItem", homenavigationitem);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("toast", s);
            return this;
        }

        public a b(String s)
        {
            b.putExtra("action", s);
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
            b = new Intent(context, com/fitbit/home/ui/HomeActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/home/ui/HomeActivity_);
        }
    }


    public static final String e = "navigationItem";
    public static final String f = "toast";
    public static final String g = "action";
    private final c k = new c();

    public HomeActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        m();
        j = com.fitbit.ui.drawer.b.a(this);
        b(bundle);
        c.a(this);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            i = (HomeNavigationItem)bundle.getSerializable("currentItem");
            return;
        }
    }

    public static a f(Context context)
    {
        return new a(context);
    }

    private void m()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("navigationItem"))
            {
                d = (HomeNavigationItem)bundle.getSerializable("navigationItem");
            }
            if (bundle.containsKey("toast"))
            {
                b = bundle.getString("toast");
            }
            if (bundle.containsKey("action"))
            {
                c = bundle.getString("action");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        d();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(k);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040039);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("currentItem", i);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        k.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        k.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        k.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        m();
    }
}
