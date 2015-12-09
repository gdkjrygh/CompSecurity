// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Utils, Request

final class ContactsPhotoRequestHandler extends RequestHandler
{
    static final class ContactPhotoStreamIcs
    {

        static InputStream get(ContentResolver contentresolver, Uri uri)
        {
            return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
        }
    }


    private static final UriMatcher matcher;
    final Context context;

    ContactsPhotoRequestHandler(Context context1)
    {
        context = context1;
    }

    private Bitmap decodeStream(InputStream inputstream, Request request)
        throws IOException
    {
        InputStream inputstream1;
        android.graphics.BitmapFactory.Options options;
        if (inputstream == null)
        {
            return null;
        }
        options = createBitmapOptions(request);
        if (!requiresInSampleSize(options))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        inputstream1 = getInputStream(request);
        BitmapFactory.decodeStream(inputstream1, null, options);
        Utils.closeQuietly(inputstream1);
        calculateInSampleSize(request.targetWidth, request.targetHeight, options, request);
        return BitmapFactory.decodeStream(inputstream, null, options);
        inputstream;
        Utils.closeQuietly(inputstream1);
        throw inputstream;
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
            throw new IllegalStateException((new StringBuilder("Invalid uri: ")).append(uri).toString());

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

    public final boolean canHandleRequest(Request request)
    {
        request = request.uri;
        return "content".equals(request.getScheme()) && android.provider.ContactsContract.Contacts.CONTENT_URI.getHost().equals(request.getHost()) && !request.getPathSegments().contains("photo");
    }

    public final RequestHandler.Result load(Request request)
        throws IOException
    {
        InputStream inputstream = null;
        InputStream inputstream1 = getInputStream(request);
        inputstream = inputstream1;
        request = new RequestHandler.Result(decodeStream(inputstream1, request), Picasso.LoadedFrom.DISK);
        Utils.closeQuietly(inputstream1);
        return request;
        request;
        Utils.closeQuietly(inputstream);
        throw request;
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        matcher = urimatcher;
        urimatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        matcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        matcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        matcher.addURI("com.android.contacts", "contacts/#", 3);
        matcher.addURI("com.android.contacts", "display_photo/#", 4);
    }
}
