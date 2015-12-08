// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;

final class etx
{

    // Unreferenced inner class etx$1

/* anonymous class */
    public final class _cls1 extends AnimatorListenerAdapter
    {

        private View a;
        private String b;

        public final void onAnimationEnd(Animator animator)
        {
            ((TextView)a).setText(b);
        }

            public 
            {
                a = view;
                b = s;
                super();
            }
    }

}
