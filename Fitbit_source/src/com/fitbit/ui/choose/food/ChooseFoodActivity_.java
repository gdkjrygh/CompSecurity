// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.fitbit.data.domain.FoodItem;
import java.util.Date;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFoodActivity

public final class ChooseFoodActivity_ extends ChooseFoodActivity
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

        public a a(Bundle bundle)
        {
            b.putExtra("relatedFoodParams", bundle);
            return this;
        }

        public a a(Date date)
        {
            b.putExtra("date", date);
            return this;
        }

        public a a(boolean flag)
        {
            b.putExtra("shoodShowDialog", flag);
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
            b = new Intent(context, com/fitbit/ui/choose/food/ChooseFoodActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/ui/choose/food/ChooseFoodActivity_);
        }
    }


    public static final String o = "date";
    public static final String p = "relatedFoodParams";
    public static final String q = "shoodShowDialog";
    private final c B = new c();

    public ChooseFoodActivity_()
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
        n();
        b(bundle);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            a = bundle.getInt("selectedPage");
            y = (Date)bundle.getSerializable("date");
            x = bundle.getString("currentFilter");
            return;
        }
    }

    private void n()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("date"))
            {
                y = (Date)bundle.getSerializable("date");
            }
            if (bundle.containsKey("relatedFoodParams"))
            {
                j = bundle.getBundle("relatedFoodParams");
            }
            if (bundle.containsKey("shoodShowDialog"))
            {
                i = bundle.getBoolean("shoodShowDialog");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        r = (ListView)a1.findViewById(0x7f1100a1);
        t = a1.findViewById(0x7f11009b);
        s = a1.findViewById(0x7f1100a2);
        v = a1.findViewById(0x7f11006c);
        w = a1.findViewById(0x7f11009f);
        u = a1.findViewById(0x7f1100a3);
        b = (ViewPager)a1.findViewById(0x7f11009e);
        k = (TextView)a1.findViewById(0x7f110498);
        View view = a1.findViewById(0x7f110497);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ChooseFoodActivity_ a;

                public void onClick(View view1)
                {
                    a.m();
                }

            
            {
                a = ChooseFoodActivity_.this;
                super();
            }
            });
        }
        a1 = (AdapterView)a1.findViewById(0x7f1100a1);
        if (a1 != null)
        {
            a1.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final ChooseFoodActivity_ a;

                public void onItemClick(AdapterView adapterview, View view1, int i, long l)
                {
                    a.a((FoodItem)adapterview.getAdapter().getItem(i));
                }

            
            {
                a = ChooseFoodActivity_.this;
                super();
            }
            });
        }
        f();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 778: 
            b(j, intent);
            return;

        case 777: 
            a(j, intent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(B);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04000e);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000a, menu);
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
        int i = menuitem.getItemId();
        if (i == 0x7f1104dd)
        {
            k();
            return true;
        }
        if (i == 0x7f1104dc)
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selectedPage", a);
        bundle.putSerializable("date", y);
        bundle.putString("currentFilter", x);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        B.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        B.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        B.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        n();
    }
}
