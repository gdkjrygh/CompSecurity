// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            au

class yL
    implements Callable
{

    final au amh;
    final ParcelFileDescriptor amj;
    final byte yL[];

    public Object call()
        throws Exception
    {
        return nt();
    }

    public Boolean nt()
    {
        android.os.FileDescriptor.AutoCloseOutputStream autocloseoutputstream;
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder()).append("processAssets: writing data to FD : ").append(amj).toString());
        }
        autocloseoutputstream = new android.os.FileDescriptor.AutoCloseOutputStream(amj);
        Object obj;
        autocloseoutputstream.write(yL);
        autocloseoutputstream.flush();
        if (Log.isLoggable("WearableClient", 3))
        {
            Log.d("WearableClient", (new StringBuilder()).append("processAssets: wrote data: ").append(amj).toString());
        }
        obj = Boolean.valueOf(true);
        IOException ioexception;
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
            }
            autocloseoutputstream.close();
        }
        catch (IOException ioexception1)
        {
            return ((Boolean) (obj));
        }
        return ((Boolean) (obj));
        obj;
        Log.w("WearableClient", (new StringBuilder()).append("processAssets: writing data failed: ").append(amj).toString());
        try
        {
            if (Log.isLoggable("WearableClient", 3))
            {
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
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
                Log.d("WearableClient", (new StringBuilder()).append("processAssets: closing: ").append(amj).toString());
            }
            autocloseoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
    }

    Stream(au au1, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
    {
        amh = au1;
        amj = parcelfiledescriptor;
        yL = abyte0;
        super();
    }
}
