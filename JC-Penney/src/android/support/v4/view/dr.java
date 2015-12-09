// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            dp, dy, ds, dn, 
//            ec

class dr extends dp
{

    WeakHashMap b;

    dr()
    {
        b = null;
    }

    public void a(dn dn, View view)
    {
        dy.a(view);
    }

    public void a(dn dn, View view, float f)
    {
        dy.a(view, f);
    }

    public void a(dn dn, View view, ec ec)
    {
        view.setTag(0x7e000000, ec);
        dy.a(view, new ds(dn));
    }
}
