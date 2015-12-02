// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.view.MotionEvent;
import com.facebook.reflex.ak;
import com.facebook.reflex.r;
import com.facebook.reflex.view.b.k;

// Referenced classes of package com.facebook.reflex.view:
//            a

class c
    implements ak
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void b(r r)
    {
        r = k.b(r);
        com.facebook.reflex.view.a.a(a, r);
        r.recycle();
    }
}
