// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.SeekBar;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.l;

// Referenced classes of package com.roidapp.photogrid.release:
//            ej, ih, ng

final class ek
    implements l
{

    final ej a;

    ek(ej ej1)
    {
        a = ej1;
        super();
    }

    public final void a(int i, String s)
    {
    }

    public final void a(IGroupInfo igroupinfo, IFilterInfo ifilterinfo)
    {
        if (ifilterinfo.a() == 0)
        {
            ej.a(a).setVisibility(8);
        } else
        {
            if (!ej.a(a).isShown())
            {
                ej.a(a).setVisibility(0);
            }
            IFilterInfo ifilterinfo1 = ih.C().ac();
            if (ifilterinfo1 != null && ifilterinfo1.c() != ifilterinfo.c())
            {
                ej.b(a);
            }
            ej.a(a).setProgress(ej.c(a));
        }
        if (ih.C().ad() != null)
        {
            ih.C().ad().a(null);
        }
        igroupinfo.a(ifilterinfo);
        if (ej.d(a) != null)
        {
            ej.d(a).a(igroupinfo, ifilterinfo, ej.c(a));
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            ej.a(a).setVisibility(8);
            return;
        } else
        {
            ej.a(a).setVisibility(0);
            ej.b(a);
            ej.a(a).setProgress(ej.c(a));
            return;
        }
    }
}
