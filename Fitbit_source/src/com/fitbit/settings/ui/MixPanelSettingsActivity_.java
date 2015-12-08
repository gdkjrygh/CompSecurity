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
import android.widget.EditText;
import android.widget.RadioButton;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.settings.ui:
//            MixPanelSettingsActivity

public final class MixPanelSettingsActivity_ extends MixPanelSettingsActivity
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
            b = new Intent(context, com/fitbit/settings/ui/MixPanelSettingsActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/settings/ui/MixPanelSettingsActivity_);
        }
    }


    private final c h = new c();

    public MixPanelSettingsActivity_()
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
        b = (RadioButton)a1.findViewById(0x7f110177);
        f = (EditText)a1.findViewById(0x7f11017b);
        c = (RadioButton)a1.findViewById(0x7f110178);
        a = (RadioButton)a1.findViewById(0x7f110176);
        d = (RadioButton)a1.findViewById(0x7f110179);
        g = a1.findViewById(0x7f110175);
        e = (RadioButton)a1.findViewById(0x7f11017a);
        a1 = a1.findViewById(0x7f11017c);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final MixPanelSettingsActivity_ a;

                public void onClick(View view)
                {
                    a.f();
                }

            
            {
                a = MixPanelSettingsActivity_.this;
                super();
            }
            });
        }
        e();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(h);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040037);
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
        h.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        h.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        h.a(this);
    }
}
