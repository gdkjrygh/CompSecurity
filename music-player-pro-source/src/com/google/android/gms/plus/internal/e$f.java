// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.people.PersonBuffer;

// Referenced classes of package com.google.android.gms.plus.internal:
//            e

final class OB extends com.google.android.gms.internal.
    implements com.google.android.gms.plus.le.LoadPeopleResult
{

    private final Status Eb;
    private final String OB;
    final e anJ;
    private PersonBuffer anM;

    protected void a(com.google.android.gms.common.api.Implementation.b b1, DataHolder dataholder)
    {
        if (dataholder != null)
        {
            dataholder = new PersonBuffer(dataholder);
        } else
        {
            dataholder = null;
        }
        anM = dataholder;
        b1.b(this);
    }

    protected void b(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.Implementation.b)obj, dataholder);
    }

    public String getNextPageToken()
    {
        return OB;
    }

    public PersonBuffer getPersonBuffer()
    {
        return anM;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public void release()
    {
        if (anM != null)
        {
            anM.close();
        }
    }

    public lder(e e1, com.google.android.gms.common.api.Implementation.b b1, Status status, DataHolder dataholder, String s)
    {
        anJ = e1;
        super(e1, b1, dataholder);
        Eb = status;
        OB = s;
    }
}
