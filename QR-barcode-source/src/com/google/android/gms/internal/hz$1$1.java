// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hx, hz, hv

class tation.b extends hx
{

    final s CI;

    public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        CH.b(new nit>(status, parcelfiledescriptor));
    }

    tation.b(tation.b b, com.google.android.gms.common.api.lementation.b b1)
    {
        CI = b;
        super(b1);
    }

    // Unreferenced inner class com/google/android/gms/internal/hz$1

/* anonymous class */
    class hz._cls1 extends hz.c
    {

        protected void a(hv hv1)
            throws RemoteException
        {
            hv1.a(new hz._cls1._cls1(this, this));
        }

        public hu.a b(Status status)
        {
            return new hz.b(status, null);
        }

        public Result c(Status status)
        {
            return b(status);
        }
    }

}
