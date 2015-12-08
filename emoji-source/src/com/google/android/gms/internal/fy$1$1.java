// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            fw, fy, fu

class t> extends fw
{

    final s yv;

    public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        yu.(new nit>(status, parcelfiledescriptor));
    }

    t(t t, com.google.android.gms.common.api. )
    {
        yv = t;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/fy$1

/* anonymous class */
    class fy._cls1 extends fy.c
    {

        protected void a(fu fu1)
            throws RemoteException
        {
            fu1.a(new fy._cls1._cls1(this, this));
        }

        public ft.a b(Status status)
        {
            return new fy.b(status, null);
        }

        public Result c(Status status)
        {
            return b(status);
        }
    }

}
