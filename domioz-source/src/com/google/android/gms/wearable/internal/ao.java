// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            an

final class ao
    implements Callable
{

    final ParcelFileDescriptor a;
    final byte b[];
    final an c;

    ao(an an, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        c = an;
        a = parcelfiledescriptor;
        b = abyte0;
        super();
    }

    private Boolean a()
    {
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder("processAssets: writing data to FD : ")).append(a).toString());
        }
        autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(a);
        Object obj;
        autocloseoutputstream.write(b);
        autocloseoutputstream.flush();
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder("processAssets: wrote data: ")).append(a).toString());
        }
        obj = Boolean.valueOf(true);
        IOException ioexception;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
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
                Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
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
                Log.d("WearableClient", (new StringBuilder("processAssets: closing: ")).append(a).toString());
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
    }

    public final Object call()
    {
        return a();
    }
}
