// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.DialogInterface;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            be

final class bf
    implements android.content.DialogInterface.OnClickListener
{

    final Activity a;
    final be b;

    bf(be be, Activity activity)
    {
        b = be;
        a = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        System.gc();
        c.a("100", a);
    }
}
