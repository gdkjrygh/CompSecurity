// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.view.View;
import org.chromium.ui.base.ViewAndroidDelegate;

// Referenced classes of package org.chromium.ui:
//            DropdownPopupWindow

class this._cls0
    implements android.widget.istener
{

    final DropdownPopupWindow this$0;

    public void onDismiss()
    {
        if (DropdownPopupWindow.access$100(DropdownPopupWindow.this) != null)
        {
            DropdownPopupWindow.access$100(DropdownPopupWindow.this).onDismiss();
        }
        DropdownPopupWindow.access$000(DropdownPopupWindow.this).removeOnLayoutChangeListener(DropdownPopupWindow.access$200(DropdownPopupWindow.this));
        DropdownPopupWindow.access$000(DropdownPopupWindow.this).setTag(null);
        DropdownPopupWindow.access$300(DropdownPopupWindow.this).releaseAnchorView(DropdownPopupWindow.access$000(DropdownPopupWindow.this));
    }

    te()
    {
        this$0 = DropdownPopupWindow.this;
        super();
    }
}
