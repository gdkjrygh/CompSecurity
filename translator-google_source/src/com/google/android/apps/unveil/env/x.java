// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, v

public final class x
{

    private static final af b = new af();
    public final ByteArrayOutputStream a = new ByteArrayOutputStream();
    private final byte c[] = new byte[0x10000];

    public x()
    {
    }

    public final byte[] a(InputStream inputstream)
    {
_L2:
        int i = inputstream.read(c);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        a.write(c, 0, i);
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        b.e("Error reading input: %s", new Object[] {
            obj
        });
        v.a(inputstream);
_L4:
        return a.toByteArray();
_L1:
        v.a(inputstream);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        v.a(inputstream);
        throw obj;
    }

}
