// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gj
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final String b;
    final ge c;

    gj(ge ge1, String s, String s1)
    {
        c = ge1;
        a = s;
        b = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ge.c(c, a, b);
        ge.t(c);
    }
}
