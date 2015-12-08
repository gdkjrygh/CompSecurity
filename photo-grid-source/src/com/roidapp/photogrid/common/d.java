// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.common:
//            c

final class d
    implements android.content.DialogInterface.OnClickListener
{

    final Activity a;
    final String b;

    d(Activity activity, String s)
    {
        a = activity;
        b = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a(a, b, "");
        dialoginterface.dismiss();
    }
}
