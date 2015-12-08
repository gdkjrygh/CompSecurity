// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

class ge
{

    ge()
    {
    }

    public Bitmap a(File file)
    {
        ((WindowManager)ct.u().getSystemService("window")).getDefaultDisplay().getMetrics(new DisplayMetrics());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = false;
        options.inPurgeable = true;
        file = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (ct.I() != 1.0F)
        {
            Bitmap bitmap = Bitmap.createScaledBitmap(file, Math.max(1, Math.round((float)file.getWidth() * ct.I())), Math.max(1, Math.round((float)file.getHeight() * ct.I())), true);
            file.recycle();
            return bitmap;
        } else
        {
            return file;
        }
    }
}
