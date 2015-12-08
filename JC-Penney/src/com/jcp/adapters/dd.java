// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.adapters:
//            TrackPackageAdapter

class dd
    implements android.content.DialogInterface.OnClickListener
{

    final TrackPackageAdapter a;

    dd(TrackPackageAdapter trackpackageadapter)
    {
        a = trackpackageadapter;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
