// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            by

final class ca
    implements android.content.DialogInterface.OnClickListener
{

    final by a;

    ca(by by1)
    {
        a = by1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("Operation denied by user.");
    }
}
