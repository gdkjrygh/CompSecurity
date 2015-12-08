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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableLayout;
import com.fitbit.ui.HeartRateZoneView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.settings.ui:
//            HeartRateCustomZoneActivity

public final class HeartRateCustomZoneActivity_ extends HeartRateCustomZoneActivity
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
            b = new Intent(context, com/fitbit/settings/ui/HeartRateCustomZoneActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/settings/ui/HeartRateCustomZoneActivity_);
        }
    }


    private final c h = new c();

    public HeartRateCustomZoneActivity_()
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
        f = a1.findViewById(0x7f11009a);
        g = a1.findViewById(0x7f110127);
        c = (TableLayout)a1.findViewById(0x7f11012a);
        a = (HeartRateZoneView)a1.findViewById(0x7f110428);
        b = (CheckBox)a1.findViewById(0x7f1103ec);
        a1 = a1.findViewById(0x7f110129);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final HeartRateCustomZoneActivity_ a;

                public void onClick(View view)
                {
                    a.f();
                }

            
            {
                a = HeartRateCustomZoneActivity_.this;
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
        setContentView(0x7f04002a);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000e, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x7f1104e1)
        {
            g();
            return true;
        } else
        {
            return false;
        }
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
