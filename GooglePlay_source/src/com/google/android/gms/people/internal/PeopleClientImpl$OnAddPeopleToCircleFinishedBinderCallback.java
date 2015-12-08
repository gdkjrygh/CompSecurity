// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.people.internal:
//            AbstractPeopleCallbacks, PeopleClientImpl, PeopleServiceLog

private static final class mListener extends AbstractPeopleCallbacks
{

    private final com.google.android.gms.common.api.internal.tener mListener;

    public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
    {
        Object obj = null;
        if (PeopleServiceLog.canLog(3))
        {
            PeopleServiceLog.d("PeopleClient", (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString());
        }
        com.google.android.gms.common.api.Status status = PeopleClientImpl.access$000$3fda7968(i, bundle);
        String s;
        if (bundle1 == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle1.getString("circle_id");
        }
        if (bundle1 == null)
        {
            s = null;
        } else
        {
            s = bundle1.getString("circle_name");
        }
        if (bundle1 == null)
        {
            bundle1 = obj;
        } else
        {
            bundle1 = bundle1.getStringArray("added_people");
        }
        mListener.tener(new mListener(status, bundle, s, bundle1));
    }

    public (com.google.android.gms.common.api.internal. )
    {
        mListener = ;
    }
}
