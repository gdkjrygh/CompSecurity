// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.graphics.Bitmap;
import android.os.Handler;
import com.roidapp.baselib.c.c;

// Referenced classes of package com.roidapp.imagelib.a:
//            a, e

final class f extends c
{

    final a a;
    private final String b = null;
    private final String c = null;
    private final int d = 360;
    private final int e;
    private final e f;
    private final Handler g = new Handler();

    public f(a a1, int i, e e1)
    {
        a = a1;
        super();
        e = i;
        f = e1;
    }

    private transient Bitmap a()
    {
        Bitmap bitmap;
        try
        {
            if (d != 0)
            {
                return a.a(d, e);
            }
            bitmap = a.h();
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
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
        f.a(((Bitmap) (obj)));
    }
}
