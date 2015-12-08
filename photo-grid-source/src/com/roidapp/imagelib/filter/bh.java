// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.view.View;

// Referenced classes of package com.roidapp.imagelib.filter:
//            bg, ad

final class bh
    implements android.view.View.OnClickListener
{

    final bg a;

    bh(bg bg1)
    {
        a = bg1;
        super();
    }

    public final void onClick(View view)
    {
        if (bg.a(a) == null)
        {
            return;
        } else
        {
            bg.a(a).e();
            return;
        }
    }
}
