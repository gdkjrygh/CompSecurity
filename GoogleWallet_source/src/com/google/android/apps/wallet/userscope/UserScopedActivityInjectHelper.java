// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.common.inject.ActivityModule;
import com.google.android.apps.common.inject.FragmentActivityModule;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import dagger.ObjectGraph;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            UserScopedApplication

public final class UserScopedActivityInjectHelper
{

    private ObjectGraph objectGraph;

    public UserScopedActivityInjectHelper()
    {
    }

    public final void initGraph(Activity activity, List list)
    {
        if (objectGraph == null)
        {
            list = Lists.newArrayList(list);
            list.add(new ActivityModule(activity));
            if (activity instanceof FragmentActivity)
            {
                list.add(new FragmentActivityModule((FragmentActivity)activity));
            }
            objectGraph = ((UserScopedApplication)activity.getApplication()).getUserObjectGraph().plus(list.toArray());
        }
    }

    public final void inject(Object obj)
    {
        boolean flag;
        if (objectGraph != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Must call initGraph() before requesting injection");
        objectGraph.inject(obj);
    }
}
