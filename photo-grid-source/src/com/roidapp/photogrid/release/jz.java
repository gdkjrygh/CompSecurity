// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.photogrid.b.f;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, ke

final class jz
    implements android.widget.AdapterView.OnItemClickListener
{

    final ImageSelector a;

    jz(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 173
    //                   1 244
    //                   2 315;
           goto _L1 _L2 _L3 _L4
_L1:
        if (i == ImageSelector.u(a).getAdapter().getCount() - 1) goto _L6; else goto _L5
_L5:
        ImageSelector.c(a, i);
        ImageSelector.c(a, (String)ImageSelector.u(a).getAdapter().getItem(i));
        i = ImageSelector.h(a).lastIndexOf("/") + 1;
        if (i <= 0 || i >= ImageSelector.h(a).length()) goto _L8; else goto _L7
_L7:
        adapterview = ImageSelector.h(a).substring(i);
        if (!adapterview.equals("PicsArt")) goto _L10; else goto _L9
_L9:
        f.a("PicsArt");
_L8:
        ImageSelector.b(a, ke.e);
        ImageSelector.r(a).f(ImageSelector.q(a));
_L6:
        return;
_L2:
        if ("cloudFragment".equals(ImageSelector.B(a)))
        {
            ImageSelector.r(a).f(ImageSelector.q(a));
            return;
        } else
        {
            ImageSelector.c(a, i);
            ImageSelector.b(a, ke.b);
            ImageSelector.r(a).f(ImageSelector.q(a));
            return;
        }
_L3:
        if ("myfolder".equals(ImageSelector.B(a)))
        {
            ImageSelector.r(a).f(ImageSelector.q(a));
            return;
        } else
        {
            ImageSelector.c(a, i);
            ImageSelector.b(a, ke.c);
            ImageSelector.r(a).f(ImageSelector.q(a));
            return;
        }
_L4:
        if (i == ImageSelector.u(a).getAdapter().getCount() - 1) goto _L6; else goto _L11
_L11:
        ImageSelector.c(a, i);
        ImageSelector.c(a, (String)ImageSelector.u(a).getAdapter().getItem(i));
        ImageSelector.b(a, ke.d);
        ImageSelector.r(a).f(ImageSelector.q(a));
        return;
_L10:
        if (adapterview.equals("Instagram"))
        {
            f.a("Instagram");
        } else
        if (adapterview.equals("Retrica"))
        {
            f.a("Retrica");
        } else
        if (adapterview.equals("LINEcamera"))
        {
            f.a("LINEcamera");
        }
        if (true) goto _L8; else goto _L12
_L12:
    }
}
