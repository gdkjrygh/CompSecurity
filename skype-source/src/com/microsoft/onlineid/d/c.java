// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.microsoft.onlineid.internal.c.d;

public final class c
{
    public final class a
    {

        final c a;
        private final String b;
        private final String c;

        public final String a()
        {
            return b;
        }

        public final String b()
        {
            return c;
        }

        public a(String s, String s1)
        {
            a = c.this;
            super();
            b = s;
            c = s1;
        }
    }


    private final Context a;

    public c(Context context)
    {
        a = context;
    }

    final Cursor a(String as[], String s)
    {
        try
        {
            as = a.getContentResolver().query(Uri.withAppendedPath(android.provider.ContactsContract.Profile.CONTENT_URI, "data"), as, "mimetype = ?", new String[] {
                s
            }, null);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            d.b("Failed to retrieve user profile from device", as);
            return null;
        }
        return as;
    }
}
