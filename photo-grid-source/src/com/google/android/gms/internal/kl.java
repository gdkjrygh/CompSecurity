// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            kj

final class kl
    implements android.content.DialogInterface.OnClickListener
{

    final kj a;

    kl(kj kj1)
    {
        a = kj1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a("User canceled the download.");
    }
}
