// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.http.b.au;
import com.facebook.http.b.av;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.analytics:
//            ar, an

final class at extends FilterInputStream
{

    final ar a;

    public at(ar ar1, InputStream inputstream)
    {
        a = ar1;
        super(inputstream);
    }

    public int read()
    {
        int i;
        try
        {
            i = in.read();
        }
        catch (IOException ioexception)
        {
            an.d(a.a).a(av.READ_RESPONSE_BODY, ioexception, null, ar.a(a));
            throw ioexception;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        try
        {
            i = in.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            an.d(a.a).a(av.READ_RESPONSE_BODY, abyte0, null, ar.a(a));
            throw abyte0;
        }
        return i;
    }

    public long skip(long l)
    {
        try
        {
            l = in.skip(l);
        }
        catch (IOException ioexception)
        {
            an.d(a.a).a(av.READ_RESPONSE_BODY, ioexception, null, ar.a(a));
            throw ioexception;
        }
        return l;
    }
}
