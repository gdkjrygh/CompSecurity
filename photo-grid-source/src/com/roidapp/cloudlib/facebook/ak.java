// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.roidapp.baselib.c.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ak
{

    private Context a;
    private Uri b;

    public ak(Context context, Uri uri)
    {
        a = context;
        b = uri;
    }

    public final x a()
    {
        Object obj;
        Object obj2;
        obj2 = null;
        obj = b.toString();
        if (!((String) (obj)).startsWith("file://")) goto _L2; else goto _L1
_L1:
        obj = new File(b.getPath());
_L9:
        Object obj1;
        obj1 = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = new FileInputStream(((File) (obj)));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((InputStream) (obj1)), null, options);
        obj = new x(obj, Integer.valueOf(Math.min(options.outWidth, options.outHeight)));
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((IOException) (obj1)).printStackTrace();
        }
        obj1 = obj;
_L4:
        return ((x) (obj1));
_L2:
        if (((String) (obj)).startsWith("content://"))
        {
            obj1 = new String[1];
            obj1[0] = "_data";
            obj = a.getContentResolver().query(b, ((String []) (obj1)), null, null, null);
            if (obj != null)
            {
                ((Cursor) (obj)).moveToFirst();
                obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex(obj1[0]));
                ((Cursor) (obj)).close();
                obj = new File(((String) (obj1)));
                continue; /* Loop/switch isn't completed */
            }
        }
        break MISSING_BLOCK_LABEL_249;
        obj;
        obj = null;
_L7:
        obj1 = obj2;
        if (obj == null) goto _L4; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return null;
        }
        return null;
        obj;
        obj1 = null;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        obj = obj1;
          goto _L7
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
