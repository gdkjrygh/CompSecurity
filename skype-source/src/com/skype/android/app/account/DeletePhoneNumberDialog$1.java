// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.skype.Account;
import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.account:
//            DeletePhoneNumberDialog

final class val.property
    implements android.content.tener
{

    final DeletePhoneNumberDialog this$0;
    final PROPKEY val$property;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1 && account.setStrProperty(val$property, ""))
        {
            account.setServersideStrProperty(val$property, "");
            getActivity().finish();
        }
    }

    ()
    {
        this$0 = final_deletephonenumberdialog;
        val$property = PROPKEY.this;
        super();
    }
}
