// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.LocalSocket;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class et
    implements RealTimeSocket
{

    private ParcelFileDescriptor jN;
    private final String nd;
    private final LocalSocket nt;

    et(LocalSocket localsocket, String s)
    {
        nt = localsocket;
        nd = s;
    }

    public void close()
        throws IOException
    {
        nt.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return nt.getInputStream();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return nt.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        if (jN == null && !isClosed())
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeFileDescriptor(nt.getFileDescriptor());
            parcel.setDataPosition(0);
            jN = parcel.readFileDescriptor();
        }
        return jN;
    }

    public boolean isClosed()
    {
        return !nt.isConnected() && !nt.isBound();
    }
}
