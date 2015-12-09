// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            rn

final class aCQ extends aCQ
    implements com.google.android.gms.people.LoadOwnersResult
{

    private final Status EU;
    final rn aCC;
    private final OwnerBuffer aCQ;

    private void p(com.google.android.gms.common.api.plementation.b b)
    {
        if (b != null)
        {
            b.d(this);
        }
    }

    public final OwnerBuffer getOwners()
    {
        return aCQ;
    }

    public final Status getStatus()
    {
        return EU;
    }

    protected final void i(Object obj)
    {
        p((com.google.android.gms.common.api.plementation.b)obj);
    }

    protected final void iQ()
    {
        release();
    }

    public final void release()
    {
        if (aCQ != null)
        {
            aCQ.close();
        }
    }

    public nerBuffer(rn rn1, com.google.android.gms.common.api.plementation.b b, Status status, OwnerBuffer ownerbuffer)
    {
        aCC = rn1;
        super(rn1, b);
        EU = status;
        aCQ = ownerbuffer;
    }
}
