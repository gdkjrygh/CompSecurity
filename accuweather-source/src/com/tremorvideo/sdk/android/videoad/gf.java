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

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

class gf
{

    gf()
    {
    }

    public Bitmap a(byte abyte0[])
    {
        ((WindowManager)ct.u().getSystemService("window")).getDefaultDisplay().getMetrics(new DisplayMetrics());
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = false;
        options.inPurgeable = true;
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        if (ct.I() != 1.0F)
        {
            Bitmap bitmap = Bitmap.createScaledBitmap(abyte0, Math.max(1, Math.round((float)abyte0.getWidth() * ct.I())), Math.max(1, Math.round((float)abyte0.getHeight() * ct.I())), true);
            abyte0.recycle();
            return bitmap;
        } else
        {
            return abyte0;
        }
    }
}
