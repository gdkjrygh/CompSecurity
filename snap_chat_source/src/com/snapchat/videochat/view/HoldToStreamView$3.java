// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Vw;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class > extends AnimatorListenerAdapter
{

    final HoldToStreamView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.postDelayed(new Runnable() {

            private HoldToStreamView._cls3 a;

            public final void run()
            {
                a.a.a.b(HoldToStreamView.k(a.a));
                HoldToStreamView.m(a.a);
            }

            
            {
                a = HoldToStreamView._cls3.this;
                super();
            }
        }, 1000L);
    }

    _cls1.a(HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}
