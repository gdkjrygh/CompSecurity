// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.google.android.gms.people.internal:
//            AbstractPeopleCallbacks, PeopleClientImpl, PeopleServiceLog

private static final class mListener extends AbstractPeopleCallbacks
{

    private final com.google.android.gms.common.api.internal.tener mListener;

    public final void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
    {
        if (PeopleServiceLog.canLog(3))
        {
            PeopleServiceLog.d("PeopleClient", (new StringBuilder("Avatar callback: status=")).append(i).append(" resolution=").append(bundle).append(" pfd=").append(parcelfiledescriptor).toString());
        }
        bundle = PeopleClientImpl.access$000$3fda7968(i, bundle);
        boolean flag = false;
        i = 0;
        int j = 0;
        if (bundle1 != null)
        {
            flag = bundle1.getBoolean("rewindable");
            i = bundle1.getInt("width");
            j = bundle1.getInt("height");
        }
        mListener.tener(new t>(bundle, parcelfiledescriptor, flag, i, j));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mListener = ;
    }
}
