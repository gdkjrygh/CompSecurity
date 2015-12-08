// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.ay.c;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            e, cg, d, c

public final class k extends ListView
    implements e
{
    final class a extends ArrayAdapter
    {

        private k a;

        private int a(int j)
        {
            return Math.round(TypedValue.applyDimension(1, j, a.getResources().getDisplayMetrics()));
        }

        private ImageView a(ViewGroup viewgroup, Drawable drawable)
        {
            ImageView imageview = new ImageView(getContext());
            imageview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-2, a(16)));
            imageview.setPadding(a(1), 0, a(1), 0);
            imageview.setImageDrawable(drawable);
            viewgroup.addView(imageview);
            return imageview;
        }

        public final View getView(int j, View view, ViewGroup viewgroup)
        {
            viewgroup = (RelativeLayout)view;
            Object obj1;
            if (view == null)
            {
                view = new RelativeLayout(getContext());
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, a(44)));
            } else
            {
                view = viewgroup;
            }
            viewgroup = (c)view.getTag();
            if (viewgroup == null)
            {
                viewgroup = new TextView(getContext());
                viewgroup.setPadding(0, 0, 0, 0);
                viewgroup.setClickable(false);
                viewgroup.setTextSize(2, 18F);
                viewgroup.setTextColor(k.a(a).getColor(com.google.android.m4b.maps.h.c.maps_floorpicker_text));
                viewgroup.setGravity(17);
                Object obj = new android.widget.RelativeLayout.LayoutParams(-1, a(36));
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
                view.addView(viewgroup, ((android.view.ViewGroup.LayoutParams) (obj)));
                obj = new LinearLayout(getContext());
                android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutparams.addRule(12);
                layoutparams.addRule(14);
                view.addView(((View) (obj)), layoutparams);
                viewgroup = new c(viewgroup, a(((ViewGroup) (obj)), k.a(a).getDrawable(com.google.android.m4b.maps.h.e.maps_floorpicker_mylocation)), a(((ViewGroup) (obj)), k.a(a).getDrawable(com.google.android.m4b.maps.h.e.maps_floorpicker_search)));
                view.setTag(viewgroup);
            }
            obj1 = ((b)getItem(j)).toString();
            ((c) (viewgroup)).a.setText(((CharSequence) (obj1)));
            ((c) (viewgroup)).a.setContentDescription(MessageFormat.format(k.a(a).getString(com.google.android.m4b.maps.h.h.maps_LEVEL_ALT_TEXT), new Object[] {
                obj1
            }));
            if (j == com.google.android.m4b.maps.cg.k.b(a))
            {
                ((c) (viewgroup)).a.setTextColor(k.a(a).getColor(com.google.android.m4b.maps.h.c.maps_floorpicker_black));
                view.setBackgroundDrawable(k.a(a).getDrawable(com.google.android.m4b.maps.h.e.maps_floorpicker_bg_selected));
                view.destroyDrawingCache();
            } else
            {
                ((c) (viewgroup)).a.setTextColor(k.a(a).getColor(com.google.android.m4b.maps.h.c.maps_floorpicker_text));
                if (view.getBackground() != null)
                {
                    view.setBackgroundDrawable(null);
                    view.destroyDrawingCache();
                }
            }
            if (j == com.google.android.m4b.maps.cg.k.c(a))
            {
                ((c) (viewgroup)).b.setVisibility(0);
            } else
            {
                ((c) (viewgroup)).b.setVisibility(8);
            }
            obj1 = ((b)getItem(j)).a;
            if (obj1 != null && k.d(a).contains(((com.google.android.m4b.maps.cg.c) (obj1)).a()))
            {
                j = 0;
            } else
            {
                j = 8;
            }
            ((c) (viewgroup)).c.setVisibility(j);
            return view;
        }

        public final boolean hasStableIds()
        {
            return true;
        }

        a(Context context, cg cg1)
        {
            a = k.this;
            super(context, -1);
            if (cg1.d())
            {
                add(new b(null));
            }
            for (k1 = cg1.b().iterator(); hasNext(); add(new b((com.google.android.m4b.maps.cg.c)next()))) { }
        }
    }

    static final class b
    {

        final com.google.android.m4b.maps.cg.c a;

        public final String toString()
        {
            if (a == null)
            {
                return "1";
            } else
            {
                return a.d();
            }
        }

        b(com.google.android.m4b.maps.cg.c c1)
        {
            a = c1;
        }
    }

    static final class c
    {

        public final TextView a;
        public final View b;
        public final View c;

        c(TextView textview, View view, View view1)
        {
            a = textview;
            b = view;
            c = view1;
        }
    }


    d a;
    private int b;
    private cg c;
    private int d;
    private volatile com.google.android.m4b.maps.ak.c e;
    private a f;
    private final Set g;
    private final Resources h;
    private final com.google.android.m4b.maps.ay.b i;

    public k(Context context, Resources resources)
    {
        this(context, resources, (byte)0);
    }

    private k(Context context, Resources resources, byte byte0)
    {
        super(context, null);
        b = -1;
        d = -1;
        g = new HashSet();
        i = com.google.android.m4b.maps.ay.c.c();
        h = resources;
    }

    static Resources a(k k1)
    {
        return k1.h;
    }

    static void a(k k1, cg cg1, com.google.android.m4b.maps.ak.c c1)
    {
        k1.a(cg1, c1);
    }

    static boolean a(cg cg1, cg cg2)
    {
        return b(cg1, cg2);
    }

    static int b(k k1)
    {
        return k1.b;
    }

    private void b()
    {
        if (b != -1)
        {
            smoothScrollToPosition(b);
        }
    }

    private static boolean b(cg cg1, cg cg2)
    {
        if (cg1 == cg2)
        {
            return true;
        }
        if (cg1 == null || cg2 == null)
        {
            return false;
        } else
        {
            return cg1.a().equals(cg2.a());
        }
    }

    static int c(k k1)
    {
        return k1.d;
    }

    static Set d(k k1)
    {
        return k1.g;
    }

    static void e(k k1)
    {
        k1.b();
    }

    static d f(k k1)
    {
        return k1.a;
    }

    static cg g(k k1)
    {
        return k1.c;
    }

    public final void a()
    {
        post(new Runnable() {

            private k a;

            public final void run()
            {
                if (k.f(a) != null)
                {
                    k k1 = a;
                    d d1 = k.f(a);
                    cg cg1 = d1.c();
                    com.google.android.m4b.maps.ak.c c1 = null;
                    if (cg1 != null)
                    {
                        c1 = d1.a(cg1.a());
                    }
                    if (ab.a("INDOOR", 3))
                    {
                        String s = String.valueOf(cg1);
                        String s1 = String.valueOf(c1);
                        Log.d("INDOOR", (new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(s1).length())).append("onIndoorBuildingFocused: ").append(s).append(", ").append(s1).toString());
                    }
                    k1.a(cg1, c1);
                }
            }

            
            {
                a = k.this;
                super();
            }
        });
    }

    public final void a(int j)
    {
        if (j != b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        b = j;
        f.notifyDataSetChanged();
        if (j == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (b)getItemAtPosition(j);
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ab.a("INDOOR", 3))
        {
            Log.d("INDOOR", (new StringBuilder(44)).append("getItemAtPosition(").append(j).append(") returned null").toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj = ((b) (obj)).a;
        if (a != null)
        {
            if (obj == null)
            {
                a.d(c);
                return;
            } else
            {
                a.a(((com.google.android.m4b.maps.cg.c) (obj)).a());
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(cg cg1)
    {
        post(new Runnable(cg1) {

            private cg a;
            private k b;

            public final void run()
            {
                if (k.f(b) != null)
                {
                    com.google.android.m4b.maps.ak.c c1 = k.f(b).a(a.a());
                    if (ab.a("INDOOR", 3))
                    {
                        String s = String.valueOf(a);
                        String s1 = String.valueOf(c1);
                        Log.d("INDOOR", (new StringBuilder(String.valueOf(s).length() + 26 + String.valueOf(s1).length())).append("onIndoorLevelActivated: ").append(s).append(", ").append(s1).toString());
                    }
                    if (k.a(k.g(b), a))
                    {
                        k.a(b, k.g(b), c1);
                    }
                }
            }

            
            {
                b = k.this;
                a = cg1;
                super();
            }
        });
    }

    final void a(cg cg1, com.google.android.m4b.maps.ak.c c1)
    {
        i.a();
        if (b(cg1, c)) goto _L2; else goto _L1
_L1:
        clearAnimation();
        c = null;
        d = -1;
        b = -1;
        if (cg1 == null) goto _L4; else goto _L3
_L3:
        if (cg1 == null) goto _L6; else goto _L5
_L5:
        int j;
        if (cg1.d())
        {
            j = 1;
        } else
        {
            j = 2;
        }
        if (cg1.b().size() < j) goto _L6; else goto _L7
_L7:
        j = 1;
_L9:
        if (j != 0)
        {
            c = cg1;
            setVisibility(0);
            cg1 = new AlphaAnimation(0.0F, 1.0F);
            cg1.setFillAfter(true);
            cg1.setDuration(500L);
            cg1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                private k a;

                public final void onAnimationEnd(Animation animation)
                {
                    k.e(a);
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                a = k.this;
                super();
            }
            });
            startAnimation(cg1);
            f = new a(getContext(), c);
            setAdapter(f);
            i.a();
            if (c != null)
            {
                cg1 = e;
                if (-1 != d)
                {
                    d = -1;
                    f.notifyDataSetChanged();
                }
            }
        }
_L4:
        if (c == null && getVisibility() == 0)
        {
            setVisibility(8);
            cg1 = new AlphaAnimation(1.0F, 0.0F);
            cg1.setDuration(500L);
            cg1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                private k a;

                public final void onAnimationEnd(Animation animation)
                {
                    a.setVisibility(8);
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                    a.setVisibility(0);
                }

            
            {
                a = k.this;
                super();
            }
            });
            startAnimation(cg1);
        }
_L2:
        if (c == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        j = 0;
        if (true) goto _L9; else goto _L8
_L8:
        cg1 = c;
        if (cg1 != null) goto _L11; else goto _L10
_L10:
        int i1 = -1;
_L13:
        a(i1);
        b();
        return;
_L11:
        if (c1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        int l;
        if (cg1.d())
        {
            l = 0;
        } else
        {
            l = -1;
        }
        i1 = l;
        if (l < 0)
        {
            i1 = -1;
        }
        if (true) goto _L13; else goto _L12
_L12:
        i1 = cg1.b(c1);
        l = i1;
        if (i1 >= 0)
        {
            l = i1;
            if (cg1.d())
            {
                l = i1 + 1;
            }
        }
        break MISSING_BLOCK_LABEL_303;
        if (true) goto _L13; else goto _L14
_L14:
    }

    protected final void onSizeChanged(int j, int l, int i1, int j1)
    {
        super.onSizeChanged(j, l, i1, j1);
        post(new Runnable() {

            private k a;

            public final void run()
            {
                k.e(a);
            }

            
            {
                a = k.this;
                super();
            }
        });
    }
}
