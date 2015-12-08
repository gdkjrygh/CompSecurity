// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e;
import com.squareup.picasso.s;
import com.tinder.e.r;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.model.Person;
import com.tinder.model.SparksEvent;
import com.tinder.utils.ac;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import com.tinder.views.BadgeView;
import com.tinder.views.RoundImageView;
import java.util.List;
import java.util.Locale;

public final class ae extends Dialog
{
    private final class a
        implements e
    {

        final ae a;
        private int b;
        private ImageView c;

        public final void a()
        {
            ae.g(a);
            if (ae.h(a) == 2)
            {
                ae.b(a).k();
            }
        }

        public final void b()
        {
            ae.g(a);
            Picasso.a(ae.d(a)).a(0x7f02004f).b(b, b).b().a(c, null);
            if (ae.h(a) == 2)
            {
                v.b("Failed to load match avatar images for match screen!");
                ae.b(a).k();
            }
        }

        public a(int i1, ImageView imageview)
        {
            a = ae.this;
            super();
            b = i1;
            c = imageview;
        }
    }


    i a;
    z b;
    com.tinder.managers.ae c;
    private final Match d;
    private final String e;
    private final r f;
    private final Context g;
    private RelativeLayout h;
    private RelativeLayout i;
    private TextView j;
    private View k;
    private View l;
    private ProgressBar m;
    private View n;
    private int o;

    public ae(Activity activity, r r, String s1, Match match)
    {
        super(activity, 0x1030010);
        o = 0;
        g = activity;
        e = s1;
        d = match;
        f = r;
        ManagerApp.h().a(this);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0x7f0b01da);
        getWindow().setLayout(-1, -1);
        setContentView(0x7f0300a5);
        TextView textview = (TextView)findViewById(0x7f0e02fe);
        r = (TextView)findViewById(0x7f0e02ff);
        j = (TextView)findViewById(0x7f0e030a);
        s1 = (ImageView)findViewById(0x7f0e02fd);
        match = (RoundImageView)findViewById(0x7f0e0302);
        RoundImageView roundimageview = (RoundImageView)findViewById(0x7f0e0305);
        m = (ProgressBar)findViewById(0x7f0e030c);
        k = findViewById(0x7f0e0307);
        l = findViewById(0x7f0e0308);
        n = findViewById(0x7f0e02a4);
        if (d.isSuperlike() && com.tinder.managers.ae.z())
        {
            n.setVisibility(0);
            float f1;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            int i1;
            int j1;
            int k1;
            if (d.isTheSuperLiker(b.b()))
            {
                i1 = 0x7f0601eb;
            } else
            {
                i1 = 0x7f0601ec;
            }
            textview.setText(String.format(getContext().getString(i1), new Object[] {
                d.getName()
            }));
        } else
        {
            n.setVisibility(8);
            textview.setText(String.format(getContext().getString(0x7f0600fa), new Object[] {
                d.getName()
            }));
        }
        h = (RelativeLayout)findViewById(0x7f0e0300);
        i = (RelativeLayout)findViewById(0x7f0e0304);
        i1 = (int)g.getResources().getDimension(0x7f090028);
        Picasso.a(g).a(e).a(0x7f02004f).b(i1, i1).b().a(match, new a(i1, match));
        activity = d.getPerson().getAvatarUrlsForSize(ad.a(activity));
        if (activity.size() > 0)
        {
            Picasso.a(g).a((String)activity.get(0)).a(0x7f02004f).b(i1, i1).b().a(roundimageview, new a(i1, roundimageview));
        }
        if (Locale.US.equals(Locale.getDefault()) || Locale.UK.equals(Locale.getDefault()))
        {
            s1.setVisibility(0);
            r.setVisibility(4);
        } else
        {
            s1.setVisibility(4);
            r.setVisibility(0);
        }
        k.setOnClickListener(new android.view.View.OnClickListener() {

            final ae a;

            public final void onClick(View view)
            {
                view = a.b.b();
                SparksEvent sparksevent = new SparksEvent("Match.OpenChat");
                sparksevent.put("matchId", ae.a(a).getId());
                sparksevent.put("superLike", Boolean.valueOf(ae.a(a).isTheSuperLiker(view)));
                sparksevent.put("didSuperLike", Boolean.valueOf(ae.a(a).superLikerIsThem()));
                com.tinder.managers.a.a(sparksevent);
                ae.b(a).a(ae.a(a));
                ae.c(a).setVisibility(0);
            }

            
            {
                a = ae.this;
                super();
            }
        });
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final ae a;

            public final void onClick(View view)
            {
                view = a.b.b();
                SparksEvent sparksevent = new SparksEvent("Match.KeepPlaying");
                sparksevent.put("matchId", ae.a(a).getId());
                sparksevent.put("superLike", Boolean.valueOf(ae.a(a).isTheSuperLiker(view)));
                sparksevent.put("didSuperLike", Boolean.valueOf(ae.a(a).superLikerIsThem()));
                com.tinder.managers.a.a(sparksevent);
                ae.b(a).i();
                a.a();
            }

            
            {
                a = ae.this;
                super();
            }
        });
        j.setOnClickListener(new android.view.View.OnClickListener() {

            final ae a;

            public final void onClick(View view)
            {
                view = a.b.b();
                SparksEvent sparksevent = new SparksEvent("Match.InviteFriends");
                sparksevent.put("matchId", ae.a(a).getId());
                sparksevent.put("superLike", Boolean.valueOf(ae.a(a).isTheSuperLiker(view)));
                sparksevent.put("didSuperLike", Boolean.valueOf(ae.a(a).superLikerIsThem()));
                com.tinder.managers.a.a(sparksevent);
                view = new Intent("android.intent.action.SEND");
                view.setType("text/plain");
                view.putExtra("android.intent.extra.TEXT", String.format(ae.d(a).getString(0x7f0601d2), new Object[] {
                    Integer.valueOf(a.a.j())
                }));
                ae.d(a).startActivity(Intent.createChooser(view, ae.d(a).getString(0x7f0601d1)));
            }

            
            {
                a = ae.this;
                super();
            }
        });
        match.setOnClickListener(new android.view.View.OnClickListener() {

            final ae a;

            public final void onClick(View view)
            {
                ae.b(a).j();
            }

            
            {
                a = ae.this;
                super();
            }
        });
        roundimageview.setOnClickListener(new android.view.View.OnClickListener() {

            final ae a;

            public final void onClick(View view)
            {
                ae.b(a).b(ae.a(a));
            }

            
            {
                a = ae.this;
                super();
            }
        });
        ad.b(j);
        ad.b(match);
        ad.b(roundimageview);
        activity = (BadgeView)findViewById(0x7f0e0303);
        r = (BadgeView)findViewById(0x7f0e0306);
        activity.setBordered(true);
        r.setBordered(true);
        s1 = b.b();
        if (s1 != null)
        {
            activity.displayBadge(s1);
        }
        r.displayBadge(d);
        f1 = ad.a(getContext());
        f2 = ad.b(getContext());
        f3 = g.getResources().getDimensionPixelSize(0x7f090027);
        k.measure(0, 0);
        l.measure(0, 0);
        j.measure(0, 0);
        i1 = k.getMeasuredWidth();
        j1 = l.getMeasuredWidth();
        k1 = j.getMeasuredHeight();
        f3 = -f3;
        f4 = -j1 - 100;
        f5 = i1;
        f6 = k1;
        i.setTranslationX(f3 * 2.0F);
        h.setTranslationX(f1);
        h.setRotation(-23F);
        i.setRotation(23F);
        k.setTranslationX(f5 + f1 + 100F);
        l.setTranslationX(f4 - f1);
        j.setTranslationY(f2 + f6);
    }

    static Match a(ae ae1)
    {
        return ae1.d;
    }

    static r b(ae ae1)
    {
        return ae1.f;
    }

    static ProgressBar c(ae ae1)
    {
        return ae1.m;
    }

    static Context d(ae ae1)
    {
        return ae1.g;
    }

    static View e(ae ae1)
    {
        return ae1.k;
    }

    static View f(ae ae1)
    {
        return ae1.l;
    }

    static int g(ae ae1)
    {
        int i1 = ae1.o;
        ae1.o = i1 + 1;
        return i1;
    }

    static int h(ae ae1)
    {
        return ae1.o;
    }

    public final void a()
    {
        Object obj = (RelativeLayout)findViewById(0x7f0e02fc);
        if (!ad.a())
        {
            ((RelativeLayout) (obj)).setPivotX(((RelativeLayout) (obj)).getMeasuredWidth() / 2);
            ((RelativeLayout) (obj)).setPivotY(((RelativeLayout) (obj)).getMeasuredHeight() / 2);
        }
        Object obj1 = (FrameLayout)findViewById(0x7f0e02fb);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
            0.0F
        });
        obj = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
            0.0F
        });
        Object obj2 = new AnticipateInterpolator(2.0F);
        objectanimator.setInterpolator(((android.animation.TimeInterpolator) (obj2)));
        ((ObjectAnimator) (obj)).setInterpolator(((android.animation.TimeInterpolator) (obj2)));
        obj1 = ObjectAnimator.ofFloat(obj1, "alpha", new float[] {
            0.0F
        });
        obj2 = new AnimatorSet();
        ((AnimatorSet) (obj2)).setDuration(300L);
        ((AnimatorSet) (obj2)).playTogether(new Animator[] {
            objectanimator, obj, obj1
        });
        ((AnimatorSet) (obj2)).addListener(new AnimatorListenerAdapter() {

            final ae a;

            public final void onAnimationEnd(Animator animator)
            {
                a.dismiss();
            }

            
            {
                a = ae.this;
                super();
            }
        });
        ((AnimatorSet) (obj2)).start();
    }

    public final void cancel()
    {
        a();
    }

    public final void show()
    {
        super.show();
        android.animation.Animator.AnimatorListener animatorlistener = new android.animation.Animator.AnimatorListener() {

            final ae a;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                com.tinder.c.ae.e(a).setEnabled(true);
                ae.f(a).setEnabled(true);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = ae.this;
                super();
            }
        };
        OvershootInterpolator overshootinterpolator = new OvershootInterpolator(1.6F);
        OvershootInterpolator overshootinterpolator1 = new OvershootInterpolator(0.6F);
        i.animate().translationX(0.0F).setStartDelay(100L).setDuration(550L).setInterpolator(overshootinterpolator).start();
        i.animate().rotation(0.0F).setStartDelay(100L).setInterpolator(new LinearInterpolator()).start();
        h.animate().translationX(0.0F).setStartDelay(100L).setDuration(550L).setInterpolator(overshootinterpolator).start();
        h.animate().rotation(0.0F).setStartDelay(100L).setInterpolator(new LinearInterpolator()).start();
        l.animate().translationX(0.0F).setStartDelay(320L).setDuration(425L).setInterpolator(overshootinterpolator1).setListener(animatorlistener).start();
        k.animate().translationX(0.0F).setStartDelay(320L).setDuration(425L).setInterpolator(overshootinterpolator1).start();
        j.animate().translationY(0.0F).alpha(1.0F).setInterpolator(new DecelerateInterpolator()).setStartDelay(650L).setDuration(500L).start();
        (new StringBuilder("New Match: ")).append(d.getId());
        ac.a().a = true;
    }
}
