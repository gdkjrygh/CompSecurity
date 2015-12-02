// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.view.View;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactMultipickerFragment

class e
    implements android.view.View.OnClickListener
{

    final ContactMultipickerFragment a;

    e(ContactMultipickerFragment contactmultipickerfragment)
    {
        a = contactmultipickerfragment;
        super();
    }

    public void onClick(View view)
    {
        a.c();
    }
}
