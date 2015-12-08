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

    private ParcelFileDescriptor Cj;
    private final LocalSocket JP;
    private final String Jg;

    RealTimeSocketImpl(LocalSocket localsocket, String s)
    {
        JP = localsocket;
        Jg = s;
    }

    public void close()
        throws IOException
    {
        JP.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return JP.getInputStream();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return JP.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        if (Cj == null && !isClosed())
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeFileDescriptor(JP.getFileDescriptor());
            parcel.setDataPosition(0);
            Cj = parcel.readFileDescriptor();
        }
        return Cj;
    }

    public boolean isClosed()
    {
        return !JP.isConnected() && !JP.isBound();
    }
}
