// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.settings.ui:
//            SoftTrackerSettingsActivity

public final class SoftTrackerSettingsActivity_ extends SoftTrackerSettingsActivity
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
            b = new Intent(context, com/fitbit/settings/ui/SoftTrackerSettingsActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/settings/ui/SoftTrackerSettingsActivity_);
        }
    }


    private final c g = new c();

    public SoftTrackerSettingsActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    public static a b(Context context)
    {
        return new a(context);
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        d = (RadioGroup)a1.findViewById(0x7f1101be);
        f = (CheckBox)a1.findViewById(0x7f1101cb);
        a = (Button)a1.findViewById(0x7f110101);
        c = (EditText)a1.findViewById(0x7f1101bd);
        e = (RadioGroup)a1.findViewById(0x7f1101c2);
        b = (EditText)a1.findViewById(0x7f1101bc);
        a1 = a1.findViewById(0x7f110101);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final SoftTrackerSettingsActivity_ a;

                public void onClick(View view)
                {
                    a.f();
                }

            
            {
                a = SoftTrackerSettingsActivity_.this;
                super();
            }
            });
        }
        e();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(g);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04004e);
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
        g.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        g.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        g.a(this);
    }
}
