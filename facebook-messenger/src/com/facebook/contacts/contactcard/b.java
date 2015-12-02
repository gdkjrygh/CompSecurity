// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.widget.RadioButtonWithSubtitle;
import com.facebook.widget.o;

// Referenced classes of package com.facebook.contacts.contactcard:
//            BlockContactDialogFragment

class b
    implements o
{

    final BlockContactDialogFragment a;

    b(BlockContactDialogFragment blockcontactdialogfragment)
    {
        a = blockcontactdialogfragment;
        super();
    }

    public void a(RadioButtonWithSubtitle radiobuttonwithsubtitle, boolean flag)
    {
        if (flag)
        {
            BlockContactDialogFragment.a(a, 0);
        }
    }
}
