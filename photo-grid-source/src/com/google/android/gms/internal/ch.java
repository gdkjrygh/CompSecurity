// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class ch
{

    ByteArrayOutputStream a;
    Base64OutputStream b;

    public ch()
    {
        a = new ByteArrayOutputStream(4096);
        b = new Base64OutputStream(a, 10);
    }

    public final void a(byte abyte0[])
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
            zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
        }
        a.close();
        s = a.toString();
        a = null;
        b = null;
        return s;
        Object obj;
        obj;
        zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        a = null;
        b = null;
        return "";
        obj;
        a = null;
        b = null;
        throw obj;
    }
}
