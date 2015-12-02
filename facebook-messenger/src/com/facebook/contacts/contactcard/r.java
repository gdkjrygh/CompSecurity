// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;
import com.facebook.zero.a.c;
import com.facebook.zero.ui.l;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class r
    implements android.view.View.OnClickListener
{

    final ContactCardFragment a;

    r(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void onClick(View view)
    {
        ContactCardFragment.a(a, "goto_timeline");
        ContactCardFragment.d(a).a(c.g, a.p());
    }
}
