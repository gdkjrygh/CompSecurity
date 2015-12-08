// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.roidapp.imagelib.b:
//            e

public final class d
{

    private static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        boolean flag = true;
        double d1 = options.outWidth;
        double d2 = options.outHeight;
        int k;
        int l;
        if (j == -1)
        {
            k = 1;
        } else
        {
            k = (int)Math.ceil(Math.sqrt((d1 * d2) / (double)j));
        }
        if (i == -1)
        {
            l = 128;
        } else
        {
            l = (int)Math.min(Math.floor(d1 / (double)i), Math.floor(d2 / (double)i));
        }
        if (l >= k)
        {
            if (j == -1 && i == -1)
            {
                k = 1;
            } else
            if (i != -1)
            {
                k = l;
            }
        }
        if (k <= 8)
        {
            i = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (i >= k)
                {
                    break;
                }
                i <<= 1;
            } while (true);
        } else
        {
            j = ((k + 7) / 8) * 8;
        }
        return j;
    }

    public static Bitmap a(Resources resources, int i, int j, int k)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        obj.inPurgeable = true;
        obj.inInputShareable = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        InputStream inputstream = resources.openRawResource(i);
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj)));
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        resources = resources.openRawResource(i);
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = a(((android.graphics.BitmapFactory.Options) (obj)), j, k);
        obj = BitmapFactory.decodeStream(resources, null, ((android.graphics.BitmapFactory.Options) (obj)));
        try
        {
            resources.close();
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            resources.printStackTrace();
            return ((Bitmap) (obj));
        }
        return ((Bitmap) (obj));
    }

    public static Bitmap a(InputStream inputstream, int i, int j)
    {
        Bitmap bitmap;
        android.graphics.BitmapFactory.Options options;
        bitmap = null;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        BitmapFactory.decodeStream(inputstream, null, options);
        Bitmap bitmap1;
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = a(options, i, j);
        bitmap1 = BitmapFactory.decodeStream(inputstream, null, options);
        bitmap = bitmap1;
_L2:
        Throwable throwable;
        Bitmap bitmap2;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return bitmap;
        }
        return bitmap;
        throwable;
        options.inSampleSize = options.inSampleSize / 2;
        bitmap2 = BitmapFactory.decodeStream(inputstream, null, options);
        bitmap = bitmap2;
        continue; /* Loop/switch isn't completed */
        Throwable throwable1;
        throwable1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Bitmap a(String s, int i, int j)
    {
        return b(s, i, j);
    }

    public static Uri a(Bitmap bitmap, String s, String s1, android.graphics.Bitmap.CompressFormat compressformat)
    {
        Object obj;
        obj = null;
        if (!a())
        {
            throw new IOException("703");
        }
        if (!b())
        {
            throw new IOException("702");
        }
        Object obj1 = s.trim();
        s = ((String) (obj1));
        if (!((String) (obj1)).endsWith("/"))
        {
            s = (new StringBuilder()).append(((String) (obj1))).append("/").toString();
        }
        obj1 = new File(s);
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdirs())
        {
            throw new IOException("701");
        }
          goto _L1
        bitmap;
        s = obj;
_L3:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw bitmap;
_L1:
        s1 = new File((new StringBuilder()).append(s).append(s1).toString());
        if (s1.exists())
        {
            s1.delete();
        }
        s1.createNewFile();
        if (!s1.isFile() || !s1.canWrite())
        {
            throw new IOException("700");
        }
        s = new FileOutputStream(s1);
        bitmap.compress(compressformat, 100, s);
        s.flush();
        s.close();
        bitmap = Uri.fromFile(s1);
        return bitmap;
        bitmap;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static Uri a(byte abyte0[], String s, String s1)
    {
        Object obj;
        obj = null;
        if (!a())
        {
            throw new IOException("703");
        }
        if (!b())
        {
            throw new IOException("702");
        }
        Object obj1 = s.trim();
        s = ((String) (obj1));
        if (!((String) (obj1)).endsWith("/"))
        {
            s = (new StringBuilder()).append(((String) (obj1))).append("/").toString();
        }
        obj1 = new File(s);
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdirs())
        {
            throw new IOException("701");
        }
          goto _L1
        abyte0;
        s = obj;
_L3:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw abyte0;
_L1:
        s1 = new File((new StringBuilder()).append(s).append(s1).toString());
        if (s1.exists())
        {
            s1.delete();
        }
        s1.createNewFile();
        if (!s1.isFile() || !s1.canWrite())
        {
            throw new IOException("700");
        }
        s = new FileOutputStream(s1);
        s.write(abyte0);
        s.flush();
        s.close();
        abyte0 = Uri.fromFile(s1);
        return abyte0;
        abyte0;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static int[] a(String s)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = -1;
        ai[1] = -1;
        try
        {
            BitmapFactory.decodeFile((new File(s)).getAbsolutePath(), options);
            ai[0] = options.outWidth;
            ai[1] = options.outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ai;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ai;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ai;
        }
        return ai;
    }

    public static Integer[] a(String s, Integer ainteger[])
    {
        ArrayList arraylist = new ArrayList();
        Integer ainteger1[] = new Integer[arraylist.size()];
        arraylist.toArray(ainteger1);
        if (s == null)
        {
            return ainteger1;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        int i;
        int k;
        int i1;
        try
        {
            BitmapFactory.decodeFile((new File(s)).getAbsolutePath(), options);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ainteger1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ainteger1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return ainteger1;
        }
        i1 = ainteger.length;
        k = 0;
        i = 0;
        for (; k < i1; k++)
        {
            int j1 = ainteger[k].intValue();
            int l = a(options, j1, j1 * j1);
            if (l != i)
            {
                arraylist.add(Integer.valueOf(j1));
                i = l;
            }
        }

        s = new Integer[arraylist.size()];
        for (int j = 0; j < s.length; j++)
        {
            s[j] = (Integer)arraylist.get(j);
        }

        return s;
    }

    private static Bitmap b(String s, int i, int j)
    {
        Object obj = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        return ((Bitmap) (obj));
_L2:
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inPurgeable = true;
        obj.inInputShareable = true;
        Bitmap bitmap;
        String s1;
        try
        {
            BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        obj.inJustDecodeBounds = false;
        obj.inSampleSize = a(((android.graphics.BitmapFactory.Options) (obj)), i, j);
        try
        {
            bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        obj = bitmap;
        if (bitmap == null) goto _L1; else goto _L3
_L3:
        s1 = s.toLowerCase();
        if (s1.endsWith(".jpg"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        if (!s1.endsWith(".jpeg")) goto _L1; else goto _L4
_L4:
        return e.a(bitmap, s);
    }

    public static boolean b()
    {
label0:
        {
            boolean flag1 = true;
            boolean flag = flag1;
            long l;
            try
            {
                if (!Environment.getExternalStorageState().equals("mounted"))
                {
                    break label0;
                }
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l = statfs.getBlockSize();
                l = ((long)statfs.getAvailableBlocks() * l) / 0x100000L;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return true;
            }
            flag = flag1;
            if (10L > l)
            {
                flag = false;
            }
        }
        return flag;
    }

    public static Integer[] b(String s)
    {
        float f;
        ArrayList arraylist;
        arraylist = new ArrayList();
        f = (float)Runtime.getRuntime().maxMemory() / 1024F / 1024F;
        if (f < 96F) goto _L2; else goto _L1
_L1:
        arraylist.add(0, Integer.valueOf(4096));
        arraylist.add(1, Integer.valueOf(2048));
        arraylist.add(2, Integer.valueOf(1024));
        arraylist.add(3, Integer.valueOf(640));
        arraylist.add(4, Integer.valueOf(320));
_L4:
        Integer ainteger[] = new Integer[arraylist.size()];
        arraylist.toArray(ainteger);
        s = a(s, ainteger);
        (new StringBuilder("save min length is ")).append(Arrays.toString(s));
        return s;
_L2:
        if (f < 96F && f >= 64F)
        {
            arraylist.add(0, Integer.valueOf(2048));
            arraylist.add(1, Integer.valueOf(1024));
            arraylist.add(2, Integer.valueOf(640));
        } else
        if (f < 64F && f >= 32F)
        {
            arraylist.add(0, Integer.valueOf(1660));
            arraylist.add(1, Integer.valueOf(960));
            arraylist.add(2, Integer.valueOf(640));
            arraylist.add(3, Integer.valueOf(320));
        } else
        if (f < 32F)
        {
            arraylist.add(0, Integer.valueOf(640));
            arraylist.add(1, Integer.valueOf(480));
            arraylist.add(2, Integer.valueOf(320));
            arraylist.add(3, Integer.valueOf(160));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
