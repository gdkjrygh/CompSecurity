// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Environment;
import android.view.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Random;

// Referenced classes of package com.amobee.pulse3d:
//            Log, Pulse3DView

class Utility
{

    Utility()
    {
    }

    public static String convertStreamToString(InputStream inputstream)
        throws Exception
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            String s = inputstream.readLine();
            if (s != null)
            {
                stringbuilder.append(s).append("\n");
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    static Bitmap createBitmapFromGLSurface(int i, int j, int k, int l)
    {
        com/amobee/pulse3d/Utility;
        JVM INSTR monitorenter ;
        Bitmap bitmap = null;
        int ai[];
        IntBuffer intbuffer;
        ai = new int[k * l];
        intbuffer = ByteBuffer.allocateDirect(l * k * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
        GLES20.glReadPixels(i, j, k, l, 6408, 5121, intbuffer);
        i = 0;
          goto _L1
_L2:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        int i1 = intbuffer.get(i * k + j);
        ai[(l - i - 1) * k + j] = 0xff00ff00 & i1 | i1 << 16 & 0xff0000 | i1 >> 16 & 0xff;
        j++;
          goto _L2
_L6:
        Bitmap bitmap1;
        System.gc();
        bitmap1 = Bitmap.createBitmap(ai, k, l, android.graphics.Bitmap.Config.ARGB_8888);
        bitmap = bitmap1;
_L4:
        com/amobee/pulse3d/Utility;
        JVM INSTR monitorexit ;
        return bitmap;
        Exception exception1;
        exception1;
        Log.d("Pulse3DUtility", (new StringBuilder()).append("exception: ").append(exception1.getMessage()).toString());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
_L1:
        if (i >= l) goto _L6; else goto _L5
_L5:
        j = 0;
          goto _L2
        i++;
          goto _L1
    }

    static int getStatusBarHeight(Context context)
    {
        int i;
        if ((((Activity)context).getWindow().getAttributes().flags & 0x400) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i)
        {
            if ((i = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0)
            {
                return context.getResources().getDimensionPixelSize(i);
            }
        }
        return 0;
    }

    public static String getStringFromFile(String s)
        throws Exception
    {
        s = new FileInputStream(new File(s));
        String s1 = convertStreamToString(s);
        s.close();
        return s1;
    }

    static void printMemory()
    {
        if (Pulse3DView.debugLevel != Log.DebugLevel.DEBUG)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.freeMemory();
        long l1 = runtime.totalMemory();
        Log.d("Pulse3D Memory Monitor", (new StringBuilder()).append("totalSize: ").append(l1).append(" freeSize: ").append(l).append(" usedSize: ").append(l1 - l).toString());
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    static String readXMLinString(String s, Context context)
    {
        try
        {
            s = context.getAssets().open(s);
            context = new byte[s.available()];
            s.read(context);
            s.close();
            s = new String(context);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static void saveBitmapToSDCARD(Bitmap bitmap)
    {
        Object obj;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        obj = Environment.getExternalStorageDirectory().toString();
        obj = new File((new StringBuilder()).append(((String) (obj))).append("/saved_images").toString());
        ((File) (obj)).mkdirs();
        int i = (new Random()).nextInt(10000);
        obj = new File(((File) (obj)), (new StringBuilder()).append("Image-").append(i).append(".jpg").toString());
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        obj = new FileOutputStream(((File) (obj)));
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, ((java.io.OutputStream) (obj)));
        ((FileOutputStream) (obj)).flush();
        ((FileOutputStream) (obj)).close();
        return;
        bitmap;
        bitmap.printStackTrace();
        return;
    }
}
