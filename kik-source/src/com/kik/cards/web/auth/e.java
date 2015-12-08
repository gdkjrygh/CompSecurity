// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import com.kik.g.as;
import java.io.IOException;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;

// Referenced classes of package com.kik.cards.web.auth:
//            AuthPlugin

final class e
    implements as
{

    final AuthPlugin a;

    e(AuthPlugin authplugin)
    {
        a = authplugin;
        super();
    }

    private static String a(byte abyte0[])
    {
        try
        {
            abyte0 = com.kik.m.e.b(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            if (DeviceUtils.c())
            {
                throw new RuntimeException(abyte0);
            } else
            {
                bx.a(abyte0);
                return "";
            }
        }
        return abyte0;
    }

    public final volatile Object a(Object obj)
    {
        return a((byte[])obj);
    }
}
