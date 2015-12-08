// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class b
    implements Releasable, Result
{

    protected final DataHolder DD;
    protected final Status yw;

    protected b(DataHolder dataholder)
    {
        yw = new Status(dataholder.getStatusCode());
        DD = dataholder;
    }

    public Status getStatus()
    {
        return yw;
    }

    public void release()
    {
        if (DD != null)
        {
            DD.close();
        }
    }
}
