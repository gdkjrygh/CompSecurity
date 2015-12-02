// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.e;

import android.database.Cursor;
import com.facebook.contacts.data.a;
import com.facebook.contacts.models.Contact;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.e:
//            a

public class b
    implements Closeable, Iterator
{

    private static final Class a = com/facebook/contacts/e/a;
    private final a b;
    private Cursor c;

    public b(a a1, Cursor cursor)
    {
        b = a1;
        c = cursor;
    }

    public Contact a()
    {
        if (c == null)
        {
            com.facebook.debug.log.b.b(a, "next: not initialized, skipping");
            return null;
        }
        if (!c.moveToNext())
        {
            com.facebook.debug.log.b.b(a, "next: cursor empty");
            return null;
        }
        Contact contact;
        try
        {
            contact = b.b(c.getString(0));
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("next: ").append(contact).toString());
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("next: error deserializing contact: ").append(ioexception.getMessage()).toString());
            return null;
        }
        return contact;
    }

    public void close()
    {
        com.facebook.debug.log.b.b(a, "closing");
        if (c != null)
        {
            c.close();
            c = null;
        }
    }

    public boolean hasNext()
    {
        return c != null && !c.isAfterLast();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException("DbContactIterator does not support remove()");
    }

}
