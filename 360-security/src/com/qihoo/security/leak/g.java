// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.qihoo.security.leak:
//            c, d

class g extends c
{

    g(d d1)
    {
        super(d1);
    }

    public String a()
    {
        return "leak_remote_wipe";
    }

    boolean b()
    {
        while (n() || o() || android.os.Build.VERSION.SDK_INT > 15) 
        {
            return false;
        }
        return true;
    }

    public Drawable d()
    {
        return a.getResources().getDrawable(0x7f0200ad);
    }

    int e()
    {
        return 0x7f0e0010;
    }

    public boolean f()
    {
        super.f();
        return true;
    }
}
