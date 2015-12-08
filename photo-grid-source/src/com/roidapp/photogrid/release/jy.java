// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.roidapp.baselib.view.j;
import com.roidapp.photogrid.common.b;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, jv, ke, la, 
//            kp, kt, ih, ig

final class jy
    implements j
{

    final ImageSelector a;

    jy(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void a()
    {
        ImageSelector.a(a, true);
    }

    public final void a(float f)
    {
        if (f != 0.0F) goto _L2; else goto _L1
_L1:
        ImageSelector.a(a, false);
        jv.a[ImageSelector.x(a) - 1];
        JVM INSTR tableswitch 1 5: default 64
    //                   1 76
    //                   2 147
    //                   3 218
    //                   4 288
    //                   5 402;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        com.roidapp.photogrid.release.ImageSelector.b(a, ke.a);
        return;
_L4:
        if (ImageSelector.v(a) != null)
        {
            ImageSelector.v(a).a(0, true);
            com.roidapp.photogrid.common.b.a("ImageSelector/initCloud");
            ImageSelector.s(a).a();
            ImageSelector.s(a).g();
            ImageSelector.y(a).b();
            ImageSelector.z(a).setVisibility(4);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (ImageSelector.v(a) != null)
        {
            ImageSelector.v(a).a(1, true);
            com.roidapp.photogrid.common.b.a("ImageSelector/initMyFolders");
            ImageSelector.s(a).a();
            ImageSelector.s(a).g();
            ImageSelector.y(a).c();
            ImageSelector.z(a).setVisibility(4);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (ImageSelector.v(a) != null)
        {
            ImageSelector.v(a).notifyDataSetChanged();
            com.roidapp.photogrid.common.b.a("ImageSelector/initRecent");
            ImageSelector.s(a).a();
            ImageSelector.s(a).g();
            ImageSelector.y(a).a(1);
            ImageSelector.z(a).setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (ImageSelector.v(a) != null)
        {
            ImageSelector.v(a).notifyDataSetChanged();
            ImageSelector.s(a).a();
            ImageSelector.s(a).g();
            ImageSelector.A(a).setText(ImageSelector.c(ImageSelector.h(a)));
            a.a(ImageSelector.h(a), 1);
            ih.C().a((ig[])ImageSelector.k(a).toArray(new ig[0]));
            ImageSelector.z(a).setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        ImageSelector.s(a).a();
        ImageSelector.s(a).d();
        if (true) goto _L3; else goto _L2
_L2:
        ImageSelector.a(a, true);
        return;
    }

    public final void a(int i)
    {
        if (i == 1)
        {
            if (ImageSelector.u(a) != null && ImageSelector.u(a).getAdapter() == null)
            {
                ImageSelector.u(a).setAdapter(ImageSelector.v(a));
                if (ImageSelector.w(a) > 2)
                {
                    ImageSelector.u(a).setSelection(ImageSelector.w(a) - 2);
                }
            }
            com.roidapp.photogrid.release.ImageSelector.b(a, ke.f);
            if (ImageSelector.s(a) != null)
            {
                ImageSelector.s(a).b();
                ImageSelector.s(a).c();
            }
        }
    }

    public final void b()
    {
    }
}
