// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public abstract class a
    implements c
{

    private final String a;
    private final AssetManager b;
    private Object c;

    public a(AssetManager assetmanager, String s)
    {
        b = assetmanager;
        a = s;
    }

    public final Object a(int i)
    {
        c = a(b, a);
        return c;
    }

    protected abstract Object a(AssetManager assetmanager, String s);

    public final void a()
    {
        if (c == null)
        {
            return;
        }
        try
        {
            a(c);
            return;
        }
        catch (IOException ioexception)
        {
            Log.isLoggable("AssetUriFetcher", 2);
        }
    }

    protected abstract void a(Object obj);

    public final String b()
    {
        return a;
    }

    public final void c()
    {
    }
}
