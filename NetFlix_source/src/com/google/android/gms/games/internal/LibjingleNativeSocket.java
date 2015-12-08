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
    private final ParcelFileDescriptor Cj;
    private final InputStream JI;
    private final OutputStream JJ;

    LibjingleNativeSocket(ParcelFileDescriptor parcelfiledescriptor)
    {
        Cj = parcelfiledescriptor;
        JI = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        JJ = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelfiledescriptor);
    }

    public void close()
        throws IOException
    {
        Cj.close();
    }

    public InputStream getInputStream()
        throws IOException
    {
        return JI;
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return JJ;
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
        throws IOException
    {
        return Cj;
    }

    public boolean isClosed()
    {
        try
        {
            JI.available();
        }
        catch (IOException ioexception)
        {
            return true;
        }
        return false;
    }

}
