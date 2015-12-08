// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import ES;
import ET;
import Em;
import Ge;
import IJ;
import MA;
import Mf;
import Og;
import PI;
import SO;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.notification.AndroidNotificationManager;
import com.squareup.otto.Bus;
import java.util.List;

public class MyStoryView extends FrameLayout
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    private static final String b = com/snapchat/android/stories/ui/MyStoryView.getSimpleName();
    private static String c = (new StringBuilder()).append(b).append("_NOTIFICATION").toString();
    public ImageView a;
    private final Context d;
    private final StorySnapLogbook e;
    private final Em f;
    private final LayoutInflater g;
    private final Bus h;
    private a i;
    private ImageView j;
    private ImageView k;
    private PI l;
    private boolean m;
    private ES n;
    private SO o;
    private List p;
    private ListView q;
    private View r;
    private final android.view.View.OnClickListener s;
    private final android.view.View.OnClickListener t;
    private android.view.View.OnClickListener u = new android.view.View.OnClickListener() {

        private MyStoryView a;

        public final void onClick(View view)
        {
            MyStoryView.d(a).b();
        }

            
            {
                a = MyStoryView.this;
                super();
            }
    };

    public MyStoryView(Context context, StorySnapLogbook storysnaplogbook, a a1)
    {
        this(context, storysnaplogbook, Mf.a(), new Em(context), a1, (LayoutInflater)context.getSystemService("layout_inflater"));
        context = g.inflate(0x7f0400a4, this);
        storysnaplogbook = new android.widget.FrameLayout.LayoutParams(-1, -1);
        storysnaplogbook.gravity = 17;
        setLayoutParams(storysnaplogbook);
        storysnaplogbook = (ImageView)context.findViewById(0x7f0d0361);
        TextView textview = (TextView)context.findViewById(0x7f0d035f);
        a1 = (TextView)context.findViewById(0x7f0d0362);
        RelativeLayout relativelayout = (RelativeLayout)context.findViewById(0x7f0d0360);
        RelativeLayout relativelayout1 = (RelativeLayout)context.findViewById(0x7f0d035d);
        a = (ImageView)context.findViewById(0x7f0d0363);
        j = (ImageView)context.findViewById(0x7f0d0365);
        k = (ImageView)context.findViewById(0x7f0d0367);
        l = new PI(context, 0x7f0d0366, 0x7f0d009a);
        n = new ES(d);
        q = (ListView)context.findViewById(0x7f0d0368);
        q.setAdapter(n);
        r = g.inflate(0x7f0400fe, null, false);
        a.setOnClickListener(u);
        k.setOnClickListener(s);
        j.setOnClickListener(t);
        o = e.mStorySnapExtra;
        p = e.mStorySnapNotes;
        if (o == null)
        {
            textview.setText("0");
            a1.setText("0");
        } else
        {
            textview.setText(Integer.toString(IJ.a(o.a())));
            a1.setText(Integer.toString(IJ.a(o.b())));
            if (p != null)
            {
                context = new ET(o, p);
                a(context, storysnaplogbook, a1);
                relativelayout.setOnClickListener(new android.view.View.OnClickListener(context, storysnaplogbook, a1) {

                    private ET a;
                    private ImageView b;
                    private TextView c;
                    private MyStoryView d;

                    public final void onClick(View view)
                    {
                        MyStoryView.d(d).a();
                        view = d;
                        boolean flag;
                        if (!MyStoryView.h(d))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        MyStoryView.a(view, flag);
                        MyStoryView.a(d, a, b, c);
                    }

            
            {
                d = MyStoryView.this;
                a = et;
                b = imageview;
                c = textview;
                super();
            }
                });
                relativelayout1.setOnClickListener(new android.view.View.OnClickListener(context, storysnaplogbook, a1) {

                    private ET a;
                    private ImageView b;
                    private TextView c;
                    private MyStoryView d;

                    public final void onClick(View view)
                    {
                        MyStoryView.d(d).a();
                        if (MyStoryView.h(d))
                        {
                            MyStoryView.a(d, false);
                            MyStoryView.a(d, a, b, c);
                        }
                    }

            
            {
                d = MyStoryView.this;
                a = et;
                b = imageview;
                c = textview;
                super();
            }
                });
                return;
            }
        }
    }

    private MyStoryView(Context context, StorySnapLogbook storysnaplogbook, Bus bus, Em em, a a1, LayoutInflater layoutinflater)
    {
        super(context);
        m = false;
        s = new android.view.View.OnClickListener() {

            final MyStoryView a;

            public final void onClick(View view)
            {
                Object obj = SnapchatApplication.get().getResources();
                view = ((Resources) (obj)).getString(0x7f0800f9);
                String s1 = ((Resources) (obj)).getString(0x7f0800fb);
                obj = ((Resources) (obj)).getString(0x7f08007f);
                (new Ge(this, MyStoryView.a(a), view, s1, ((String) (obj))) {

                    final _cls1 a;

                    protected final void a()
                    {
                        MyStoryView.e(a.a).a(MyStoryView.b(a.a), new Em.a(this) {

                            private _cls1 a;

                            public final void a()
                            {
                                String s1 = MyStoryView.a(a.a.a).getResources().getString(0x7f0800f8);
                                MyStoryView.c(a.a.a).a(MyStoryView.a(s1, 0xff000000));
                            }

                            public final void b()
                            {
                            }

                            public final void c()
                            {
                                String s1 = MyStoryView.a(a.a.a).getResources().getString(0x7f0800fa);
                                MyStoryView.c(a.a.a).a(MyStoryView.a(s1, 0xff000000));
                                MyStoryView.d(a.a.a).c();
                            }

                            public final void d()
                            {
                                String s1 = MyStoryView.a(a.a.a).getResources().getString(0x7f0800f6);
                                MyStoryView.c(a.a.a).a(MyStoryView.a(s1, AndroidNotificationManager.a));
                            }

            
            {
                a = _pcls1;
                super();
            }
                        });
                        MyStoryView.c(a.a).a(new Og(false));
                    }

                    protected final void b()
                    {
                        MyStoryView.c(a.a).a(new Og(false));
                    }

                    public final void cancel()
                    {
                        super.cancel();
                        MyStoryView.c(a.a).a(new Og(false));
                    }

            
            {
                a = _pcls1;
                super(context, s1, s2, s3);
            }
                }).show();
            }

            
            {
                a = MyStoryView.this;
                super();
            }
        };
        t = new android.view.View.OnClickListener() {

            final MyStoryView a;

            public final void onClick(View view)
            {
                MyStoryView.e(a).b(MyStoryView.b(a), new Em.a(this) {

                    private _cls2 a;

                    public final void a()
                    {
                        MyStoryView.f(a.a).a(0);
                        MyStoryView.g(a.a).setVisibility(8);
                        String s1 = MyStoryView.a(a.a).getResources().getString(0x7f080224);
                        MyStoryView.c(a.a).a(MyStoryView.a(s1, 0xff000000));
                    }

                    public final void b()
                    {
                        MyStoryView.f(a.a).a(8);
                        MyStoryView.g(a.a).setVisibility(0);
                    }

                    public final void c()
                    {
                        String s1 = MyStoryView.a(a.a).getResources().getString(0x7f080228);
                        MyStoryView.c(a.a).a(MyStoryView.a(s1, 0xff000000));
                    }

                    public final void d()
                    {
                        String s1 = MyStoryView.a(a.a).getResources().getString(0x7f080223);
                        MyStoryView.c(a.a).a(MyStoryView.a(s1, AndroidNotificationManager.a));
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                a = MyStoryView.this;
                super();
            }
        };
        d = context;
        h = bus;
        e = storysnaplogbook;
        i = a1;
        f = em;
        g = layoutinflater;
    }

    static MA a(String s1, int i1)
    {
        s1 = new MA(s1, i1, -1, c);
        s1.a();
        return s1;
    }

    static Context a(MyStoryView mystoryview)
    {
        return mystoryview.d;
    }

    private void a(ET et, ImageView imageview, TextView textview)
    {
        q.removeFooterView(r);
        n.clear();
        et.b = m;
        n.addAll(et.a());
        Integer integer;
        int i1;
        if (et.b)
        {
            integer = et.a.b();
        } else
        {
            integer = et.a.a();
        }
        i1 = IJ.a(integer) - et.a().size();
        if (i1 > 0)
        {
            ((TextView)r.findViewById(0x7f0d0522)).setText(String.format(d.getString(0x7f080190), new Object[] {
                Integer.valueOf(i1)
            }));
            q.addFooterView(r, null, false);
        }
        n.notifyDataSetChanged();
        q.invalidate();
        imageview.setSelected(m);
        et = getResources();
        if (m)
        {
            i1 = 0x7f0c003d;
        } else
        {
            i1 = 0x7f0c0075;
        }
        textview.setTextColor(et.getColor(i1));
    }

    static void a(MyStoryView mystoryview, ET et, ImageView imageview, TextView textview)
    {
        mystoryview.a(et, imageview, textview);
    }

    static boolean a(MyStoryView mystoryview, boolean flag)
    {
        mystoryview.m = flag;
        return flag;
    }

    static StorySnapLogbook b(MyStoryView mystoryview)
    {
        return mystoryview.e;
    }

    static Bus c(MyStoryView mystoryview)
    {
        return mystoryview.h;
    }

    static a d(MyStoryView mystoryview)
    {
        return mystoryview.i;
    }

    static Em e(MyStoryView mystoryview)
    {
        return mystoryview.f;
    }

    static PI f(MyStoryView mystoryview)
    {
        return mystoryview.l;
    }

    static ImageView g(MyStoryView mystoryview)
    {
        return mystoryview.j;
    }

    static boolean h(MyStoryView mystoryview)
    {
        return mystoryview.m;
    }

    public final int a()
    {
        boolean flag = false;
        int j1 = 0;
        int i1 = 0;
        for (; j1 < n.getCount(); j1++)
        {
            View view = n.getView(j1, null, q);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            i1 += view.getMeasuredHeight();
        }

        if (n.getCount() == 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = n.getCount();
            j1 = q.getDividerHeight() * (j1 + 1);
        }
        return i1 + j1;
    }

    public final int b()
    {
        return findViewById(0x7f0d035c).getMeasuredHeight();
    }

    public final boolean c()
    {
        return n.getCount() > 0;
    }

}
