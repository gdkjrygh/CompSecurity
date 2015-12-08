// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.bumptech.glide.load.engine:
//            a

static class 
{

    public OutputStream a(File file)
        throws FileNotFoundException
    {
        return new BufferedOutputStream(new FileOutputStream(file));
    }

    ()
    {
    }
}
