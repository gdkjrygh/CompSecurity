// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.d;

import android.graphics.Bitmap;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;

// Referenced classes of package com.roidapp.imagelib.d:
//            d, b

final class c extends com.roidapp.baselib.c.c
{

    final b a;
    private final String b;
    private final Bitmap c;
    private final int d;
    private d e;

    public c(b b1, String s, Bitmap bitmap, int i, d d1)
    {
        a = b1;
        super();
        b = s;
        d = i;
        e = d1;
        c = bitmap;
    }

    private transient Bitmap a()
    {
        Bitmap bitmap;
        try
        {
            if (c != null && !c.isRecycled())
            {
                return com.roidapp.imagelib.b.c.a(c, d);
            }
            bitmap = com.roidapp.imagelib.b.c.a(b, d);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            return null;
        }
        return bitmap;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (obj == null)
        {
            an.a(aj.a(), "Do blur out of memory");
        }
        if (e != null)
        {
            e.a(((Bitmap) (obj)));
        }
    }
}
