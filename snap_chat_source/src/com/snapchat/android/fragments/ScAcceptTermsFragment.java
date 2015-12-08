// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import Bt;
import Iq;
import LA;
import Mf;
import Oi;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.api2.LogoutTask;
import com.snapchat.android.fragments.settings.WebFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.Random;
import lX;

public class ScAcceptTermsFragment extends SnapchatFragment
{

    private static Random a = new Random();
    private final lX b;
    private final LA c;

    public ScAcceptTermsFragment()
    {
        this(new lX(), LA.a());
    }

    private ScAcceptTermsFragment(lX lx, LA la)
    {
        b = lx;
        c = la;
    }

    static void a(ScAcceptTermsFragment scaccepttermsfragment)
    {
        Object obj2 = (ImageView)scaccepttermsfragment.d(0x7f0d03ed);
        Object obj1 = (ImageView)scaccepttermsfragment.d(0x7f0d03ec);
        Object obj = (ImageView)scaccepttermsfragment.d(0x7f0d03ee);
        float f4 = -(float)(((ImageView) (obj1)).getMeasuredWidth() / 2);
        float f5 = ((ImageView) (obj1)).getY() - ((ImageView) (obj2)).getY();
        float f2 = (float)((ImageView) (obj1)).getBottom() - ((ImageView) (obj2)).getY();
        Object obj3 = (TextView)scaccepttermsfragment.d(0x7f0d03ef);
        float f1 = f2;
        if ((float)(((ImageView) (obj2)).getBottom() - ((ImageView) (obj2)).getPaddingBottom()) + f2 > (float)((TextView) (obj3)).getTop())
        {
            f1 = ((ImageView) (obj2)).getHeight() - ((ImageView) (obj2)).getPaddingBottom();
            f1 = (float)((TextView) (obj3)).getTop() - ((ImageView) (obj2)).getY() - f1;
            float f3 = ((ImageView) (obj2)).getY();
            obj3 = (android.widget.RelativeLayout.LayoutParams)((ImageView) (obj1)).getLayoutParams();
            obj3.height = (int)(f3 + f1);
            ((ImageView) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        }
        obj1 = ObjectAnimator.ofFloat(obj2, "translationY", new float[] {
            0.0F, f5, f1
        });
        obj2 = ObjectAnimator.ofFloat(obj2, "translationX", new float[] {
            0.0F, f4
        });
        obj3 = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
            0.0F, f5, f1
        });
        Object obj4 = ObjectAnimator.ofFloat(obj, "translationX", new float[] {
            0.0F, f4
        });
        ((ObjectAnimator) (obj1)).setDuration(260L);
        ((ObjectAnimator) (obj2)).setDuration(260L);
        ((ObjectAnimator) (obj3)).setDuration(260L);
        ((ObjectAnimator) (obj4)).setDuration(260L);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(300L);
        objectanimator.addListener(new android.animation.Animator.AnimatorListener(((ImageView) (obj))) {

            private ImageView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = imageview;
                super();
            }
        });
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).play(((Animator) (obj2))).after(objectanimator).with(((Animator) (obj1))).with(((Animator) (obj4))).with(((Animator) (obj3)));
        ((AnimatorSet) (obj)).setStartDelay(100L);
        obj2 = (TextView)scaccepttermsfragment.d(0x7f0d03ef);
        obj3 = (TextView)scaccepttermsfragment.d(0x7f0d03f0);
        obj4 = ObjectAnimator.ofFloat(obj2, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator = ObjectAnimator.ofFloat(obj3, "alpha", new float[] {
            0.0F, 1.0F
        });
        obj1 = new AnimatorSet();
        ((AnimatorSet) (obj1)).play(((Animator) (obj4))).with(objectanimator);
        ((AnimatorSet) (obj1)).setDuration(130L);
        ((AnimatorSet) (obj1)).addListener(new android.animation.Animator.AnimatorListener(((TextView) (obj2)), ((TextView) (obj3))) {

            private TextView a;
            private TextView b;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
                b.setVisibility(0);
            }

            
            {
                a = textview;
                b = textview1;
                super();
            }
        });
        obj3 = (ImageView)scaccepttermsfragment.d(0x7f0d03ec);
        obj4 = ObjectAnimator.ofFloat(obj3, "scaleX", new float[] {
            0.0F, 1.0F
        });
        objectanimator = ObjectAnimator.ofFloat(obj3, "scaleY", new float[] {
            0.0F, 1.0F
        });
        obj2 = new AnimatorSet();
        ((AnimatorSet) (obj2)).play(((Animator) (obj4))).with(objectanimator);
        ((AnimatorSet) (obj2)).setDuration(230L);
        ((AnimatorSet) (obj2)).setInterpolator(new BounceInterpolator());
        ((AnimatorSet) (obj2)).addListener(new android.animation.Animator.AnimatorListener(((ImageView) (obj3))) {

            private ImageView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = imageview;
                super();
            }
        });
        obj4 = (ImageView)scaccepttermsfragment.d(0x7f0d03f1);
        objectanimator = ObjectAnimator.ofFloat(obj4, "rotation", new float[] {
            -20F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(obj4, "alpha", new float[] {
            0.0F, 1.0F
        });
        obj3 = new AnimatorSet();
        ((AnimatorSet) (obj3)).play(objectanimator).with(objectanimator1);
        ((AnimatorSet) (obj3)).setDuration(130L);
        ((AnimatorSet) (obj3)).addListener(new android.animation.Animator.AnimatorListener(((ImageView) (obj4))) {

            private ImageView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = imageview;
                super();
            }
        });
        scaccepttermsfragment = scaccepttermsfragment.h();
        obj4 = new AnimatorSet();
        ((AnimatorSet) (obj4)).play(((Animator) (obj)));
        ((AnimatorSet) (obj4)).play(((Animator) (obj1))).with(((Animator) (obj2))).after(((Animator) (obj)));
        ((AnimatorSet) (obj4)).play(((Animator) (obj3))).after(((Animator) (obj2)));
        ((AnimatorSet) (obj4)).play(scaccepttermsfragment).after(((Animator) (obj3)));
        ((AnimatorSet) (obj4)).start();
    }

    static View b(ScAcceptTermsFragment scaccepttermsfragment)
    {
        return scaccepttermsfragment.mFragmentLayout;
    }

    static View c(ScAcceptTermsFragment scaccepttermsfragment)
    {
        return scaccepttermsfragment.mFragmentLayout;
    }

    static View d(ScAcceptTermsFragment scaccepttermsfragment)
    {
        return scaccepttermsfragment.mFragmentLayout;
    }

    static LA e(ScAcceptTermsFragment scaccepttermsfragment)
    {
        return scaccepttermsfragment.c;
    }

    static void f(ScAcceptTermsFragment scaccepttermsfragment)
    {
        scaccepttermsfragment.m();
    }

    static lX g(ScAcceptTermsFragment scaccepttermsfragment)
    {
        return scaccepttermsfragment.b;
    }

    private Animator h()
    {
        ImageView imageview = (ImageView)d(0x7f0d03f2);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(imageview, "alpha", new float[] {
            0.0F, 0.8F
        });
        Object obj = ObjectAnimator.ofFloat(imageview, "alpha", new float[] {
            0.8F, 0.0F
        });
        objectanimator.setDuration(182L);
        ((ObjectAnimator) (obj)).setDuration(182L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(((Animator) (obj))).after(objectanimator);
        animatorset.addListener(new android.animation.Animator.AnimatorListener(imageview) {

            private ImageView a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = imageview;
                super();
            }
        });
        imageview = (ImageView)d(0x7f0d03f3);
        imageview.setPivotY(imageview.getMeasuredHeight());
        imageview.setPivotX(imageview.getMeasuredWidth() / 2);
        objectanimator = ObjectAnimator.ofFloat(imageview, "rotation", new float[] {
            0.0F, -110F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(imageview, "rotation", new float[] {
            -110F, 0.0F
        });
        objectanimator.setDuration(365L);
        objectanimator1.setDuration(365L);
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).play(objectanimator1).after(objectanimator);
        ((AnimatorSet) (obj)).play(animatorset).after(objectanimator);
        int j = a.nextInt(5);
        for (int i = 0; i < j + 4; i++)
        {
            Object obj1 = (RelativeLayout)d(0x7f0d03eb);
            ImageView imageview1 = new ImageView(getActivity());
            Object obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(2, 0x7f0d03f4);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(0, 0x7f0d03f3);
            imageview1.setVisibility(4);
            imageview1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
            imageview1.setImageDrawable(getResources().getDrawable(0x7f020282));
            int k = a.nextInt(5) + 1;
            imageview1.setScaleX((float)k / 10F);
            imageview1.setScaleY((float)k / 10F);
            ((RelativeLayout) (obj1)).addView(imageview1);
            imageview1.setY(75F);
            k = a.nextInt(71);
            obj1 = ObjectAnimator.ofFloat(imageview1, "translationX", new float[] {
                (float)((a.nextInt(160) - 80) * -1)
            });
            obj2 = ObjectAnimator.ofFloat(imageview1, "translationY", new float[] {
                (float)((k + 10) * -1)
            });
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.play(((Animator) (obj1))).with(((Animator) (obj2)));
            animatorset1.addListener(new android.animation.Animator.AnimatorListener(imageview1) {

                private ImageView a;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    a.setVisibility(4);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    a.setVisibility(0);
                }

            
            {
                a = imageview;
                super();
            }
            });
            animatorset1.setDuration(182L);
            ((AnimatorSet) (obj)).play(animatorset1).after(objectanimator);
        }

        ((AnimatorSet) (obj)).addListener(new android.animation.Animator.AnimatorListener(imageview, ((AnimatorSet) (obj))) {

            private ImageView a;
            private AnimatorSet b;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                b.start();
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
            }

            
            {
                a = imageview;
                b = animatorset;
                super();
            }
        });
        return ((Animator) (obj));
    }

    private void m()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setMessage(0x7f080265);
        builder.setCancelable(true);
        builder.setPositiveButton(0x7f080323, new android.content.DialogInterface.OnClickListener() {

            private ScAcceptTermsFragment a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                ScAcceptTermsFragment.g(a);
                (new LogoutTask()).a(com.snapchat.android.api2.LogoutTask.LogoutReason.TERMS_OF_USE, new String[0]).execute();
                dialoginterface = a.getActivity();
                dialoginterface.setResult(1);
                dialoginterface.finish();
            }

            
            {
                a = ScAcceptTermsFragment.this;
                super();
            }
        });
        builder.setNegativeButton(0x7f080196, null);
        builder.show();
    }

    public final boolean f()
    {
        m();
        return true;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400ba, viewgroup, false);
        viewgroup = getString(0x7f0802e0);
        bundle = getString(0x7f0802e3);
        String s = getString(0x7f0802e2, new Object[] {
            bundle, viewgroup, viewgroup, bundle
        });
        int i = s.lastIndexOf(viewgroup);
        layoutinflater = new SpannableString(s);
        layoutinflater.setSpan(new ClickableSpan(viewgroup) {

            private String a;

            public final void onClick(View view)
            {
                view.invalidate();
                Mf.a().a(new Oi(new WebFragment("https://www.snapchat.com/privacy", a)));
            }

            public final void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                a = s;
                super();
            }
        }, i, viewgroup.length() + i, 33);
        i = s.lastIndexOf(bundle);
        layoutinflater.setSpan(new ClickableSpan(bundle) {

            private String a;

            public final void onClick(View view)
            {
                view.invalidate();
                Mf.a().a(new Oi(new WebFragment("https://www.snapchat.com/terms", a)));
            }

            public final void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                a = s;
                super();
            }
        }, i, bundle.length() + i, 33);
        viewgroup = (TextView)d(0x7f0d03ef);
        viewgroup.setText(layoutinflater);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        layoutinflater = (Button)d(0x7f0d03f4);
        getActivity().getAssets();
        Iq.a(layoutinflater);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private ScAcceptTermsFragment a;

            public final void onClick(View view)
            {
                ScAcceptTermsFragment.e(a);
                LA.j();
                Bt.ah();
                a.getActivity().finish();
            }

            
            {
                a = ScAcceptTermsFragment.this;
                super();
            }
        });
        viewgroup = getString(0x7f0802dd);
        layoutinflater = new SpannableString(viewgroup);
        layoutinflater.setSpan(new ClickableSpan() {

            private ScAcceptTermsFragment a;

            public final void onClick(View view)
            {
                view.invalidate();
                ScAcceptTermsFragment.f(a);
            }

            public final void updateDrawState(TextPaint textpaint)
            {
                super.updateDrawState(textpaint);
                textpaint.setUnderlineText(false);
            }

            
            {
                a = ScAcceptTermsFragment.this;
                super();
            }
        }, 0, viewgroup.length(), 33);
        viewgroup = (TextView)d(0x7f0d03f0);
        viewgroup.setText(layoutinflater);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        mFragmentLayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private ScAcceptTermsFragment a;

            public final void onGlobalLayout()
            {
label0:
                {
                    ScAcceptTermsFragment.a(a);
                    if (ScAcceptTermsFragment.b(a).getViewTreeObserver().isAlive())
                    {
                        if (android.os.Build.VERSION.SDK_INT < 16)
                        {
                            break label0;
                        }
                        ScAcceptTermsFragment.c(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    return;
                }
                ScAcceptTermsFragment.d(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                a = ScAcceptTermsFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

}
