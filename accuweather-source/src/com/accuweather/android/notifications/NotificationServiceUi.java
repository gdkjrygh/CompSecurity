// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.notifications;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Environment;
import com.accuweather.android.utilities.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

// Referenced classes of package com.accuweather.android.notifications:
//            NotificationService

public class NotificationServiceUi
{

    public NotificationServiceUi()
    {
    }

    public static Bitmap buildBitmap(Context context, int i, boolean flag)
    {
        Bitmap bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), i), (int)context.getResources().getDimension(com.accuweather.android.R.dimen.notification_large_icon_height), (int)context.getResources().getDimension(com.accuweather.android.R.dimen.notification_large_icon_width), false);
        Canvas canvas;
        Bitmap bitmap1;
        Matrix matrix;
        try
        {
            bitmap = convertToMutableBitmap(bitmap);
            canvas = new Canvas(bitmap);
            canvas.drawBitmap(bitmap, new Matrix(), null);
        }
        catch (IOException ioexception)
        {
            Logger.e(com/accuweather/android/notifications/NotificationService.getName(), "Error in buildBitmap", ioexception);
            return BitmapFactory.decodeResource(context.getResources(), i);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        bitmap1 = BitmapFactory.decodeResource(context.getResources(), com.accuweather.android.R.drawable.alert_img);
        matrix = new Matrix();
        matrix.preTranslate(bitmap.getWidth() - bitmap1.getWidth(), 0.0F);
        matrix.postScale(0.4691358F, 0.4691358F);
        canvas.drawBitmap(bitmap1, matrix, null);
        return bitmap;
    }

    private static Bitmap convertToMutableBitmap(Bitmap bitmap)
        throws IOException
    {
        File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append("temp.tmp").toString());
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        FileChannel filechannel = randomaccessfile.getChannel();
        MappedByteBuffer mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, bitmap.getRowBytes() * j);
        bitmap.copyPixelsToBuffer(mappedbytebuffer);
        bitmap = Bitmap.createBitmap(i, j, config);
        mappedbytebuffer.position(0);
        bitmap.copyPixelsFromBuffer(mappedbytebuffer);
        filechannel.close();
        randomaccessfile.close();
        file.delete();
        return bitmap;
    }
}
