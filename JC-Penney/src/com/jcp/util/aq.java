// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.DialogInterface;
import com.jcp.activities.MainActivity;

// Referenced classes of package com.jcp.util:
//            ap

class aq
    implements android.content.DialogInterface.OnClickListener
{

    final ap a;

    aq(ap ap1)
    {
        a = ap1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ap.a(a).finish();
        System.exit(1);
    }
}
