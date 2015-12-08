// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            f

static final class ng extends IOException
{

    ng()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
