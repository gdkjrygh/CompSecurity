// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import com.cardinalblue.android.piccollage.model.k;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            g

class a
    implements Callable
{

    final byte a[];
    final g b;

    public File a()
        throws Exception
    {
        File file = k.a("gif");
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        com.cardinalblue.android.b.k.a(new ByteArrayInputStream(a), fileoutputstream);
        return file;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (g g1, byte abyte0[])
    {
        b = g1;
        a = abyte0;
        super();
    }
}
