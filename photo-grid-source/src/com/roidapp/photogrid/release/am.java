// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.crop.a;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.photogrid.release:
//            BackgroundImageCrop

public final class am
    implements Runnable
{

    protected String a;
    final BackgroundImageCrop b;

    public am(BackgroundImageCrop backgroundimagecrop)
    {
        b = backgroundimagecrop;
        super();
        a = "";
    }

    public final void run()
    {
        Object obj;
        Object obj2;
        Object obj4;
        Object obj5;
        a = ImageLibrary.a().b(BackgroundImageCrop.h(b));
        obj = (new StringBuilder()).append(a);
        ImageLibrary.a();
        a = ((StringBuilder) (obj)).append(ImageLibrary.g()).toString();
        obj = new File(a);
        if (((File) (obj)).exists() && ((File) (obj)).isDirectory())
        {
            String as[] = ((File) (obj)).list();
            if (as != null)
            {
                for (int i = 0; i < as.length; i++)
                {
                    File file = new File((new StringBuilder()).append(a).append(File.separator).append(as[i]).toString());
                    if (file.isFile())
                    {
                        file.delete();
                    }
                }

            }
        }
        obj5 = (new StringBuilder(".PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        obj4 = null;
        as = null;
        obj2 = null;
        Object obj1 = BackgroundImageCrop.i(b).c(BackgroundImageCrop.b(b));
        obj2 = obj1;
        obj4 = obj1;
        as = ((String []) (obj1));
        if (BackgroundImageCrop.i(b).d == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj2 = obj1;
        obj4 = obj1;
        as = ((String []) (obj1));
        c.a(BackgroundImageCrop.b(b));
        obj2 = obj1;
        obj4 = obj1;
        as = ((String []) (obj1));
        obj5 = d.a(((android.graphics.Bitmap) (obj1)), a, ((String) (obj5)), android.graphics.Bitmap.CompressFormat.JPEG);
        c.a(((android.graphics.Bitmap) (obj1)));
        System.gc();
        as = Message.obtain(BackgroundImageCrop.g(b), 3, 0, 0, obj5);
        BackgroundImageCrop.g(b).sendMessage(as);
        return;
        obj1;
        as = null;
_L4:
        c.a(as);
        System.gc();
        BackgroundImageCrop.g(b).obtainMessage(5, new OutOfMemoryError("Out Of Memory")).sendToTarget();
        ((OutOfMemoryError) (obj1)).printStackTrace();
        c.a(as);
        System.gc();
        return;
        obj1;
        as = ((String []) (obj2));
        BackgroundImageCrop.g(b).obtainMessage(5, new IOException("IOException")).sendToTarget();
        as = ((String []) (obj2));
        ((IOException) (obj1)).printStackTrace();
        c.a(((android.graphics.Bitmap) (obj2)));
        System.gc();
        return;
        obj1;
        as = ((String []) (obj4));
        ((Exception) (obj1)).printStackTrace();
        as = ((String []) (obj4));
        BackgroundImageCrop.g(b).obtainMessage(5, new Exception("")).sendToTarget();
        c.a(((android.graphics.Bitmap) (obj4)));
        System.gc();
        return;
        Object obj3;
        obj3;
        obj1 = as;
        as = ((String []) (obj3));
_L2:
        c.a(((android.graphics.Bitmap) (obj1)));
        System.gc();
        throw as;
        obj3;
        obj1 = as;
        as = ((String []) (obj3));
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        as = ((String []) (obj1));
        obj1 = obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
