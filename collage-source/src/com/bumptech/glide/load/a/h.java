// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            a

public class h extends a
{

    public h(AssetManager assetmanager, String s)
    {
        super(assetmanager, s);
    }

    protected Object a(AssetManager assetmanager, String s)
        throws IOException
    {
        return b(assetmanager, s);
    }

    protected void a(InputStream inputstream)
        throws IOException
    {
        inputstream.close();
    }

    protected volatile void a(Object obj)
        throws IOException
    {
        a((InputStream)obj);
    }

    protected InputStream b(AssetManager assetmanager, String s)
        throws IOException
    {
        return assetmanager.open(s);
    }
}
