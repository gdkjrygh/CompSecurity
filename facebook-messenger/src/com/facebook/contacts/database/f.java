// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import com.facebook.backgroundtasks.a;
import com.google.common.a.fi;
import com.google.common.d.a.s;
import java.util.Set;

// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner, ContactsTaskTag

public class f extends a
{

    private final AddressBookPeriodicRunner a;

    public f(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        super("ADDRESSBOOK_SYNC");
        a = addressbookperiodicrunner;
    }

    public boolean b()
    {
        a.a(false);
        return false;
    }

    public s c()
    {
        return null;
    }

    public Set g()
    {
        return fi.b(com/facebook/contacts/database/ContactsTaskTag);
    }
}
