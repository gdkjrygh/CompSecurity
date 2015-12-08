// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.translate.anim.AnimationScheme;
import com.google.android.apps.translate.anim.c;
import com.google.android.apps.translate.anim.e;
import com.google.android.apps.translate.anim.f;
import com.google.android.apps.translate.cards.DictionaryCard;
import com.google.android.apps.translate.cards.SuggestCard;
import com.google.android.apps.translate.cards.TranslateErrorCard;
import com.google.android.apps.translate.cards.TranslatedTextCard;
import com.google.android.apps.translate.cards.b;
import com.google.android.apps.translate.widget.AutoLinearLayout;
import com.google.android.apps.translate.widget.FloatingInputCard;
import com.google.android.apps.translate.widget.InputTextView;
import com.google.android.apps.translate.widget.aq;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate:
//            o, m, v, g, 
//            k

public class ResultScrollView extends ScrollView
    implements aq
{

    private final LinearLayout a;
    private final AutoLinearLayout b;
    private final FrameLayout c;
    private final View d;

    public ResultScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(o.widget_result_view, this, true);
        c = (FrameLayout)findViewById(m.floating_input_holder);
        a = (LinearLayout)findViewById(m.resultContainer);
        b = (AutoLinearLayout)findViewById(m.firstTwoContainer);
        d = findViewById(m.progress_container);
    }

    private static android.view.ViewGroup.LayoutParams b()
    {
        return new android.view.ViewGroup.LayoutParams(-1, -2);
    }

    public final void a()
    {
        b.removeAllViews();
        b.addView(d);
        a.removeAllViews();
        a.addView(c);
        a.addView(b);
    }

    public final void a(m m1, b b1, Bundle bundle, int i)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        if (m1 != null)
        {
            bundle = SuggestCard.a(getContext(), b1);
            if (bundle != null)
            {
                arraylist.add(bundle);
            }
            arraylist.add(new TranslatedTextCard(getContext(), b1));
            if (!TextUtils.isEmpty(m1.a(2)))
            {
                arraylist.add(new DictionaryCard(getContext(), b1, 0, new v()));
            }
        } else
        {
            arraylist.add(new TranslateErrorCard(getContext(), b1, bundle, i));
        }
        m1 = (View)arraylist.get(0);
        if (m1 instanceof SuggestCard)
        {
            arraylist.remove(0);
            m1.setLayoutParams(b());
            a.addView(m1, 1);
        }
        m1 = arraylist.iterator();
        i = ((flag) ? 1 : 0);
        while (m1.hasNext()) 
        {
            b1 = (View)m1.next();
            if (i < 2)
            {
                b1.setLayoutParams(b());
                b.addView(b1);
            } else
            {
                a.addView(b1);
            }
            bundle = AnimationUtils.loadAnimation(getContext(), g.fade_in);
            i++;
            bundle.setStartOffset((long)i * 100L);
            b1.startAnimation(bundle);
        }
    }

    public final void a(boolean flag)
    {
        View view = d;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (flag)
        {
            requestChildFocus(d, d);
        }
    }

    protected void onMeasure(int i, int j)
    {
        b.setMinimumHeight(0);
        super.onMeasure(i, j);
        j = getMeasuredHeight();
        int l = j - c.getMeasuredHeight();
        if (l > 0 && a.getMeasuredHeight() <= j)
        {
            b.setMinimumHeight(l);
            a.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
        }
    }

    public void setFloatingInputCard(FloatingInputCard floatinginputcard, boolean flag, String s)
    {
        if (floatinginputcard == null)
        {
            c.removeAllViews();
            return;
        }
        FrameLayout framelayout = c;
        floatinginputcard.requestLayout();
        if (!floatinginputcard.g)
        {
            floatinginputcard.g = true;
            floatinginputcard.e.measure(0, 0);
            floatinginputcard.d.setMinHeight(floatinginputcard.b - floatinginputcard.e.getMeasuredHeight() - floatinginputcard.getResources().getDimensionPixelSize(k.default_touch_target));
        }
        floatinginputcard.d.setText(s);
        floatinginputcard.a();
        if (floatinginputcard.f)
        {
            floatinginputcard.f = false;
            floatinginputcard.setCursorBlink();
            floatinginputcard.a(framelayout);
            floatinginputcard.c.clearAnimation();
            floatinginputcard.c.setVisibility(0);
            floatinginputcard.c.getLayoutParams().height = -2;
            if (flag)
            {
                floatinginputcard.c.measure(0, 0);
                int i = floatinginputcard.c.getMeasuredHeight();
                floatinginputcard.c.getLayoutParams().height = 0;
                s = new e(new f[] {
                    (new c(floatinginputcard)).a("topMargin", 0), (new c(floatinginputcard.c)).a("height", i)
                });
                s.setAnimationListener(new com.google.android.apps.translate.widget.f(floatinginputcard));
                s.a(floatinginputcard.getContext(), 0x10e0000);
                ((TextView)floatinginputcard.findViewById(m.touch_to_type_text)).setVisibility(4);
                floatinginputcard.startAnimation(s);
                framelayout.setMinimumHeight(floatinginputcard.getMeasuredHeight());
                AnimationScheme.FADE.hideView(floatinginputcard.a);
            } else
            {
                floatinginputcard.a.setVisibility(8);
                ((android.view.ViewGroup.MarginLayoutParams)floatinginputcard.getLayoutParams()).topMargin = 0;
            }
        }
        Singleton.b().c("result");
    }
}
