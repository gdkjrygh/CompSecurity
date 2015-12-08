// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class abN extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.nts.LoadMomentsResult
{

    private final String HS;
    final e abM;
    private final String abN;
    private MomentBuffer abO;
    private final Status yz;

    protected void a(com.google.android.gms.common.api..c c1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new MomentBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        abO = dataholder;
        c1.a(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.)obj, dataholder);
    }

    public MomentBuffer getMomentBuffer()
    {
        return abO;
    }

    public String getNextPageToken()
    {
        return HS;
    }

    public Status getStatus()
    {
        return yz;
    }

    public String getUpdated()
    {
        return abN;
    }

    public void release()
    {
        if (abO != null)
        {
            abO.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api. , Status status, DataHolder dataholder, String s, String s1)
    {
        abM = e1;
        super(e1, , dataholder);
        yz = status;
        HS = s;
        abN = s1;
    }
}
