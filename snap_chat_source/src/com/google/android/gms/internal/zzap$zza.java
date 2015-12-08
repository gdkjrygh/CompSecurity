// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzhx

static class zzoF
{

    ByteArrayOutputStream zzoF;
    Base64OutputStream zzoG;

    public String toString()
    {
        String s;
        try
        {
            zzoG.close();
        }
        catch (IOException ioexception)
        {
            zzhx.zzb("HashManager: Unable to convert to Base64.", ioexception);
        }
        zzoF.close();
        s = zzoF.toString();
        zzoF = null;
        zzoG = null;
        return s;
        Object obj;
        obj;
        zzhx.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        zzoF = null;
        zzoG = null;
        return "";
        obj;
        zzoF = null;
        zzoG = null;
        throw obj;
    }

    public void write(byte abyte0[])
    {
        zzoG.write(abyte0);
    }

    public ()
    {
        zzoF = new ByteArrayOutputStream(4096);
        zzoG = new Base64OutputStream(zzoF, 10);
    }
}
