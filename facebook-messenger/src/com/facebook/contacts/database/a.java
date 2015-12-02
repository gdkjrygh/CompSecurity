// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;


// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner

class a
    implements Runnable
{

    final boolean a;
    final AddressBookPeriodicRunner b;

    a(AddressBookPeriodicRunner addressbookperiodicrunner, boolean flag)
    {
        b = addressbookperiodicrunner;
        a = flag;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}
