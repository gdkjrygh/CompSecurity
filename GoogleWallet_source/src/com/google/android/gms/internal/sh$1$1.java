// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            sh, rn

final class Fe
    implements com.google.android.gms.people.SetAvatarResult
{

    final Status Fe;
    final s aFv;

    public final Status getStatus()
    {
        return Fe;
    }

    s(s s, Status status)
    {
        aFv = s;
        Fe = status;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/sh$1

/* anonymous class */
    final class sh._cls1 extends com.google.android.gms.people.People.a
    {

        final String aEH;
        final String aEN;
        final Uri aFs;
        final boolean aFt;

        private void b(rn rn1)
        {
            rn1.a(this, aEH, aEN, aFs, aFt);
        }

        private com.google.android.gms.people.Images.SetAvatarResult bm(Status status)
        {
            return new sh._cls1._cls1(this, status);
        }

        protected final void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            b((rn)a1);
        }

        protected final Result b(Status status)
        {
            return bm(status);
        }
    }

}
