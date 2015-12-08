// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.skype.Contact;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactDeleteNumberDialog

final class val.index
    implements android.content.ner
{

    final ContactDeleteNumberDialog this$0;
    final int val$index;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1 && ContactDeleteNumberDialog.access$000(ContactDeleteNumberDialog.this).setPhoneNumber(val$index, "", ""))
        {
            getActivity().finish();
        }
    }

    ()
    {
        this$0 = final_contactdeletenumberdialog;
        val$index = I.this;
        super();
    }
}
