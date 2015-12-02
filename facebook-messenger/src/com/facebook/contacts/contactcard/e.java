// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.contacts.contactcard:
//            BlockContactDialogFragment

class e
    implements android.content.DialogInterface.OnClickListener
{

    final BlockContactDialogFragment a;

    e(BlockContactDialogFragment blockcontactdialogfragment)
    {
        a = blockcontactdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
