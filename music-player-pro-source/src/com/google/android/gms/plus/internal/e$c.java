// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.MomentBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class anK extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.nts.LoadMomentsResult
{

    private final Status Eb;
    private final String OB;
    final e anJ;
    private final String anK;
    private MomentBuffer anL;

    protected void a(com.google.android.gms.common.api.Implementation.b b1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new MomentBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        anL = dataholder;
        b1.b(this);
    }

    protected void b(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.Implementation.b)obj, dataholder);
    }

    public MomentBuffer getMomentBuffer()
    {
        return anL;
    }

    public String getNextPageToken()
    {
        return OB;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public String getUpdated()
    {
        return anK;
    }

    public void release()
    {
        if (anL != null)
        {
            anL.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api.Implementation.b b1, Status status, DataHolder dataholder, String s, String s1)
    {
        anJ = e1;
        super(e1, b1, dataholder);
        Eb = status;
        OB = s;
        anK = s1;
    }
}
