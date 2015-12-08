// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            fz, fv, fx

class  extends 
{

    protected void a(fv fv1)
        throws RemoteException
    {
        fv1.a(new fx(this) {

            final fz._cls1 ys;

            public void a(Status status, ParcelFileDescriptor parcelfiledescriptor)
            {
                yr.a(new fz.b(status, parcelfiledescriptor));
            }

            
            {
                ys = fz._cls1.this;
                super(d);
            }
        });
    }

    public tus b(Status status)
    {
        return new <init>(status, null);
    }

    public Result c(Status status)
    {
        return b(status);
    }
}
