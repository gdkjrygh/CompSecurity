// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        MenuFragment.access$1700(_fld0);
    }

    l.sponsorDuration()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/MenuFragment$14

/* anonymous class */
    class MenuFragment._cls14
        implements android.view.animation.Animation.AnimationListener
    {

        final MenuFragment this$0;
        final int val$sponsorDuration;

        public void onAnimationEnd(Animation animation)
        {
            try
            {
                MenuFragment.access$1600(MenuFragment.this).setVisibility(0);
                (new Handler()).postDelayed(new MenuFragment._cls14._cls1(), sponsorDuration);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Animation animation)
            {
                animation.printStackTrace();
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$0 = final_menufragment;
                sponsorDuration = I.this;
                super();
            }
    }

}
