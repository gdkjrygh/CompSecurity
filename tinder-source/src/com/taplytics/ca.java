// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.taplytics:
//            cb, cc

public final class ca
{

    private static ca f;
    Method a;
    HashSet b;
    HashMap c;
    android.view.View.OnLayoutChangeListener d;
    android.view.View.OnLayoutChangeListener e;

    public ca()
    {
        a = null;
        b = new HashSet();
        c = new HashMap();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            d = new cb(this);
            e = new cc(this);
        }
    }

    public static ca a()
    {
        if (f != null)
        {
            return f;
        } else
        {
            ca ca1 = new ca();
            f = ca1;
            return ca1;
        }
    }
}
