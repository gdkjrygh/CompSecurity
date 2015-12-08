// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

// Referenced classes of package com.google.common.io:
//            InputSupplier, Resources

static final class val.url
    implements InputSupplier
{

    final URL val$url;

    public InputStream getInput()
        throws IOException
    {
        return val$url.openStream();
    }

    public volatile Object getInput()
        throws IOException
    {
        return getInput();
    }

    r(URL url1)
    {
        val$url = url1;
        super();
    }
}
