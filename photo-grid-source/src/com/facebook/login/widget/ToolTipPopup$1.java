// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import android.widget.PopupWindow;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.login.widget:
//            ToolTipPopup

class this._cls0
    implements android.view.r.OnScrollChangedListener
{

    final ToolTipPopup this$0;

    public void onScrollChanged()
    {
label0:
        {
            if (ToolTipPopup.access$000(ToolTipPopup.this).get() != null && ToolTipPopup.access$100(ToolTipPopup.this) != null && ToolTipPopup.access$100(ToolTipPopup.this).isShowing())
            {
                if (!ToolTipPopup.access$100(ToolTipPopup.this).isAboveAnchor())
                {
                    break label0;
                }
                ToolTipPopup.access$200(ToolTipPopup.this).showBottomArrow();
            }
            return;
        }
        ToolTipPopup.access$200(ToolTipPopup.this).showTopArrow();
    }

    pupContentView()
    {
        this$0 = ToolTipPopup.this;
        super();
    }
}
