// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64;

// Referenced classes of package com.google.android.gms.internal:
//            m

class e
    implements m
{

    e()
    {
    }

    public String a(byte abyte0[], boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 2;
        }
        return Base64.encodeToString(abyte0, byte0);
    }

    public byte[] a(String s, boolean flag)
        throws IllegalArgumentException
    {
        byte byte0;
        if (flag)
        {
            byte0 = 11;
        } else
        {
            byte0 = 2;
        }
        return Base64.decode(s, byte0);
    }
}
