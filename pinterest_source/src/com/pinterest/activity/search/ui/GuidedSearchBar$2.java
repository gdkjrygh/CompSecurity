// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.View;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

class this._cls0
    implements android.view.Listener
{

    final GuidedSearchBar this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            Device.hideSoftKeyboard(view);
        }
    }

    ()
    {
        this$0 = GuidedSearchBar.this;
        super();
    }
}
