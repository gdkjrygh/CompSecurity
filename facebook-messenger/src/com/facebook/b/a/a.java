// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import android.app.Activity;
import com.facebook.config.a.d;

// Referenced classes of package com.facebook.b.a:
//            f, b

public class a extends com.facebook.base.activity.a
{

    private final b a;
    private final d b;
    private boolean c;

    public a(b b1, d d1)
    {
        a = b1;
        b = d1;
    }

    public void b(Activity activity)
    {
        if (activity.getParent() == null)
        {
            boolean flag;
            if (b == d.MESSENGER)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (activity instanceof f)
            {
                flag = ((f)activity).a_();
            }
            if (flag)
            {
                a.c();
                c = true;
                return;
            }
        }
    }

    public void c(Activity activity)
    {
        while (activity.getParent() != null || !c) 
        {
            return;
        }
        a.b();
        c = false;
    }
}
