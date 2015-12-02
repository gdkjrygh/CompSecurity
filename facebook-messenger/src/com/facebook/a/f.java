// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;

class f
{

    private final byte a[] = null;
    private final Uri b;

    f(Uri uri)
    {
        b = uri;
    }

    Bitmap a(Context context, android.graphics.BitmapFactory.Options options)
    {
        if (a != null)
        {
            return BitmapFactory.decodeByteArray(a, 0, a.length, options);
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        context = context.getContentResolver().openInputStream(b);
        options = BitmapFactory.decodeStream(context, null, options);
        context.close();
        return options;
        options;
        context.close();
        throw options;
        throw new IllegalStateException("neither mData nor mUri are set");
    }

    android.graphics.BitmapFactory.Options a(Context context)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (a != null)
        {
            BitmapFactory.decodeByteArray(a, 0, a.length, options);
            return options;
        }
        if (b != null)
        {
            context = context.getContentResolver().openInputStream(b);
            BitmapFactory.decodeStream(context, null, options);
            context.close();
            return options;
        } else
        {
            throw new IllegalStateException("neither mData nor mUri are set");
        }
    }
}
