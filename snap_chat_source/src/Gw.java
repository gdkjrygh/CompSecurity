// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.ui.chat.ChatAboveTheFoldV2RecyclerView;
import com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener;

public final class Gw extends SwipeableRecyclerViewItemTouchListener
    implements android.view.View.OnTouchListener
{

    public boolean a;
    private final ChatAboveTheFoldV2RecyclerView e;
    private final int f;
    private final int g;
    private boolean h;
    private float i;
    private float j;
    private int k;

    public Gw(Context context, ChatAboveTheFoldV2RecyclerView chatabovethefoldv2recyclerview, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.SwipeDirection swipedirection, com.snapchat.android.ui.listeners.SwipeableRecyclerViewItemTouchListener.d d)
    {
        super(chatabovethefoldv2recyclerview, swipedirection, d);
        e = chatabovethefoldv2recyclerview;
        f = context.getResources().getDimensionPixelSize(0x7f0a0059);
        g = context.getResources().getInteger(0x10e0000);
    }

    static ChatAboveTheFoldV2RecyclerView a(Gw gw)
    {
        return gw.e;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        float f1;
        float f3;
        boolean flag;
        flag = true;
        f1 = motionevent.getRawX();
        f3 = motionevent.getRawY();
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 51
    //                   1 218
    //                   2 75;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onTouch(view, motionevent);
_L2:
        h = true;
        a = true;
        i = f1;
        j = f3;
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = Math.abs(i - f1);
        f3 = Math.abs(j - f3);
        if (h)
        {
            if (f2 == f3)
            {
                a = false;
                continue; /* Loop/switch isn't completed */
            }
            h = false;
            boolean flag1;
            if (f2 > f3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a = flag1;
        }
        if (i >= f1 || f2 <= f3)
        {
            flag = false;
        }
        if (flag)
        {
            k = (int)f2;
            if (k > f)
            {
                k = f;
            }
            e.a(k);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (k != 0)
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                k, 0
            }).setDuration(g);
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                private Gw a;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    Gw.a(a).a(((Integer)valueanimator1.getAnimatedValue()).intValue());
                }

            
            {
                a = Gw.this;
                super();
            }
            });
            valueanimator.start();
        }
        k = 0;
        if (true) goto _L1; else goto _L5
_L5:
    }
}
