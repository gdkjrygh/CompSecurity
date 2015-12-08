// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.callback.a;
import com.cardinalblue.android.piccollage.a.f;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

class j extends BitmapAjaxCallback
{

    final ImageView i;
    final com.cardinalblue.android.piccollage.lib.f j;
    final k k;

    protected void a(String s, ImageView imageview, Bitmap bitmap, a a1)
    {
        bitmap = i.getResources().getAssets().open(k.k.k(k.k));
        s = null;
        imageview = BitmapFactory.decodeStream(bitmap);
        i.setImageBitmap(imageview);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        bitmap.close();
_L2:
        return;
        s;
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            f.a(s);
        }
        if (s instanceof OutOfMemoryError)
        {
            System.gc();
        }
        if (j == null) goto _L2; else goto _L1
_L1:
        j.a(i, k.k);
        return;
        bitmap.close();
        return;
        s;
        throw s;
        imageview;
_L9:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        if (s == null) goto _L6; else goto _L5
_L5:
        bitmap.close();
_L4:
        throw imageview;
        bitmap;
        s.addSuppressed(bitmap);
        continue; /* Loop/switch isn't completed */
_L6:
        bitmap.close();
        if (true) goto _L4; else goto _L7
_L7:
        imageview;
        if (true) goto _L9; else goto _L8
_L8:
    }

    ( , ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
    {
        k = ;
        i = imageview;
        j = f1;
        super();
    }
}
