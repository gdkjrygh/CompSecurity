// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.widget.CompoundButton;
import android.widget.RadioButton;

// Referenced classes of package com.skype.android.app.settings:
//            BinaryDialogPreference

final class this._cls0
    implements android.widget.hangeListener
{

    final BinaryDialogPreference this$0;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!flag || compoundbutton.getId() != 0x7f10052b) goto _L2; else goto _L1
_L1:
        BinaryDialogPreference.access$000(BinaryDialogPreference.this).setChecked(false);
_L4:
        BinaryDialogPreference.access$200(BinaryDialogPreference.this);
        return;
_L2:
        if (flag && compoundbutton.getId() == 0x7f10052f)
        {
            BinaryDialogPreference.access$100(BinaryDialogPreference.this).setChecked(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = BinaryDialogPreference.this;
        super();
    }
}
