// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;


// Referenced classes of package com.android.slyce.crop:
//            c, b

class e
{

    public c a;
    public android.graphics.BitmapFactory.Options b;

    private e()
    {
        a = c.b;
    }

    e(b b1)
    {
        this();
    }

    public String toString()
    {
        String s;
        if (a == c.a)
        {
            s = "Cancel";
        } else
        if (a == c.b)
        {
            s = "Allow";
        } else
        {
            s = "?";
        }
        return (new StringBuilder()).append("thread state = ").append(s).append(", options = ").append(b).toString();
    }
}
