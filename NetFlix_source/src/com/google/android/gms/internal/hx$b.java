// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hx

final class TH extends TH
{

    final hx TE;
    private final com.google.android.gms.common.api.s TF;
    private final com.google.android.gms.common.api.s TG;
    private final Uri TH;

    public void a(int i, Bundle bundle, int j, Intent intent)
    {
        if (TH != null)
        {
            TE.getContext().revokeUriPermission(TH, 1);
        }
        if (bundle != null)
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        } else
        {
            bundle = null;
        }
        bundle = new Status(i, null, bundle);
        if (TG != null)
        {
            TE.a(new <init>(TE, TG, bundle, intent));
        } else
        if (TF != null)
        {
            TE.a(new <init>(TE, TF, bundle, j, intent));
            return;
        }
    }

    public (hx hx1, com.google.android.gms.common.api.s s, com.google.android.gms.common.api.s s1, Uri uri)
    {
        TE = hx1;
        super();
        TF = s;
        TG = s1;
        TH = uri;
    }
}
