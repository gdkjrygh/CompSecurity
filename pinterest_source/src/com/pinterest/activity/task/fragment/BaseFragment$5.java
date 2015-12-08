// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.fragment;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.task.fragment:
//            BaseFragment

class this._cls0
    implements android.view.kListener
{

    final BaseFragment this$0;

    public boolean onLongClick(View view)
    {
        CharSequence charsequence = _actionBar.getTitle();
        if (charsequence != null)
        {
            view = Toast.makeText(view.getContext(), String.valueOf(charsequence), 1);
            view.setGravity(51, 72, Constants.ACTIONBAR_HEIGHT);
            view.show();
            return true;
        } else
        {
            return false;
        }
    }

    _cls9()
    {
        this$0 = BaseFragment.this;
        super();
    }
}
