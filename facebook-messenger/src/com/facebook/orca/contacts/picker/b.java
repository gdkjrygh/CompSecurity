// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;


// Referenced classes of package com.facebook.orca.contacts.picker:
//            z, ContactMultipickerFragment

class b
    implements z
{

    final ContactMultipickerFragment a;

    b(ContactMultipickerFragment contactmultipickerfragment)
    {
        a = contactmultipickerfragment;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            a.O();
            return;
        } else
        {
            a.P();
            a.d();
            return;
        }
    }
}
