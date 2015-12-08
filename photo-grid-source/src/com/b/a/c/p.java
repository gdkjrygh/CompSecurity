// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import android.content.DialogInterface;

// Referenced classes of package com.b.a.c:
//            o, t

final class p
    implements android.content.DialogInterface.OnClickListener
{

    final o a;

    p(o o1)
    {
        a = o1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.b.a(true);
        dialoginterface.dismiss();
    }
}
