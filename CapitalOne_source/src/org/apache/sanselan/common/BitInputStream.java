// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.common:
//            BinaryConstants

public class BitInputStream extends InputStream
    implements BinaryConstants
{

    private final InputStream a;
    private int b;

    public int read()
    {
        if (b > 0)
        {
            throw new IOException("BitInputStream: incomplete bit read");
        } else
        {
            return a.read();
        }
    }
}
