// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class i
    implements Callable
{

    final String a;
    final ContactCardFragment b;

    i(ContactCardFragment contactcardfragment, String s)
    {
        b = contactcardfragment;
        a = s;
        super();
    }

    public Uri a()
    {
        Uri uri = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, Uri.encode(a));
        return android.provider.ContactsContract.Contacts.lookupContact(b.n().getContentResolver(), uri);
    }

    public Object call()
    {
        return a();
    }
}
