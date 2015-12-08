// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class LibjingleNativeSocket
    implements RealTimeSocket
{

    private static final String TAG = com/google/android/gms/games/internal/LibjingleNativeSocket.getSimpleName();
    private final ParcelFileDescriptor Fj;
    private final InputStream OW;
    private final OutputStream OX;

    LibjingleNativeSocket(ParcelFileDescriptor parcelfiledescriptor)
    {
        Fj = parcelfiledescriptor;
        OW = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        OX = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelfiledescriptor);
    }

    public void close()
        throws IOException
    {
        Fj.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return OW;
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return OX;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        return Fj;
    }

    public boolean isClosed()
    {
        try
        {
            OW.available();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return false;
    }

}
