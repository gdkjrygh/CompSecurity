// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.view.View;

// Referenced classes of package com.kik.view.adapters:
//            bp, bf, ak

final class bq
    implements android.view.View.OnClickListener
{

    final ak a;
    final bp b;

    bq(bp bp1, ak ak)
    {
        b = bp1;
        a = ak;
        super();
    }

    public final void onClick(View view)
    {
        b.d.a(b.a, a);
    }
}
