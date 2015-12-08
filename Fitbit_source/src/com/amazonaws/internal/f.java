// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.internal;

import java.io.FilterOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.amazonaws.internal:
//            c

public class f extends FilterOutputStream
    implements c
{

    public f(OutputStream outputstream)
    {
        super(outputstream);
    }

    public boolean d()
    {
        if (out instanceof c)
        {
            return ((c)out).d();
        } else
        {
            return false;
        }
    }
}
