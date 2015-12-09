// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ac;

// Referenced classes of package com.jcp.adapters:
//            TrackPackageAdapter

class dc
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final TrackPackageAdapter b;

    dc(TrackPackageAdapter trackpackageadapter, String s)
    {
        b = trackpackageadapter;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a));
        TrackPackageAdapter.a(b).startActivity(dialoginterface);
    }
}
