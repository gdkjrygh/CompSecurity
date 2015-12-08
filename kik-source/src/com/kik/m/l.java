// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.kik.m:
//            j, k

final class l
    implements j
{

    l()
    {
    }

    public final byte[] a(byte abyte0[], android.graphics.Bitmap.CompressFormat compressformat, long l1)
    {
        if (abyte0 == null || (long)abyte0.length <= l1)
        {
            return abyte0;
        }
        int i = k.a(abyte0.length, l1);
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        if (abyte0 != null)
        {
            Object obj;
            do
            {
                ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                abyte0.compress(compressformat, i, bytearrayoutputstream);
                obj = bytearrayoutputstream.toByteArray();
                bytearrayoutputstream.close();
                i -= 10;
            } while (i > 20 && (long)obj.length > l1 && l1 != -1L);
            if ((long)obj.length <= l1 || l1 == -1L)
            {
                if (compressformat != android.graphics.Bitmap.CompressFormat.JPEG)
                {
                    abyte0 = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length);
                    obj = new ByteArrayOutputStream();
                    abyte0.compress(compressformat, 100, ((java.io.OutputStream) (obj)));
                    compressformat = ((ByteArrayOutputStream) (obj)).toByteArray();
                    ((ByteArrayOutputStream) (obj)).close();
                } else
                {
                    compressformat = ((android.graphics.Bitmap.CompressFormat) (obj));
                }
            } else
            {
                compressformat = null;
            }
            abyte0.recycle();
            return compressformat;
        } else
        {
            return null;
        }
    }
}
