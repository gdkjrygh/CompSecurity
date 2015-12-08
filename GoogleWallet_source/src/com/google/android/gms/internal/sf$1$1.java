// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            sf, rn

final class Fe
    implements com.google.android.gms.people.oadOwnersResult
{

    final Status Fe;
    final s aEM;

    public final OwnerBuffer getOwners()
    {
        return null;
    }

    public final Status getStatus()
    {
        return Fe;
    }

    public final void release()
    {
    }

    s(s s, Status status)
    {
        aEM = s;
        Fe = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/sf$1

/* anonymous class */
    final class sf._cls1 extends com.google.android.gms.people.People.a
    {

        final com.google.android.gms.people.Graph.LoadOwnersOptions aEK;
        final sf aEL;

        private void b(rn rn1)
            throws RemoteException
        {
            rn1.a(this, false, aEK.isIncludePlusPages(), null, null, aEK.getSortOrder());
        }

        private com.google.android.gms.people.Graph.LoadOwnersResult bc(Status status)
        {
            return new sf._cls1._cls1(this, status);
        }

        protected final void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            b((rn)a1);
        }

        protected final Result b(Status status)
        {
            return bc(status);
        }

            
            {
                aEL = sf1;
                aEK = loadownersoptions;
                super(googleapiclient);
            }
    }

}
