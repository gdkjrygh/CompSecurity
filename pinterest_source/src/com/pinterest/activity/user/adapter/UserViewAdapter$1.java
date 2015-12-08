// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.adapter;

import android.view.View;
import com.pinterest.activity.task.fragment.BaseFragment;

// Referenced classes of package com.pinterest.activity.user.adapter:
//            UserViewAdapter

class lViewListener extends com.pinterest.ui.scrollview.ew.ScrollViewListener
{

    final UserViewAdapter this$0;
    final BaseFragment val$fragment;

    public void onScroll(View view, int i, int j, int k, int l)
    {
        if (val$fragment.isActive())
        {
            UserViewAdapter.access$000(UserViewAdapter.this).onChildScrolled(j);
        }
    }

    ildListener()
    {
        this$0 = final_userviewadapter;
        val$fragment = BaseFragment.this;
        super();
    }
}
