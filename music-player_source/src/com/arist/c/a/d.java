// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;

public final class d
{

    public static Bitmap a(Context context)
    {
        Object obj = context.getResources().openRawResource(0x7f020037);
        context = ((Context) (obj));
        Object obj1 = new android.graphics.BitmapFactory.Options();
        context = ((Context) (obj));
        obj1.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        context = ((Context) (obj));
        obj1.inPurgeable = true;
        context = ((Context) (obj));
        obj1.inInputShareable = true;
        context = ((Context) (obj));
        obj1 = BitmapFactory.decodeStream(((java.io.InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj1)));
        a(((Closeable) (obj)));
        return ((Bitmap) (obj1));
        Object obj2;
        obj2;
        obj = null;
_L4:
        context = ((Context) (obj));
        Log.e("ImageUtil", ((Exception) (obj2)).getMessage());
        a(((Closeable) (obj)));
        return null;
        context;
        obj2 = null;
        obj = context;
_L2:
        a(((Closeable) (obj2)));
        throw obj;
        obj;
        obj2 = context;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        closeable.printStackTrace();
        return;
    }
}
