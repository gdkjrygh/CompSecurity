// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;

// Referenced classes of package com.c.b:
//            az, aw, ba, ap

final class n extends az
{

    private static final UriMatcher a;
    private final Context b;

    n(Context context)
    {
        b = context;
    }

    public final boolean a(aw aw1)
    {
        Uri uri = aw1.d;
        return "content".equals(uri.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && a.match(aw1.d) != -1;
    }

    public final ba b(aw aw1)
    {
        Uri uri;
        ContentResolver contentresolver;
        contentresolver = b.getContentResolver();
        uri = aw1.d;
        aw1 = uri;
        a.match(uri);
        JVM INSTR tableswitch 1 4: default 52
    //                   1 76
    //                   2 133
    //                   3 106
    //                   4 133;
           goto _L1 _L2 _L3 _L4 _L3
_L3:
        break MISSING_BLOCK_LABEL_133;
_L1:
        throw new IllegalStateException((new StringBuilder("Invalid uri: ")).append(uri).toString());
_L2:
        uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
        aw1 = uri;
        if (uri != null) goto _L4; else goto _L5
_L5:
        aw1 = null;
_L6:
        if (aw1 != null)
        {
            return new ba(aw1, ap.b);
        } else
        {
            return null;
        }
_L4:
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            aw1 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, aw1);
        } else
        {
            aw1 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, aw1, true);
        }
          goto _L6
        aw1 = contentresolver.openInputStream(uri);
          goto _L6
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        a = urimatcher;
        urimatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        a.addURI("com.android.contacts", "contacts/#/photo", 2);
        a.addURI("com.android.contacts", "contacts/#", 3);
        a.addURI("com.android.contacts", "display_photo/#", 4);
    }
}
