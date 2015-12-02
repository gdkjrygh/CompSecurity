// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;


// Referenced classes of package com.facebook.orca.camera:
//            c, b

class d
{

    public c a;
    public android.graphics.BitmapFactory.Options b;

    private d()
    {
        a = c.ALLOW;
    }

    d(b b1)
    {
        this();
    }

    public String toString()
    {
        String s;
        if (a == c.CANCEL)
        {
            s = "Cancel";
        } else
        if (a == c.ALLOW)
        {
            s = "Allow";
        } else
        {
            s = "?";
        }
        return (new StringBuilder()).append("thread state = ").append(s).append(", options = ").append(b).toString();
    }
}
