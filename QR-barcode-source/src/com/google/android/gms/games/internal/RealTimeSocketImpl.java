// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class RealTimeSocketImpl
    implements RealTimeSocket
{

    private ParcelFileDescriptor KE;
    private final String Xr;
    private final LocalSocket Ye;

    RealTimeSocketImpl(LocalSocket localsocket, String s)
    {
        Ye = localsocket;
        Xr = s;
    }

    public void close()
        throws IOException
    {
        Ye.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return Ye.getInputStream();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return Ye.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        if (KE == null && !isClosed())
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeFileDescriptor(Ye.getFileDescriptor());
            parcel.setDataPosition(0);
            KE = parcel.readFileDescriptor();
        }
        return KE;
    }

    public boolean isClosed()
    {
        return !Ye.isConnected() && !Ye.isBound();
    }
}
