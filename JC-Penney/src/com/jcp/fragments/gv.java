// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            TrackOrderHistoryFragment

class gv
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final TrackOrderHistoryFragment b;

    gv(TrackOrderHistoryFragment trackorderhistoryfragment, String s)
    {
        b = trackorderhistoryfragment;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (a != null && a.equalsIgnoreCase("SRV_SESSION_INVALID"))
        {
            TrackOrderHistoryFragment.a(b);
            return;
        } else
        {
            TrackOrderHistoryFragment.b(b);
            return;
        }
    }
}
