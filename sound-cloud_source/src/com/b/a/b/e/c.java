// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.b.a.b.a.e;

// Referenced classes of package com.b.a.b.e:
//            a

public final class c
    implements a
{

    protected final String a;
    protected final e b;
    protected final int c;

    public c(e e1, int i)
    {
        this(null, e1, i);
    }

    public c(String s, e e1, int i)
    {
        if (e1 == null)
        {
            throw new IllegalArgumentException("imageSize must not be null");
        }
        if (i == 0)
        {
            throw new IllegalArgumentException("scaleType must not be null");
        } else
        {
            a = s;
            b = e1;
            c = i;
            return;
        }
    }

    public final int a()
    {
        return b.a;
    }

    public final boolean a(Bitmap bitmap)
    {
        return true;
    }

    public final boolean a(Drawable drawable)
    {
        return true;
    }

    public final int b()
    {
        return b.b;
    }

    public final int c()
    {
        return c;
    }

    public final View d()
    {
        return null;
    }

    public final boolean e()
    {
        return false;
    }

    public final int f()
    {
        if (TextUtils.isEmpty(a))
        {
            return super.hashCode();
        } else
        {
            return a.hashCode();
        }
    }
}
