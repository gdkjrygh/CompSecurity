// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            DataSpec

public class dataSpec extends IOException
{

    public final DataSpec dataSpec;

    public (IOException ioexception, DataSpec dataspec)
    {
        super(ioexception);
        dataSpec = dataspec;
    }

    public dataSpec(String s, DataSpec dataspec)
    {
        super(s);
        dataSpec = dataspec;
    }

    public dataSpec(String s, IOException ioexception, DataSpec dataspec)
    {
        super(s, ioexception);
        dataSpec = dataspec;
    }
}
