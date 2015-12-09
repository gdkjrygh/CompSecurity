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
import java.util.Date;
import org.androidannotations.a.b;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.home.ui:
//            DetailActivity

public final class DetailActivity_ extends DetailActivity
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

        public a a(Date date)
        {
            b.putExtra("date", date);
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
            b = new Intent(context, com/fitbit/home/ui/DetailActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/home/ui/DetailActivity_);
        }
    }


    public static final String b = "date";
    private final c c = new c();

    public DetailActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        f();
    }

    public static a b(Context context)
    {
        return new a(context);
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("date"))
        {
            a = (Date)bundle.getSerializable("date");
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(c);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
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
        c.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        c.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        c.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
