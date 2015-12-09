// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;

public final class ggp
{

    public static View a(View view, Integer integer, Integer integer1)
    {
        ctz.a(view);
        view = view.findViewById(0x7f110355);
        ctz.a(view);
        ImageView imageview = (ImageView)view.findViewById(0x7f11026d);
        Assertion.a(imageview);
        if (integer == null)
        {
            imageview.setVisibility(8);
        } else
        {
            imageview.setImageResource(integer.intValue());
        }
        ctz.a(view);
        integer = (TextView)view.findViewById(0x7f110382);
        Assertion.a(integer);
        integer.setVisibility(8);
        integer = (TextView)view.findViewById(0x7f1102f9);
        Assertion.a(integer);
        if (integer1 == null)
        {
            integer.setVisibility(8);
            return view;
        } else
        {
            integer.setText(integer1.intValue());
            return view;
        }
    }

    public static void a(RecyclerView recyclerview, aay aay)
    {
        if (!cty.a(recyclerview.o(), aay))
        {
            recyclerview.a(aay);
            recyclerview.p();
        }
    }

    public static void a(View view, int i)
    {
        int j = view.getPaddingBottom();
        int k = view.getPaddingTop();
        int l = view.getPaddingRight();
        int i1 = view.getPaddingLeft();
        view.setBackgroundResource(i);
        view.setPadding(i1, k, l, j);
    }

    public static void a(AdapterView adapterview, int i)
    {
        adapterview.setSelection(i);
        ListAdapter listadapter = (ListAdapter)adapterview.getAdapter();
        View view = listadapter.getView(i, null, adapterview);
        if (!adapterview.performItemClick(view, i, listadapter.getItemId(i)))
        {
            view.performClick();
        }
    }

    public static boolean a(View view)
    {
        return ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void b(View view)
    {
        android.view.ViewParent viewparent;
label0:
        {
            viewparent = view.getParent();
            if (viewparent != null)
            {
                if (!(viewparent instanceof ViewGroup))
                {
                    break label0;
                }
                ((ViewGroup)viewparent).removeView(view);
            }
            return;
        }
        Assertion.a((new StringBuilder("Parent is not a ViewGroup: ")).append(viewparent).toString());
    }

    public static void c(View view)
    {
        if (view.getVisibility() != 0)
        {
            view.setAlpha(0.0F);
            view.setVisibility(0);
            view.animate().alpha(1.0F).start();
        }
    }

    // Unreferenced inner class ggp$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private View a;

        public final void run()
        {
            View view = a;
            ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }

            public 
            {
                a = view;
                super();
            }
    }


    // Unreferenced inner class ggp$2

/* anonymous class */
    public final class _cls2
        implements android.animation.Animator.AnimatorListener
    {

        private View a;
        private View b;

        public final void onAnimationCancel(Animator animator)
        {
        }

        public final void onAnimationEnd(Animator animator)
        {
            a.setAlpha(1.0F);
            a.setVisibility(4);
            b.setVisibility(0);
            b.setAlpha(0.0F);
            b.animate().alpha(1.0F).start();
        }

        public final void onAnimationRepeat(Animator animator)
        {
        }

        public final void onAnimationStart(Animator animator)
        {
        }

            public 
            {
                a = view;
                b = view1;
                super();
            }
    }

}
