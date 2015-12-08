// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.b;

import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.b:
//            d

public final class c
    implements e
{

    private static final d a = new d();
    private e b;
    private final d c;

    public c(e e1)
    {
        this(e1, a);
    }

    private c(e e1, d d1)
    {
        b = e1;
        c = d1;
    }

    private x a(File file, int i, int j)
    {
        FileInputStream fileinputstream = new FileInputStream(file);
        file = b.a(fileinputstream, i, j);
        try
        {
            fileinputstream.close();
        }
        catch (IOException ioexception)
        {
            return file;
        }
        return file;
        file;
        fileinputstream = null;
_L2:
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            catch (IOException ioexception1) { }
        }
        throw file;
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final volatile x a(Object obj, int i, int j)
    {
        return a((File)obj, i, j);
    }

    public final String a()
    {
        return "";
    }

}
