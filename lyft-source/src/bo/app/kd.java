// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package bo.app:
//            kg, kn, ke, kz, 
//            kx, kh, km, kf, 
//            jo, jn, kv

public final class kd
    implements kg
{

    protected final boolean a;

    public kd(boolean flag)
    {
        a = flag;
    }

    private static ke a(String s)
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
        int j = (new ExifInterface(kn.c.c(s))).getAttributeInt("Orientation", 1);
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
        return new ke(i, flag1);
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
        kz.c("Can't read EXIF tags from file [%s]", new Object[] {
            s
        });
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static InputStream a(InputStream inputstream, kh kh1)
    {
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            kx.a(inputstream);
            return b(kh1);
        }
        return inputstream;
    }

    private static InputStream b(kh kh1)
    {
        return kh1.f.a(kh1.b, kh1.g);
    }

    public final Bitmap a(kh kh1)
    {
        Object obj;
        Object obj2;
        obj2 = b(kh1);
        obj = obj2;
        Object obj3 = new android.graphics.BitmapFactory.Options();
        obj = obj2;
        obj3.inJustDecodeBounds = true;
        obj = obj2;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        obj = obj2;
        Object obj1 = kh1.b;
        obj = obj2;
        if (!kh1.h) goto _L2; else goto _L1
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
        if (kn.a(((String) (obj1))) != kn.c) goto _L4; else goto _L6
_L6:
        int i = 1;
_L13:
        if (i == 0) goto _L2; else goto _L7
_L7:
        obj = obj2;
        obj1 = a(((String) (obj1)));
_L10:
        obj = obj2;
        obj3 = new kf(new jo(((android.graphics.BitmapFactory.Options) (obj3)).outWidth, ((android.graphics.BitmapFactory.Options) (obj3)).outHeight, ((ke) (obj1)).a), ((ke) (obj1)));
        obj = obj2;
        obj1 = a(((InputStream) (obj2)), kh1);
        obj = obj1;
        obj2 = ((kf) (obj3)).a;
        obj = obj1;
        i = kh1.d;
        obj = obj1;
        if (i != jn.a) goto _L9; else goto _L8
_L8:
        obj = obj1;
        i = kv.a(((jo) (obj2)));
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
        kz.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] {
            obj2, new jo(((jo) (obj2)).a / i, ((jo) (obj2)).b / i), Integer.valueOf(i), kh1.a
        });
        obj = obj1;
        obj2 = kh1.i;
        obj = obj1;
        obj2.inSampleSize = i;
        obj = obj1;
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj2)));
        kx.a(((java.io.Closeable) (obj1)));
        jo jo3;
        boolean flag;
        if (obj2 == null)
        {
            kz.d("Image can't be decoded [%s]", new Object[] {
                kh1.a
            });
            return ((Bitmap) (obj2));
        }
        i = ((kf) (obj3)).b.a;
        boolean flag2 = ((kf) (obj3)).b.b;
        obj = new Matrix();
        int j = kh1.d;
        if (j == jn.d || j == jn.e)
        {
            jo jo1 = new jo(((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), i);
            jo jo2 = kh1.c;
            int k = kh1.e;
            float f;
            boolean flag1;
            if (j == jn.e)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f = kv.b(jo1, jo2, k, flag1);
            if (Float.compare(f, 1.0F) != 0)
            {
                ((Matrix) (obj)).setScale(f, f);
                if (a)
                {
                    kz.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] {
                        jo1, new jo((int)((float)jo1.a * f), (int)((float)jo1.b * f)), Float.valueOf(f), kh1.a
                    });
                }
            }
        }
        if (flag2)
        {
            ((Matrix) (obj)).postScale(-1F, 1.0F);
            if (a)
            {
                kz.a("Flip image horizontally [%s]", new Object[] {
                    kh1.a
                });
            }
        }
        if (i != 0)
        {
            ((Matrix) (obj)).postRotate(i);
            if (a)
            {
                kz.a("Rotate image on %1$d\260 [%2$s]", new Object[] {
                    Integer.valueOf(i), kh1.a
                });
            }
        }
        kh1 = Bitmap.createBitmap(((Bitmap) (obj2)), 0, 0, ((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), ((Matrix) (obj)), true);
        if (kh1 != obj2)
        {
            ((Bitmap) (obj2)).recycle();
        }
        return kh1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = obj2;
        obj1 = new ke();
          goto _L10
        kh1;
        kx.a(((java.io.Closeable) (obj)));
        throw kh1;
_L9:
        obj = obj1;
        jo3 = kh1.c;
        obj = obj1;
        if (i == jn.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        i = kv.a(((jo) (obj2)), jo3, kh1.e, flag);
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }
}
