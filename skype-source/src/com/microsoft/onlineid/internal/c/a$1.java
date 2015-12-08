// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.c;

import android.content.DialogInterface;

// Referenced classes of package com.microsoft.onlineid.internal.c:
//            a

final class a
    implements android.content.ogInterface.OnClickListener
{

    final a a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }

    kListener(a a1)
    {
        a = a1;
        super();
    }
}
