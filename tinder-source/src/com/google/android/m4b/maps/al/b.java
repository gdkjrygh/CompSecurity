// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.al;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;

public final class b
{

    private static final long a[];
    private static int b;

    public static long a(String s)
    {
        CRC32 crc32 = new CRC32();
        try
        {
            crc32.update(s.getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception) { }
        return crc32.getValue() << 32 | (long)s.hashCode() & 0xffffffffL;
    }

    public static Bitmap a(Bitmap bitmap)
    {
        Matrix matrix = new Matrix();
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        float f = j;
        float f1 = i;
        float f2 = i;
        float f3 = j;
        float f4 = j;
        float f5 = i;
        float f6 = j;
        float f7 = i;
        matrix.setPolyToPoly(new float[] {
            0.0F, 0.0F, 0.0F, f, f1, 0.0F, f2, f3
        }, 0, new float[] {
            0.0F, f4, 0.0F, 0.0F, f5, f6, f7, 0.0F
        }, 0, 4);
        Object obj = new ColorMatrix(new float[] {
            0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 
            1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
        });
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(((ColorMatrix) (obj))));
        obj = Bitmap.createBitmap(bitmap);
        (new Canvas(bitmap)).drawBitmap(((Bitmap) (obj)), matrix, paint);
        return bitmap;
    }

    public static Pair a(ah ah, ac ac1)
    {
        ah = ac1.a(ac1.d.a(ah));
        ac1 = ((ac) (ah)).d;
        long l;
        if (ac1.b())
        {
            l = (long)(((ac) (ah)).a & 0x1f) << 58 | (long)(((ac) (ah)).b & 0x1fffffff) << 29 | (long)(((ac) (ah)).c & 0x1fffffff);
        } else
        {
            int i = ((ac) (ah)).a;
            long l1;
            if (i == 0)
            {
                l = 0L;
            } else
            {
                l = a[i - 1] + 1L;
            }
            l1 = ((ac) (ah)).b;
            l = l + (((long)((ac) (ah)).c << i) + l1) | (0x8000000000000000L | (long)ac1.hashCode() << b);
        }
        ah = ((ac) (ah)).d;
        if (ah.b())
        {
            ah = null;
        } else
        {
            ah = ah.toString();
        }
        return new Pair(Long.valueOf(l), ah);
    }

    public static a a(Context context, String s, com.google.android.m4b.maps.ac.b b1)
    {
        DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(context.openFileInput(s), 4096));
        context = datainputstream;
        b1 = new a(b1);
        context = datainputstream;
        b1.a(datainputstream);
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return b1;
        }
        return b1;
        context;
        context = null;
_L13:
        if (!ab.a("MapsNavigation", 3)) goto _L2; else goto _L1
_L1:
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = "readProtoFromFile failed: ".concat(s);
_L3:
        Log.d("MapsNavigation", s);
_L2:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return null;
        s = new String("readProtoFromFile failed: ");
          goto _L3
        s;
_L10:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        context;
        datainputstream = null;
_L11:
        context = datainputstream;
        if (!ab.a("MapsNavigation", 3)) goto _L5; else goto _L4
_L4:
        context = datainputstream;
        s = String.valueOf(s);
        context = datainputstream;
        if (s.length() == 0) goto _L7; else goto _L6
_L6:
        context = datainputstream;
        s = "readProtoFromFile failed: ".concat(s);
_L9:
        context = datainputstream;
        Log.d("MapsNavigation", s);
_L5:
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return null;
_L7:
        context = datainputstream;
        s = new String("readProtoFromFile failed: ");
        if (true) goto _L9; else goto _L8
_L8:
        s;
          goto _L10
        s;
        context = null;
          goto _L10
        context;
          goto _L11
        context;
        context = datainputstream;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static ac a(long l)
    {
        if (l < 0L)
        {
            return null;
        } else
        {
            return new ac((int)(l >> 58) & 0x1f, (int)(l >> 29) & 0x1fffffff, (int)l & 0x1fffffff);
        }
    }

    public static File a(Context context)
    {
        return new File(d(context), "testdata");
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean a(Context context, a a1, String s)
    {
        DataOutputStream dataoutputstream = new DataOutputStream(context.openFileOutput(s, 0));
        a1.b(dataoutputstream);
        dataoutputstream.close();
        return true;
        IOException ioexception;
        ioexception;
        a1 = null;
_L2:
        if (ab.a("MapsNavigation", 3))
        {
            String s1 = String.valueOf(ioexception.getMessage());
            if (s1.length() != 0)
            {
                s1 = "writeProtoToFile failed: ".concat(s1);
            } else
            {
                s1 = new String("writeProtoToFile failed: ");
            }
            Log.d("MapsNavigation", s1);
        }
        if (a1 != null)
        {
            try
            {
                a1.close();
            }
            // Misplaced declaration of an exception variable
            catch (a a1) { }
            context.getFileStreamPath(s).delete();
        }
        return false;
        s1;
        a1 = dataoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long b()
    {
        if (!a())
        {
            return 0L;
        }
        int i;
        long l;
        try
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            l = statfs.getBlockSize();
            i = statfs.getAvailableBlocks();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return 0L;
        }
        return (long)i * l;
    }

    public static File b(Context context)
    {
        return new File(d(context), "debug");
    }

    public static File c(Context context)
    {
        return new File(d(context), "cache");
    }

    private static File d(Context context)
    {
        if (a())
        {
            context = context.getPackageName();
            File file = Environment.getExternalStorageDirectory();
            context = String.valueOf(context);
            if (context.length() != 0)
            {
                context = "Android/data/".concat(context);
            } else
            {
                context = new String("Android/data/");
            }
            return new File(file, context);
        } else
        {
            return context.getDir("", 0);
        }
    }

    static 
    {
        int j;
        long l;
        long l1;
        boolean flag = false;
        long al[] = new long[22];
        l = 0L;
        for (int i = 0; i < 22; i++)
        {
            l += 1L << i * 2;
            al[i] = l - 1L;
        }

        a = al;
        l1 = al[21];
        j = ((flag) ? 1 : 0);
        l = l1;
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        int k = 64;
_L4:
        b = k;
        return;
_L2:
        do
        {
            k = j;
            if (l == 0L)
            {
                continue;
            }
            l >>= 1;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
