// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

final class lcy extends lcq
{

    private final jzc a;

    public lcy(jzc jzc1)
    {
        a = jzc1;
    }

    public final void a(int i, Bundle bundle, int j, Intent intent)
    {
        if (bundle != null)
        {
            bundle = (PendingIntent)bundle.getParcelable("pendingIntent");
        } else
        {
            bundle = null;
        }
        bundle = new Status(i, null, bundle);
        a.a(new lco(bundle, intent, j));
    }
}
