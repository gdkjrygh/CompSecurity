// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            m

static final class a
{

    ByteArrayOutputStream a;
    Base64OutputStream b;

    public final void a(byte abyte0[])
        throws IOException
    {
        b.write(abyte0);
    }

    public final String toString()
    {
        String s;
        try
        {
            b.close();
        }
        catch (IOException ioexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", ioexception);
        }
        a.close();
        s = a.toString();
        a = null;
        b = null;
        return s;
        Object obj;
        obj;
        com.google.android.gms.ads.internal.util.client.b.b("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        a = null;
        b = null;
        return "";
        obj;
        a = null;
        b = null;
        throw obj;
    }

    public util.client.b()
    {
        a = new ByteArrayOutputStream(4096);
        b = new Base64OutputStream(a, 10);
    }
}
