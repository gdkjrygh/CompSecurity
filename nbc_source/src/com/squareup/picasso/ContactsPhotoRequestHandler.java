// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Request

class ContactsPhotoRequestHandler extends RequestHandler
{
    private static class ContactPhotoStreamIcs
    {

        static InputStream get(ContentResolver contentresolver, Uri uri)
        {
            return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
        }

        private ContactPhotoStreamIcs()
        {
        }
    }


    private static final int ID_CONTACT = 3;
    private static final int ID_DISPLAY_PHOTO = 4;
    private static final int ID_LOOKUP = 1;
    private static final int ID_THUMBNAIL = 2;
    private static final UriMatcher matcher;
    private final Context context;

    ContactsPhotoRequestHandler(Context context1)
    {
        context = context1;
    }

    private InputStream getInputStream(Request request)
        throws IOException
    {
        ContentResolver contentresolver = context.getContentResolver();
        Uri uri = request.uri;
        request = uri;
        switch (matcher.match(uri))
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid uri: ").append(uri).toString());

        case 1: // '\001'
            uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
            request = uri;
            if (uri == null)
            {
                return null;
            }
            // fall through

        case 3: // '\003'
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, request);
            } else
            {
                return ContactPhotoStreamIcs.get(contentresolver, request);
            }

        case 2: // '\002'
        case 4: // '\004'
            return contentresolver.openInputStream(uri);
        }
    }

    public boolean canHandleRequest(Request request)
    {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && matcher.match(request.uri) != -1;
    }

    public RequestHandler.Result load(Request request, int i)
        throws IOException
    {
        request = getInputStream(request);
        if (request != null)
        {
            return new RequestHandler.Result(request, Picasso.LoadedFrom.DISK);
        } else
        {
            return null;
        }
    }

    static 
    {
        matcher = new UriMatcher(-1);
        matcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        matcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        matcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        matcher.addURI("com.android.contacts", "contacts/#", 3);
        matcher.addURI("com.android.contacts", "display_photo/#", 4);
    }
}
