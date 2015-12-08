// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.DialogInterface;
import com.skype.Account;
import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.account:
//            ChangeGenderDialog

final class this._cls0
    implements android.content.ckListener
{

    final ChangeGenderDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        account.setIntProperty(PROPKEY.CONTACT_GENDER, i);
        account.setServersideIntProperty(PROPKEY.CONTACT_GENDER, i);
        dismiss();
    }

    ()
    {
        this$0 = ChangeGenderDialog.this;
        super();
    }
}
