// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.a.c;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.b:
//            f, g

static class b
    implements c
{

    private final c a;
    private final c b;

    public g a(i i)
        throws Exception
    {
        Object obj1 = null;
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = (InputStream)a.b(i);
_L6:
        ParcelFileDescriptor parcelfiledescriptor;
        parcelfiledescriptor = obj1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        parcelfiledescriptor = (ParcelFileDescriptor)b.b(i);
_L4:
        return new g(((InputStream) (obj)), parcelfiledescriptor);
        obj;
        if (Log.isLoggable("IVML", 2))
        {
            Log.v("IVML", "Exception fetching input stream, trying ParcelFileDescriptor", ((Throwable) (obj)));
        }
        if (b == null)
        {
            throw obj;
        }
          goto _L2
        i;
        if (Log.isLoggable("IVML", 2))
        {
            Log.v("IVML", "Exception fetching ParcelFileDescriptor", i);
        }
        parcelfiledescriptor = obj1;
        if (obj != null) goto _L4; else goto _L3
_L3:
        throw i;
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a()
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

    public Object b(i i)
        throws Exception
    {
        return a(i);
    }

    public String b()
    {
        if (a != null)
        {
            return a.b();
        } else
        {
            return b.b();
        }
    }

    public void c()
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

    public r(c c1, c c2)
    {
        a = c1;
        b = c2;
    }
}
