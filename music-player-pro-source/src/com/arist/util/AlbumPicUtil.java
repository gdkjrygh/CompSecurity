// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import com.arist.MusicPlayer.MyApplication;
import com.arist.entity.Music;

// Referenced classes of package com.arist.util:
//            BitmapService, Constant

public class AlbumPicUtil
{

    public AlbumPicUtil()
    {
    }

    public static Bitmap createReflectedImage(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        Object obj = new Matrix();
        ((Matrix) (obj)).preScale(1.0F, -1F);
        Object obj1 = Bitmap.createBitmap(bitmap, 0, j / 2, i, j / 2, ((Matrix) (obj)), false);
        obj = Bitmap.createBitmap(i, j / 2 + j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        Paint paint = new Paint();
        canvas.drawRect(0.0F, j, i, j + 4, paint);
        canvas.drawBitmap(((Bitmap) (obj1)), 0.0F, j + 4, null);
        obj1 = new Paint();
        ((Paint) (obj1)).setShader(new LinearGradient(0.0F, bitmap.getHeight(), 0.0F, ((Bitmap) (obj)).getHeight() + 4, 0x70ffffff, 0xffffff, android.graphics.Shader.TileMode.MIRROR));
        ((Paint) (obj1)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0F, j, i, ((Bitmap) (obj)).getHeight() + 4, ((Paint) (obj1)));
        return ((Bitmap) (obj));
    }

    public static String getAlbumArtString(Context context, String s)
    {
        Cursor cursor;
        try
        {
            cursor = context.getContentResolver().query(Uri.parse((new StringBuilder(String.valueOf("content://media/external/audio/albums"))).append("/").append(s).toString()), new String[] {
                "album_art"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        s = null;
        context = s;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        context = s;
        if (cursor.getColumnCount() > 0)
        {
            cursor.moveToNext();
            context = cursor.getString(0);
        }
        cursor.close();
        return context;
    }

    public static Bitmap getAlbumBitmap(Music music)
    {
        if (music == null)
        {
            return null;
        }
        String s = getAlbumArtString(MyApplication.context, (new StringBuilder()).append(music.getAlbumId()).toString());
        if (s != null)
        {
            return BitmapService.getBitmap(s, 90, 90);
        } else
        {
            return BitmapService.getBitmap((new StringBuilder(String.valueOf(Constant.BASE_ABLUM_PATH))).append(music.getTitle()).append("-").append(music.getAlbum()).append(".jpg").toString());
        }
    }
}
