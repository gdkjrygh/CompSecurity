// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.reflex;

import android.app.Activity;
import com.facebook.base.activity.a;
import com.facebook.orca.threadlist.s;

// Referenced classes of package com.facebook.orca.reflex:
//            e

public class h extends a
{

    private e a;

    public h(e e1)
    {
        a = e1;
    }

    public void a(Activity activity)
    {
        if (activity instanceof s)
        {
            a.a(activity);
        }
    }
}
