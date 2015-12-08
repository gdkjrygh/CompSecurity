// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;
import com.android.slyce.k;

// Referenced classes of package com.jcp.activities:
//            SlyceScanActivity

class bx
    implements android.content.DialogInterface.OnClickListener
{

    final SlyceScanActivity a;

    bx(SlyceScanActivity slycescanactivity)
    {
        a = slycescanactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SlyceScanActivity.a(a).e();
    }
}
