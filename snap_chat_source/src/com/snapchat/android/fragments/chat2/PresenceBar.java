// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import Gh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import cn;
import com.addlive.view.ALVideoTextureView;
import com.addlive.view.CircleVideoTextureView;
import com.snapchat.android.Timber;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.util.emoji.Emoji;
import java.io.IOException;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBarStateController

public class PresenceBar extends View
    implements PresenceBarStateController.a
{

    private CircleVideoTextureView A;
    private boolean B;
    private boolean C;
    private String D;
    private int E;
    private String F;
    private PresenceBarStateController.PresenceBarState G;
    private ChatConversation a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private AnimatorSet k;
    private AnimatorSet l;
    private ValueAnimator m;
    private ValueAnimator n;
    private ValueAnimator o;
    private ValueAnimator p;
    private ValueAnimator q;
    private ValueAnimator r;
    private ValueAnimator s;
    private ValueAnimator t;
    private Drawable u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    public PresenceBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        D = "";
        E = 0;
        F = "";
        G = PresenceBarStateController.PresenceBarState.NOTHING;
        b = a(context);
        c = a(context);
        c.setTextSize(40F);
        f = getResources().getDimension(0x7f0a00dd);
        PresenceBarStateController.a().a = this;
        a();
    }

    private float a(float f1)
    {
        return (float)getMeasuredHeight() - f1 - j;
    }

    static float a(PresenceBar presencebar, float f1)
    {
        presencebar.e = f1;
        return f1;
    }

    static int a(PresenceBar presencebar, int i1)
    {
        presencebar.E = i1;
        return i1;
    }

    static AnimatorSet a(PresenceBar presencebar, AnimatorSet animatorset)
    {
        presencebar.k = animatorset;
        return animatorset;
    }

    private ValueAnimator a(Drawable drawable)
    {
        p = ValueAnimator.ofFloat(new float[] {
            j, h
        });
        p.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        p.addListener(new AnimatorListenerAdapter(drawable) {

            private Drawable a;
            private PresenceBar b;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.a(b, a);
                PresenceBar.c(b);
            }

            
            {
                b = PresenceBar.this;
                a = drawable;
                super();
            }
        });
        return p;
    }

    private ValueAnimator a(String s1)
    {
        s = ValueAnimator.ofInt(new int[] {
            E, 255
        });
        s.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(s1) {

            private String a;
            private PresenceBar b;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.a(b, ((Integer)valueanimator.getAnimatedValue()).intValue());
                PresenceBar.a(b, a);
                PresenceBar.a(b, true);
                b.invalidate();
            }

            
            {
                b = PresenceBar.this;
                a = s1;
                super();
            }
        });
        s.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a);
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        return s;
    }

    private static Paint a(Context context)
    {
        int i1 = context.getResources().getColor(0x7f0c000a);
        context = new Paint();
        context.setColor(i1);
        context.setAntiAlias(true);
        return context;
    }

    static Drawable a(PresenceBar presencebar, Drawable drawable)
    {
        presencebar.u = drawable;
        return drawable;
    }

    private Drawable a(Emoji emoji)
    {
        try
        {
            emoji = Gh.a().b(new String(Character.toChars(emoji.getUnicode())));
            Bitmap bitmap = Bitmap.createBitmap((int)f, (int)f, android.graphics.Bitmap.Config.ARGB_8888);
            emoji.a(new Canvas(bitmap));
            emoji = new BitmapDrawable(getResources(), bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (Emoji emoji)
        {
            Timber.e("PresenceBar", emoji.getMessage(), new Object[0]);
            return null;
        }
        return emoji;
    }

    static String a(PresenceBar presencebar, String s1)
    {
        presencebar.D = s1;
        return s1;
    }

    private void a()
    {
        d = -2F * f;
        g = f / 4F;
        h = f / 2.0F;
        i = f;
        e = d;
        j = g;
        setVisibility(8);
        B = true;
        c();
        a(((Drawable) (null)));
        d();
        b();
        e();
        a("");
        f();
        v = a(Emoji.SMILING_FACE_WITH_OPEN_MOUTH);
        w = a(Emoji.CONFUSED_FACE);
        x = getResources().getDrawable(0x7f020084);
        z = getResources().getDrawable(0x7f020136);
        y = getResources().getDrawable(0x7f020087);
    }

    static void a(PresenceBar presencebar)
    {
        presencebar.p.setFloatValues(new float[] {
            presencebar.j, presencebar.h
        });
        presencebar.q.setFloatValues(new float[] {
            presencebar.j, presencebar.i
        });
        presencebar.r.setFloatValues(new float[] {
            presencebar.j, presencebar.g
        });
        presencebar.m.setFloatValues(new float[] {
            presencebar.e, 0.0F
        });
        presencebar.o.setFloatValues(new float[] {
            presencebar.e, -5F, 0.0F
        });
        presencebar.s.setFloatValues(new float[] {
            (float)presencebar.E, 255F
        });
        presencebar.t.setFloatValues(new float[] {
            (float)presencebar.E, 0.0F
        });
    }

    static boolean a(PresenceBar presencebar, boolean flag)
    {
        presencebar.C = flag;
        return flag;
    }

    static float b(PresenceBar presencebar, float f1)
    {
        presencebar.j = f1;
        return f1;
    }

    static AnimatorSet b(PresenceBar presencebar, AnimatorSet animatorset)
    {
        presencebar.l = animatorset;
        return animatorset;
    }

    private ValueAnimator b()
    {
        m = ValueAnimator.ofFloat(new float[] {
            e, 0.0F
        });
        m.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        m.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                a.setVisibility(0);
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        return m;
    }

    static void b(PresenceBar presencebar)
    {
        presencebar.getLayoutParams().height = (int)presencebar.f / 2;
        presencebar.requestLayout();
    }

    private void b(String s1)
    {
        AnimatorSet animatorset = new AnimatorSet();
        ValueAnimator valueanimator = f();
        s1 = a(s1);
        animatorset.play(valueanimator).before(s1);
        animatorset.addListener(new AnimatorListenerAdapter(animatorset) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.b(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.b(b, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.f(b);
                PresenceBar.b(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        s1.start();
    }

    private ValueAnimator c()
    {
        r = ValueAnimator.ofFloat(new float[] {
            j, g
        });
        r.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        r.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a, null);
                PresenceBar.b(a);
                PresenceBar.a(a);
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        return r;
    }

    static void c(PresenceBar presencebar)
    {
        presencebar.getLayoutParams().height = (int)presencebar.f;
        presencebar.requestLayout();
    }

    private ValueAnimator d()
    {
        q = ValueAnimator.ofFloat(new float[] {
            j, i
        });
        q.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        q.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.a(a, null);
                PresenceBar.d(a);
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        return q;
    }

    static void d(PresenceBar presencebar)
    {
        presencebar.getLayoutParams().height = (int)presencebar.f << 1;
        presencebar.requestLayout();
    }

    private ValueAnimator e()
    {
        o = ValueAnimator.ofFloat(new float[] {
            e, -5F, 0.0F
        });
        o.setDuration(600L);
        o.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        o.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a);
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        o.setRepeatCount(-1);
        o.setRepeatMode(1);
        return o;
    }

    static void e(PresenceBar presencebar)
    {
        if (presencebar.k != null)
        {
            presencebar.k.cancel();
            presencebar.k = null;
        }
    }

    private ValueAnimator f()
    {
        t = ValueAnimator.ofInt(new int[] {
            E, 0
        });
        t.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                PresenceBar.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        t.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a, false);
                PresenceBar.a(a);
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        return t;
    }

    static void f(PresenceBar presencebar)
    {
        if (presencebar.l != null)
        {
            presencebar.l.cancel();
            presencebar.l = null;
        }
    }

    private void g()
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(f());
        animatorset.addListener(new AnimatorListenerAdapter(animatorset) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.b(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.b(b, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.f(b);
                PresenceBar.b(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset.start();
    }

    static void g(PresenceBar presencebar)
    {
        presencebar.A.stop();
        presencebar.A.setSinkId(presencebar.F);
        presencebar.A.setRadius(0.25F);
        presencebar.A.setVisibility(0);
        presencebar.A.bringToFront();
        presencebar.A.start();
    }

    public final void a(PresenceBarStateController.PresenceBarState presencebarstate)
    {
        if (G == presencebarstate)
        {
            return;
        }
        if (G == PresenceBarStateController.PresenceBarState.VIDEO)
        {
            A.setVisibility(4);
            A.stop();
        }
        if (presencebarstate != PresenceBarStateController.PresenceBarState.NOTHING)
        {
            setVisibility(0);
        }
        static final class _cls20
        {

            static final int a[];

            static 
            {
                a = new int[PresenceBarStateController.PresenceBarState.values().length];
                try
                {
                    a[PresenceBarStateController.PresenceBarState.NOTHING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.PRESENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.SOMETHING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.RINGING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.LISTENING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.TALKING.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[PresenceBarStateController.PresenceBarState.VIDEO.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls20.a[presencebarstate.ordinal()];
        JVM INSTR tableswitch 1 7: default 96
    //                   1 154
    //                   2 154
    //                   3 154
    //                   4 154
    //                   5 162
    //                   6 162
    //                   7 162;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L3 _L3
_L1:
        _cls20.a[presencebarstate.ordinal()];
        JVM INSTR tableswitch 1 7: default 148
    //                   1 170
    //                   2 261
    //                   3 430
    //                   4 501
    //                   5 582
    //                   6 666
    //                   7 750;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        G = presencebarstate;
        return;
_L2:
        setKeepScreenOn(false);
          goto _L1
_L3:
        setKeepScreenOn(true);
          goto _L1
_L5:
        AnimatorSet animatorset = new AnimatorSet();
        n = ValueAnimator.ofFloat(new float[] {
            e, d
        });
        n.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            private PresenceBar a;

            public final void onAnimationUpdate(ValueAnimator valueanimator14)
            {
                PresenceBar.a(a, ((Float)valueanimator14.getAnimatedValue()).floatValue());
                a.invalidate();
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        n.addListener(new AnimatorListenerAdapter() {

            private PresenceBar a;

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(a);
                a.setVisibility(4);
                a.invalidate();
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                a = PresenceBar.this;
                super();
            }
        });
        animatorset.play(n);
        animatorset.addListener(new AnimatorListenerAdapter(animatorset) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b, null);
                b.setVisibility(8);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset.start();
          goto _L4
_L6:
        if (G == PresenceBarStateController.PresenceBarState.NOTHING)
        {
            AnimatorSet animatorset1 = new AnimatorSet();
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(1000L);
            ValueAnimator valueanimator6 = c();
            ValueAnimator valueanimator11 = b();
            ValueAnimator valueanimator13 = a(v);
            animatorset1.play(valueanimator11).before(valueanimator);
            animatorset1.play(valueanimator13).with(valueanimator11);
            animatorset1.play(valueanimator).before(valueanimator6);
            animatorset1.addListener(new AnimatorListenerAdapter(animatorset1) {

                private AnimatorSet a;
                private PresenceBar b;

                public final void onAnimationCancel(Animator animator)
                {
                    PresenceBar.a(b, null);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    PresenceBar.a(b, null);
                }

                public final void onAnimationStart(Animator animator)
                {
                    PresenceBar.e(b);
                    PresenceBar.a(b, a);
                }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
            });
            animatorset1.start();
            g();
        } else
        {
            AnimatorSet animatorset2 = new AnimatorSet();
            animatorset2.play(b()).with(c());
            animatorset2.addListener(new AnimatorListenerAdapter(animatorset2) {

                private AnimatorSet a;
                private PresenceBar b;

                public final void onAnimationCancel(Animator animator)
                {
                    PresenceBar.a(b, null);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    PresenceBar.a(b, null);
                }

                public final void onAnimationStart(Animator animator)
                {
                    PresenceBar.e(b);
                    PresenceBar.a(b, a);
                }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
            });
            animatorset2.start();
            g();
        }
          goto _L4
_L7:
        AnimatorSet animatorset3 = new AnimatorSet();
        ValueAnimator valueanimator1 = b();
        ValueAnimator valueanimator7 = c();
        ValueAnimator valueanimator12 = e();
        animatorset3.play(valueanimator7).before(valueanimator1);
        animatorset3.play(valueanimator1).before(valueanimator12);
        animatorset3.addListener(new AnimatorListenerAdapter(animatorset3) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset3.start();
        g();
          goto _L4
_L8:
        AnimatorSet animatorset4 = new AnimatorSet();
        ValueAnimator valueanimator2 = b();
        ValueAnimator valueanimator8 = a(y);
        animatorset4.play(valueanimator2).with(valueanimator8);
        animatorset4.addListener(new AnimatorListenerAdapter(animatorset4) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset4.start();
        b((new StringBuilder("You are ringing ")).append(a.mTheirUsername).toString());
          goto _L4
_L9:
        AnimatorSet animatorset5 = new AnimatorSet();
        ValueAnimator valueanimator3 = b();
        ValueAnimator valueanimator9 = a(z);
        animatorset5.play(valueanimator3).with(valueanimator9);
        animatorset5.addListener(new AnimatorListenerAdapter(animatorset5) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset5.start();
        b((new StringBuilder()).append(a.mTheirUsername).append(" is listening").toString());
          goto _L4
_L10:
        AnimatorSet animatorset6 = new AnimatorSet();
        ValueAnimator valueanimator4 = b();
        ValueAnimator valueanimator10 = a(x);
        animatorset6.play(valueanimator4).with(valueanimator10);
        animatorset6.addListener(new AnimatorListenerAdapter(animatorset6) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset6.start();
        b((new StringBuilder()).append(a.mTheirUsername).append(" is talking").toString());
          goto _L4
_L11:
        AnimatorSet animatorset7 = new AnimatorSet();
        ValueAnimator valueanimator5 = b();
        animatorset7.play(d()).with(valueanimator5);
        animatorset7.addListener(new AnimatorListenerAdapter(animatorset7) {

            private AnimatorSet a;
            private PresenceBar b;

            public final void onAnimationCancel(Animator animator)
            {
                PresenceBar.a(b, null);
            }

            public final void onAnimationEnd(Animator animator)
            {
                PresenceBar.a(b, null);
                PresenceBar.g(b);
            }

            public final void onAnimationStart(Animator animator)
            {
                PresenceBar.e(b);
                PresenceBar.a(b, a);
            }

            
            {
                b = PresenceBar.this;
                a = animatorset;
                super();
            }
        });
        animatorset7.start();
        g();
          goto _L4
    }

    public final void a(ChatConversation chatconversation)
    {
        a = chatconversation;
        F = "";
    }

    public void onDraw(Canvas canvas)
    {
        if (!B)
        {
            a();
        }
        canvas.drawCircle(j, a(e), j, b);
        if (u != null)
        {
            Object obj = u;
            Object obj1 = u;
            int i1 = ((Drawable) (obj1)).getIntrinsicWidth();
            int j1 = ((Drawable) (obj1)).getIntrinsicHeight();
            double d1;
            double d2;
            float f1;
            Rect rect;
            if (obj1 == v || obj1 == w)
            {
                d2 = j;
                d1 = j;
            } else
            {
                float f2 = j;
                d1 = Math.atan2(j1, i1);
                d2 = (double)f2 * Math.cos(d1);
                d1 = (double)f2 * Math.sin(d1);
            }
            ((Drawable) (obj)).setBounds(new Rect((int)((double)j - d2), (int)((double)a(e) - d1), (int)(d2 + (double)j), (int)(d1 + (double)a(e))));
            u.draw(canvas);
        }
        if (C)
        {
            c.setAlpha(E);
            obj = D;
            f1 = j;
            obj1 = c;
            rect = new Rect();
            ((Paint) (obj1)).getTextBounds(D, 0, D.length(), rect);
            canvas.drawText(((String) (obj)), f1 * 2.0F + 20F, a(e + rect.exactCenterY()), c);
        }
    }

    public void setSinkId(String s1)
    {
        F = s1;
    }

    public void setVideoView(ALVideoTextureView alvideotextureview)
    {
        A = (CircleVideoTextureView)alvideotextureview;
    }
}
