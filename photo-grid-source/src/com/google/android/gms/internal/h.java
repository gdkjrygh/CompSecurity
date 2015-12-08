// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64;

// Referenced classes of package com.google.android.gms.internal:
//            af

final class h
    implements af
{

    h()
    {
    }

    public final String a(byte abyte0[])
    {
        return Base64.encodeToString(abyte0, 11);
    }

    public final byte[] a(String s)
    {
        return Base64.decode(s, 2);
    }
}
