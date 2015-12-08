// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            nw, nx

public final class ny extends d
    implements Moment
{

    private nw amZ;

    public ny(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private nw nt()
    {
        this;
        JVM INSTR monitorenter ;
        if (amZ == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            amZ = nw.CREATOR.dc(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return amZ;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object freeze()
    {
        return ns();
    }

    public String getId()
    {
        return nt().getId();
    }

    public ItemScope getResult()
    {
        return nt().getResult();
    }

    public String getStartDate()
    {
        return nt().getStartDate();
    }

    public ItemScope getTarget()
    {
        return nt().getTarget();
    }

    public String getType()
    {
        return nt().getType();
    }

    public boolean hasId()
    {
        return nt().hasId();
    }

    public boolean hasResult()
    {
        return nt().hasResult();
    }

    public boolean hasStartDate()
    {
        return nt().hasStartDate();
    }

    public boolean hasTarget()
    {
        return nt().hasTarget();
    }

    public boolean hasType()
    {
        return nt().hasType();
    }

    public nw ns()
    {
        return nt();
    }
}
