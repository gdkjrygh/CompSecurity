// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

final class b
    implements ServiceConnection
{

    final Bitmap a;

    b(Bitmap bitmap)
    {
        a = bitmap;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            componentname = Parcel.obtain();
            if (a != null)
            {
                a.writeToParcel(componentname, 0);
            }
            ibinder.transact(1, componentname, null, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
