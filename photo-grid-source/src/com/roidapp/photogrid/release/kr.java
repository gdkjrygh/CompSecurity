// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import com.roidapp.baselib.b.i;
import com.roidapp.baselib.c.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            kp, GridImageView

final class kr extends c
{

    String a;
    GridImageView b;
    boolean c;
    boolean d;
    final kp e;

    public kr(kp kp1, String s, GridImageView gridimageview, boolean flag, boolean flag1)
    {
        e = kp1;
        super();
        a = s;
        b = gridimageview;
        c = flag;
        d = flag1;
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        if (!kp.a(e))
        {
            aobj = ((Object []) (aobj[0]));
            aobj = kp.a(e, ((String) (aobj)), kp.b(e), d);
            if (aobj != null && com.roidapp.photogrid.release.kp.c(e) != null)
            {
                com.roidapp.photogrid.release.kp.c(e).a(a, ((Bitmap) (aobj)));
                return ((Object) (aobj));
            }
        }
        return null;
    }

    protected final void onCancelled()
    {
        super.onCancelled();
    }

    protected final void onPostExecute(Object obj)
    {
        if (isCancelled() || kp.a(e))
        {
            if (obj instanceof Bitmap)
            {
                obj = (Bitmap)obj;
                if (!((Bitmap) (obj)).isRecycled())
                {
                    ((Bitmap) (obj)).recycle();
                }
            }
            return;
        }
        if (obj instanceof Bitmap)
        {
            Bitmap bitmap = (Bitmap)obj;
            if (this == kp.a(b))
            {
                obj = b;
            } else
            {
                obj = null;
            }
            if (obj != null && !bitmap.isRecycled())
            {
                ((GridImageView) (obj)).a(bitmap);
            }
        }
        kp.a(e, this, c);
    }
}
