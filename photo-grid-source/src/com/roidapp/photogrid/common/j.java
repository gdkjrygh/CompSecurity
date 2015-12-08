// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;
import com.roidapp.cloudlib.ads.d;

// Referenced classes of package com.roidapp.photogrid.common:
//            e, b

final class j
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final d b;
    final e c;

    j(e e1, String s, d d1)
    {
        c = e1;
        a = s;
        b = d1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(e.a(c)).append(a).append("/com.cleanmaster.mguard/Click/Description/Dialog/Download").toString());
        e.a(c, "com.cleanmaster.mguard", b.g("com.cleanmaster.mguard"), a);
    }
}
