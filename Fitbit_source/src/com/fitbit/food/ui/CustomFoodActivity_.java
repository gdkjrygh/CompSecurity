// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.fitbit.food.ui.logging.views.ServingSizeView;
import com.fitbit.ui.EditText;
import java.util.concurrent.atomic.AtomicBoolean;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

public final class CustomFoodActivity_ extends CustomFoodActivity
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

        public a a(long l)
        {
            b.putExtra("foodEntityId", l);
            return this;
        }

        public a a(CustomFoodActivity.States states)
        {
            b.putExtra("state", states);
            return this;
        }

        public a a(String s1)
        {
            b.putExtra("foodNameFromSearch", s1);
            return this;
        }

        public a b(long l)
        {
            b.putExtra("foodServerId", l);
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
            b = new Intent(context, com/fitbit/food/ui/CustomFoodActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/food/ui/CustomFoodActivity_);
        }
    }


    public static final String r = "foodNameFromSearch";
    public static final String s = "foodEntityId";
    public static final String t = "foodServerId";
    public static final String u = "state";
    private final c v = new c();

    public CustomFoodActivity_()
    {
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        g();
        b(bundle);
    }

    public static a b(Context context)
    {
        return new a(context);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            p = (AtomicBoolean)bundle.getSerializable("logging");
            q = (CustomFoodActivity.CustomFoodModel)bundle.getSerializable("model");
            return;
        }
    }

    private void g()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("foodNameFromSearch"))
            {
                o = bundle.getString("foodNameFromSearch");
            }
            if (bundle.containsKey("foodEntityId"))
            {
                n = bundle.getLong("foodEntityId");
            }
            if (bundle.containsKey("foodServerId"))
            {
                m = bundle.getLong("foodServerId");
            }
            if (bundle.containsKey("state"))
            {
                l = (CustomFoodActivity.States)bundle.getSerializable("state");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        i = (LinearLayout)a1.findViewById(0x7f1100e4);
        d = (EditText)a1.findViewById(0x7f1100dc);
        j = (LinearLayout)a1.findViewById(0x7f1100de);
        f = (SwitchCompat)a1.findViewById(0x7f1100e3);
        k = (ServingSizeView)a1.findViewById(0x7f1100e0);
        g = (ProgressBar)a1.findViewById(0x7f1100e6);
        e = (EditText)a1.findViewById(0x7f1100dd);
        h = a1.findViewById(0x7f1100db);
        a1 = a1.findViewById(0x7f1100e5);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final CustomFoodActivity_ a;

                public void onClick(View view)
                {
                    a.d();
                }

            
            {
                a = CustomFoodActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(v);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040019);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120000, menu);
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
        if (menuitem.getItemId() == 0x7f1104d1)
        {
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("logging", p);
        bundle.putSerializable("model", q);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        v.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        v.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        v.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        g();
    }
}
