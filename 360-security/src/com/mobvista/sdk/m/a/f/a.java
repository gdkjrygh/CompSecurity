// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public final class a
{

    public static Bitmap a(String s)
    {
        Bitmap bitmap;
        Object obj;
        android.graphics.BitmapFactory.Options options;
        obj = null;
        bitmap = null;
        if (!com.mobvista.sdk.m.a.a.b.a.a(s))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        bitmap = BitmapFactory.decodeFile(s, options);
        return bitmap;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        outofmemoryerror.printStackTrace();
        System.gc();
        String s1 = obj;
        try
        {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        s1 = obj;
        s = BitmapFactory.decodeFile(s, options);
        s1 = s;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        return s;
        s;
        s.printStackTrace();
        return null;
    }
}
