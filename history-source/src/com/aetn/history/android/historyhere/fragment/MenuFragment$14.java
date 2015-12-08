// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class val.sponsorDuration
    implements android.view.animation.ionListener
{

    final MenuFragment this$0;
    final int val$sponsorDuration;

    public void onAnimationEnd(Animation animation)
    {
        try
        {
            MenuFragment.access$1600(MenuFragment.this).setVisibility(0);
            (new Handler()).postDelayed(new Runnable() {

                final MenuFragment._cls14 this$1;

                public void run()
                {
                    MenuFragment.access$1700(this$0);
                }

            
            {
                this$1 = MenuFragment._cls14.this;
                super();
            }
            }, val$sponsorDuration);
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

    _cls1.this._cls1()
    {
        this$0 = final_menufragment;
        val$sponsorDuration = I.this;
        super();
    }
}
