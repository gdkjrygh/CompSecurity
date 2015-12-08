// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.graphics.Bitmap;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.c.e;
import com.roidapp.imagelib.c.h;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import jp.co.cyberagent.android.gpuimage.GPUImageRenderer;
import jp.co.cyberagent.android.gpuimage.PixelBuffer;

// Referenced classes of package com.roidapp.imagelib.filter:
//            n, bi

final class q
    implements e
{

    final n a;

    q(n n1)
    {
        a = n1;
        super();
    }

    public final Bitmap a(Bitmap bitmap, h h1)
    {
        if (bitmap == null)
        {
            return null;
        }
        IFilterInfo ifilterinfo = (IFilterInfo)h1.b;
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        h1 = a;
        if (!h1.isAdded())
        {
            h1 = null;
        } else
        {
            h1 = new bi(h1.getActivity());
            if (ifilterinfo instanceof CloudFilterInfo)
            {
                h1 = h1.a((CloudFilterInfo)ifilterinfo, i, j, new b());
            } else
            {
                h1 = h1.a(ifilterinfo.a(), i, j, new b(), true);
            }
        }
        if (h1 == null)
        {
            return null;
        }
        if (a.d == null)
        {
            try
            {
                a.d = new PixelBuffer(i, j);
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap = new StringBuilder();
                bitmap.append("width:").append(i).append(" height:").append(j);
                bitmap = bitmap.toString();
                ImageLibrary.a().a("ImageFilterView/bitmapHandler/handle/".concat(bitmap));
                return null;
            }
            a.c.setImageThumbnailBitmap(bitmap, true);
            a.d.setRenderer(a.c);
        }
        a.a(ifilterinfo.a());
        a.c.setFilter(h1);
        return a.d.getBitmap();
    }
}
