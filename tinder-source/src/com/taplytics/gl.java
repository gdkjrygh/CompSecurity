// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.ViewGroup;
import java.util.HashMap;

// Referenced classes of package com.taplytics:
//            gj

final class gl
    implements Runnable
{

    final int a;
    final ViewGroup b;
    final String c;

    gl(int i, ViewGroup viewgroup, String s)
    {
        a = i;
        b = viewgroup;
        c = s;
        super();
    }

    public final void run()
    {
        try
        {
            gj.a(a, b, c);
            return;
        }
        catch (Throwable throwable)
        {
            gj.b().put(c, Boolean.valueOf(false));
        }
    }
}
