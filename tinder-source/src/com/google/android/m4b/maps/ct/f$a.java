// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            f

public static final class  extends IOException
{

    private static final long serialVersionUID = 0x9f95917c52ce6e25L;

    ()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    (Throwable throwable)
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
    }
}
