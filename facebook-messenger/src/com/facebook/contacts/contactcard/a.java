// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.app.Dialog;
import com.facebook.widget.text.f;

// Referenced classes of package com.facebook.contacts.contactcard:
//            BlockContactDialogFragment, f

class a extends f
{

    final BlockContactDialogFragment a;

    a(BlockContactDialogFragment blockcontactdialogfragment)
    {
        a = blockcontactdialogfragment;
        super();
    }

    public void a()
    {
        BlockContactDialogFragment.a(a).c(a);
        if (BlockContactDialogFragment.b(a) != null)
        {
            BlockContactDialogFragment.b(a).dismiss();
        }
    }
}
