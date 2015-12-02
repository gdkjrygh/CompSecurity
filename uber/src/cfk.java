// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

final class cfk extends cgu
{

    private static final UriMatcher b;
    final Context a;

    cfk(Context context)
    {
        a = context;
    }

    private InputStream c(cgr cgr1)
    {
        ContentResolver contentresolver = a.getContentResolver();
        Uri uri = cgr1.d;
        cgr1 = uri;
        switch (b.match(uri))
        {
        default:
            throw new IllegalStateException((new StringBuilder("Invalid uri: ")).append(uri).toString());

        case 1: // '\001'
            uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
            cgr1 = uri;
            if (uri == null)
            {
                return null;
            }
            // fall through

        case 3: // '\003'
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, cgr1);
            } else
            {
                return cfl.a(contentresolver, cgr1);
            }

        case 2: // '\002'
        case 4: // '\004'
            return contentresolver.openInputStream(uri);
        }
    }

    public final boolean a(cgr cgr1)
    {
        cgr1 = cgr1.d;
        return "content".equals(cgr1.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(cgr1.getHost()) && !cgr1.getPathSegments().contains("photo");
    }

    public final cgv b(cgr cgr1)
    {
        return new cgv(c(cgr1), cgl.b);
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        b = urimatcher;
        urimatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        b.addURI("com.android.contacts", "contacts/#/photo", 2);
        b.addURI("com.android.contacts", "contacts/#", 3);
        b.addURI("com.android.contacts", "display_photo/#", 4);
    }
}
