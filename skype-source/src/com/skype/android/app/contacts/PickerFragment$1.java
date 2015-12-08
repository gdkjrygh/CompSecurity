// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import com.skype.android.app.data.DataAdapter;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

final class this._cls0
    implements android.view.ner
{

    final PickerFragment this$0;

    public final void onClick(View view)
    {
        view = PickerFragment.access$000(PickerFragment.this).getCheckedState(0);
        onConfirm(getSelectedItems(view));
    }

    ()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
