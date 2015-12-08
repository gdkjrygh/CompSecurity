// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.IBinder;

// Referenced classes of package com.google.android.gms.dynamic:
//            IObjectWrapper

private static final class mRemote
    implements IObjectWrapper
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
