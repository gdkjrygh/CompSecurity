// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class eok
{

    public eok()
    {
    }

    public static Bitmap a(Uri uri, Bitmap bitmap)
    {
        int j = 0;
        int i = (new ExifInterface(uri.getPath())).getAttributeInt("Orientation", 1);
        i;
        JVM INSTR tableswitch 3 8: default 60
    //                   3 153
    //                   4 60
    //                   5 60
    //                   6 147
    //                   7 60
    //                   8 160;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        i = 0;
_L5:
        uri = new Matrix();
        uri.postRotate(i);
        bitmap.getWidth();
        bitmap.getHeight();
        IOException ioexception;
        int k;
        int l;
        if (bitmap.getWidth() >= bitmap.getHeight())
        {
            i = bitmap.getWidth() / 2;
            int i1 = bitmap.getHeight() / 2;
            k = bitmap.getHeight();
            l = bitmap.getHeight();
            j = 0;
            i -= i1;
        } else
        {
            int j1 = bitmap.getHeight() / 2 - bitmap.getWidth() / 2;
            k = bitmap.getWidth();
            l = bitmap.getWidth();
            i = j;
            j = j1;
        }
        return Bitmap.createBitmap(bitmap, i, j, k, l, uri, true);
_L3:
        i = 90;
          goto _L5
_L2:
        i = 180;
          goto _L5
_L4:
        i = 270;
          goto _L5
        ioexception;
        Logger.c("Could not access ExIf from path %s", new Object[] {
            uri.getPath()
        });
        i = 0;
          goto _L5
    }
}
