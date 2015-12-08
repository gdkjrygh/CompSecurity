// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            bk

final class a
    implements android.content.gInterface.OnClickListener
{

    final bk a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("Operation denied by user.");
    }

    ckListener(bk bk1)
    {
        a = bk1;
        super();
    }
}
