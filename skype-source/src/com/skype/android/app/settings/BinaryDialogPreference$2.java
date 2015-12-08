// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.view.View;
import android.widget.RadioButton;

// Referenced classes of package com.skype.android.app.settings:
//            BinaryDialogPreference

final class this._cls0
    implements android.view.ialogPreference._cls2
{

    final BinaryDialogPreference this$0;

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756328: 
            BinaryDialogPreference.access$100(BinaryDialogPreference.this).setChecked(true);
            return;

        case 2131756332: 
            BinaryDialogPreference.access$000(BinaryDialogPreference.this).setChecked(true);
            break;
        }
    }

    ()
    {
        this$0 = BinaryDialogPreference.this;
        super();
    }
}
