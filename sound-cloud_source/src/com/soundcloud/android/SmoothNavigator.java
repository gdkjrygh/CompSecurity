// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.soundcloud.android.discovery.SearchActivity;
import com.soundcloud.android.properties.FeatureFlags;

// Referenced classes of package com.soundcloud.android:
//            Navigator

public class SmoothNavigator extends Navigator
{

    public SmoothNavigator(FeatureFlags featureflags)
    {
        super(featureflags);
    }

    public void openSearch(Activity activity)
    {
        final View searchIcon = activity.findViewById(0x7f0f022b);
        final View searchItem = activity.findViewById(0x7f0f0229);
        final int mediumAnimTime = activity.getResources().getInteger(0x10e0001);
        searchIcon.animate().alpha(0.0F).setDuration(mediumAnimTime).start();
        searchItem.animate().alpha(0.0F).setDuration(mediumAnimTime).start();
        activity.setExitSharedElementCallback(new _cls1());
        searchIcon = ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[] {
            Pair.create(activity.findViewById(0x7f0f022c), activity.getString(0x7f07030c)), Pair.create(activity.findViewById(0x7f0f022a), activity.getString(0x7f07030b))
        });
        activity.startActivity(new Intent(activity, com/soundcloud/android/discovery/SearchActivity), searchIcon.toBundle());
    }

    private class _cls1 extends SharedElementCallback
    {

        final SmoothNavigator this$0;
        final int val$mediumAnimTime;
        final View val$searchIcon;
        final View val$searchItem;

        public void onSharedElementEnd(List list, List list1, List list2)
        {
            searchIcon.animate().alpha(1.0F).setDuration(mediumAnimTime).start();
            searchItem.setAlpha(1.0F);
        }

        _cls1()
        {
            this$0 = SmoothNavigator.this;
            searchIcon = view;
            mediumAnimTime = i;
            searchItem = view1;
            super();
        }
    }

}
