// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.a;

import android.hardware.Camera;
import android.net.Uri;
import android.util.Log;
import com.fitbit.FitBitApplication;
import com.fitbit.food.barcode.c.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.fitbit.food.barcode.a:
//            e, h

public abstract class l
    implements e
{

    private static final String a = "S3UploadablePhotoCallback";
    private String b;
    private h c;

    public l(h h1, String s)
    {
        b = s;
        c = h1;
    }

    public abstract void a(Exception exception);

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        if (c == null || abyte0 == null || b == null) goto _L2; else goto _L1
_L1:
        Log.i("S3UploadablePhotoCallback", (new StringBuilder()).append("Receive data from camera, length = ").append(abyte0.length).toString());
        Log.i("S3UploadablePhotoCallback", (new StringBuilder()).append("Free memory = ").append(Runtime.getRuntime().freeMemory()).toString());
        camera = new File(com.fitbit.food.barcode.c.b.a(FitBitApplication.a()), b);
        FileOutputStream fileoutputstream = new FileOutputStream(camera);
        fileoutputstream.write(abyte0);
        fileoutputstream.flush();
        fileoutputstream.close();
_L4:
        abyte0 = Uri.fromFile(camera);
        c.a(abyte0);
_L2:
        return;
        abyte0;
        try
        {
            Log.w("S3UploadablePhotoCallback", "Exception when closing output stream", abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("S3UploadablePhotoCallback", "Exception when creating FileOutputStream", abyte0);
        }
        continue; /* Loop/switch isn't completed */
        abyte0;
        Log.e("S3UploadablePhotoCallback", "Exception when writing data to output stream", abyte0);
        fileoutputstream.close();
        continue; /* Loop/switch isn't completed */
        abyte0;
        Log.w("S3UploadablePhotoCallback", "Exception when closing output stream", abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        fileoutputstream.close();
_L5:
        throw abyte0;
        IOException ioexception;
        ioexception;
        Log.w("S3UploadablePhotoCallback", "Exception when closing output stream", ioexception);
          goto _L5
    }
}
