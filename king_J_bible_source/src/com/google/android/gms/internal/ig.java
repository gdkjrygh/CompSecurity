// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            ie, if

public final class ig extends b
    implements Moment
{

    private ie VG;

    public ig(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private ie ju()
    {
        this;
        JVM INSTR monitorenter ;
        if (VG == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            VG = ie.CREATOR.aM(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return VG;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object freeze()
    {
        return jt();
    }

    public String getId()
    {
        return ju().getId();
    }

    public ItemScope getResult()
    {
        return ju().getResult();
    }

    public String getStartDate()
    {
        return ju().getStartDate();
    }

    public ItemScope getTarget()
    {
        return ju().getTarget();
    }

    public String getType()
    {
        return ju().getType();
    }

    public boolean hasId()
    {
        return ju().hasId();
    }

    public boolean hasResult()
    {
        return ju().hasId();
    }

    public boolean hasStartDate()
    {
        return ju().hasStartDate();
    }

    public boolean hasTarget()
    {
        return ju().hasTarget();
    }

    public boolean hasType()
    {
        return ju().hasType();
    }

    public ie jt()
    {
        return ju();
    }
}
