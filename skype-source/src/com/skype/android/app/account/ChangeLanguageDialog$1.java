// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.DialogInterface;
import com.skype.Account;
import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.account:
//            ChangeLanguageDialog

final class this._cls0
    implements android.content.Listener
{

    final ChangeLanguageDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = ChangeLanguageDialog.access$000(ChangeLanguageDialog.this, i);
        if (dialoginterface != null)
        {
            account.setStrProperty(PROPKEY.CONTACT_LANGUAGES, dialoginterface);
            account.setServersideStrProperty(PROPKEY.CONTACT_LANGUAGES, dialoginterface);
            dismiss();
        }
    }

    ()
    {
        this$0 = ChangeLanguageDialog.this;
        super();
    }
}
