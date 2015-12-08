// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.plus.internal:
//            a, e

final class TG extends a
{

    private final com.google.android.gms.common.api.aHolder TG;
    final e Ud;

    public void a(DataHolder dataholder, String s)
    {
        Object obj;
        if (dataholder.getMetadata() != null)
        {
            obj = (PendingIntent)dataholder.getMetadata().getParcelable("pendingIntent");
        } else
        {
            obj = null;
        }
        obj = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
        if (!((Status) (obj)).isSuccess() && dataholder != null)
        {
            if (!dataholder.isClosed())
            {
                dataholder.close();
            }
            dataholder = null;
        }
        Ud.a(new <init>(Ud, TG, ((Status) (obj)), dataholder, s));
    }

    public lder(e e1, com.google.android.gms.common.api. )
    {
        Ud = e1;
        super();
        TG = ;
    }
}
