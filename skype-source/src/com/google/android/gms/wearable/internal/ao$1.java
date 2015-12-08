// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ao

final class b
    implements Callable
{

    final ParcelFileDescriptor a;
    final byte b[];
    final ao c;

    private Boolean a()
    {
        android.os.lFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        if (Log.isLoggable("WearableClient", 3))
        {
            (new StringBuilder("processAssets: writing data to FD : ")).append(a);
        }
        autocloseoutputstream = new android.os.lFileDescriptor.AutoCloseOutputStream(a);
        Object obj;
        autocloseoutputstream.write(b);
        autocloseoutputstream.flush();
        if (Log.isLoggable("WearableClient", 3))
        {
            (new StringBuilder("processAssets: wrote data: ")).append(a);
        }
        obj = Boolean.valueOf(true);
        IOException ioexception;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        catch (IOException ioexception1)
        {
            return ((Boolean) (obj));
        }
        return ((Boolean) (obj));
        obj;
        Log.w("WearableClient", (new StringBuilder("processAssets: writing data failed: ")).append(a).toString());
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        return Boolean.valueOf(false);
        obj;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                (new StringBuilder("processAssets: closing: ")).append(a);
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
    }

    public final Object call()
        throws Exception
    {
        return a();
    }

    tStream(ao ao1, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        c = ao1;
        a = parcelfiledescriptor;
        b = abyte0;
        super();
    }
}
