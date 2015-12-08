// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.android.volley.k;
import com.android.volley.m;
import com.android.volley.r;

// Referenced classes of package com.kik.cache:
//            z

public abstract class ac extends z
{

    public ac(Object obj, String s, com.android.volley.r.b b1, int i, int j, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(obj, s, b1, i, j, config, a1);
    }

    protected final r a(k k)
    {
        try
        {
            k = b(k);
        }
        // Misplaced declaration of an exception variable
        catch (k k)
        {
            return r.a(new m(k));
        }
        return k;
    }

    protected abstract r b(k k);

    public final boolean w()
    {
        return false;
    }
}
