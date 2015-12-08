// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class elu
{

    cvq a;
    private android.graphics.Bitmap.CompressFormat b;
    private int c;

    public elu(Context context, String s, android.graphics.Bitmap.CompressFormat compressformat)
    {
        b = android.graphics.Bitmap.CompressFormat.JPEG;
        c = 70;
        try
        {
            a = cvq.a(new File((new StringBuilder()).append(context.getCacheDir().getPath()).append(File.separator).append(s).toString()), 1, 0xa00000L);
            b = compressformat;
            c = 70;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.getMessage();
        }
    }

    public final Bitmap a(String s, int i)
    {
        Object obj2;
        int j;
        obj2 = null;
        j = 1;
        Object obj = a.a(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        s = obj2;
        if (obj != null)
        {
            ((cvu) (obj)).close();
            s = obj2;
        }
_L5:
        return s;
_L2:
        s = ((String) (obj));
        Object obj1 = ((cvu) (obj)).a[0];
        s = ((String) (obj));
        byte abyte0[] = new byte[8192];
        s = ((String) (obj));
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(2048);
_L4:
        s = ((String) (obj));
        int k = ((InputStream) (obj1)).read(abyte0, 0, 8192);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj));
        bytearrayoutputstream.write(abyte0, 0, k);
        if (true) goto _L4; else goto _L3
        obj1;
_L11:
        s = ((String) (obj));
        ((IOException) (obj1)).getMessage();
        s = obj2;
        if (obj != null)
        {
            ((cvu) (obj)).close();
            return null;
        }
          goto _L5
_L3:
        s = ((String) (obj));
        obj1 = bytearrayoutputstream.toByteArray();
        s = ((String) (obj));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        s = ((String) (obj));
        options.inJustDecodeBounds = true;
        s = ((String) (obj));
        BitmapFactory.decodeByteArray(((byte []) (obj1)), 0, obj1.length, options);
_L7:
        s = ((String) (obj));
        if (options.outWidth / j / 2 < i)
        {
            break; /* Loop/switch isn't completed */
        }
        j <<= 1;
        if (true) goto _L7; else goto _L6
_L6:
        s = ((String) (obj));
        i = obj1.length;
        s = ((String) (obj));
        options = new android.graphics.BitmapFactory.Options();
        s = ((String) (obj));
        options.inPurgeable = true;
        s = ((String) (obj));
        options.inDither = false;
        s = ((String) (obj));
        options.inInputShareable = true;
        s = ((String) (obj));
        options.inSampleSize = j;
        s = ((String) (obj));
        obj1 = BitmapFactory.decodeByteArray(((byte []) (obj1)), 0, i, options);
        s = ((String) (obj1));
        if (obj == null) goto _L5; else goto _L8
_L8:
        ((cvu) (obj)).close();
        return ((Bitmap) (obj1));
        s;
        obj1 = null;
        obj = s;
_L10:
        if (obj1 != null)
        {
            ((cvu) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = s;
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
        obj = null;
          goto _L11
    }

    final boolean a(Bitmap bitmap, cvr cvr1)
    {
        cvr1 = new BufferedOutputStream(cvr1.a(0), 8192);
        boolean flag = bitmap.compress(b, c, cvr1);
        cvr1.close();
        return flag;
        bitmap;
        cvr1 = null;
_L2:
        if (cvr1 != null)
        {
            cvr1.close();
        }
        throw bitmap;
        bitmap;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
