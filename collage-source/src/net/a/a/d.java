// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package net.a.a:
//            a

public class d extends a
{

    private int a;

    public d()
    {
        this(-1, null, null);
    }

    public d(int i, String s, Drawable drawable)
    {
        this(i, s, drawable, 0);
    }

    public d(int i, String s, Drawable drawable, int j)
    {
        super(i, s, drawable);
        a = 0;
        a = j;
    }

    public int e()
    {
        return a;
    }
}
