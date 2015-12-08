// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.tinder.utils:
//            m, v

public static final class t>
    implements t>
{

    final String a;
    final String b;
    final Bitmap c;
    final int d = 100;
    final Context e;

    public final Object a()
    {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), a);
        file.mkdirs();
        file = new File(file, (new StringBuilder()).append(b).append(".jpeg").toString());
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            c.compress(android.graphics.ap.CompressFormat.JPEG, d, fileoutputstream);
            fileoutputstream.close();
            MediaScannerConnection.scanFile(e, new String[] {
                file.getPath()
            }, new String[] {
                "image/jpeg"
            }, null);
        }
        catch (Exception exception)
        {
            v.b(exception.toString());
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(true);
    }

    public xt(String s, String s1, Bitmap bitmap, Context context)
    {
        a = s;
        b = s1;
        c = bitmap;
        e = context;
        super();
    }
}
