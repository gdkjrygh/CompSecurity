// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;

// Referenced classes of package com.actionbarsherlock.widget:
//            ActivityChooserView

class this._cls0
    implements android.view.balLayoutListener
{

    final ActivityChooserView this$0;

    public void onGlobalLayout()
    {
        if (isShowingPopup())
        {
            if (!isShown())
            {
                ActivityChooserView.access$100(ActivityChooserView.this).dismiss();
            } else
            {
                ActivityChooserView.access$100(ActivityChooserView.this).show();
                if (mProvider != null)
                {
                    mProvider.subUiVisibilityChanged(true);
                    return;
                }
            }
        }
    }

    indow()
    {
        this$0 = ActivityChooserView.this;
        super();
    }
}
