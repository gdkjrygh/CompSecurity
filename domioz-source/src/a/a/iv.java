// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package a.a:
//            iy, jg, iw, js, 
//            jq, iz, jf, ix, 
//            ih, ig, jo

public final class iv
    implements iy
{

    protected final boolean a;

    public iv(boolean flag)
    {
        a = flag;
    }

    private static iw a(String s)
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
        int j = (new ExifInterface(jg.c.c(s))).getAttributeInt("Orientation", 1);
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
        return new iw(i, flag1);
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
        js.c("Can't read EXIF tags from file [%s]", new Object[] {
            s
        });
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static InputStream a(InputStream inputstream, iz iz1)
    {
        try
        {
            inputstream.reset();
        }
        catch (IOException ioexception)
        {
            jq.a(inputstream);
            return b(iz1);
        }
        return inputstream;
    }

    private static InputStream b(iz iz1)
    {
        return iz1.f.a(iz1.b, iz1.g);
    }

    public final Bitmap a(iz iz1)
    {
        Object obj;
        Object obj2;
        obj2 = b(iz1);
        obj = obj2;
        Object obj3 = new android.graphics.BitmapFactory.Options();
        obj = obj2;
        obj3.inJustDecodeBounds = true;
        obj = obj2;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        obj = obj2;
        Object obj1 = iz1.b;
        obj = obj2;
        if (!iz1.h) goto _L2; else goto _L1
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
        if (jg.a(((String) (obj1))) != jg.c) goto _L4; else goto _L6
_L6:
        int i = 1;
_L13:
        if (i == 0) goto _L2; else goto _L7
_L7:
        obj = obj2;
        obj1 = a(((String) (obj1)));
_L10:
        obj = obj2;
        obj3 = new ix(new ih(((android.graphics.BitmapFactory.Options) (obj3)).outWidth, ((android.graphics.BitmapFactory.Options) (obj3)).outHeight, ((iw) (obj1)).a), ((iw) (obj1)));
        obj = obj2;
        obj1 = a(((InputStream) (obj2)), iz1);
        obj = obj1;
        obj2 = ((ix) (obj3)).a;
        obj = obj1;
        i = iz1.d;
        obj = obj1;
        if (i != ig.a) goto _L9; else goto _L8
_L8:
        obj = obj1;
        i = jo.a(((ih) (obj2)));
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
        js.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] {
            obj2, new ih(((ih) (obj2)).a / i, ((ih) (obj2)).b / i), Integer.valueOf(i), iz1.a
        });
        obj = obj1;
        obj2 = iz1.i;
        obj = obj1;
        obj2.inSampleSize = i;
        obj = obj1;
        obj2 = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj2)));
        jq.a(((java.io.Closeable) (obj1)));
        ih ih3;
        boolean flag;
        if (obj2 == null)
        {
            js.d("Image can't be decoded [%s]", new Object[] {
                iz1.a
            });
            return ((Bitmap) (obj2));
        }
        i = ((ix) (obj3)).b.a;
        boolean flag2 = ((ix) (obj3)).b.b;
        obj = new Matrix();
        int j = iz1.d;
        if (j == ig.d || j == ig.e)
        {
            ih ih1 = new ih(((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), i);
            ih ih2 = iz1.c;
            int k = iz1.e;
            float f;
            boolean flag1;
            if (j == ig.e)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f = jo.b(ih1, ih2, k, flag1);
            if (Float.compare(f, 1.0F) != 0)
            {
                ((Matrix) (obj)).setScale(f, f);
                if (a)
                {
                    js.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] {
                        ih1, new ih((int)((float)ih1.a * f), (int)((float)ih1.b * f)), Float.valueOf(f), iz1.a
                    });
                }
            }
        }
        if (flag2)
        {
            ((Matrix) (obj)).postScale(-1F, 1.0F);
            if (a)
            {
                js.a("Flip image horizontally [%s]", new Object[] {
                    iz1.a
                });
            }
        }
        if (i != 0)
        {
            ((Matrix) (obj)).postRotate(i);
            if (a)
            {
                js.a("Rotate image on %1$d\260 [%2$s]", new Object[] {
                    Integer.valueOf(i), iz1.a
                });
            }
        }
        iz1 = Bitmap.createBitmap(((Bitmap) (obj2)), 0, 0, ((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), ((Matrix) (obj)), true);
        if (iz1 != obj2)
        {
            ((Bitmap) (obj2)).recycle();
        }
        return iz1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = obj2;
        obj1 = new iw();
          goto _L10
        iz1;
        jq.a(((java.io.Closeable) (obj)));
        throw iz1;
_L9:
        obj = obj1;
        ih3 = iz1.c;
        obj = obj1;
        if (i == ig.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = obj1;
        i = jo.a(((ih) (obj2)), ih3, iz1.e, flag);
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }
}
