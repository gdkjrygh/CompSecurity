// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.androidquery.callback.BitmapAjaxCallback;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import java.io.File;

public class GalleryBitmapAjaxCallback extends BitmapAjaxCallback
{

    private Context i;

    public GalleryBitmapAjaxCallback()
    {
    }

    protected Object a(String s, File file, com.androidquery.callback.a a1)
    {
        return b(s, file, a1);
    }

    protected Bitmap b(String s, File file, com.androidquery.callback.a a1)
    {
        s = super.b(s, file, a1);
        file = Uri.fromFile(file);
        float f1 = k.a(i, file);
        try
        {
            file = com.cardinalblue.android.b.a.a(s, f1, 2);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            f.a(file);
            return s;
        }
        return file;
    }

    public GalleryBitmapAjaxCallback c(Context context)
    {
        i = context.getApplicationContext();
        return this;
    }
}
