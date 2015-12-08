// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodMeasurementUnit;
import com.fitbit.data.domain.h;
import com.fitbit.food.CommonMeasurementUnits;
import com.fitbit.food.NutritionalValue;
import com.fitbit.food.ui.logging.views.ServingSizeView;
import com.fitbit.ui.EditText;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.ab;
import com.fitbit.util.bf;
import com.fitbit.util.bh;
import com.fitbit.util.bq;
import com.fitbit.util.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity_, NutritionalValueEditView

public class CustomFoodActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    protected static class CustomFoodModel
        implements Serializable
    {

        private static final double a = 999999D;
        private static final long b = 6000L;
        private static final long serialVersionUID = 1L;
        List additionalValues;
        String brand;
        String name;
        double servingSize;
        String servingUnit;
        boolean showMoreDetails;
        Map usedNutritionalValues;

        Map a()
        {
            HashMap hashmap = new HashMap();
            NutritionalValue nutritionalvalue;
            for (Iterator iterator = usedNutritionalValues.keySet().iterator(); iterator.hasNext(); hashmap.put(nutritionalvalue.c(), usedNutritionalValues.get(nutritionalvalue)))
            {
                nutritionalvalue = (NutritionalValue)iterator.next();
            }

            return hashmap;
        }

        int b()
        {
            name = bh.f(name);
            if (name.isEmpty() || name.trim().isEmpty())
            {
                return 0x7f08012b;
            }
            if (((Double)usedNutritionalValues.get(NutritionalValue.a)).doubleValue() == 0.0D)
            {
                return 0x7f08012b;
            }
            if (Math.abs(servingSize) < 0.0001D || Math.abs(servingSize) > 999999D)
            {
                return 0x7f0803e4;
            }
            return ((Double)usedNutritionalValues.get(NutritionalValue.a)).doubleValue() <= 6000D ? 0 : 0x7f080124;
        }

        CustomFoodModel(FoodItem fooditem, String s1)
        {
            usedNutritionalValues = new HashMap();
            additionalValues = new ArrayList();
            showMoreDetails = false;
            usedNutritionalValues.put(NutritionalValue.a, Double.valueOf(0.0D));
            usedNutritionalValues.put(NutritionalValue.b, Double.valueOf(0.0D));
            additionalValues.add(NutritionalValue.c);
            additionalValues.add(NutritionalValue.d);
            additionalValues.add(NutritionalValue.e);
            additionalValues.add(NutritionalValue.f);
            additionalValues.add(NutritionalValue.g);
            additionalValues.add(NutritionalValue.h);
            additionalValues.add(NutritionalValue.i);
            additionalValues.add(NutritionalValue.j);
            additionalValues.add(NutritionalValue.k);
            additionalValues.add(NutritionalValue.l);
            NutritionalValue nutritionalvalue1;
            for (Iterator iterator = additionalValues.iterator(); iterator.hasNext(); usedNutritionalValues.put(nutritionalvalue1, Double.valueOf(0.0D)))
            {
                nutritionalvalue1 = (NutritionalValue)iterator.next();
            }

            if (fooditem != null)
            {
                name = fooditem.f();
                brand = "";
                s1 = fooditem.a();
                if (s1 != null)
                {
                    brand = s1.a();
                }
                s1 = ab.a(fooditem);
                servingSize = ab.a(s1);
                servingUnit = s1.a();
                fooditem = fooditem.d();
                s1 = usedNutritionalValues.keySet().iterator();
                do
                {
                    if (!s1.hasNext())
                    {
                        break;
                    }
                    NutritionalValue nutritionalvalue = (NutritionalValue)s1.next();
                    Double double1 = (Double)fooditem.get(nutritionalvalue.c());
                    if (double1 != null)
                    {
                        usedNutritionalValues.put(nutritionalvalue, double1);
                    }
                } while (true);
            } else
            {
                if (s1 == null || s1.isEmpty())
                {
                    s1 = "";
                }
                name = s1;
                brand = "";
                servingSize = 1.0D;
            }
        }
    }

    public static final class States extends Enum
    {

        public static final States a;
        public static final States b;
        private static final States c[];

        public static States valueOf(String s1)
        {
            return (States)Enum.valueOf(com/fitbit/food/ui/CustomFoodActivity$States, s1);
        }

        public static States[] values()
        {
            return (States[])c.clone();
        }

        static 
        {
            a = new States("CREATE", 0);
            b = new States("EDIT", 1);
            c = (new States[] {
                a, b
            });
        }

        private States(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    class a
    {

        final CustomFoodActivity a;
        private final View b;
        private NutritionalValue c;
        private NutritionalValueEditView d;
        private TextView e;

        public NutritionalValue a()
        {
            return c;
        }

        public void a(double d1)
        {
            if (d1 == 0.0D)
            {
                d.setHint(d.c(0.0D));
                return;
            } else
            {
                d.a(d1);
                return;
            }
        }

        public void a(NutritionalValue nutritionalvalue)
        {
            c = nutritionalvalue;
            e.setText(nutritionalvalue.a());
            d.b(b.getContext().getString(nutritionalvalue.b()));
        }

        public double b()
        {
            return d.b();
        }

        public View c()
        {
            return b;
        }

        public a(View view)
        {
            a = CustomFoodActivity.this;
            super();
            b = view;
            d = (NutritionalValueEditView)view.findViewById(0x7f1104a7);
            e = (TextView)view.findViewById(0x7f1104a6);
        }
    }


    public static final int a = 4781;
    public static final int b = 3;
    public static final String c = "com.fitbit.food.ui.CustomFoodActivity.EXTRA_CREATED_FOOD_ENTITY_ID";
    protected EditText d;
    protected EditText e;
    protected SwitchCompat f;
    protected ProgressBar g;
    protected View h;
    protected LinearLayout i;
    protected LinearLayout j;
    protected ServingSizeView k;
    protected States l;
    protected long m;
    protected long n;
    protected String o;
    protected AtomicBoolean p;
    protected CustomFoodModel q;
    private FoodItem r;
    private Map s;
    private List t;

    public CustomFoodActivity()
    {
        m = -1L;
        n = -1L;
        p = new AtomicBoolean(false);
        q = null;
        s = new HashMap();
        t = new ArrayList();
    }

    public static Intent a(Activity activity)
    {
        return CustomFoodActivity_.b(activity).a(States.a).a();
    }

    public static Intent a(Context context, String s1)
    {
        return CustomFoodActivity_.b(context).a(States.a).a(s1).a();
    }

    private h a(String s1)
    {
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            Iterator iterator = t.iterator();
            h h1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                h1 = (h)iterator.next();
            } while (!s1.equals(h1.a()));
            return h1;
        }
        return null;
    }

    public static void a(Context context)
    {
        CustomFoodActivity_.b(context).a(States.a).b();
    }

    public static void a(Context context, long l1, long l2)
    {
        CustomFoodActivity_.b(context).a(States.b).b(l2).a(l1).b(4781);
    }

    static void a(CustomFoodActivity customfoodactivity)
    {
        customfoodactivity.i();
    }

    static void a(CustomFoodActivity customfoodactivity, boolean flag)
    {
        customfoodactivity.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            f.setText(f.getTextOn());
            return;
        } else
        {
            f.setText(f.getTextOff());
            return;
        }
    }

    static void b(CustomFoodActivity customfoodactivity)
    {
        customfoodactivity.o();
    }

    static FoodItem c(CustomFoodActivity customfoodactivity)
    {
        return customfoodactivity.r;
    }

    private void g()
    {
        e.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final CustomFoodActivity a;

            public void onFocusChange(View view, boolean flag)
            {
                if (!flag)
                {
                    bq.a(a, a.e);
                }
            }

            
            {
                a = CustomFoodActivity.this;
                super();
            }
        });
        k.a(t);
        a a1 = new a(j.findViewById(0x7f1100e1));
        a1.a(NutritionalValue.a);
        s.put(NutritionalValue.a, a1);
        a1 = new a(j.findViewById(0x7f1100e2));
        a1.a(NutritionalValue.b);
        s.put(NutritionalValue.b, a1);
        h();
        a(f.isChecked());
        f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CustomFoodActivity a;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                CustomFoodActivity.a(a, flag);
                a.q.showMoreDetails = flag;
                CustomFoodActivity.a(a);
            }

            
            {
                a = CustomFoodActivity.this;
                super();
            }
        });
        j();
        i();
    }

    private void h()
    {
        if (i.getChildCount() > 0)
        {
            i.removeAllViews();
        }
        Iterator iterator = q.additionalValues.iterator();
        while (iterator.hasNext()) 
        {
            NutritionalValue nutritionalvalue = (NutritionalValue)iterator.next();
            Object obj = (a)s.get(nutritionalvalue);
            if (obj != null)
            {
                obj = ((a) (obj)).c();
            } else
            {
                obj = LayoutInflater.from(this).inflate(0x7f0401cf, i, false);
                a a1 = new a(((View) (obj)));
                a1.a(nutritionalvalue);
                a1.a(((Double)q.usedNutritionalValues.get(nutritionalvalue)).doubleValue());
                s.put(nutritionalvalue, a1);
            }
            i.addView(((View) (obj)));
        }
    }

    private void i()
    {
        LinearLayout linearlayout = i;
        int i1;
        if (q.showMoreDetails)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        linearlayout.setVisibility(i1);
    }

    private void j()
    {
        d.setText(q.name);
        e.setText(q.brand);
        Object obj = q.usedNutritionalValues.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            NutritionalValue nutritionalvalue = (NutritionalValue)((Iterator) (obj)).next();
            a a1 = (a)s.get(nutritionalvalue);
            if (a1 != null)
            {
                a1.a(((Double)q.usedNutritionalValues.get(nutritionalvalue)).doubleValue());
            }
        } while (true);
        h h1 = a(q.servingUnit);
        obj = h1;
        if (h1 == null)
        {
            obj = (h)t.get(0);
        }
        k.a(q.servingSize, ((h) (obj)));
    }

    private void k()
    {
        q.name = d.getText().toString();
        q.brand = e.getText().toString();
        q.servingSize = k.b();
        q.servingUnit = k.c().a();
        Iterator iterator = q.usedNutritionalValues.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            NutritionalValue nutritionalvalue = (NutritionalValue)iterator.next();
            a a1 = (a)s.get(nutritionalvalue);
            if (a1 != null)
            {
                q.usedNutritionalValues.put(nutritionalvalue, Double.valueOf(a1.b()));
            }
        } while (true);
    }

    private void l()
    {
        FoodItem fooditem;
        Object obj;
        Object obj1;
        if (States.a.equals(l))
        {
            fooditem = new FoodItem();
        } else
        {
            fooditem = r;
        }
        fooditem.a(q.name);
        obj1 = new Brand();
        if (q.brand == null)
        {
            obj = "";
        } else
        {
            obj = q.brand.trim();
        }
        ((Brand) (obj1)).a(((String) (obj)));
        ((Brand) (obj1)).a(false);
        fooditem.a(((Brand) (obj1)));
        obj = a(q.servingUnit);
        ((h) (obj)).a(true);
        ((h) (obj)).a(1.0D / q.servingSize);
        obj1 = new ArrayList();
        ((List) (obj1)).add(obj);
        fooditem.a(((List) (obj1)));
        fooditem.a(q.a());
        fooditem.d(true);
        fooditem.a(true);
        com.fitbit.util.f.a(new com.fitbit.util.f.a(this, fooditem) {

            final FoodItem a;
            final CustomFoodActivity b;

            public void a(Activity activity)
            {
                com.fitbit.data.bl.r.a().a(a, activity);
            }

            public void a(Object obj2)
            {
                b((Activity)obj2);
            }

            public void b(Activity activity)
            {
                if (States.a.equals(b.l))
                {
                    Intent intent = new Intent();
                    Long long1 = a.getEntityId();
                    activity = long1;
                    if (long1 == null)
                    {
                        activity = Long.valueOf(-1L);
                    }
                    intent.putExtra("com.fitbit.food.ui.CustomFoodActivity.EXTRA_CREATED_FOOD_ENTITY_ID", activity);
                    b.setResult(-1, intent);
                }
                b.finish();
            }

            public void b(Object obj2)
            {
                a((Activity)obj2);
            }

            
            {
                b = CustomFoodActivity.this;
                a = fooditem;
                super(activity);
            }
        });
    }

    private void m()
    {
        g.setVisibility(0);
        h.setVisibility(4);
    }

    private void n()
    {
        g.setVisibility(4);
        h.setVisibility(0);
    }

    private void o()
    {
        CommonMeasurementUnits acommonmeasurementunits[] = CommonMeasurementUnits.values();
        int j1 = acommonmeasurementunits.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj = acommonmeasurementunits[i1];
            obj = com.fitbit.data.bl.r.a().e(((CommonMeasurementUnits) (obj)).a());
            if (obj != null)
            {
                h h1 = new h();
                h1.a(((FoodMeasurementUnit) (obj)).b());
                h1.b(((FoodMeasurementUnit) (obj)).c());
                h1.a(1.0D);
                t.add(h1);
            }
        }

    }

    public void a(Loader loader, FoodItem fooditem)
    {
        r = fooditem;
        if (q == null)
        {
            q = new CustomFoodModel(r, o);
        }
        n();
        g();
    }

    protected void c()
    {
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[States.values().length];
                try
                {
                    a[States.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[States.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6.a[l.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 49
    //                   2 59;
           goto _L1 _L2 _L3
_L1:
        m();
        getSupportLoaderManager().initLoader(26, null, this);
        return;
_L2:
        setTitle(0x7f0801e3);
        continue; /* Loop/switch isn't completed */
_L3:
        setTitle(0x7f0801db);
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void d()
    {
        k();
        int i1 = q.b();
        if (i1 == 0)
        {
            if (p.compareAndSet(false, true))
            {
                l();
            }
            return;
        } else
        {
            com.fitbit.ui.s.a(this, i1, 0).i();
            return;
        }
    }

    public boolean e()
    {
        return q.showMoreDetails;
    }

    protected void f()
    {
        com.fitbit.util.f.a(new com.fitbit.util.f.a(this) {

            final CustomFoodActivity a;

            public void a(Activity activity)
            {
                com.fitbit.data.bl.r.a().b(CustomFoodActivity.c(a), activity);
            }

            public void b(Object obj)
            {
                a((Activity)obj);
            }

            
            {
                a = CustomFoodActivity.this;
                super(activity);
            }
        });
        setResult(3);
        finish();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new bf(this) {

            final CustomFoodActivity a;

            public FoodItem a()
            {
label0:
                {
                    CustomFoodActivity.b(a);
                    FoodItem fooditem = null;
                    if (States.b == a.l)
                    {
                        if (-1L == a.m)
                        {
                            break label0;
                        }
                        fooditem = com.fitbit.data.bl.r.a().c(a.m);
                    }
                    return fooditem;
                }
                return com.fitbit.data.bl.r.a().b(a.n);
            }

            public Object f_()
            {
                return a();
            }

            
            {
                a = CustomFoodActivity.this;
                super(context);
            }
        };
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (FoodItem)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return States.b == l;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        k();
    }
}
