// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            c, b

final class f
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    final c b;

    f(c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c.a(b, a);
    }
}
