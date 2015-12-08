// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a, e

final class anI extends a
{

    private final com.google.android.gms.common.api.Implementation.b anI;
    final e anJ;

    public void h(int i, Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        } else
        {
            bundle = null;
        }
        bundle = new Status(i, null, bundle);
        anJ.a(new <init>(anJ, anI, bundle));
    }

    public ntation.b(e e1, com.google.android.gms.common.api.Implementation.b b)
    {
        anJ = e1;
        super();
        anI = b;
    }
}
