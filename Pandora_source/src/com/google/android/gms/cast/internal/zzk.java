// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzf

public final class zzk
{

    public static final com.google.android.gms.common.api.Api.zzc zzKh;
    public static final String zzOf;
    public static final String zzOg;
    public static final Charset zzOh;

    static 
    {
        Charset charset;
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzOf = zzf.zzbp("com.google.cast.receiver");
        zzOg = zzf.zzbp("com.google.cast.tp.connection");
        charset = null;
        Charset charset1 = Charset.forName("UTF-8");
        charset = charset1;
_L2:
        zzOh = charset;
        return;
        Object obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
