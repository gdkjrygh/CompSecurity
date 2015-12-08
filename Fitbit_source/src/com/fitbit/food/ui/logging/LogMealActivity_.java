// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fitbit.data.domain.MealType;
import com.fitbit.food.ui.logging.views.AddedFoodLogView;
import com.fitbit.food.ui.logging.views.ChooseMealTypeView;
import com.fitbit.food.ui.logging.views.FoodItemDescriptionView;
import com.fitbit.food.ui.logging.views.FoodLogDateView;
import com.fitbit.food.ui.logging.views.ServingSizeView;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogMealActivity

public final class LogMealActivity_ extends LogMealActivity
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

        public a a(MealType mealtype)
        {
            b.putExtra("mealType", mealtype);
            return this;
        }

        public a a(Long long1)
        {
            b.putExtra("mealServerId", long1);
            return this;
        }

        public a a(Date date)
        {
            b.putExtra("logDate", date);
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
            b = new Intent(context, com/fitbit/food/ui/logging/LogMealActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/food/ui/logging/LogMealActivity_);
        }
    }


    public static final String k = "logDate";
    public static final String l = "mealType";
    public static final String m = "mealServerId";
    private final c n = new c();

    public LogMealActivity_()
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
        h();
        b(bundle);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            E = (AtomicBoolean)bundle.getSerializable("logging");
            A = (Date)bundle.getSerializable("logDate");
            B = (MealType)bundle.getSerializable("mealType");
            return;
        }
    }

    private void h()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("logDate"))
            {
                A = (Date)bundle.getSerializable("logDate");
            }
            if (bundle.containsKey("mealType"))
            {
                B = (MealType)bundle.getSerializable("mealType");
            }
            if (bundle.containsKey("mealServerId"))
            {
                j = (Long)bundle.getSerializable("mealServerId");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        D = a1.findViewById(0x7f11006c);
        C = (ChooseMealTypeView)a1.findViewById(0x7f110150);
        f = (FoodItemDescriptionView)a1.findViewById(0x7f11014b);
        a = (ScrollView)a1.findViewById(0x7f110149);
        b = (FoodLogDateView)a1.findViewById(0x7f110152);
        c = a1.findViewById(0x7f110153);
        g = (ServingSizeView)a1.findViewById(0x7f11014c);
        h = (TextView)a1.findViewById(0x7f110109);
        i = a1.findViewById(0x7f11014d);
        e = (AddedFoodLogView)a1.findViewById(0x7f11014a);
        d = a1.findViewById(0x7f110156);
        View view = a1.findViewById(0x7f110154);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final LogMealActivity_ a;

                public void onClick(View view1)
                {
                    a.g();
                }

            
            {
                a = LogMealActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f110155);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final LogMealActivity_ a;

                public void onClick(View view1)
                {
                    a.f();
                }

            
            {
                a = LogMealActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(n);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040031);
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
        bundle.putSerializable("logging", E);
        bundle.putSerializable("logDate", A);
        bundle.putSerializable("mealType", B);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        n.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        n.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        n.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        h();
    }
}
