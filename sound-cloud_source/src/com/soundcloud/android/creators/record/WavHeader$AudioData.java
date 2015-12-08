// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import java.io.InputStream;

// Referenced classes of package com.soundcloud.android.creators.record:
//            WavHeader

public static class length
{

    public final long length;
    public final InputStream stream;

    (InputStream inputstream, long l)
    {
        stream = inputstream;
        length = l;
    }
}
