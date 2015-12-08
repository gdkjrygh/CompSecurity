// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.filterpacks.face;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.moviemaker.filterpacks.face:
//            FaceDetector

public class a
{

    File a;
    private int b;

    static int a(a a1)
    {
        return a1.b;
    }

    public static b a()
    {
        return a(new File("/system/vendor/media/PFFprec_600.emd"));
    }

    public static a a(Context context, String s)
    {
        AssetManager assetmanager = context.getAssets();
        context = context.getFilesDir();
        String s2 = (new File(s)).getName();
        context = new File(context.getPath(), s2);
        if (!context.exists())
        {
            try
            {
                a(assetmanager.open(s, 2), ((File) (context)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                String s1 = FaceDetector.a();
                context = String.valueOf(s);
                if (context.length() != 0)
                {
                    context = "Unable to unpack: ".concat(context);
                } else
                {
                    context = new String("Unable to unpack: ");
                }
                Log.e(s1, context);
                return null;
            }
        }
        return new <init>(context);
    }

    public static <init> a(File file)
    {
        if (!file.exists())
        {
            file = String.valueOf(file);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(file).length() + 30)).append("Module file '").append(file).append("' does not exist!").toString());
        } else
        {
            return new <init>(file);
        }
    }

    private static void a(InputStream inputstream, File file)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        file = new byte[1000];
_L3:
        int i = inputstream.read(file);
        if (i == -1) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(file, 0, i);
          goto _L3
        file;
_L5:
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        fileoutputstream.close();
        inputstream.close();
        throw file;
_L2:
        fileoutputstream.close();
        inputstream.close();
        return;
        file;
        inputstream.close();
        throw file;
        file;
        inputstream.close();
        throw file;
        file;
        fileoutputstream = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static <init> b()
    {
        return a(new File("/system/vendor/media/LMspeed_508.emd"));
    }

    private static native int makeModule(String s);

    private static native boolean nativeRelease(int i);

    public final void c()
    {
        nativeRelease(b);
        b = 0;
    }

    static 
    {
        System.loadLibrary("moviemaker-jni");
    }

    private (File file)
    {
        b = 0;
        b = makeModule(file.getAbsolutePath());
        a = file;
    }
}
