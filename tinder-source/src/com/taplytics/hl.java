// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hk

final class hl
    implements Runnable
{

    final ViewGroup a;
    final int b;
    final JSONObject c;
    final boolean d;

    hl(ViewGroup viewgroup, int i, JSONObject jsonobject, boolean flag)
    {
        a = viewgroup;
        b = i;
        c = jsonobject;
        d = flag;
        super();
    }

    public final void run()
    {
        hk.a(a, b, c, d);
    }
}
