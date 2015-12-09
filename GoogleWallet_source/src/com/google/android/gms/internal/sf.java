// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.model.OwnerBuffer;

// Referenced classes of package com.google.android.gms.internal:
//            rn

public final class sf
    implements Graph
{

    public sf()
    {
    }

    public final PendingResult loadOwners(GoogleApiClient googleapiclient, com.google.android.gms.people.Graph.LoadOwnersOptions loadownersoptions)
    {
        if (loadownersoptions == null)
        {
            loadownersoptions = com.google.android.gms.people.Graph.LoadOwnersOptions.DEFAULT;
        }
        return googleapiclient.a(new com.google.android.gms.people.People.a(googleapiclient, loadownersoptions) {

            final com.google.android.gms.people.Graph.LoadOwnersOptions aEK;
            final sf aEL;

            private void b(rn rn1)
                throws RemoteException
            {
                rn1.a(this, false, aEK.isIncludePlusPages(), null, null, aEK.getSortOrder());
            }

            private com.google.android.gms.people.Graph.LoadOwnersResult bc(Status status)
            {
                return new com.google.android.gms.people.Graph.LoadOwnersResult(this, status) {

                    final Status Fe;
                    final _cls1 aEM;

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

            
            {
                aEM = _pcls1;
                Fe = status;
                super();
            }
                };
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
                aEL = sf.this;
                aEK = loadownersoptions;
                super(googleapiclient);
            }
        });
    }
}
