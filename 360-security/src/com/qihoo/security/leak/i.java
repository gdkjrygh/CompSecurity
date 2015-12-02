// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.qihoo.security.leak:
//            c, d

class i extends c
{

    i(d d1)
    {
        super(d1);
    }

    public String a()
    {
        return "leak_sms_broadcast";
    }

    boolean b()
    {
        while (o() || n()) 
        {
            return false;
        }
        return true;
    }

    public Drawable d()
    {
        return a.getResources().getDrawable(0x7f0200ae);
    }

    int e()
    {
        return 0x7f0e000e;
    }

    public boolean f()
    {
        super.f();
        return true;
    }
}
