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

    private ParcelFileDescriptor Fj;
    private final String Oq;
    private final LocalSocket Pd;

    RealTimeSocketImpl(LocalSocket localsocket, String s)
    {
        Pd = localsocket;
        Oq = s;
    }

    public void close()
        throws IOException
    {
        Pd.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return Pd.getInputStream();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return Pd.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        if (Fj == null && !isClosed())
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeFileDescriptor(Pd.getFileDescriptor());
            parcel.setDataPosition(0);
            Fj = parcel.readFileDescriptor();
        }
        return Fj;
    }

    public boolean isClosed()
    {
        return !Pd.isConnected() && !Pd.isBound();
    }
}
