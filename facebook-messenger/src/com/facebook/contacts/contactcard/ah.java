// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard:
//            GroupContactCardFragment, ai

class ah
    implements android.view.View.OnClickListener
{

    final GroupContactCardFragment a;

    ah(GroupContactCardFragment groupcontactcardfragment)
    {
        a = groupcontactcardfragment;
        super();
    }

    public void onClick(View view)
    {
        if (GroupContactCardFragment.a(a) != null)
        {
            GroupContactCardFragment.a(a).f();
        }
    }
}
