// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.support.v4.app.aj;
import android.support.v4.app.ak;
import android.support.v4.app.al;
import com.jcp.fragments.s;

// Referenced classes of package com.jcp.activities:
//            MainActivity

class am
    implements al
{

    final MainActivity a;

    am(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public void a()
    {
        Object obj = a.f();
        if (obj != null && ((aj) (obj)).e() > 0)
        {
            ak ak1 = ((aj) (obj)).a(((aj) (obj)).e() - 1);
            if (ak1 != null)
            {
                obj = ((aj) (obj)).a(ak1.c());
                if (obj != null && (obj instanceof s))
                {
                    ((s)obj).b();
                }
            }
        }
    }
}
