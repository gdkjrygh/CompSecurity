// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.animation.Animation;
import android.widget.ScrollView;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class this._cls0
    implements android.view.animation.istener
{

    final StoreListActivity this$0;

    public void onAnimationEnd(Animation animation)
    {
        savedLocationsScroller.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    istener()
    {
        this$0 = StoreListActivity.this;
        super();
    }
}
