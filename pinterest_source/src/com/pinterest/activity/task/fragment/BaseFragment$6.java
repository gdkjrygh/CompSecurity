// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.fragment;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

// Referenced classes of package com.pinterest.activity.task.fragment:
//            BaseFragment

class this._cls0
    implements android.view.tener
{

    final BaseFragment this$0;

    public void onClick(View view)
    {
        view = _actionBar.getMenu().findItem(0x7f0f0506);
        if (view != null)
        {
            onActionIconClick(view);
        }
    }

    _cls9()
    {
        this$0 = BaseFragment.this;
        super();
    }
}
