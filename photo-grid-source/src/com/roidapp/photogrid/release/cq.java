// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, cd, ck, PhotoGridActivity

final class cq
    implements android.view.View.OnClickListener
{

    final ImageView a;
    final ck b;

    cq(ck ck1, ImageView imageview)
    {
        b = ck1;
        a = imageview;
        super();
    }

    public final void onClick(View view)
    {
        ih.C().q(0);
        view = new cd();
        ck.b(b).a(0x7f0d03ec, view, "FragmentBgListSub");
        a.setVisibility(8);
    }
}
