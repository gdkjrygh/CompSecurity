// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class s
    implements android.view.View.OnClickListener
{

    final ContactCardFragment a;

    s(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void onClick(View view)
    {
        ContactCardFragment.d(a).a(c.l, a.p());
    }
}
