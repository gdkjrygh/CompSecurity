// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.people.internal:
//            AbstractPeopleCallbacks, PeopleClientImpl, PeopleServiceLog

private static final class mListener extends AbstractPeopleCallbacks
{

    private final com.google.android.gms.common.api.internal.tener mListener;

    public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
    {
        if (PeopleServiceLog.canLog(3))
        {
            PeopleServiceLog.d("PeopleClient", (new StringBuilder("Owner callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
        }
        com.google.android.gms.common.api.Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
        if (dataholder == null)
        {
            bundle = null;
        } else
        {
            bundle = new OwnerBuffer(dataholder);
        }
        mListener.tener(new mListener(status, bundle));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mListener = ;
    }
}
