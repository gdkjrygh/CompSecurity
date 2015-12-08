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
//            pf, pg

public final class ph extends d
    implements Moment
{

    private pf apk;

    public ph(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private pf oK()
    {
        this;
        JVM INSTR monitorenter ;
        if (apk == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            apk = pf.CREATOR.dy(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return apk;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object freeze()
    {
        return oJ();
    }

    public final String getId()
    {
        return oK().getId();
    }

    public final ItemScope getResult()
    {
        return oK().getResult();
    }

    public final String getStartDate()
    {
        return oK().getStartDate();
    }

    public final ItemScope getTarget()
    {
        return oK().getTarget();
    }

    public final String getType()
    {
        return oK().getType();
    }

    public final boolean hasId()
    {
        return oK().hasId();
    }

    public final boolean hasResult()
    {
        return oK().hasResult();
    }

    public final boolean hasStartDate()
    {
        return oK().hasStartDate();
    }

    public final boolean hasTarget()
    {
        return oK().hasTarget();
    }

    public final boolean hasType()
    {
        return oK().hasType();
    }

    public final pf oJ()
    {
        return oK();
    }
}
