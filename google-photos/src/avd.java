// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class avd
    implements ank
{

    private static anf a = anf.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    private static anf b = anf.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public avd()
    {
    }

    private boolean a(aqa aqa1, File file, ani ani1)
    {
        boolean flag1;
        Bitmap bitmap = (Bitmap)aqa1.b();
        long l = bac.a();
        aqa1 = (android.graphics.Bitmap.CompressFormat)ani1.a(b);
        double d;
        int i;
        if (aqa1 == null)
        {
            if (bitmap.hasAlpha())
            {
                aqa1 = android.graphics.Bitmap.CompressFormat.PNG;
            } else
            {
                aqa1 = android.graphics.Bitmap.CompressFormat.JPEG;
            }
        }
        i = ((Integer)ani1.a(a)).intValue();
        flag1 = false;
        file = new FileOutputStream(file);
        bitmap.compress(aqa1, i, file);
        file.close();
        boolean flag = true;
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (Log.isLoggable("BitmapEncoder", 2))
        {
            aqa1 = String.valueOf(aqa1);
            i = bag.a(bitmap);
            d = bac.a(l);
            (new StringBuilder(String.valueOf(aqa1).length() + 70)).append("Compressed with type: ").append(aqa1).append(" of size ").append(i).append(" in ").append(d);
        }
        return flag;
        file;
        file = null;
_L4:
        flag = flag1;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            flag = flag1;
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        break MISSING_BLOCK_LABEL_79;
        aqa1;
        file = null;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw aqa1;
        aqa1;
        if (true) goto _L2; else goto _L1
_L1:
        ani1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final anb a(ani ani1)
    {
        return anb.b;
    }

    public final volatile boolean a(Object obj, File file, ani ani1)
    {
        return a((aqa)obj, file, ani1);
    }

}
