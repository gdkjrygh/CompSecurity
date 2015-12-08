// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.tinder.e.au;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.model.SparksEvent;
import com.tinder.utils.DateUtils;
import com.tinder.utils.a;
import com.tinder.utils.t;
import com.tinder.views.LikeMeter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class x extends Dialog
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void J();
    }


    private static final Pattern f = Pattern.compile("\n\n", 16);
    private static final SimpleDateFormat g = new SimpleDateFormat("HH:mm:ss");
    ab a;
    d b;
    ae c;
    com.tinder.d.a d;
    public n.a e;
    private List h;
    private com.tinder.e.x i;
    private TextView j;
    private LikeMeter k;
    private long l;
    private String m;
    private a n;

    public x(Context context, List list, com.tinder.e.x x1, a a1, String s)
    {
        super(context, 0x7f0b0166);
        ManagerApp.h().a(this);
        setContentView(0x7f030054);
        n = a1;
        m = s;
        h = list;
        i = x1;
        g.setLenient(false);
        setCanceledOnTouchOutside(true);
        k = (LikeMeter)findViewById(0x7f0e017d);
        k.setAssetMode(com.tinder.views.LikeMeter.AssetMode.EXTRA_LARGE);
        context = findViewById(0x7f0e017b);
        context.setOnClickListener(this);
        com.tinder.utils.a.a(context, 0.95F, 275L, 275L);
        context = getContext().getString(0x7f06020d);
        boolean flag = f.matcher(context).matches();
        if (flag)
        {
            context = f.matcher(context).replaceAll("\n");
        }
        list = (TextView)findViewById(0x7f0e017c);
        x1 = new RelativeSizeSpan(0.55F);
        a1 = new SpannableString(context);
        int i1;
        int j1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = context.indexOf('\n') + 1;
        }
        if (flag)
        {
            j1 = context.indexOf('\n') - 1;
        } else
        {
            j1 = context.length();
        }
        a1.setSpan(x1, i1, j1, 18);
        list.setText(a1);
        d.h();
    }

    static long a(x x1)
    {
        return x1.l;
    }

    static long a(x x1, long l1)
    {
        x1.l = l1;
        return l1;
    }

    static TextView b(x x1)
    {
        return x1.j;
    }

    static LikeMeter c(x x1)
    {
        return x1.k;
    }

    public final void dismiss()
    {
        boolean flag;
        if (l <= 1000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.e();
        } else
        {
            SparksEvent sparksevent = new SparksEvent("Roadblock.Cancel");
            sparksevent.put("percentLikesLeft", Integer.valueOf(a.g));
            sparksevent.put("otherId", m);
            sparksevent.put("locale", t.b());
            sparksevent.put("roadblockVersion", Integer.valueOf(1));
            sparksevent.put("timeRemaining", Long.valueOf(a.a()));
            com.tinder.managers.a.a(sparksevent);
        }
        super.dismiss();
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624315: 
            view = new SparksEvent("Roadblock.Select");
            break;
        }
        view.put("percentLikesLeft", Integer.valueOf(a.g));
        view.put("otherId", m);
        view.put("locale", t.b());
        view.put("roadblockVersion", Integer.valueOf(1));
        view.put("timeRemaining", Long.valueOf(a.a()));
        com.tinder.managers.a.a(view);
        n.J();
        dismiss();
    }

    public final void show()
    {
        super.show();
        Object obj = new ValueAnimator();
        ((ValueAnimator) (obj)).setInterpolator(new AccelerateInterpolator());
        ((ValueAnimator) (obj)).setDuration(420L);
        ((ValueAnimator) (obj)).setStartDelay(400L);
        ((ValueAnimator) (obj)).setFloatValues(new float[] {
            1.0F, 0.15F
        });
        ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final x a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                x.c(a).setPercentFull(((Float)valueanimator.getAnimatedValue()).floatValue());
            }

            
            {
                a = x.this;
                super();
            }
        });
        ((ValueAnimator) (obj)).addListener(new au() {

            final x a;

            public final void onAnimationEnd(Animator animator)
            {
                animator = new ValueAnimator();
                animator.setRepeatMode(2);
                animator.setRepeatCount(-1);
                animator.setInterpolator(new DecelerateInterpolator());
                animator.setDuration(510L);
                animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this) {

                    final _cls3 a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        x.c(a.a).setPercentFull(((Float)valueanimator.getAnimatedValue()).floatValue());
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
                animator.setFloatValues(new float[] {
                    0.15F, 0.2F
                });
                animator.start();
            }

            
            {
                a = x.this;
                super();
            }
        });
        ((ValueAnimator) (obj)).start();
        j = (TextView)findViewById(0x7f0e017a);
        long l1 = System.currentTimeMillis();
        l = (a.h + 1000L) - l1;
        if (l <= 1000L)
        {
            dismiss();
        } else
        {
            j.setText(DateUtils.b(l));
            (new CountDownTimer(l) {

                final x a;

                public final void onFinish()
                {
                    a.dismiss();
                }

                public final void onTick(long l2)
                {
                    com.tinder.c.x.a(a, l2 - 1000L);
                    x.b(a).setText(DateUtils.b(com.tinder.c.x.a(a)));
                }

            
            {
                a = x.this;
                super(l1, 1000L);
            }
            }).start();
        }
        ae.b.putBoolean("HAS_VIEWED_ROADBLOCK", true);
        ae.b.commit();
        obj = new SparksEvent("Roadblock.View");
        ((SparksEvent) (obj)).put("percentLikesLeft", Integer.valueOf(a.g));
        ((SparksEvent) (obj)).put("otherId", m);
        ((SparksEvent) (obj)).put("locale", t.b());
        ((SparksEvent) (obj)).put("roadblockVersion", Integer.valueOf(1));
        ((SparksEvent) (obj)).put("timeRemaining", Long.valueOf(a.a()));
        com.tinder.managers.a.a(((SparksEvent) (obj)));
    }

}
