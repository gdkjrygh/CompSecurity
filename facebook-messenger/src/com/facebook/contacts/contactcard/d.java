// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.contacts.contactcard:
//            BlockContactDialogFragment, f

class d
    implements android.content.DialogInterface.OnClickListener
{

    final BlockContactDialogFragment a;

    d(BlockContactDialogFragment blockcontactdialogfragment)
    {
        a = blockcontactdialogfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        BlockContactDialogFragment.c(a);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 35
    //                   1 64;
           goto _L1 _L2 _L3
_L1:
        dialoginterface.dismiss();
        return;
_L2:
        if (BlockContactDialogFragment.a(a) != null)
        {
            BlockContactDialogFragment.a(a).a(a);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (BlockContactDialogFragment.a(a) != null)
        {
            BlockContactDialogFragment.a(a).b(a);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
