// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.al;
import com.fitbit.util.bh;
import com.mobeta.android.dslv.DragSortListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseShortcutsSelector, AutoLapSelector

public class ExerciseOptionsActivity extends FitbitActivity
    implements ExerciseShortcutsSelector.b
{
    private class a extends ArrayAdapter
    {

        final ExerciseOptionsActivity a;

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f04015a, viewgroup, false);
            }
            view = (ExerciseOption)getItem(i1);
            (new b(view1)).a(view.b());
            if (com.fitbit.device.ui.ExerciseOptionsActivity.a(a).getCount() == 1)
            {
                a.c.b(false);
                return view1;
            } else
            {
                a.c.b(true);
                return view1;
            }
        }

        public a(Context context, List list)
        {
            a = ExerciseOptionsActivity.this;
            super(context, 0, list);
        }
    }

    static class b
    {

        View a;
        TextView b;
        ImageView c;

        public void a(String s1)
        {
            b.setText(s1);
        }

        public void a(boolean flag)
        {
            a.setPressed(flag);
        }

        public void b(boolean flag)
        {
            boolean flag2 = true;
            int i1 = 0;
            Object obj = (RelativeLayout)a.findViewById(0x7f1100f6);
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((RelativeLayout) (obj)).setEnabled(flag1);
            obj = a;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((View) (obj)).setEnabled(flag1);
            obj = b;
            if (!flag)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            ((TextView) (obj)).setEnabled(flag1);
            obj = c;
            if (!flag)
            {
                i1 = 4;
            }
            ((ImageView) (obj)).setVisibility(i1);
        }

        public b(View view)
        {
            a = view;
            b = (TextView)a.findViewById(0x1020014);
            c = (ImageView)a.findViewById(0x7f1100f7);
        }
    }

    private class c extends com.mobeta.android.dslv.b
    {

        DragSortListView a;
        final ExerciseOptionsActivity b;
        private boolean i;
        private boolean j;
        private boolean k;
        private int l;
        private int m;
        private float n;
        private int o;

        private float a(float f1)
        {
            return TypedValue.applyDimension(1, f1, b.getResources().getDisplayMetrics());
        }

        private void e()
        {
            Display display = b.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            m = point.y - (int)(2.5F * (float)b.i.getHeight());
        }

        private void f()
        {
            b.i.setVisibility(0);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)b.i.getLayoutParams();
            layoutparams.topMargin = o;
            b.i.setLayoutParams(layoutparams);
        }

        public View a(int i1)
        {
            f();
            View view = LayoutInflater.from(b).inflate(0x7f040152, null);
            b b1 = new b(b.i);
            b1.a(((ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(b).getItem(i1)).b());
            b1.a(true);
            return view;
        }

        public void a(View view)
        {
            b.i.setVisibility(8);
        }

        public void a(View view, Point point, Point point1)
        {
            if (point.y > 0 && point.y < m)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)b.i.getLayoutParams();
                layoutparams.topMargin = point.y;
                b.i.setLayoutParams(layoutparams);
            }
            point = new b(b.i);
            if (n - view.getY() == 0.0F)
            {
                com.fitbit.device.ui.ExerciseOptionsActivity.g(b).setVisibility(8);
            } else
            {
                com.fitbit.device.ui.ExerciseOptionsActivity.g(b).setVisibility(0);
            }
            if ((float)(point1.y - l) < a(48F))
            {
                point.b(true);
                i = true;
            } else
            {
                point.b(false);
                i = false;
            }
            point = new View[b.h.getChildCount()];
            for (int i1 = 0; i1 < point.length; i1++)
            {
                point[i1] = b.h.getChildAt(i1);
            }

            n = view.getY();
        }

        public boolean a(int i1, int j1, int k1)
        {
            l = k1;
            e();
            if (!j)
            {
                return false;
            }
            if (k)
            {
                ExerciseOptionsActivity.f(b).post(ExerciseOptionsActivity.h(b));
                k = false;
            } else
            {
                ExerciseOptionsActivity.f(b).postDelayed(ExerciseOptionsActivity.h(b), 500L);
            }
            return super.a(i1, j1, k1);
        }

        public void onLongPress(MotionEvent motionevent)
        {
            com.fitbit.e.a.a("ExerciseOptionsActivity", "OnLongPress", new Object[0]);
            o = (int)(motionevent.getY() - (float)l);
            b(2);
            j = true;
            super.onLongPress(motionevent);
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            super.onTouch(view, motionevent);
            switch (motionevent.getAction() & 0xff)
            {
            case 0: // '\0'
            default:
                return false;

            case 1: // '\001'
                break;
            }
            if (i)
            {
                a.a(true);
                i = false;
            }
            b.i.setVisibility(8);
            j = false;
            k = true;
            return false;
        }

        public c(DragSortListView dragsortlistview)
        {
            b = ExerciseOptionsActivity.this;
            super(dragsortlistview);
            i = false;
            j = false;
            k = true;
            a = dragsortlistview;
        }
    }


    public static final int a = 7;
    private static final String j = "ExerciseOptionsActivity";
    private static final int l = 48;
    private static final String m = "com.fitbit.device.ui.ExerciseOptionsActivity.EXTRA_SAVE_EXERCISES";
    private View A;
    protected String b;
    protected DragSortListView c;
    protected Button d;
    protected TextView e;
    protected View f;
    protected View g;
    protected RelativeLayout h;
    protected LinearLayout i;
    private com.mobeta.android.dslv.DragSortListView.h k;
    private final Runnable n = new Runnable() {

        final ExerciseOptionsActivity a;

        public void run()
        {
            ExerciseOptionsActivity.b(a, false);
        }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
    };
    private final Runnable o = new Runnable() {

        final ExerciseOptionsActivity a;

        public void run()
        {
            com.fitbit.device.ui.ExerciseOptionsActivity.a(a, true);
        }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
    };
    private Device p;
    private int q;
    private ExerciseOption r;
    private com.mobeta.android.dslv.DragSortListView.m s;
    private a t;
    private View u;
    private View v;
    private TrackerSettings w;
    private List x;
    private List y;
    private Handler z;

    public ExerciseOptionsActivity()
    {
        k = new com.mobeta.android.dslv.DragSortListView.h() {

            final ExerciseOptionsActivity a;

            public void a(int i1, int j1)
            {
                com.fitbit.e.a.a("ExerciseOptionsActivity", "drop %s to %s", new Object[] {
                    Integer.valueOf(i1), Integer.valueOf(j1)
                });
                if (i1 != j1)
                {
                    ExerciseOption exerciseoption = (ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(a).getItem(i1);
                    com.fitbit.device.ui.ExerciseOptionsActivity.a(a).remove(exerciseoption);
                    com.fitbit.device.ui.ExerciseOptionsActivity.a(a).insert(exerciseoption, j1);
                    a.c.b(i1, j1);
                }
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a, false);
            }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
        };
        q = -1;
        r = null;
        s = new com.mobeta.android.dslv.DragSortListView.m() {

            final ExerciseOptionsActivity a;

            public void a(int i1)
            {
                com.fitbit.e.a.a("ExerciseOptionsActivity", "Remove %s", new Object[] {
                    Integer.valueOf(i1)
                });
                ExerciseOption exerciseoption = (ExerciseOption)com.fitbit.device.ui.ExerciseOptionsActivity.a(a).getItem(i1);
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a).remove(exerciseoption);
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a, i1);
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a, exerciseoption);
                ExerciseOptionsActivity.b(a);
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a, false);
                com.fitbit.device.ui.ExerciseOptionsActivity.a(a, bh.a(a, 0x7f0801a3, new String[] {
                    exerciseoption.b()
                }));
            }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
        };
    }

    static int a(ExerciseOptionsActivity exerciseoptionsactivity, int i1)
    {
        exerciseoptionsactivity.q = i1;
        return i1;
    }

    static ExerciseOption a(ExerciseOptionsActivity exerciseoptionsactivity, ExerciseOption exerciseoption)
    {
        exerciseoptionsactivity.r = exerciseoption;
        return exerciseoption;
    }

    static a a(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        return exerciseoptionsactivity.t;
    }

    static String a(Context context, int i1)
    {
        i1 = 7 - i1;
        Object obj = null;
        if (i1 > 0)
        {
            String s1 = al.a(0x7f0b000a, i1);
            context = obj;
            if (s1 != null)
            {
                context = String.format(s1, new Object[] {
                    Integer.valueOf(i1)
                });
            }
            return context;
        } else
        {
            return context.getString(0x7f0801a1);
        }
    }

    static void a(ExerciseOptionsActivity exerciseoptionsactivity, String s1)
    {
        exerciseoptionsactivity.a(s1);
    }

    static void a(ExerciseOptionsActivity exerciseoptionsactivity, boolean flag)
    {
        exerciseoptionsactivity.a(flag);
    }

    private void a(String s1)
    {
        ((TextView)f.findViewById(0x7f1100f3)).setText(s1);
        s1 = AnimationUtils.loadAnimation(this, 0x10a0000);
        s1.setDuration(200L);
        s1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final ExerciseOptionsActivity a;

            public void onAnimationEnd(Animation animation)
            {
                ExerciseOptionsActivity.f(a).postDelayed(com.fitbit.device.ui.ExerciseOptionsActivity.e(a), 3000L);
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
        });
        f.setAnimation(s1);
        f.setVisibility(0);
    }

    private void a(boolean flag)
    {
        if (z != null)
        {
            z.removeCallbacks(o);
        }
        Animation animation = AnimationUtils.loadAnimation(this, 0x10a0000);
        if (flag && g.getVisibility() != 0)
        {
            g.startAnimation(animation);
            g.setVisibility(0);
            v.setVisibility(0);
            u.setVisibility(4);
        } else
        if (u.getVisibility() != 0)
        {
            u.startAnimation(animation);
            u.setVisibility(0);
            g.setVisibility(8);
            v.setVisibility(8);
            return;
        }
    }

    static void b(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        exerciseoptionsactivity.g();
    }

    static void b(ExerciseOptionsActivity exerciseoptionsactivity, boolean flag)
    {
        exerciseoptionsactivity.b(flag);
    }

    private void b(boolean flag)
    {
        if (z != null)
        {
            z.removeCallbacks(n);
        }
        Animation animation = AnimationUtils.loadAnimation(this, 0x10a0001);
        animation.setDuration(200L);
        if (!flag)
        {
            f.setAnimation(animation);
        }
        f.setVisibility(8);
    }

    static void c(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        exerciseoptionsactivity.h();
    }

    static void d(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        exerciseoptionsactivity.i();
    }

    static Runnable e(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        return exerciseoptionsactivity.n;
    }

    static Handler f(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        return exerciseoptionsactivity.z;
    }

    private boolean f()
    {
        for (int i1 = t.getCount(); i1 >= 7 || i1 == y.size();)
        {
            return false;
        }

        return true;
    }

    static View g(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        return exerciseoptionsactivity.A;
    }

    private void g()
    {
        d.setEnabled(f());
        e.setText(a(this, t.getCount()));
    }

    static Runnable h(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        return exerciseoptionsactivity.o;
    }

    private void h()
    {
        ArrayList arraylist = new ArrayList(y.size());
        Iterator iterator = y.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ExerciseOption exerciseoption = (ExerciseOption)iterator.next();
            if (!x.contains(exerciseoption))
            {
                arraylist.add(exerciseoption);
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            com.fitbit.device.ui.ExerciseShortcutsSelector.a(arraylist, this, t.getCount(), p.j()).show(getSupportFragmentManager(), "ExerciseShortcutsSelector.ADD_EXERCISE_SHORTCUTS");
        }
    }

    private void i()
    {
        if (q != -1 && r != null)
        {
            t.insert(r, q);
            q = -1;
            r = null;
            g();
        }
    }

    public void a(ExerciseShortcutsSelector exerciseshortcutsselector)
    {
        t.addAll(exerciseshortcutsselector.d());
        t.notifyDataSetChanged();
        g();
    }

    protected void c()
    {
        Object obj = new c(c);
        c.a(((com.mobeta.android.dslv.DragSortListView.i) (obj)));
        c.setOnTouchListener(((android.view.View.OnTouchListener) (obj)));
        c.a(s);
        c.a(k);
        obj = View.inflate(this, 0x7f040159, null);
        A = ((View) (obj)).findViewById(0x7f110401);
        c.addHeaderView(((View) (obj)));
        Object obj1 = View.inflate(this, 0x7f040158, null);
        c.addFooterView(((View) (obj1)));
        u = ((View) (obj)).findViewById(0x7f1103fe);
        v = ((View) (obj)).findViewById(0x7f110400);
        TextView textview = (TextView)((View) (obj)).findViewById(0x7f1103ff);
        if (com.fitbit.bluetooth.g.f() && p.a(DeviceFeature.AUTO_LAP))
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7f020281, 0);
            textview.setOnClickListener(new android.view.View.OnClickListener() {

                final ExerciseOptionsActivity a;

                public void onClick(View view)
                {
                    com.fitbit.device.ui.AutoLapSelector.a(a.b).show(a.getSupportFragmentManager(), null);
                }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
            });
        }
        e = (TextView)((View) (obj1)).findViewById(0x7f110395);
        d = (Button)((View) (obj1)).findViewById(0x7f1103fd);
        obj1 = (TextView)findViewById(0x7f1100f1);
        ((TextView) (obj1)).setText(bh.a(this, 0x7f0801a4, new String[] {
            p.j()
        }));
        ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0x7f02028b, 0, 0, 0);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final ExerciseOptionsActivity a;

            public void onClick(View view)
            {
                ExerciseOptionsActivity.b(a, true);
                ExerciseOptionsActivity.c(a);
            }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
        });
        ((TextView)((View) (obj)).findViewById(0x7f110395)).setText(bh.a(this, 0x7f0801a5, new String[] {
            p.j()
        }));
        ((Button)f.findViewById(0x7f1100f4)).setOnClickListener(new android.view.View.OnClickListener() {

            final ExerciseOptionsActivity a;

            public void onClick(View view)
            {
                ExerciseOptionsActivity.b(a, false);
                ExerciseOptionsActivity.d(a);
            }

            
            {
                a = ExerciseOptionsActivity.this;
                super();
            }
        });
        z = new Handler();
        t = new a(this, x);
        c.setAdapter(t);
        g();
        a(false);
    }

    public void onBackPressed()
    {
        w.a(TrackerOption.EXERCISES).a(x);
        p.a(w);
        an.a().a(p, this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        p = an.a().a(b);
        if (p != null) goto _L2; else goto _L1
_L1:
        finish();
_L10:
        w = (TrackerSettings)p.o().clone();
        y = p.r();
        if (bundle == null) goto _L4; else goto _L3
_L3:
        x = bundle.getParcelableArrayList("com.fitbit.device.ui.ExerciseOptionsActivity.EXTRA_SAVE_EXERCISES");
_L8:
        return;
_L2:
        if (p.o() == null)
        {
            p.a(new TrackerSettings());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        x = new ArrayList();
        bundle = ((List)w.a(TrackerOption.EXERCISES).c()).iterator();
_L6:
        int i1;
        if (!bundle.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ExerciseOption exerciseoption = (ExerciseOption)bundle.next();
        i1 = y.indexOf(exerciseoption);
        if (i1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        x.add(y.get(i1));
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        bundle;
        com.fitbit.e.a.f("ExerciseOptionsActivity", "Clone unsopported", bundle, new Object[0]);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (z != null)
        {
            z.removeCallbacks(n);
            z.removeCallbacks(o);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (x != null)
        {
            bundle.putParcelableArrayList("com.fitbit.device.ui.ExerciseOptionsActivity.EXTRA_SAVE_EXERCISES", new ArrayList(x));
        }
    }
}
