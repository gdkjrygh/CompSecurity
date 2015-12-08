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
    private final ParcelFileDescriptor KE;
    private final InputStream XX;
    private final OutputStream XY;

    LibjingleNativeSocket(ParcelFileDescriptor parcelfiledescriptor)
    {
        KE = parcelfiledescriptor;
        XX = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        XY = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelfiledescriptor);
    }

    public void close()
        throws IOException
    {
        KE.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return XX;
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return XY;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        return KE;
    }

    public boolean isClosed()
    {
        try
        {
            XX.available();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return false;
    }

}
