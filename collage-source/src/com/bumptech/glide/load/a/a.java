// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.i;
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

    protected abstract Object a(AssetManager assetmanager, String s)
        throws IOException;

    public void a()
    {
        if (c != null)
        {
            try
            {
                a(c);
                return;
            }
            catch (IOException ioexception)
            {
                if (Log.isLoggable("AssetUriFetcher", 2))
                {
                    Log.v("AssetUriFetcher", "Failed to close data", ioexception);
                    return;
                }
            }
        }
    }

    protected abstract void a(Object obj)
        throws IOException;

    public Object b(i i)
        throws Exception
    {
        c = a(b, a);
        return c;
    }

    public String b()
    {
        return a;
    }

    public void c()
    {
    }
}
