// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.adapter.HashtagListAdapter;
import com.pinterest.ui.text.HashTagUtils;

// Referenced classes of package com.pinterest.ui.grid.dialog:
//            PinHashtagListDialog

class this._cls0
    implements android.widget.Listener
{

    final PinHashtagListDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        HashTagUtils.gotoTarget((String)PinHashtagListDialog.access$000(PinHashtagListDialog.this).getItem(i));
        dismiss();
    }

    _cls9()
    {
        this$0 = PinHashtagListDialog.this;
        super();
    }
}
