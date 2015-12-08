// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            r, b, GridImageView

final class u extends c
{

    final r a;
    private String b;
    private final WeakReference c;

    public u(r r1, GridImageView gridimageview)
    {
        a = r1;
        super();
        b = null;
        c = new WeakReference(gridimageview);
    }

    private transient Bitmap a(Integer ainteger[])
    {
        if (r.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        Object obj = r.b(a);
        obj;
        JVM INSTR monitorenter ;
        if (r.b(a) == null || r.b(a).isEmpty() || r.b(a).size() <= 0 || ainteger[0].intValue() >= r.b(a).size()) goto _L2; else goto _L1
_L1:
        ainteger = (b)r.b(a).get(ainteger[0].intValue());
_L10:
        Bitmap bitmap = r.a(a, ainteger);
        if (com.roidapp.photogrid.release.r.c(a) == null) goto _L4; else goto _L3
_L3:
        obj = com.roidapp.photogrid.release.r.c(a);
        obj;
        JVM INSTR monitorenter ;
        if (ainteger == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (!((b) (ainteger)).g) goto _L6; else goto _L5
_L5:
        b = ((b) (ainteger)).e;
_L8:
        if (b != null && bitmap != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        ainteger;
        obj;
        JVM INSTR monitorexit ;
        throw ainteger;
_L6:
        b = String.valueOf(((b) (ainteger)).a);
        if (true) goto _L8; else goto _L7
        ainteger;
        obj;
        JVM INSTR monitorexit ;
        throw ainteger;
_L7:
        if (com.roidapp.photogrid.release.r.c(a) != null && com.roidapp.photogrid.release.r.c(a).get(b) == null)
        {
            com.roidapp.photogrid.release.r.c(a).put(b, bitmap);
        }
        obj;
        JVM INSTR monitorexit ;
_L4:
        return bitmap;
_L2:
        ainteger = null;
        continue; /* Loop/switch isn't completed */
        ainteger = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static String a(u u1)
    {
        return u1.b;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected final volatile void onCancelled(Object obj)
    {
        super.onCancelled((Bitmap)obj);
    }

    protected final void onPostExecute(Object obj)
    {
        Bitmap bitmap = (Bitmap)obj;
        obj = bitmap;
        if (isCancelled())
        {
            bitmap.recycle();
            obj = null;
        }
        if (c != null)
        {
            GridImageView gridimageview = (GridImageView)c.get();
            if (this == r.a(gridimageview))
            {
                gridimageview.a(((Bitmap) (obj)));
            }
        }
        super.onPostExecute(obj);
    }
}
