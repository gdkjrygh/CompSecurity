// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Environment;
import com.tinder.e.ah;
import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.tinder.utils:
//            v

public final class m
{

    public static boolean a(File file)
    {
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        String as[];
        int i;
        as = file.list();
        i = 0;
_L5:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(new File(file, as[i]))) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return file.delete();
    }

    // Unreferenced inner class com/tinder/utils/m$1

/* anonymous class */
    public static final class _cls1
        implements e.c
    {

        final ah a;

        public final void a(Object obj)
        {
            if (((Boolean)obj).booleanValue())
            {
                a.a();
                return;
            } else
            {
                a.b();
                return;
            }
        }

            public 
            {
                a = ah1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/utils/m$2

/* anonymous class */
    public static final class _cls2
        implements e.a
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
                c.compress(android.graphics.Bitmap.CompressFormat.JPEG, d, fileoutputstream);
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

            public 
            {
                a = s;
                b = s1;
                c = bitmap;
                e = context;
                super();
            }
    }

}
