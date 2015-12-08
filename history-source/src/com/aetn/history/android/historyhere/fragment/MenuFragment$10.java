// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MenuFragment

class this._cls0
    implements android.view.animation.ionListener
{

    final MenuFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        MenuFragment.access$700(MenuFragment.this).setAlpha(1.0F);
        MenuFragment.access$800(MenuFragment.this).setAlpha(1.0F);
        MenuFragment.access$900(MenuFragment.this).setAlpha(1.0F);
        MenuFragment.access$1000(MenuFragment.this).setAlpha(1.0F);
        MenuFragment.access$1100(MenuFragment.this).setVisibility(0);
        MenuFragment.access$600(MenuFragment.this).setVisibility(8);
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
