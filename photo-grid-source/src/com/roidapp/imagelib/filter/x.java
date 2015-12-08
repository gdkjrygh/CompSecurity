// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.Context;
import android.widget.ImageView;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

// Referenced classes of package com.roidapp.imagelib.filter:
//            ax, s

final class x extends ax
{

    final s a;

    x(s s, IGroupInfo igroupinfo, Context context)
    {
        a = s;
        super(igroupinfo, context);
    }

    public final void a(ImageView imageview, IFilterInfo ifilterinfo)
    {
        imageview.setImageDrawable(ifilterinfo.a(imageview.getContext()));
    }
}
