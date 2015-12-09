// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.people.internal:
//            AbstractPeopleCallbacks, PeopleClientImpl, PeopleServiceLog

private static final class mListener extends AbstractPeopleCallbacks
{

    private final com.google.android.gms.common.api.internal.tener mListener;

    public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
    {
        if (PeopleServiceLog.canLog(3))
        {
            PeopleServiceLog.d("PeopleClient", (new StringBuilder("People callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder).toString());
        }
        bundle = PeopleClientImpl.access$000$3fda7968(i, bundle);
        dataholder = PeopleClientImpl.access$100(dataholder);
        mListener.tener(new mListener(bundle, dataholder));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mListener = ;
    }
}
