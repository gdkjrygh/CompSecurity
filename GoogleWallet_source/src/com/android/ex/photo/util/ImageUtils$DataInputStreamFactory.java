// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.android.ex.photo.util:
//            ImageUtils

static final class <init> extends <init>
{

    private byte mData[];

    private static byte[] parseDataUri(Uri uri)
    {
        uri = uri.getSchemeSpecificPart();
        if (uri.startsWith("base64,"))
        {
            return Base64.decode(uri.substring(7), 8);
        }
        if (!ImageUtils.access$000().matcher(uri).matches())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        uri = Base64.decode(uri.substring(uri.indexOf("base64,") + 7), 0);
        return uri;
        uri;
        uri = String.valueOf(uri);
        Log.e("ImageUtils", (new StringBuilder(String.valueOf(uri).length() + 21)).append("Mailformed data URI: ").append(uri).toString());
        return null;
    }

    public final InputStream createInputStream()
        throws FileNotFoundException
    {
        if (mData == null)
        {
            mData = parseDataUri(mUri);
            if (mData == null)
            {
                return super.createInputStream();
            }
        }
        return new ByteArrayInputStream(mData);
    }

    public A(ContentResolver contentresolver, Uri uri)
    {
        super(contentresolver, uri);
    }
}
