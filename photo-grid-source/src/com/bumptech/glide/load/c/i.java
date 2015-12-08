// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.a.c;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.c:
//            j

final class i
    implements c
{

    private final c a;
    private final c b;

    public i(c c1, c c2)
    {
        a = c1;
        b = c2;
    }

    private j b(int k)
    {
        Object obj1 = null;
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = (InputStream)a.a(k);
_L6:
        ParcelFileDescriptor parcelfiledescriptor;
        parcelfiledescriptor = obj1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        parcelfiledescriptor = (ParcelFileDescriptor)b.a(k);
_L4:
        return new j(((InputStream) (obj)), parcelfiledescriptor);
        obj;
        Log.isLoggable("IVML", 2);
        if (b == null)
        {
            throw obj;
        }
          goto _L2
        Exception exception;
        exception;
        Log.isLoggable("IVML", 2);
        parcelfiledescriptor = obj1;
        if (obj != null) goto _L4; else goto _L3
_L3:
        throw exception;
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Object a(int k)
    {
        return b(k);
    }

    public final void a()
    {
        if (a != null)
        {
            a.a();
        }
        if (b != null)
        {
            b.a();
        }
    }

    public final String b()
    {
        if (a != null)
        {
            return a.b();
        } else
        {
            return b.b();
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.c();
        }
        if (b != null)
        {
            b.c();
        }
    }
}
