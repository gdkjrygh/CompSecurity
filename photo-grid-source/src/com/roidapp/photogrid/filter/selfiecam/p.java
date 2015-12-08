// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.DialogInterface;
import com.roidapp.photogrid.release.ParentActivity;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            o, a

final class p
    implements android.content.DialogInterface.OnCancelListener
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (o.a(a))
        {
            if (o.b(a).x != null)
            {
                if (o.c(a))
                {
                    o.b(a).x.a();
                } else
                {
                    o.b(a).x.b();
                }
            }
            o.d(a);
        }
    }
}
