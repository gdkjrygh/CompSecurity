// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.roidapp.baselib.c.ah;
import com.roidapp.baselib.gl.c;
import com.roidapp.imagelib.c.a;
import com.roidapp.imagelib.c.b;
import com.roidapp.imagelib.c.h;
import com.roidapp.imagelib.e;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

// Referenced classes of package com.roidapp.imagelib.filter:
//            ax, aj

final class an extends ax
{

    final aj a;

    an(aj aj1, IGroupInfo igroupinfo, Context context)
    {
        a = aj1;
        super(igroupinfo, context);
    }

    public final void a(ImageView imageview, IFilterInfo ifilterinfo)
    {
        if (!c.a().c())
        {
            int i = ah.a(a.a);
            int j = (int)a.getResources().getDimension(e.g);
            Object obj = new a(j, j, android.graphics.Bitmap.Config.ARGB_8888, i);
            obj = h.a(a.a.concat(String.valueOf(ifilterinfo.c())), a.e, ifilterinfo, ((a) (obj)));
            a.b.a(imageview, ((h) (obj)), ifilterinfo.a(imageview.getContext()));
            return;
        } else
        {
            imageview.setImageDrawable(ifilterinfo.a(imageview.getContext()));
            return;
        }
    }
}
