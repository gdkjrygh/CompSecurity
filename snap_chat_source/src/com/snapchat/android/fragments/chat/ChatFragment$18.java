// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import IE;
import Jo;
import PI;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.snapchat.android.ui.CashReceiverView;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class c
    implements Runnable
{

    final ChatFragment a;
    private int b;
    private long c;

    public final void run()
    {
label0:
        {
            if (!ChatFragment.H(a))
            {
                ChatFragment.I(a);
                long l1 = (long)((1.0F - ((CashReceiverView)ChatFragment.J(a).a()).getAlpha()) * 500F);
                ((CashReceiverView)ChatFragment.J(a).a()).animate().alpha(1.0F).setListener(null).setDuration(l1);
            }
            CashReceiverView cashreceiverview = (CashReceiverView)ChatFragment.J(a).a();
            int j = b;
            long l2 = c;
            int i;
            if (cashreceiverview.f.containsKey(Long.valueOf(l2)))
            {
                i = j - ((Integer)cashreceiverview.f.get(Long.valueOf(l2))).intValue();
            } else
            {
                i = j;
            }
            if (i <= 0)
            {
                break label0;
            }
            cashreceiverview.f.put(Long.valueOf(l2), Integer.valueOf(j));
            if (cashreceiverview.e == null || !cashreceiverview.e.isStarted())
            {
                cashreceiverview.a(1);
            }
            for (j = 0; j < i; j++)
            {
label1:
                {
                    float f;
                    ImageView imageview;
label2:
                    {
                        imageview = new ImageView(cashreceiverview.getContext());
                        imageview.setImageDrawable(cashreceiverview.getResources().getDrawable(0x7f0200a8));
                        imageview.setLayoutParams(new android.view.Params((int)Jo.a(72F, cashreceiverview.getContext()), (int)Jo.a(36F, cashreceiverview.getContext())));
                        imageview.setTag("FALLING_DOLLAR_TAG");
                        float f3 = IE.a().nextFloat();
                        float f4 = 0.9F + IE.a().nextFloat() * 0.2F;
                        imageview.setScaleX(f4);
                        imageview.setScaleY(f4);
                        int k;
                        for (k = 0; k < cashreceiverview.getChildCount() && f4 > cashreceiverview.getChildAt(k).getScaleX(); k++) { }
                        cashreceiverview.addView(imageview, k);
                        f = Jo.a(3.33F - 1.66F * f3, cashreceiverview.getContext());
                        float f1 = Jo.a(0.2F + 0.1F * f3, cashreceiverview.getContext());
                        float f2 = Jo.a(0.0015F + -0.0005F * f3, cashreceiverview.getContext());
                        f3 = Jo.a(133F * f4 + f3 * -66F, cashreceiverview.getContext());
                        f4 = cashreceiverview.getMeasuredWidth();
                        float f5 = IE.a().nextFloat();
                        float f6 = (float)imageview.getLayoutParams().width / 2.0F;
                        float f7 = (float)(6.2831853071795862D * (double)IE.a().nextFloat());
                        float f8 = -imageview.getLayoutParams().height;
                        float f9 = Jo.a(5F, cashreceiverview.getContext());
                        ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                            0.0F, 1.0F
                        });
                        valueanimator.setDuration(5000L);
                        valueanimator.setInterpolator(new LinearInterpolator());
                        valueanimator.addUpdateListener(new com.snapchat.android.ui.._cls3(imageview, f2, f7, f3, f4 * (0.4F + 0.2F * f5) - f6, f8 - f9, f1, f));
                        valueanimator.addListener(new com.snapchat.android.ui.._cls4(imageview));
                        valueanimator.start();
                        if (cashreceiverview.a >= 6)
                        {
                            break label1;
                        }
                        imageview = new ImageView(cashreceiverview.getContext());
                        imageview.setImageResource(0x7f0200a7);
                        k = (int)Jo.a(9F, cashreceiverview.getContext());
                        int l = (int)Jo.a(18F, cashreceiverview.getContext());
                        f = 0.9F + 0.2F * IE.a().nextFloat();
                        imageview.setScaleX(f);
                        imageview.setScaleY(f);
                        imageview.setLayoutParams(new android.view.Params(k, l));
                        imageview.setTag("CAUGHT_DOLLAR_TAG");
                        cashreceiverview.c.addView(imageview);
                        f1 = -2F + 2.0F * IE.a().nextFloat();
                        if (!cashreceiverview.d || cashreceiverview.a % 2 != 0)
                        {
                            f = f1;
                            if (cashreceiverview.d)
                            {
                                break label2;
                            }
                            f = f1;
                            if (cashreceiverview.a % 2 == 0)
                            {
                                break label2;
                            }
                        }
                        f = f1 + 32F;
                    }
                    imageview.setTranslationX(Jo.a(f, cashreceiverview.getContext()));
                    imageview.setTranslationY(Jo.a(4F + 2.0F * IE.a().nextFloat(), cashreceiverview.getContext()));
                    imageview.setRotation(-30F + 60F * IE.a().nextFloat());
                }
                cashreceiverview.b.add(Long.valueOf(SystemClock.elapsedRealtime()));
                cashreceiverview.a = cashreceiverview.a + 1;
            }

        }
        ChatFragment.K(a).removeCallbacksAndMessages(null);
        ChatFragment.K(a).postDelayed(new Runnable() {

            private ChatFragment._cls18 a;

            public final void run()
            {
                ChatFragment.L(a.a);
            }

            
            {
                a = ChatFragment._cls18.this;
                super();
            }
        }, 3000L);
    }

    _cls1.a(ChatFragment chatfragment, int i, long l)
    {
        a = chatfragment;
        b = i;
        c = l;
        super();
    }
}
