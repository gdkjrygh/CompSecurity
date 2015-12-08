// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b;

import java.io.IOException;

// Referenced classes of package org.c.b:
//            a

public final class b extends IOException
{

    public b(String s)
    {
        super(s);
    }

    public b(String s, Throwable throwable)
    {
        super(s);
        initCause(throwable);
    }

    public final String getMessage()
    {
        return a.buildMessage(super.getMessage(), getCause());
    }

    static 
    {
        org/c/b/a.getName();
    }
}
