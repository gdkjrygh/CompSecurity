// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.DialogInterface;
import android.os.Bundle;

// Referenced classes of package com.skype.android.app.settings:
//            DeletePhoneDialogFragment

final class this._cls0
    implements android.content.ner
{

    final DeletePhoneDialogFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (DeletePhoneDialogFragment.access$000(DeletePhoneDialogFragment.this) != null)
        {
            DeletePhoneDialogFragment.access$000(DeletePhoneDialogFragment.this).onDeletePhoneNumber((com.skype.android.app.shortcircuit..AliasInfo)getArguments().getSerializable("alias"));
        }
    }

    honeCallback()
    {
        this$0 = DeletePhoneDialogFragment.this;
        super();
    }
}
