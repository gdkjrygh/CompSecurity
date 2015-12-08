// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.chromium.content.browser.input:
//            SelectPopupDropdown

class this._cls0
    implements android.widget.kListener
{

    final SelectPopupDropdown this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SelectPopupDropdown.access$000(SelectPopupDropdown.this, new int[] {
            i
        });
        hide();
    }

    ()
    {
        this$0 = SelectPopupDropdown.this;
        super();
    }
}
