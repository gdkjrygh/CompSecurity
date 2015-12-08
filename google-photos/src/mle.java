// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.material.butterfly.ButterflyView;

public final class mle extends AnimatorListenerAdapter
{

    private ButterflyView a;

    public mle(ButterflyView butterflyview)
    {
        a = butterflyview;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        for (int i = 0; i < a.getChildCount(); i++)
        {
            ((mlg)a.getChildAt(i).getTag(b.DA)).a();
        }

    }
}
