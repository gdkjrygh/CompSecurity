// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pandora.android.daydream:
//            a

class dapter extends AnimatorListenerAdapter
{

    final String a;
    final int b;
    final art c;

    public void onAnimationEnd(Animator animator)
    {
        if (dapter(c))
        {
            return;
        } else
        {
            c(c, ObjectAnimator.ofInt(Int(c).get(), a, new int[] {
                b, -b
            }));
            b(c).setRepeatCount(-1);
            tRepeatCount(c).setRepeatMode(2);
            tRepeatMode(c).setDuration(25000L);
            tDuration(c).start();
            return;
        }
    }

    dapter(dapter dapter, String s, int i)
    {
        c = dapter;
        a = s;
        b = i;
        super();
    }
}
