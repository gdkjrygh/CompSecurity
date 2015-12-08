// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package com.squareup.a:
//            bb, ax, o, bc, 
//            aq

class n extends bb
{

    private static final UriMatcher a;
    private final Context b;

    n(Context context)
    {
        b = context;
    }

    private InputStream b(ax ax1)
    {
        ContentResolver contentresolver = b.getContentResolver();
        Uri uri = ax1.d;
        ax1 = uri;
        switch (a.match(uri))
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid uri: ").append(uri).toString());

        case 1: // '\001'
            uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
            ax1 = uri;
            if (uri == null)
            {
                return null;
            }
            // fall through

        case 3: // '\003'
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, ax1);
            } else
            {
                return o.a(contentresolver, ax1);
            }

        case 2: // '\002'
        case 4: // '\004'
            return contentresolver.openInputStream(uri);
        }
    }

    public bc a(ax ax1, int i)
    {
        ax1 = b(ax1);
        if (ax1 != null)
        {
            return new bc(ax1, aq.b);
        } else
        {
            return null;
        }
    }

    public boolean a(ax ax1)
    {
        Uri uri = ax1.d;
        return "content".equals(uri.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && a.match(ax1.d) != -1;
    }

    static 
    {
        a = new UriMatcher(-1);
        a.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a.addURI("com.android.contacts", "contacts/#/photo", 2);
        a.addURI("com.android.contacts", "contacts/#", 3);
        a.addURI("com.android.contacts", "display_photo/#", 4);
    }
}
