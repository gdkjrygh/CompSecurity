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
    private final ParcelFileDescriptor LG;
    private final InputStream ZO;
    private final OutputStream ZP;

    LibjingleNativeSocket(ParcelFileDescriptor parcelfiledescriptor)
    {
        LG = parcelfiledescriptor;
        ZO = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        ZP = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelfiledescriptor);
    }

    public void close()
        throws IOException
    {
        LG.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return ZO;
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return ZP;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        return LG;
    }

    public boolean isClosed()
    {
        try
        {
            ZO.available();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return false;
    }

}
