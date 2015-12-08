// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Bitmap;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package com.taplytics:
//            gs, cv

public class gr
{

    public gr()
    {
    }

    private static int a(Bitmap bitmap)
    {
        int i;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 12)
            {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
            i = bitmap.getByteCount();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            gs.b(com/taplytics/gr.getSimpleName(), bitmap);
            return 0xc3500;
        }
        return i;
    }

    public static String a(View view)
        throws JSONException
    {
        Bitmap bitmap;
        ByteArrayOutputStream bytearrayoutputstream;
        int j;
        view.setDrawingCacheEnabled(true);
        bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        bytearrayoutputstream = new ByteArrayOutputStream();
        j = view.getId();
        int i;
        i = j;
        if (j == -1)
        {
            i = 1010;
        }
        Object obj;
        if (a(bitmap) <= 0xb71b0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = android.graphics.Bitmap.CompressFormat.JPEG;
        view = (new StringBuilder()).append(String.valueOf(i)).append(".jpg").toString();
_L1:
        bitmap.compress(((android.graphics.Bitmap.CompressFormat) (obj)), 60, bytearrayoutputstream);
        obj = bytearrayoutputstream.toByteArray();
        cv.a().k.put(view, obj);
        return view;
        obj = android.graphics.Bitmap.CompressFormat.PNG;
        view = (new StringBuilder()).append(String.valueOf(i)).append(".png").toString();
          goto _L1
        Exception exception;
        exception;
        view = null;
_L3:
        gs.b("Error creating screenshot: ", exception);
        return view;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
