// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.release.ig;

public final class b
{

    public static Bitmap a(com.roidapp.imagelib.e.b b1, Bitmap bitmap, ig ig1)
    {
        if (b1 != null)
        {
            boolean flag;
            if (!TextUtils.isEmpty(ig1.b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                if ((b1 = b1.a(bitmap)) != null && b1 != bitmap)
                {
                    if (bitmap != null && !bitmap.isRecycled())
                    {
                        bitmap.recycle();
                    }
                    return b1;
                }
            }
        }
        return bitmap;
    }

    public static com.roidapp.imagelib.e.b a(Context context)
    {
        if (!aa.a().g())
        {
            return null;
        }
        bi bi1 = new bi(context);
        IGroupInfo igroupinfo = aa.a().d();
        if (igroupinfo != null)
        {
            bi1.a(igroupinfo.a());
        } else
        {
            bi1.a(null);
        }
        bi1.a(aa.a().e());
        bi1.a(aa.a().b());
        bi1.c(true);
        return new com.roidapp.imagelib.e.b(context, bi1);
    }

    public static com.roidapp.imagelib.e.b b(Context context)
    {
        if (!aa.a().g())
        {
            return null;
        }
        bi bi1 = new bi(context);
        com.roidapp.imagelib.filter.filterinfo.IFilterInfo ifilterinfo = aa.a().c();
        if (ifilterinfo != null)
        {
            bi1.a(ifilterinfo);
        } else
        {
            bi1.a(null);
        }
        bi1.a(aa.a().e());
        bi1.a(aa.a().b());
        bi1.c(true);
        return new com.roidapp.imagelib.e.b(context, bi1);
    }
}
