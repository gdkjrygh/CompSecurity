// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.DialogInterface;

// Referenced classes of package com.taplytics:
//            ci

final class cq
    implements android.content.DialogInterface.OnClickListener
{

    final ci a;

    cq(ci ci1)
    {
        a = ci1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
        ci.o(a);
    }
}
