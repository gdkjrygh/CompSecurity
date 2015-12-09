// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.callback.a;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

class j extends BitmapAjaxCallback
{

    final f i;
    final ImageView j;
    final k k;

    protected void a(String s, ImageView imageview, Bitmap bitmap, a a1)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        } else
        if (i != null)
        {
            i.a(j, k.k);
            return;
        }
    }

    ( , f f1, ImageView imageview)
    {
        k = ;
        i = f1;
        j = imageview;
        super();
    }
}
