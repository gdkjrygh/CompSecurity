// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.kik.cache.SimpleLruBitmapCache;
import com.kik.g.s;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import kik.a.e.q;
import kik.android.f.a.a;
import kik.android.util.bx;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.m:
//            l, r, j

public final class k
{

    private static a a;
    private static SimpleLruBitmapCache b;
    private static j c = new l();
    private static final b d = org.c.c.a("ImageUtil");

    static int a(long l1, long l2)
    {
        if (l1 > 6L * l2)
        {
            return 60;
        }
        if (l1 > 2L * l2)
        {
            return 70;
        }
        return l1 <= l2 ? 100 : 80;
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int i1)
    {
        int l1;
label0:
        {
            int k1 = options.outHeight;
            l1 = options.outWidth;
            int j1 = 1;
            if (k1 > i1 || l1 > i)
            {
                if (l1 <= k1)
                {
                    break label0;
                }
                j1 = Math.round((float)k1 / (float)i1);
            }
            return j1;
        }
        return Math.round((float)l1 / (float)i);
    }

    public static Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        Bitmap bitmap1;
        try
        {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            bx.a(outofmemoryerror);
            return bitmap;
        }
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i1)
    {
        float f;
        if (i1 > 0 && i > 0)
        {
            f = Math.min((float)i1 / (float)bitmap.getHeight(), (float)i / (float)bitmap.getWidth());
        } else
        if (i > 0)
        {
            f = (float)i / (float)bitmap.getWidth();
        } else
        if (i1 > 0)
        {
            f = (float)i1 / (float)bitmap.getHeight();
        } else
        {
            f = 1.0F;
        }
        i = (int)((float)bitmap.getWidth() * f);
        i1 = (int)((float)bitmap.getHeight() * f);
        if (f >= 1.0F)
        {
            if (f <= 1.0F);
            return bitmap;
        } else
        {
            return Bitmap.createScaledBitmap(bitmap, i, i1, true);
        }
    }

    private static Bitmap a(InputStream inputstream)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = true;
        options.inTempStorage = new byte[16384];
        BitmapFactory.decodeStream(inputstream, null, options);
        String s1 = options.outMimeType;
        options.inSampleSize = a(options, 300, 300);
        options.inJustDecodeBounds = false;
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception) { }
        return BitmapFactory.decodeStream(inputstream, null, options);
    }

    public static Bitmap a(String s1, int i, int i1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s1, options);
        String s2 = options.outMimeType;
        int j1 = i;
        if (i < 0)
        {
            j1 = Math.min(options.outWidth, 512);
        }
        i = i1;
        if (i1 < 0)
        {
            if (options.outHeight == 0)
            {
                return null;
            }
            i = Math.min(options.outHeight, (j1 * 512) / options.outHeight);
        }
        options.inSampleSize = a(options, j1, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(s1, options);
    }

    public static SimpleLruBitmapCache a()
    {
        return b;
    }

    public static File a(String s1, File file, String s2, String s3)
    {
        Object obj1;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj4 = null;
        obj1 = null;
        s1 = (HttpURLConnection)(new URL(s1)).openConnection();
        String s4;
        int i;
        s1.setConnectTimeout(20000);
        s1.setReadTimeout(20000);
        i = s1.getResponseCode();
        s4 = s1.getContentType();
        Object obj;
        obj = s3;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = s3;
        if (s4.equals(""))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = s3;
        if (c(s4) != null)
        {
            obj = c(s4);
        }
        s3 = s2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        s3 = s2;
        if (!((String) (obj)).equals(""))
        {
            s3 = (new StringBuilder()).append(s2).append(".").append(((String) (obj))).toString();
        }
        file = new File(file, s3);
        if (i == 200) goto _L2; else goto _L1
_L1:
        throw new IOException((new StringBuilder("Unexpected response code: ")).append(i).toString());
        s3;
        s2 = s1;
        s1 = file;
        file = s2;
        s2 = s3;
_L9:
        obj = file;
        s3 = ((String) (obj1));
        d.a("Malformed URL", s2);
        com.kik.m.r.a(((java.io.OutputStream) (obj1)));
        s2 = s1;
        if (file != null)
        {
            file.disconnect();
            s2 = s1;
        }
_L4:
        return s2;
_L2:
        s3 = s1.getInputStream();
        s2 = new FileOutputStream(file);
        long l1;
        i = s1.getContentLength();
        l1 = com.kik.m.r.a(s3, s2);
        if (i != -1 && l1 != (long)i)
        {
            try
            {
                throw new EOFException("Length read did not match content length");
            }
            // Misplaced declaration of an exception variable
            catch (String s3)
            {
                obj1 = s2;
                s2 = s3;
                s3 = s1;
                s1 = file;
                file = s3;
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (String s3)
            {
                obj2 = s2;
                s2 = s3;
                s3 = s1;
                s1 = file;
                file = s3;
            }
            finally
            {
                file = s1;
                s1 = s3;
                s3 = s2;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            com.kik.m.r.a(s2);
            Object obj2;
            if (s1 != null)
            {
                s1.disconnect();
                return file;
            } else
            {
                return file;
            }
        }
        break MISSING_BLOCK_LABEL_312;
        s2;
        file = null;
        s1 = null;
        obj2 = obj3;
_L7:
        obj = file;
        s3 = ((String) (obj2));
        d.a("Download failed", s2);
        com.kik.m.r.a(((java.io.OutputStream) (obj2)));
        s2 = s1;
        if (file == null) goto _L4; else goto _L3
_L3:
        file.disconnect();
        return s1;
        s1;
        file = null;
        s3 = obj4;
_L6:
        com.kik.m.r.a(s3);
        if (file != null)
        {
            file.disconnect();
        }
        throw s1;
        s2;
        file = s1;
        s1 = s2;
        s3 = obj4;
        continue; /* Loop/switch isn't completed */
        s1;
        file = ((File) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        s2;
        file = s1;
        s1 = null;
        obj2 = obj3;
          goto _L7
        s2;
        s3 = s1;
        s1 = file;
        file = s3;
        obj2 = obj3;
          goto _L7
        s2;
        file = null;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        s2;
        file = s1;
        s1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(Context context, q q)
    {
        b = new SimpleLruBitmapCache((int)((float)(((ActivityManager)context.getSystemService("activity")).getMemoryClass() * 0x100000) * 0.05F));
        a = new a(context, q, "kik_content_preview_cache", b);
    }

    public static boolean a(String s1)
    {
        return a.a(s1);
    }

    public static byte[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(compressformat, i, bytearrayoutputstream);
            bitmap = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bx.a(bitmap);
            return null;
        }
        return bitmap;
    }

    public static byte[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, long l1)
    {
        return a(bitmap, compressformat, c, l1, 50, 50, false);
    }

    private static byte[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, j j1, long l1, int i, int i1, boolean flag)
    {
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((byte []) (obj));
_L2:
        byte abyte0[];
        try
        {
            obj = a(bitmap, i, i1);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        if (compressformat != android.graphics.Bitmap.CompressFormat.JPEG && !flag)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = b(((Bitmap) (obj)));
        i = 1;
_L5:
        bitmap = new ByteArrayOutputStream();
        ((Bitmap) (obj)).compress(compressformat, 90, bitmap);
        abyte0 = bitmap.toByteArray();
        bitmap.close();
        bitmap = abyte0;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        bitmap = abyte0;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        bitmap = abyte0;
        if ((long)abyte0.length > l1)
        {
            bitmap = b(((Bitmap) (obj)));
            obj = new ByteArrayOutputStream();
            bitmap.compress(compressformat, 100, ((java.io.OutputStream) (obj)));
            bitmap = ((ByteArrayOutputStream) (obj)).toByteArray();
            ((ByteArrayOutputStream) (obj)).close();
        }
        obj = bitmap;
        if ((long)bitmap.length <= l1) goto _L4; else goto _L3
_L3:
        bitmap = j1.a(bitmap, compressformat, l1);
        return bitmap;
        i = 0;
          goto _L5
    }

    public static byte[] a(InputStream inputstream, android.graphics.Bitmap.CompressFormat compressformat)
    {
        return a(a(inputstream), compressformat, c, 20480L, 300, 300, true);
    }

    public static byte[] a(String s1, android.graphics.Bitmap.CompressFormat compressformat)
    {
        return a(a(s1, 200, 200), compressformat, c, 20480L, 200, 200, true);
    }

    public static byte[] a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return abyte0;
        }
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, null);
        if (abyte0 == null)
        {
            return new byte[0];
        } else
        {
            abyte0 = b(abyte0);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            abyte0.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, bytearrayoutputstream);
            return bytearrayoutputstream.toByteArray();
        }
    }

    private static Bitmap b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
            return bitmap1;
        }
    }

    public static byte[] b(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, int i)
    {
        if (bitmap == null)
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            bitmap.compress(compressformat, i, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bx.a(bitmap);
            return null;
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] b(String s1)
    {
        try
        {
            s1 = (byte[])s.b(a.b(s1), 30000L);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return s1;
    }

    public static String c(String s1)
    {
        if (s1 != null)
        {
            if (s1.startsWith("image/jpg") || s1.startsWith("image/jpeg"))
            {
                return "jpg";
            }
            if (s1.startsWith("image/png"))
            {
                return "png";
            }
        }
        return null;
    }

}
