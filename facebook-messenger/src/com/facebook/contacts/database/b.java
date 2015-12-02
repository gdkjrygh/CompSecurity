// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;


// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner

class b
    implements Runnable
{

    final AddressBookPeriodicRunner a;

    b(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        a = addressbookperiodicrunner;
        super();
    }

    public void run()
    {
        a.e();
        a.f();
    }
}
