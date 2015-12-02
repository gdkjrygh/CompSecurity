// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.contacts.picker.ad;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.v;
import com.facebook.debug.log.b;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ContactMultipickerFragment, az

class a
    implements v
{

    final ContactMultipickerFragment a;

    a(ContactMultipickerFragment contactmultipickerfragment)
    {
        a = contactmultipickerfragment;
        super();
    }

    public ad a(Object obj)
    {
        if (!(obj instanceof UserWithIdentifier))
        {
            b.d(ContactMultipickerFragment.R(), (new StringBuilder()).append("unexpected rowData of type: ").append(obj.getClass()).toString());
            throw new IllegalArgumentException();
        }
        obj = (UserWithIdentifier)obj;
        if (((Boolean)ContactMultipickerFragment.a(a).b()).booleanValue())
        {
            return com.facebook.orca.contacts.picker.ContactMultipickerFragment.b(a).b(((UserWithIdentifier) (obj)), ah.AUTO_COMPLETE);
        } else
        {
            return com.facebook.orca.contacts.picker.ContactMultipickerFragment.b(a).a(((UserWithIdentifier) (obj)), ah.AUTO_COMPLETE);
        }
    }
}
