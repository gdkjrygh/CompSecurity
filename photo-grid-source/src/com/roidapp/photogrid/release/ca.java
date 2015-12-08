// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            by, PhotoGridActivity

final class ca
    implements android.view.View.OnClickListener
{

    final by a;

    ca(by by1)
    {
        a = by1;
        super();
    }

    public final void onClick(View view)
    {
        if (by.a(a).i)
        {
            return;
        } else
        {
            by.a(a).g(false);
            return;
        }
    }
}
