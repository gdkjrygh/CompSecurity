// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.personalization.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import p.bz.n;
import p.cw.c;
import p.dd.au;

// Referenced classes of package com.pandora.android.personalization.view:
//            c, a

public class PersonalizationThumbView extends LinearLayout
    implements android.view.View.OnClickListener
{
    private class a
    {

        final PersonalizationThumbView a;

        public void onStationPersonalizationChange(au au1)
        {
            if (!au1.a.c().equals(PersonalizationThumbView.h(a).c())) goto _L2; else goto _L1
_L1:
            PersonalizationThumbView.a(a, au1.a);
            a.setTotalThumbsDown(PersonalizationThumbView.h(a).G());
            a.setTotalThumbsUp(PersonalizationThumbView.h(a).H());
            static class _cls3
            {

                static final int a[];

                static 
                {
                    a = new int[p.dd.au.a.values().length];
                    try
                    {
                        a[p.dd.au.a.e.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.dd.au.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.dd.au.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls3.a[au1.b.ordinal()];
            JVM INSTR tableswitch 1 3: default 108
        //                       1 109
        //                       2 109
        //                       3 109;
               goto _L2 _L3 _L3 _L3
_L2:
            return;
_L3:
            if (!s.u())
            {
                PersonalizationThumbView.i(a).start();
                return;
            }
            if (true) goto _L2; else goto _L4
_L4:
        }

        private a()
        {
            a = PersonalizationThumbView.this;
            super();
        }

    }


    private View a;
    private TextView b;
    private View c;
    private TextView d;
    private ImageView e;
    private com.pandora.android.personalization.view.c f;
    private View g;
    private Rect h;
    private y i;
    private a j;
    private boolean k;

    public PersonalizationThumbView(Context context)
    {
        this(context, null);
    }

    public PersonalizationThumbView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c();
    }

    static View a(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.g;
    }

    static y a(PersonalizationThumbView personalizationthumbview, y y)
    {
        personalizationthumbview.i = y;
        return y;
    }

    static boolean a(PersonalizationThumbView personalizationthumbview, boolean flag)
    {
        personalizationthumbview.k = flag;
        return flag;
    }

    static TextView b(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.b;
    }

    static TextView c(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.d;
    }

    private void c()
    {
        View view = LayoutInflater.from(getContext()).inflate(0x7f040082, this);
        j = new a();
        f = com.pandora.android.personalization.view.c.a(getContext(), 0x7f0d00af);
        e = (ImageView)view.findViewById(0x7f100212);
        e.setImageDrawable(f.b());
        e.setOnClickListener(this);
        b = (TextView)view.findViewById(0x7f100215);
        a = view.findViewById(0x7f100213);
        a.setOnClickListener(this);
        d = (TextView)view.findViewById(0x7f100217);
        c = view.findViewById(0x7f100216);
        c.setOnClickListener(this);
    }

    static ImageView d(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.e;
    }

    private void d()
    {
        View view = g.findViewById(0x7f100200);
        if (h != null && !k)
        {
            k = true;
            post(new Runnable(view) {

                final View a;
                final PersonalizationThumbView b;

                public void run()
                {
                    PersonalizationThumbView.a(b).setVisibility(0);
                    com.pandora.android.personalization.view.PersonalizationThumbView.b(b).setVisibility(8);
                    com.pandora.android.personalization.view.PersonalizationThumbView.c(b).setVisibility(8);
                    Object obj = new Rect();
                    PersonalizationThumbView.d(b).getGlobalVisibleRect(((Rect) (obj)));
                    int l = ((android.widget.RelativeLayout.LayoutParams)PersonalizationThumbView.d(b).getLayoutParams()).leftMargin;
                    AnimatorSet animatorset = new AnimatorSet();
                    ObjectAnimator objectanimator = com.pandora.android.personalization.view.a.c(a, PersonalizationThumbView.e(b).top - a.getTop(), ((Rect) (obj)).top - a.getTop());
                    ObjectAnimator objectanimator1 = com.pandora.android.personalization.view.a.b(a, PersonalizationThumbView.e(b).left - a.getLeft(), ((Rect) (obj)).left - a.getLeft());
                    objectanimator1.addListener(new AnimatorListenerAdapter(this, ((Rect) (obj)), l) {

                        final Rect a;
                        final int b;
                        final _cls1 c;

                        public void onAnimationEnd(Animator animator)
                        {
                            super.onAnimationEnd(animator);
                            c.b.setVisibility(0);
                            ((ViewGroup)c.b.getRootView()).removeView(PersonalizationThumbView.a(c.b));
                            int l = PersonalizationThumbView.f(c.b).getMeasuredHeight();
                            animator = PersonalizationThumbView.f(c.b).getLayoutParams();
                            animator.width = l;
                            PersonalizationThumbView.f(c.b).setLayoutParams(animator);
                            animator = PersonalizationThumbView.g(c.b).getLayoutParams();
                            animator.width = l;
                            PersonalizationThumbView.g(c.b).setLayoutParams(animator);
                            PersonalizationThumbView.g(c.b).measure(0, 0);
                            PersonalizationThumbView.f(c.b).measure(0, 0);
                            PersonalizationThumbView.f(c.b).setTranslationX((a.centerX() - PersonalizationThumbView.f(c.b).getRight()) + b);
                            PersonalizationThumbView.f(c.b).setVisibility(0);
                            PersonalizationThumbView.g(c.b).setTranslationX(-((PersonalizationThumbView.g(c.b).getLeft() - a.centerX()) + b));
                            PersonalizationThumbView.g(c.b).setVisibility(0);
                            PersonalizationThumbView.a(c.b, false);
                        }

            
            {
                c = _pcls1;
                a = rect;
                b = l;
                super();
            }
                    });
                    animatorset.setDuration(350L);
                    animatorset.playTogether(new Animator[] {
                        objectanimator1, objectanimator
                    });
                    animatorset.setInterpolator(new DecelerateInterpolator(2.0F));
                    obj = com.pandora.android.personalization.view.a.a(b, PersonalizationThumbView.d(b), ((Rect) (obj)));
                    ((AnimatorSet) (obj)).setStartDelay(550L);
                    ((AnimatorSet) (obj)).start();
                    ((AnimatorSet) (obj)).setDuration(350L);
                    animatorset.start();
                    ((AnimatorSet) (obj)).setDuration(350L);
                }

            
            {
                b = PersonalizationThumbView.this;
                a = view;
                super();
            }
            });
        }
    }

    static Rect e(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.h;
    }

    static View f(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.a;
    }

    static View g(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.c;
    }

    static y h(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.i;
    }

    static com.pandora.android.personalization.view.c i(PersonalizationThumbView personalizationthumbview)
    {
        return personalizationthumbview.f;
    }

    public void a()
    {
        if (h != null && !k)
        {
            k = true;
            ((ViewGroup)getRootView()).addView(g);
            post(new Runnable(g.findViewById(0x7f100200)) {

                final View a;
                final PersonalizationThumbView b;

                public void run()
                {
                    Object obj = new Rect();
                    PersonalizationThumbView.d(b).getGlobalVisibleRect(((Rect) (obj)));
                    AnimatorSet animatorset = new AnimatorSet();
                    ObjectAnimator objectanimator = com.pandora.android.personalization.view.a.c(a, ((Rect) (obj)).top - a.getTop(), PersonalizationThumbView.e(b).top - a.getTop());
                    ObjectAnimator objectanimator1 = com.pandora.android.personalization.view.a.b(a, ((Rect) (obj)).left - a.getLeft(), PersonalizationThumbView.e(b).left - a.getLeft());
                    ObjectAnimator objectanimator2 = com.pandora.android.personalization.view.a.a(a, 1.0F, 0.0F);
                    animatorset.setDuration(350L);
                    animatorset.setStartDelay(350L);
                    animatorset.playTogether(new Animator[] {
                        objectanimator1, objectanimator, objectanimator2
                    });
                    obj = com.pandora.android.personalization.view.a.b(b, PersonalizationThumbView.d(b), ((Rect) (obj)));
                    ((AnimatorSet) (obj)).setDuration(175L);
                    ((AnimatorSet) (obj)).addListener(new AnimatorListenerAdapter(this) {

                        final _cls2 a;

                        public void onAnimationEnd(Animator animator)
                        {
                            super.onAnimationEnd(animator);
                            a.b.setVisibility(4);
                            PersonalizationThumbView.a(a.b).setVisibility(0);
                            PersonalizationThumbView.f(a.b).setTranslationX(0.0F);
                            PersonalizationThumbView.f(a.b).setVisibility(8);
                            PersonalizationThumbView.g(a.b).setTranslationX(0.0F);
                            PersonalizationThumbView.g(a.b).setVisibility(8);
                        }

            
            {
                a = _pcls2;
                super();
            }
                    });
                    ((AnimatorSet) (obj)).start();
                    animatorset.start();
                }

            
            {
                b = PersonalizationThumbView.this;
                a = view;
                super();
            }
            });
        }
    }

    public boolean b()
    {
        return k;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            b.a.b().b(j);
        }
        if (h != null)
        {
            setVisibility(4);
            g = LayoutInflater.from(getContext()).inflate(0x7f04007c, null);
            if (g != null)
            {
                g.setVisibility(0);
                ImageView imageview = (ImageView)g.findViewById(0x7f100200);
                imageview.setImageDrawable(com.pandora.android.personalization.view.c.a(getContext(), 0x7f0d00af).b());
                imageview.getDrawable().setAlpha(255);
                if (g != null)
                {
                    ((ViewGroup)getRootView()).addView(g);
                    d();
                }
            }
        }
    }

    public void onClick(View view)
    {
        int l;
        l = view.getId();
        view = null;
        if (l != 0x7f100212) goto _L2; else goto _L1
_L1:
        view = p.bz.n.a.c;
_L4:
        if (view != null)
        {
            b.a.e().a(new n(view, true));
        }
        return;
_L2:
        if (l == 0x7f100213)
        {
            view = p.bz.n.a.a;
        } else
        if (l == 0x7f100216)
        {
            view = p.bz.n.a.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b.a.b().c(j);
    }

    public void setActionViewRect(Rect rect)
    {
        h = rect;
    }

    public void setStationData(y y)
    {
        i = y;
    }

    public void setTotalThumbsDown(int l)
    {
        b.setText(s.c(l));
    }

    public void setTotalThumbsUp(int l)
    {
        d.setText(s.c(l));
    }
}
