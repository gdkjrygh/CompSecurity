// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hk

final class hm
    implements Runnable
{

    final boolean a;
    final int b;
    final ViewGroup c;
    final int d;
    final JSONObject e;
    final boolean f;

    hm(boolean flag, int i, ViewGroup viewgroup, int j, JSONObject jsonobject, boolean flag1)
    {
        a = flag;
        b = i;
        c = viewgroup;
        d = j;
        e = jsonobject;
        f = flag1;
        super();
    }

    public final void run()
    {
        if (a)
        {
            hk.b(b, c, d, e, f);
            return;
        } else
        {
            hk.a(b, c, d, e, f);
            return;
        }
    }
}
