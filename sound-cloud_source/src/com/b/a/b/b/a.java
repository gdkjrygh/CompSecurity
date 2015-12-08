// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.b.a.b.a.d;
import com.b.a.b.a.e;
import com.b.a.c.b;
import com.b.a.c.c;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.b.a.b.b:
//            b, c

public final class com.b.a.b.b.a
    implements com.b.a.b.b.b
{
    protected static final class a
    {

        public final int a;
        public final boolean b;

        protected a()
        {
            a = 0;
            b = false;
        }

        protected a(int i, boolean flag)
        {
            a = i;
            b = flag;
        }
    }

    protected static final class b
    {

        public final e a;
        public final a b;

        protected b(e e1, a a1)
        {
            a = e1;
            b = a1;
        }
    }


    protected final boolean a;

    public com.b.a.b.b.a(boolean flag)
    {
        a = flag;
    }

    private static a a(String s)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag = false;
        flag2 = true;
        flag3 = true;
        flag4 = true;
        flag1 = true;
        int j = (new ExifInterface(com.b.a.b.d.b.a.c.c(s))).getAttributeInt("Orientation", 1);
        int i = ((flag) ? 1 : 0);
        j;
        JVM INSTR tableswitch 1 8: default 88
    //                   1 88
    //                   2 93
    //                   3 117
    //                   4 120
    //                   5 134
    //                   6 104
    //                   7 107
    //                   8 131;
           goto _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        flag1 = false;
        i = ((flag) ? 1 : 0);
_L10:
        return new a(i, flag1);
_L6:
        flag2 = false;
_L7:
        i = 90;
        flag1 = flag2;
        continue; /* Loop/switch isn't completed */
_L3:
        flag3 = false;
_L4:
        i = 180;
        flag1 = flag3;
        continue; /* Loop/switch isn't completed */
_L8:
        flag4 = false;
_L5:
        i = 270;
        flag1 = flag4;
        if (true) goto _L10; else goto _L9
_L9:
        IOException ioexception;
        ioexception;
        c.c("Can't read EXIF tags from file [%s]", new Object[] {
            s
        });
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static InputStream a(InputStream inputstream, com.b.a.b.b.c c1)
        throws IOException
    {
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            com.b.a.c.b.a(inputstream);
            return b(c1);
        }
        return inputstream;
    }

    private static InputStream b(com.b.a.b.b.c c1)
        throws IOException
    {
        return c1.f.a(c1.b, c1.g);
    }

    public final Bitmap a(com.b.a.b.b.c c1)
        throws IOException
    {
        Object obj;
        Object obj2;
        obj2 = b(c1);
        obj = obj2;
        Object obj3 = new android.graphics.BitmapFactory.Options();
        obj = obj2;
        obj3.inJustDecodeBounds = true;
        obj = obj2;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        obj = obj2;
        Object obj1 = c1.b;
        obj = obj2;
        if (!c1.h) goto _L2; else goto _L1
_L1:
        obj = obj2;
        String s = ((android.graphics.BitmapFactory.Options) (obj3)).outMimeType;
        obj = obj2;
        if (android.os.Build.VERSION.SDK_INT < 5) goto _L4; else goto _L3
_L3:
        obj = obj2;
        if (!"image/jpeg".equalsIgnoreCase(s)) goto _L4; else goto _L5
_L5:
        obj = obj2;
        if (com.b.a.b.d.b.a.a(((String) (obj1))) != com.b.a.b.d.b.a.c) goto _L4; else goto _L6
_L6:
        int i = 1;
_L13:
        if (i == 0) goto _L2; else goto _L7
_L7:
        obj = obj2;
        obj1 = a(((String) (obj1)));
_L10:
        obj = obj2;
        obj3 = new b(new e(((android.graphics.BitmapFactory.Options) (obj3)).outWidth, ((android.graphics.BitmapFactory.Options) (obj3)).outHeight, ((a) (obj1)).a), ((a) (obj1)));
        obj = obj2;
        obj1 = a(((InputStream) (obj2)), c1);
        obj = obj1;
        obj2 = ((b) (obj3)).a;
        obj = obj1;
        i = c1.d;
        obj = obj1;
        if (i != d.a) goto _L9; else goto _L8
_L8:
        obj = obj1;
        i = com.b.a.c.a.a(((e) (obj2)));
_L11:
        if (i <= 1)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        obj = obj1;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        obj = obj1;
        c.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] {
            obj2, new e(((e) (obj2)).a / i, ((e) (obj2)).b / i), Integer.valueOf(i), c1.a
        });
        obj = obj1;
        obj2 = c1.i;
        obj = obj1;
        obj2.inSampleSize = i;
        obj = obj1;
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj2)));
        com.b.a.c.b.a(((java.io.Closeable) (obj1)));
        e e3;
        boolean flag;
        if (obj2 == null)
        {
            c.d("Image can't be decoded [%s]", new Object[] {
                c1.a
            });
            return ((Bitmap) (obj2));
        }
        i = ((b) (obj3)).b.a;
        boolean flag2 = ((b) (obj3)).b.b;
        obj = new Matrix();
        int j = c1.d;
        if (j == d.d || j == d.e)
        {
            e e1 = new e(((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), i);
            e e2 = c1.c;
            int k = c1.e;
            float f;
            boolean flag1;
            if (j == d.e)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f = com.b.a.c.a.b(e1, e2, k, flag1);
            if (Float.compare(f, 1.0F) != 0)
            {
                ((Matrix) (obj)).setScale(f, f);
                if (a)
                {
                    c.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] {
                        e1, new e((int)((float)e1.a * f), (int)((float)e1.b * f)), Float.valueOf(f), c1.a
                    });
                }
            }
        }
        if (flag2)
        {
            ((Matrix) (obj)).postScale(-1F, 1.0F);
            if (a)
            {
                c.a("Flip image horizontally [%s]", new Object[] {
                    c1.a
                });
            }
        }
        if (i != 0)
        {
            ((Matrix) (obj)).postRotate(i);
            if (a)
            {
                c.a("Rotate image on %1$d\260 [%2$s]", new Object[] {
                    Integer.valueOf(i), c1.a
                });
            }
        }
        c1 = Bitmap.createBitmap(((Bitmap) (obj2)), 0, 0, ((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), ((Matrix) (obj)), true);
        if (c1 != obj2)
        {
            ((Bitmap) (obj2)).recycle();
        }
        return c1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = obj2;
        obj1 = new a();
          goto _L10
        c1;
        com.b.a.c.b.a(((java.io.Closeable) (obj)));
        throw c1;
_L9:
        obj = obj1;
        e3 = c1.c;
        obj = obj1;
        if (i == d.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        i = com.b.a.c.a.a(((e) (obj2)), e3, c1.e, flag);
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }
}
