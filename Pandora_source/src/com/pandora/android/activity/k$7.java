// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.activity:
//            k

class rAdapter extends AnimatorListenerAdapter
{

    final Runnable a;
    final k b;

    public void onAnimationEnd(Animator animator)
    {
        s.a(k.a(b), 0.0F);
        k.a(b).setVisibility(4);
        k.a(b).setImageBitmap(null);
        a.run();
    }

    rAdapter(k k1, Runnable runnable)
    {
        b = k1;
        a = runnable;
        super();
    }
}
