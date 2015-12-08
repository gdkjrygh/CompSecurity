// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.onboarding.landing:
//            SensitiveDataAccessActivity

public final class SensitiveDataAccessActivity_ extends SensitiveDataAccessActivity
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
            b = new Intent(context, com/fitbit/onboarding/landing/SensitiveDataAccessActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/onboarding/landing/SensitiveDataAccessActivity_);
        }
    }


    private final c e = new c();

    public SensitiveDataAccessActivity_()
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
        c.a(this);
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = (CheckBox)a1.findViewById(0x7f1100c8);
        c = (TextView)a1.findViewById(0x7f1100c6);
        b = (ImageView)a1.findViewById(0x7f1100c4);
        d = (TextView)a1.findViewById(0x7f1100c5);
        View view = a1.findViewById(0x7f1100ca);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final SensitiveDataAccessActivity_ a;

                public void onClick(View view1)
                {
                    a.g();
                }

            
            {
                a = SensitiveDataAccessActivity_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1100c7);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final SensitiveDataAccessActivity_ a;

                public void onClick(View view1)
                {
                    a.e();
                }

            
            {
                a = SensitiveDataAccessActivity_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1100c9);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final SensitiveDataAccessActivity_ a;

                public void onClick(View view1)
                {
                    a.f();
                }

            
            {
                a = SensitiveDataAccessActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1100c6);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final SensitiveDataAccessActivity_ a;

                public void onClick(View view1)
                {
                    a.i();
                }

            
            {
                a = SensitiveDataAccessActivity_.this;
                super();
            }
            });
        }
        d();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(e);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040015);
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
        e.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        e.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        e.a(this);
    }
}
