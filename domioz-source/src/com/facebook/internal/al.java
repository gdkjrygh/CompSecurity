// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            aw

public final class al
{

    private static final String a = com/facebook/internal/al.getName();
    private static File b;

    private al()
    {
    }

    public static File a(UUID uuid, String s)
    {
        if (aw.a(s) || uuid == null)
        {
            throw new FileNotFoundException();
        }
        try
        {
            uuid = b(uuid, s);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new FileNotFoundException();
        }
        return uuid;
    }

    private static File b(UUID uuid, String s)
    {
        if (b == null)
        {
            uuid = null;
        } else
        {
            uuid = new File(b, uuid.toString());
        }
        if (uuid == null)
        {
            return null;
        }
        try
        {
            uuid = new File(uuid, URLEncoder.encode(s, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

}
