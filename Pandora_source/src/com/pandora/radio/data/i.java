// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import java.io.Serializable;

// Referenced classes of package com.pandora.radio.data:
//            h

public class i
    implements Serializable
{

    public final h a[];
    public final h b[];

    public i(h ah[], h ah1[])
    {
        a = ah;
        b = ah1;
    }

    public boolean a()
    {
        return a != null && a.length > 0 || b != null && b.length > 0;
    }
}
