// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.view.View;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXContinueBar

class this._cls0
    implements android.view.ner
{

    final NUXContinueBar this$0;

    public void onClick(View view)
    {
        if (_continueBt.isEnabled() && _continueBt.getVisibility() == 0)
        {
            _continueListener.nextFragment();
        }
    }

    tListener()
    {
        this$0 = NUXContinueBar.this;
        super();
    }
}
