// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;

// Referenced classes of package com.taplytics:
//            cv, hk

final class gq
    implements Runnable
{

    final View a;
    final String b;
    final String c;

    gq(View view, String s, String s1)
    {
        a = view;
        b = s;
        c = s1;
        super();
    }

    public final void run()
    {
        try
        {
            HashMap hashmap = (HashMap)a.getTag(cv.a().o);
            HashMap hashmap1 = new HashMap();
            hashmap1.put(b, Integer.valueOf(hk.a(((Float)a.getClass().getMethod(b.replaceAll("set", "get"), new Class[0]).invoke(a, new Object[0])).floatValue())));
            hashmap1.put("parameterType", c);
            hashmap.put(b, hashmap1);
            a.setTag(cv.a().o, hashmap);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
