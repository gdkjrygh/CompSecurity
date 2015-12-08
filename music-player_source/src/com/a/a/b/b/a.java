// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.a.a.b.a.f;
import com.a.a.b.d.d;
import com.a.a.c.c;
import com.a.a.c.e;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.a.a.b.b:
//            d, b, e, c

public final class a
    implements com.a.a.b.b.d
{

    protected final boolean a;

    public a(boolean flag)
    {
        a = flag;
    }

    private static b a(String s)
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
        int j = (new ExifInterface(d.c.c(s))).getAttributeInt("Orientation", 1);
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
        return new b(i, flag1);
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
        e.c("Can't read EXIF tags from file [%s]", new Object[] {
            s
        });
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static InputStream a(InputStream inputstream, com.a.a.b.b.e e1)
    {
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            c.a(inputstream);
            return b(e1);
        }
        return inputstream;
    }

    private static InputStream b(com.a.a.b.b.e e1)
    {
        return e1.f().a(e1.b(), e1.g());
    }

    public final Bitmap a(com.a.a.b.b.e e1)
    {
        Object obj;
        Object obj2;
        obj2 = b(e1);
        obj = obj2;
        Object obj3 = new android.graphics.BitmapFactory.Options();
        obj = obj2;
        obj3.inJustDecodeBounds = true;
        obj = obj2;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        obj = obj2;
        Object obj1 = e1.b();
        obj = obj2;
        if (!e1.h()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        Object obj4 = ((android.graphics.BitmapFactory.Options) (obj3)).outMimeType;
        obj = obj2;
        if (android.os.Build.VERSION.SDK_INT < 5) goto _L4; else goto _L3
_L3:
        obj = obj2;
        if (!"image/jpeg".equalsIgnoreCase(((String) (obj4)))) goto _L4; else goto _L5
_L5:
        obj = obj2;
        if (d.a(((String) (obj1))) != d.c) goto _L4; else goto _L6
_L6:
        int j = 1;
_L13:
        if (j == 0) goto _L2; else goto _L7
_L7:
        obj = obj2;
        obj1 = a(((String) (obj1)));
_L10:
        obj = obj2;
        obj3 = new com.a.a.b.b.c(new f(((android.graphics.BitmapFactory.Options) (obj3)).outWidth, ((android.graphics.BitmapFactory.Options) (obj3)).outHeight, ((b) (obj1)).a), ((b) (obj1)));
        obj = obj2;
        obj1 = a(((InputStream) (obj2)), e1);
        obj = obj1;
        obj2 = ((com.a.a.b.b.c) (obj3)).a;
        obj = obj1;
        obj4 = e1.d();
        obj = obj1;
        if (obj4 != com.a.a.b.a.e.a) goto _L9; else goto _L8
_L8:
        obj = obj1;
        j = com.a.a.c.a.a(((f) (obj2)));
_L11:
        if (j <= 1)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj = obj1;
        if (!a)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj = obj1;
        e.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] {
            obj2, ((f) (obj2)).a(j), Integer.valueOf(j), e1.a()
        });
        obj = obj1;
        obj2 = e1.i();
        obj = obj1;
        obj2.inSampleSize = j;
        obj = obj1;
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj2)));
        c.a(((java.io.Closeable) (obj1)));
        f f4;
        boolean flag;
        if (obj2 == null)
        {
            e.d("Image can't be decoded [%s]", new Object[] {
                e1.a()
            });
            return ((Bitmap) (obj2));
        }
        j = ((com.a.a.b.b.c) (obj3)).b.a;
        boolean flag2 = ((com.a.a.b.b.c) (obj3)).b.b;
        obj = new Matrix();
        obj1 = e1.d();
        if (obj1 == com.a.a.b.a.e.d || obj1 == com.a.a.b.a.e.e)
        {
            f f2 = new f(((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), j);
            f f3 = e1.c();
            com.a.a.b.a.i i = e1.e();
            float f1;
            boolean flag1;
            if (obj1 == com.a.a.b.a.e.e)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f1 = com.a.a.c.a.b(f2, f3, i, flag1);
            if (Float.compare(f1, 1.0F) != 0)
            {
                ((Matrix) (obj)).setScale(f1, f1);
                if (a)
                {
                    e.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] {
                        f2, f2.a(f1), Float.valueOf(f1), e1.a()
                    });
                }
            }
        }
        if (flag2)
        {
            ((Matrix) (obj)).postScale(-1F, 1.0F);
            if (a)
            {
                e.a("Flip image horizontally [%s]", new Object[] {
                    e1.a()
                });
            }
        }
        if (j != 0)
        {
            ((Matrix) (obj)).postRotate(j);
            if (a)
            {
                e.a("Rotate image on %1$d\260 [%2$s]", new Object[] {
                    Integer.valueOf(j), e1.a()
                });
            }
        }
        e1 = Bitmap.createBitmap(((Bitmap) (obj2)), 0, 0, ((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), ((Matrix) (obj)), true);
        if (e1 != obj2)
        {
            ((Bitmap) (obj2)).recycle();
        }
        return e1;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = obj2;
        obj1 = new b();
          goto _L10
        e1;
        c.a(((java.io.Closeable) (obj)));
        throw e1;
_L9:
        obj = obj1;
        f4 = e1.c();
        obj = obj1;
        if (obj4 == com.a.a.b.a.e.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        j = com.a.a.c.a.a(((f) (obj2)), f4, e1.e(), flag);
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }
}
