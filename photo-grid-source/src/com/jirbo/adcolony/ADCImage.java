// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.jirbo.adcolony:
//            a

public class ADCImage
{

    static int k;
    static int l;
    Bitmap a;
    Bitmap b;
    Paint c;
    Rect d;
    Rect e;
    int f;
    int g;
    boolean h;
    int i;
    int j;
    boolean m;
    ArrayList n;

    ADCImage(String s)
    {
        this(s, 1.0D);
    }

    ADCImage(String s, double d1)
    {
        this(s, d1, false);
    }

    ADCImage(String s, double d1, boolean flag)
    {
        this(s, d1, flag, false);
    }

    ADCImage(String s, double d1, boolean flag, boolean flag1)
    {
        int i1;
        c = new Paint();
        d = new Rect();
        e = new Rect();
        n = new ArrayList();
        int ai[];
        try
        {
            FileInputStream fileinputstream = new FileInputStream(s);
            a = BitmapFactory.decodeStream(fileinputstream);
            fileinputstream.close();
            b = a;
            f = a.getWidth();
            g = a.getHeight();
            i = a.getWidth();
            j = a.getHeight();
            k = i;
            l = j;
            a(d1);
            h = true;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.jirbo.adcolony.a.e((new StringBuilder("Failed to load image ")).append(s).toString());
            m = true;
            return;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        a = convertToMutable(a);
        ai = new int[a.getWidth() * a.getHeight()];
        a.getPixels(ai, 0, a.getWidth(), 0, 0, a.getWidth(), a.getHeight());
        i1 = 0;
_L4:
        if (i1 < ai.length)
        {
            if (ai[i1] < 255 && ai[i1] != 0)
            {
                ai[i1] = ai[i1] >> 1 & 0x7f7f7f | 0xff000000;
            }
            i1++;
            continue; /* Loop/switch isn't completed */
        }
        a.setPixels(ai, 0, a.getWidth(), 0, 0, a.getWidth(), a.getHeight());
        b = a;
_L2:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        a.ad.add(a);
        n.add(a);
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    ADCImage(String s, int i1, int j1)
    {
        this(s, 1.0D);
        b(i1, j1);
    }

    ADCImage(String s, boolean flag)
    {
        this(s, 1.0D, flag);
    }

    ADCImage(String s, boolean flag, boolean flag1)
    {
        this(s, 1.0D, flag1, flag);
    }

    public static Bitmap convertToMutable(Bitmap bitmap)
    {
        Object obj;
        File file;
        RandomAccessFile randomaccessfile;
        FileChannel filechannel;
        MappedByteBuffer mappedbytebuffer;
        file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append("temp.tmp").toString());
        randomaccessfile = new RandomAccessFile(file, "rw");
        int i1 = k;
        int j1 = l;
        obj = bitmap.getConfig();
        filechannel = randomaccessfile.getChannel();
        mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, bitmap.getRowBytes() * j1);
        bitmap.copyPixelsToBuffer(mappedbytebuffer);
        obj = Bitmap.createBitmap(i1, j1, ((android.graphics.Bitmap.Config) (obj)));
        mappedbytebuffer.position(0);
        ((Bitmap) (obj)).copyPixelsFromBuffer(mappedbytebuffer);
        filechannel.close();
        randomaccessfile.close();
        file.delete();
        return ((Bitmap) (obj));
        obj;
_L2:
        ((Exception) (obj)).printStackTrace();
        return bitmap;
        Exception exception;
        exception;
        bitmap = ((Bitmap) (obj));
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void a()
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext(); ((Bitmap)iterator.next()).recycle()) { }
        n.clear();
    }

    void a(double d1)
    {
        a(d1, false);
    }

    void a(double d1, boolean flag)
    {
        while (a == null || a.isRecycled()) 
        {
            return;
        }
        if (d1 != 1.0D)
        {
            int i1 = (int)((double)b.getWidth() * d1);
            int j1 = (int)((double)b.getHeight() * d1);
            if (i1 != f || j1 != g)
            {
                f = i1;
                g = j1;
                a = Bitmap.createScaledBitmap(b, f, g, true);
                if (!flag)
                {
                    a.ad.add(a);
                    n.add(a);
                }
            }
            if (flag)
            {
                b.recycle();
                b = null;
            }
        }
        d.right = f;
        d.bottom = g;
    }

    void a(int i1, int j1)
    {
        Bitmap bitmap2;
        int ai[];
        int ai1[];
        int k1;
        int l1;
        if (a == null)
        {
            return;
        }
        Bitmap bitmap = Bitmap.createBitmap(b, 0, 0, i / 3, j);
        Bitmap bitmap1 = Bitmap.createBitmap(b, (i * 2) / 3, 0, i / 3, j);
        bitmap2 = Bitmap.createScaledBitmap(Bitmap.createBitmap(b, i / 3, 0, i / 3, j), i1, j, false);
        ai = new int[(i / 3) * j];
        ai1 = new int[(i / 3) * j];
        bitmap.getPixels(ai, 0, i / 3, 0, 0, i / 3, j);
        bitmap1.getPixels(ai1, 0, i / 3, 0, 0, i / 3, j);
        bitmap2.getPixels(new int[bitmap2.getWidth() * bitmap2.getHeight()], 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        l1 = 0;
        k1 = 0;
        i1 = 0;
        j1 = 0;
_L7:
        if (j1 >= bitmap2.getHeight()) goto _L2; else goto _L1
_L1:
        if (i1 >= i / 3) goto _L4; else goto _L3
_L3:
        int i2;
        int j2;
        if (k1 < ai.length)
        {
            bitmap2.setPixel(i1, j1, ai[k1]);
        }
        j2 = k1 + 1;
        i2 = l1;
_L5:
        int k2 = i1 + 1;
        l1 = i2;
        k1 = j2;
        i1 = k2;
        if (k2 == bitmap2.getWidth())
        {
            j1++;
            i1 = 0;
            l1 = i2;
            k1 = j2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i2 = l1;
        j2 = k1;
        if (i1 >= bitmap2.getWidth() - i / 3)
        {
            if (l1 < ai1.length)
            {
                bitmap2.setPixel(i1, j1, ai1[l1]);
            }
            i2 = l1 + 1;
            j2 = k1;
        }
        if (true) goto _L5; else goto _L2
_L2:
        a = bitmap2;
        b = a;
        f = a.getWidth();
        g = a.getHeight();
        i = f;
        j = g;
        d.right = f;
        d.bottom = g;
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void a(Canvas canvas)
    {
        while (a == null || a.isRecycled()) 
        {
            return;
        }
        canvas.drawBitmap(a, d, e, c);
    }

    void a(Canvas canvas, int i1, int j1)
    {
        c(i1, j1);
        a(canvas);
    }

    void b(int i1, int j1)
    {
        while (a == null || a.isRecycled() || i1 == f && j1 == g) 
        {
            return;
        }
        a = Bitmap.createScaledBitmap(b, i1, j1, true);
        f = i1;
        g = j1;
        d.right = i1;
        d.bottom = j1;
        a.ad.add(a);
        n.add(a);
    }

    int[] b()
    {
        return (new int[] {
            e.left, e.top
        });
    }

    int c()
    {
        return e.left;
    }

    void c(int i1, int j1)
    {
        e.left = i1;
        e.top = j1;
        e.right = f + i1;
        e.bottom = g + j1;
    }

    int d()
    {
        return e.top;
    }

    void d(int i1, int j1)
    {
        c((i1 - f) / 2, (j1 - g) / 2);
    }
}
