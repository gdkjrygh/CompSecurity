// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, y

final class p
    implements android.content.DialogInterface.OnClickListener
{

    final i a;

    p(i j)
    {
        a = j;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (i.b(a) != null)
        {
            i.b(a).c();
        }
    }
}
