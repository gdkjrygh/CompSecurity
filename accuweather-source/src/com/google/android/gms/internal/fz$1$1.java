// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            fx, fz, fv

class t> extends fx
{

    final s ys;

    public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        yr.(new nit>(status, parcelfiledescriptor));
    }

    t(t t, com.google.android.gms.common.api. )
    {
        ys = t;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/fz$1

/* anonymous class */
    class fz._cls1 extends fz.c
    {

        protected void a(fv fv1)
            throws RemoteException
        {
            fv1.a(new fz._cls1._cls1(this, this));
        }

        public fu.a b(Status status)
        {
            return new fz.b(status, null);
        }

        public Result c(Status status)
        {
            return b(status);
        }
    }

}
