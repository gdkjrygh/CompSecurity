// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.freedesktop.gstreamer;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GStreamer
{

    public static void a(Context context)
        throws Exception
    {
        nativeInit(context);
        AssetManager assetmanager = context.getAssets();
        context = new File(new File(context.getFilesDir(), "ssl"), "certs");
        File file = new File(context, "ca-certificates.crt");
        context.mkdirs();
        try
        {
            a(assetmanager, "ssl/certs/ca-certificates.crt", file);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    private static void a(AssetManager assetmanager, String s, File file)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        if (file.exists())
        {
            file.delete();
        }
        assetmanager = assetmanager.open(s);
        s = new FileOutputStream(file);
        do
        {
            int i = assetmanager.read(abyte0);
            if (i != -1)
            {
                s.write(abyte0, 0, i);
            } else
            {
                assetmanager.close();
                s.flush();
                s.close();
                return;
            }
        } while (true);
    }

    private static native void nativeInit(Context context)
        throws Exception;
}
