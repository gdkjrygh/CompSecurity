// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class bfv extends mtf
{

    private final bdo a;

    public bfv(bdo bdo1)
    {
        super("ComputeResultImageTask");
        a = bdo1;
    }

    public static void a(Bitmap bitmap, String s)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(s);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, fileoutputstream);
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        fileoutputstream.close();
        return;
        s;
        fileoutputstream = null;
_L2:
        if (bitmap != null)
        {
            bitmap.recycle();
        }
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final mue a(Context context)
    {
        noz noz1 = noz.a(context, "ComputeResultImageTask", new String[0]);
        String s1;
        bdt bdt1;
        try
        {
            s1 = File.createTempFile("consumereditor_out", ".jpg", context.getCacheDir()).getAbsolutePath();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        bdt1 = a.b();
        if (bdt1 == null || bdt1.a == null)
        {
            return new mue(false);
        }
        Bitmap bitmap = bdt1.a;
        context = bitmap;
        if (a.n > 0)
        {
            context = bitmap;
            if (a.o > 0)
            {
                Bitmap bitmap1 = Bitmap.createScaledBitmap(bdt1.a, a.n, a.o, false);
                context = bitmap1;
                if (bdt1.a != null)
                {
                    context = bitmap1;
                    if (bdt1.a != bitmap1)
                    {
                        bdt1.a.recycle();
                        bdt1.a = null;
                        context = bitmap1;
                    }
                }
            }
        }
        try
        {
            a(((Bitmap) (context)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (noz1.a())
            {
                String s = String.valueOf(s1);
                if (s.length() != 0)
                {
                    "Error saving bitmap to file:".concat(s);
                } else
                {
                    new String("Error saving bitmap to file:");
                }
            }
            return new mue(0, context, null);
        }
        context = new mue(true);
        context.a().putString("saved_file_path", s1);
        context.a().putByteArray("edit_list_bytes", bdt1.b);
        return context;
    }
}
