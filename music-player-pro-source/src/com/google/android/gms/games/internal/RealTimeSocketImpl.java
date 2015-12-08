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

    private ParcelFileDescriptor LG;
    private final LocalSocket ZV;
    private final String Zk;

    RealTimeSocketImpl(LocalSocket localsocket, String s)
    {
        ZV = localsocket;
        Zk = s;
    }

    public void close()
        throws IOException
    {
        ZV.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return ZV.getInputStream();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return ZV.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        if (LG == null && !isClosed())
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeFileDescriptor(ZV.getFileDescriptor());
            parcel.setDataPosition(0);
            LG = parcel.readFileDescriptor();
        }
        return LG;
    }

    public boolean isClosed()
    {
        return !ZV.isConnected() && !ZV.isBound();
    }
}
