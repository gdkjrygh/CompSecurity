// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Vw;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.a.b(HoldToStreamView.k(a.a));
        HoldToStreamView.m(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/videochat/view/HoldToStreamView$3

/* anonymous class */
    final class HoldToStreamView._cls3 extends AnimatorListenerAdapter
    {

        final HoldToStreamView a;

        public final void onAnimationEnd(Animator animator)
        {
            a.postDelayed(new HoldToStreamView._cls3._cls1(this), 1000L);
        }

            
            {
                a = holdtostreamview;
                super();
            }
    }

}
