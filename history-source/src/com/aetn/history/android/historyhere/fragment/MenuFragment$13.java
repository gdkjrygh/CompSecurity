// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.animation.Animation;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class this._cls0
    implements android.view.animation.ionListener
{

    final MenuFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        try
        {
            MenuFragment.access$1400(MenuFragment.this);
            MenuFragment.access$1500(MenuFragment.this);
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

    ()
    {
        this$0 = MenuFragment.this;
        super();
    }
}
