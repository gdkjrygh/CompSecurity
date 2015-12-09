// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.animation.Animator;
import android.widget.ListView;

// Referenced classes of package com.jcp.fragments:
//            ff

class fi
    implements android.animation.Animator.AnimatorListener
{

    final ff a;

    fi(ff ff1)
    {
        a = ff1;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        if (ff.a(a) == 1)
        {
            ff.g(a).setVisibility(8);
        } else
        {
            if (ff.a(a) == 2)
            {
                ff.h(a).setVisibility(8);
                return;
            }
            if (ff.a(a) == 0)
            {
                ff.g(a).setVisibility(8);
                ff.h(a).setVisibility(8);
                return;
            }
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        if (ff.a(a) == 2)
        {
            ff.g(a).setVisibility(0);
        } else
        if (ff.a(a) == 1)
        {
            ff.h(a).setVisibility(0);
            return;
        }
    }
}
