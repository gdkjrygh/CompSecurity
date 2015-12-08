// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            nn, PhotoGridActivity

final class nq
    implements android.view.View.OnClickListener
{

    final nn a;

    nq(nn nn1)
    {
        a = nn1;
        super();
    }

    public final void onClick(View view)
    {
        nn.d(a);
        nn.e(a);
        if (nn.g(a))
        {
            ((PhotoGridActivity)nn.c(a)).h = true;
        }
        b.a("PhotoSaveDialog/Save");
        ((PhotoGridActivity)nn.c(a)).s();
    }
}
