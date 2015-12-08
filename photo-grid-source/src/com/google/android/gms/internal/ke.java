// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            kd, qa

final class ke
    implements android.content.DialogInterface.OnClickListener
{

    final kd a;

    ke(kd kd1)
    {
        a = kd1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.b();
        zzp.zzbv();
        qa.a(kd.a(a), dialoginterface);
    }
}
