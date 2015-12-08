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
    private final ParcelFileDescriptor Fg;
    private final InputStream OT;
    private final OutputStream OU;

    LibjingleNativeSocket(ParcelFileDescriptor parcelfiledescriptor)
    {
        Fg = parcelfiledescriptor;
        OT = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        OU = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelfiledescriptor);
    }

    public void close()
        throws IOException
    {
        Fg.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return OT;
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return OU;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        return Fg;
    }

    public boolean isClosed()
    {
        try
        {
            OT.available();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return false;
    }

}
