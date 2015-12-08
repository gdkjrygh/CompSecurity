// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.kik.cache.g;
import com.kik.cache.h;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.usermedia:
//            q

final class n
    implements Runnable
{

    public p a;
    private ContentResolver b;
    private q c;
    private int d;

    public n(q q1, ContentResolver contentresolver, int i)
    {
        a = new p();
        c = q1;
        b = contentresolver;
        d = i;
    }

    public final void run()
    {
        Bitmap bitmap = android.provider.MediaStore.Images.Thumbnails.getThumbnail(b, c.a().longValue(), d, null);
        int i = c.b();
        if (bitmap != null)
        {
            Object obj = bitmap;
            if (i > 0)
            {
                obj = new Matrix();
                ((Matrix) (obj)).setRotate(i);
                obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
            }
            obj = new h(new g(((Bitmap) (obj))), Long.valueOf(0L));
            a.a(obj);
            return;
        } else
        {
            a.a(null);
            return;
        }
    }
}
