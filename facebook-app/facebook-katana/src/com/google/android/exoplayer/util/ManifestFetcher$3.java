// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.util:
//            ManifestFetcher

class a
    implements Runnable
{

    final IOException a;
    final ManifestFetcher b;

    public void run()
    {
    }

    _cls9(ManifestFetcher manifestfetcher, IOException ioexception)
    {
        b = manifestfetcher;
        a = ioexception;
        super();
    }
}
