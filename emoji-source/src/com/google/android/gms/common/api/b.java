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

    protected final DataHolder DG;
    protected final Status yz;

    protected b(DataHolder dataholder)
    {
        yz = new Status(dataholder.getStatusCode());
        DG = dataholder;
    }

    public Status getStatus()
    {
        return yz;
    }

    public void release()
    {
        if (DG != null)
        {
            DG.close();
        }
    }
}
