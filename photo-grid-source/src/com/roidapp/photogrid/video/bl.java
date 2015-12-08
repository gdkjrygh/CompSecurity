// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.graphics.Bitmap;
import com.bumptech.glide.load.a.c;
import com.roidapp.baselib.a.a;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;

public final class bl
    implements c
{

    private final ig a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public bl(ig ig1, int i, int j)
    {
label0:
        {
            boolean flag1 = false;
            super();
            a = ig1;
            d = i;
            e = j;
            boolean flag;
            if (a.e != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            if (!c)
            {
                flag = flag1;
                if (!ih.C().ax())
                {
                    break label0;
                }
            }
            flag = true;
        }
        b = flag;
    }

    private Bitmap d()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = a.e;
_L4:
        obj = com.roidapp.baselib.a.a.a(((String) (obj)), d, e, false, b);
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (b)
        {
            return ((Bitmap) (obj));
        }
        break MISSING_BLOCK_LABEL_66;
        Bitmap bitmap;
        try
        {
            obj = a.d();
        }
        catch (Exception exception)
        {
            return null;
        }
          goto _L4
        com.roidapp.baselib.a.a.a();
        bitmap = com.roidapp.baselib.a.a.a(((Bitmap) (obj)), d, e);
        ((Bitmap) (obj)).recycle();
        return bitmap;
    }

    public final Object a(int i)
    {
        return d();
    }

    public final void a()
    {
    }

    public final String b()
    {
        if (a != null)
        {
            return (new StringBuilder("[")).append(a.hashCode()).append("-").append(a.e).append("-").append(a.d()).append("-").append(d).append("-").append(e).append("-").append(c).append("-").append(b).append("]").toString();
        } else
        {
            return "";
        }
    }

    public final void c()
    {
    }
}
