// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.b;

import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.j;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.b:
//            b

public class a
    implements e
{

    public a()
    {
    }

    public j a(File file, int i, int j)
    {
        return new b(file);
    }

    public volatile j a(Object obj, int i, int j)
        throws IOException
    {
        return a((File)obj, i, j);
    }

    public String a()
    {
        return "";
    }
}
