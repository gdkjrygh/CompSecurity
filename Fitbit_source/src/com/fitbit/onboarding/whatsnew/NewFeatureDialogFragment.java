// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.whatsnew;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.ui.d;
import com.fitbit.util.b.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.onboarding.whatsnew:
//            PanelContent, a

public class NewFeatureDialogFragment extends DialogFragment
{

    private static final String a = "panel_contents";
    private static final String b = java/lang/Class.getSimpleName();
    private ArrayList c;
    private com.fitbit.onboarding.whatsnew.a d;
    private ViewPager e;

    public NewFeatureDialogFragment()
    {
    }

    public static NewFeatureDialogFragment a(ArrayList arraylist)
    {
        NewFeatureDialogFragment newfeaturedialogfragment = new NewFeatureDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("panel_contents", arraylist);
        newfeaturedialogfragment.setArguments(bundle);
        return newfeaturedialogfragment;
    }

    static ArrayList a(NewFeatureDialogFragment newfeaturedialogfragment)
    {
        return newfeaturedialogfragment.c;
    }

    private void a(View view)
    {
        view = (LinearLayout)view.findViewById(0x7f1102dd);
        d d1 = new d(getResources().getColor(0x7f0f0090), getResources().getColor(0x7f0f0168));
        View view1 = view.getChildAt(0);
        d1.a().add(view1);
        int i = 1;
        while (i < c.size()) 
        {
            View view2 = new View(getActivity());
            view2.setLayoutParams(view1.getLayoutParams());
            Drawable drawable = getResources().getDrawable(0x7f0203b6);
            if (com.fitbit.util.b.a.a(16))
            {
                view2.setBackground(drawable);
            } else
            {
                view2.setBackgroundDrawable(drawable);
            }
            view.addView(view2);
            d1.a().add(view2);
            i++;
        }
        e.setOnPageChangeListener(new _cls3(d1, view));
        if (c.size() == 1)
        {
            view.setVisibility(8);
        }
    }

    private void a(View view, Context context, int i)
    {
        PanelContent panelcontent = (PanelContent)c.get(i);
        TextView textview = (TextView)view.findViewById(0x7f1102dc);
        view = (ImageButton)view.findViewById(0x7f1102db);
        context = context.obtainStyledAttributes(panelcontent.a(), com.fitbit.FitbitMobile.R.styleable.whatsNewTitle);
        i = textview.getTextColors().getDefaultColor();
        int j = getResources().getColor(context.getResourceId(0, 0x7f0f0172));
        if (i != j)
        {
            ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            valueanimator.addUpdateListener(new _cls2(textview));
            if (view.getDrawable() != null)
            {
                TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                    view.getDrawable(), getResources().getDrawable(context.getResourceId(1, 0x7f02025f))
                });
                transitiondrawable.setCrossFadeEnabled(true);
                view.setImageDrawable(transitiondrawable);
                transitiondrawable.startTransition(300);
            } else
            {
                view.setImageDrawable(getResources().getDrawable(context.getResourceId(1, 0x7f02025f)));
            }
            valueanimator.start();
        }
        context.recycle();
    }

    static void a(NewFeatureDialogFragment newfeaturedialogfragment, View view, Context context, int i)
    {
        newfeaturedialogfragment.a(view, context, i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            c = getArguments().getParcelableArrayList("panel_contents");
        }
        setStyle(0, ((PanelContent)c.get(0)).a());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = new ContextThemeWrapper(getActivity(), ((PanelContent)c.get(0)).a());
        layoutinflater = layoutinflater.cloneInContext(bundle).inflate(0x7f0400b9, viewgroup, false);
        d = new com.fitbit.onboarding.whatsnew.a(getChildFragmentManager());
        if (c != null)
        {
            d.a(c);
        }
        e = (ViewPager)layoutinflater.findViewById(0x7f1102da);
        e.setAdapter(d);
        ((ImageButton)layoutinflater.findViewById(0x7f1102db)).setOnClickListener(new _cls1());
        a(layoutinflater);
        a(layoutinflater, bundle, 0);
        return layoutinflater;
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
