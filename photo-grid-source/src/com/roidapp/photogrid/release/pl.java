// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoView, ra, PhotoGridActivity, qz, 
//            qx, ps, ig, ih, 
//            ao

final class pl
    implements android.content.DialogInterface.OnClickListener
{

    final ao a;
    final PhotoView b;

    pl(PhotoView photoview, ao ao)
    {
        b = photoview;
        a = ao;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        b.a = false;
        if (!(a instanceof ra)) goto _L2; else goto _L1
_L1:
        PhotoView.a(b).K();
        PhotoView.b(b).remove(a);
_L4:
        PhotoView.e(b).remove(a);
        b.b = -1;
        b.invalidate();
        return;
_L2:
        if (a instanceof qz)
        {
            PhotoView.a(b).K();
            PhotoView.c(b).remove(a);
            qx.a().b((qz)a);
        } else
        if (a instanceof ps)
        {
            dialoginterface = ((ps)a).H;
            PhotoView.d(b).remove(a);
            ig aig[] = PhotoView.a(b).e;
            if (aig != null && aig.length > 0)
            {
                ig aig1[] = new ig[aig.length - 1];
                i = 0;
                int k;
                for (int j = -1; i < aig1.length; j = k)
                {
                    k = j;
                    if (j < 0)
                    {
                        aig1[i] = aig[i];
                        k = j;
                        if (dialoginterface.equals(aig[i]))
                        {
                            k = i;
                        }
                    }
                    if (k >= 0)
                    {
                        aig1[i] = aig[i + 1];
                    }
                    i++;
                }

                PhotoView.a(b).e = aig1;
                ih.C().a(aig1);
                PhotoView.a(b).K();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
