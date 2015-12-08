// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.app.SharedElementCallback;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.List;

// Referenced classes of package com.soundcloud.android:
//            SmoothNavigator

class val.searchItem extends SharedElementCallback
{

    final SmoothNavigator this$0;
    final int val$mediumAnimTime;
    final View val$searchIcon;
    final View val$searchItem;

    public void onSharedElementEnd(List list, List list1, List list2)
    {
        val$searchIcon.animate().alpha(1.0F).setDuration(val$mediumAnimTime).start();
        val$searchItem.setAlpha(1.0F);
    }

    ()
    {
        this$0 = final_smoothnavigator;
        val$searchIcon = view;
        val$mediumAnimTime = i;
        val$searchItem = View.this;
        super();
    }
}
