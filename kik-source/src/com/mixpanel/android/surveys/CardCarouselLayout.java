// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mixpanel.android.surveys:
//            a, b, c

public class CardCarouselLayout extends ViewGroup
{
    private static final class a
        implements ListAdapter
    {

        private final List a;
        private final LayoutInflater b;

        public final String a(int i)
        {
            return (String)a.get(i);
        }

        public final boolean areAllItemsEnabled()
        {
            return true;
        }

        public final int getCount()
        {
            return a.size();
        }

        public final Object getItem(int i)
        {
            return a(i);
        }

        public final long getItemId(int i)
        {
            return (long)i;
        }

        public final int getItemViewType(int i)
        {
            if (i == 0)
            {
                return 0;
            }
            return i != a.size() - 1 ? 2 : 1;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1;
            int j;
            j = -1;
            view1 = view;
            if (view != null) goto _L2; else goto _L1
_L1:
            getItemViewType(i);
            JVM INSTR tableswitch 0 2: default 40
        //                       0 83
        //                       1 91
        //                       2 99;
               goto _L3 _L4 _L5 _L6
_L3:
            view1 = b.inflate(j, viewgroup, false);
_L2:
            ((TextView)view1.findViewById(com.mixpanel.android.a.c.e)).setText((String)a.get(i));
            return view1;
_L4:
            j = com.mixpanel.android.a.d.d;
            continue; /* Loop/switch isn't completed */
_L5:
            j = com.mixpanel.android.a.d.e;
            continue; /* Loop/switch isn't completed */
_L6:
            j = com.mixpanel.android.a.d.f;
            if (true) goto _L3; else goto _L7
_L7:
        }

        public final int getViewTypeCount()
        {
            return 3;
        }

        public final boolean hasStableIds()
        {
            return true;
        }

        public final boolean isEmpty()
        {
            return a.isEmpty();
        }

        public final boolean isEnabled(int i)
        {
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver datasetobserver)
        {
        }

        public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
        {
        }

        public a(List list, LayoutInflater layoutinflater)
        {
            a = list;
            b = layoutinflater;
        }
    }

    public static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        public static int[] a()
        {
            return (int[])c.clone();
        }

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }

    public static interface c
    {

        public abstract void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s);
    }

    private final class d
    {

        final CardCarouselLayout a;
        private com.mixpanel.android.mpmetrics.Survey.a b;
        private final View c;
        private final TextView d;
        private final TextView e;
        private final ListView f;

        static com.mixpanel.android.mpmetrics.Survey.a a(d d1)
        {
            return d1.b;
        }

        public final View a()
        {
            return c;
        }

        public final void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
        {
            InputMethodManager inputmethodmanager;
            com.mixpanel.android.mpmetrics.Survey.b b1;
            b = a1;
            d.setText(b.b());
            inputmethodmanager = (InputMethodManager)c.getContext().getSystemService("input_method");
            b1 = a1.d();
            if (com.mixpanel.android.mpmetrics.Survey.b.c != b1) goto _L2; else goto _L1
_L1:
            f.setVisibility(8);
            e.setVisibility(0);
            if (s != null)
            {
                e.setText(s);
            }
            if (a.getResources().getConfiguration().orientation == 1)
            {
                e.requestFocus();
                inputmethodmanager.showSoftInput(e, 0);
            } else
            {
                inputmethodmanager.hideSoftInputFromWindow(c.getWindowToken(), 0);
            }
_L4:
            c.invalidate();
            return;
_L2:
            if (com.mixpanel.android.mpmetrics.Survey.b.b != b1)
            {
                break; /* Loop/switch isn't completed */
            }
            inputmethodmanager.hideSoftInputFromWindow(c.getWindowToken(), 0);
            f.setVisibility(0);
            e.setVisibility(8);
            a1 = new a(a1.c(), LayoutInflater.from(a.getContext()));
            f.setAdapter(a1);
            f.clearChoices();
            if (s != null)
            {
                int i = 0;
                while (i < a1.getCount()) 
                {
                    if (a1.a(i).equals(s))
                    {
                        f.setItemChecked(i, true);
                    }
                    i++;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            throw new e((new StringBuilder("No way to display question type ")).append(b1).toString(), (byte)0);
        }

        public d(View view)
        {
            a = CardCarouselLayout.this;
            super();
            c = view;
            d = (TextView)view.findViewWithTag("com_mixpanel_android_TAG_prompt_text");
            e = (EditText)view.findViewWithTag("com_mixpanel_android_TAG_text_answer");
            f = (ListView)view.findViewWithTag("com_mixpanel_android_TAG_choice_list");
            e.setText("");
            e.setOnEditorActionListener(new com.mixpanel.android.surveys.b(this, CardCarouselLayout.this));
            f.setOnItemClickListener(new com.mixpanel.android.surveys.c(this, CardCarouselLayout.this));
        }
    }

    public static final class e extends Exception
    {

        private e(String s)
        {
            super(s);
        }

        e(String s, byte byte0)
        {
            this(s);
        }
    }


    private static int a = 45;
    private static float b = 0.8F;
    private static float c = 0.5F;
    private static float d = 0.5F;
    private final List e;
    private d f;
    private d g;
    private c h;

    public CardCarouselLayout(Context context)
    {
        super(context);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    public CardCarouselLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new ArrayList(1);
        h = null;
        a(context);
    }

    static c a(CardCarouselLayout cardcarousellayout)
    {
        return cardcarousellayout.h;
    }

    private void a(Context context)
    {
        Object obj = LayoutInflater.from(context);
        context = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.a.d.g, this, false);
        f = new d(context);
        obj = ((LayoutInflater) (obj)).inflate(com.mixpanel.android.a.d.g, this, false);
        g = new d(((View) (obj)));
        addView(context);
        addView(((View) (obj)));
    }

    public final void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s)
    {
        f.a(a1, s);
        removeAllViews();
        addView(f.a());
        addView(g.a());
        invalidate();
    }

    public final void a(com.mixpanel.android.mpmetrics.Survey.a a1, String s, int i)
    {
        Object obj;
        View view;
        obj = g;
        g = f;
        f = ((d) (obj));
        f.a(a1, s);
        obj = g.a();
        view = f.a();
        ((View) (obj)).setVisibility(0);
        view.setVisibility(0);
        s = null;
        a1 = null;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.a().length];
                try
                {
                    a[b.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.b - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[i - 1];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 123
    //                   2 376;
           goto _L1 _L2 _L3
_L1:
        s.setAnimationListener(new com.mixpanel.android.surveys.a(this, ((View) (obj))));
        ((View) (obj)).startAnimation(s);
        view.startAnimation(a1);
        invalidate();
        return;
_L2:
        s = new AnimationSet(false);
        a1 = new RotateAnimation(0.0F, -a, 1, c, 1, d);
        a1.setDuration(330L);
        a1.setStartOffset(132L);
        s.addAnimation(a1);
        a1 = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
        a1.setDuration(330L);
        a1.setStartOffset(132L);
        s.addAnimation(a1);
        a1 = new TranslateAnimation(2, -1F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
        a1.setInterpolator(new AccelerateInterpolator());
        a1.setDuration(330L);
        s.addAnimation(a1);
        a1 = new AnimationSet(false);
        Object obj1 = new RotateAnimation(a, 0.0F, 1, c, 1, d);
        ((RotateAnimation) (obj1)).setDuration(198L);
        a1.addAnimation(((Animation) (obj1)));
        obj1 = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
        ((ScaleAnimation) (obj1)).setDuration(198L);
        a1.addAnimation(((Animation) (obj1)));
        obj1 = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj1)).setDuration(330L);
        a1.addAnimation(((Animation) (obj1)));
        continue; /* Loop/switch isn't completed */
_L3:
        s = new AnimationSet(false);
        a1 = new RotateAnimation(0.0F, a, 1, c, 1, d);
        a1.setDuration(198L);
        a1.setStartOffset(132L);
        s.addAnimation(a1);
        a1 = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
        a1.setDuration(198L);
        a1.setStartOffset(132L);
        s.addAnimation(a1);
        a1 = new TranslateAnimation(2, -1F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
        a1.setInterpolator(new AccelerateInterpolator());
        a1.setDuration(330L);
        s.addAnimation(a1);
        a1 = new AnimationSet(false);
        Object obj2 = new RotateAnimation(-a, 0.0F, 1, c, 1, d);
        ((RotateAnimation) (obj2)).setDuration(198L);
        a1.addAnimation(((Animation) (obj2)));
        obj2 = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
        ((ScaleAnimation) (obj2)).setDuration(198L);
        a1.addAnimation(((Animation) (obj2)));
        obj2 = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
        ((TranslateAnimation) (obj2)).setDuration(330L);
        a1.addAnimation(((Animation) (obj2)));
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(c c1)
    {
        h = c1;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = f.a();
        if (view.getVisibility() != 8)
        {
            i = view.getMeasuredWidth();
            view.layout(0, 0, i, view.getMeasuredHeight());
        } else
        {
            i = 0;
        }
        view = g.a();
        if (view.getVisibility() != 8)
        {
            view.layout(i, 0, view.getMeasuredWidth() + i, view.getMeasuredHeight());
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k2 = getChildCount();
        int k;
        int i1;
        int k1;
        int j2;
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000 || android.view.View.MeasureSpec.getMode(j) != 0x40000000)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        e.clear();
        i1 = 0;
        j2 = 0;
        int i2;
        for (k1 = 0; i1 < k2; k1 = i2)
        {
            int l1;
label0:
            {
                View view = getChildAt(i1);
                l1 = j2;
                i2 = k1;
                if (view.getVisibility() == 8)
                {
                    break label0;
                }
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                view.measure(getChildMeasureSpec(i, 0, layoutparams.width), getChildMeasureSpec(j, 0, layoutparams.height));
                j2 = Math.max(j2, view.getMeasuredWidth());
                k1 = Math.max(k1, view.getMeasuredHeight());
                l1 = j2;
                i2 = k1;
                if (!k)
                {
                    break label0;
                }
                if (layoutparams.width != -1)
                {
                    l1 = j2;
                    i2 = k1;
                    if (layoutparams.height != -1)
                    {
                        break label0;
                    }
                }
                e.add(view);
                i2 = k1;
                l1 = j2;
            }
            i1++;
            j2 = l1;
        }

        k = Math.max(k1, getSuggestedMinimumHeight());
        setMeasuredDimension(resolveSize(Math.max(j2, getSuggestedMinimumWidth()), i), resolveSize(k, j));
        Iterator iterator = e.iterator();
        while (iterator.hasNext()) 
        {
            View view1 = (View)iterator.next();
            android.view.ViewGroup.LayoutParams layoutparams1 = view1.getLayoutParams();
            int l;
            int j1;
            if (layoutparams1.width == -1)
            {
                l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
            } else
            {
                l = getChildMeasureSpec(i, 0, layoutparams1.width);
            }
            if (layoutparams1.height == -1)
            {
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
            } else
            {
                j1 = getChildMeasureSpec(j, 0, layoutparams1.height);
            }
            view1.measure(l, j1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

}
