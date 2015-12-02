// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity;

import android.content.DialogInterface;

// Referenced classes of package com.facebook.bugreporter.activity:
//            d, BugReportActivity

class e
    implements android.content.DialogInterface.OnClickListener
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
        a.Z.finish();
    }
}
