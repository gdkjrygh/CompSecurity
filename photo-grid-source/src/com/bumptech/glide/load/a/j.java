// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.res.AssetManager;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            a

public final class j extends a
{

    public j(AssetManager assetmanager, String s)
    {
        super(assetmanager, s);
    }

    protected final Object a(AssetManager assetmanager, String s)
    {
        return assetmanager.open(s);
    }

    protected final void a(Object obj)
    {
        ((InputStream)obj).close();
    }
}
