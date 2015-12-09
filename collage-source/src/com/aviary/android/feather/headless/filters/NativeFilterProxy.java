// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import android.content.Context;
import android.graphics.Bitmap;
import com.aviary.android.feather.headless.b;
import com.aviary.android.feather.headless.moa.Moa;
import com.aviary.android.feather.headless.moa.MoaResult;
import com.aviary.android.feather.headless.moa.a;
import com.aviary.android.feather.headless.moa.c;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.i;
import org.json.JSONException;

public class NativeFilterProxy
{

    private static boolean a = false;

    public NativeFilterProxy()
    {
    }

    public static MoaResult a(d d, Bitmap bitmap, Bitmap bitmap1, int j, int k)
        throws JSONException
    {
        Object obj = c.b();
        ((i) (obj)).a(j, k);
        try
        {
            d = com.aviary.android.feather.headless.moa.a.a(d, ((i) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            d.printStackTrace();
            throw d;
        }
        obj = new MoaResult();
        if (bitmap1 != null)
        {
            obj.outputBitmap = bitmap1;
        }
        obj.inputString = d;
        obj.outputString = "";
        obj.inputBitmap = bitmap;
        return ((MoaResult) (obj));
    }

    public static String a(d d)
        throws JSONException
    {
        i j = c.b();
        j.a(1, 1);
        return com.aviary.android.feather.headless.moa.a.a(d, j);
    }

    public static void a(Context context)
        throws b
    {
        com/aviary/android/feather/headless/filters/NativeFilterProxy;
        JVM INSTR monitorenter ;
        if (!a)
        {
            Moa.a(context, context.getPackageName(), android.os.Build.VERSION.SDK_INT);
            a = true;
        }
        com/aviary/android/feather/headless/filters/NativeFilterProxy;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

}
