// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner

public class e
    implements b
{

    private AddressBookPeriodicRunner a;

    public e()
    {
    }

    public void a(Context context, Intent intent, c c)
    {
        g.a(context);
        a = (AddressBookPeriodicRunner)t.a(context).a(com/facebook/contacts/database/AddressBookPeriodicRunner);
        a.c();
    }
}
