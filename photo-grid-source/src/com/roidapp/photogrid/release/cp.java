// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ck, PhotoGridActivity, ih

final class cp
    implements android.view.View.OnClickListener
{

    final ck a;

    cp(ck ck1)
    {
        a = ck1;
        super();
    }

    public final void onClick(View view)
    {
        if (!ck.b(a).i)
        {
            ih.C().q(false);
            ck.l(a);
        }
    }
}
