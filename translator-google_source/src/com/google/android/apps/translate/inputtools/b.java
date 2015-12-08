// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputtools;

import com.google.android.libraries.translate.e.d;
import com.google.common.collect.Maps;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.inputtools:
//            e, g, InputToolsInput, c

public final class b
{

    private static final Map a;
    private static final Map b = Maps.b();
    private static final Object c = new Object();

    static e a(InputStream inputstream)
    {
        inputstream = d.a(inputstream);
        return new e(new g(inputstream.substring(inputstream.indexOf("({") + 1, inputstream.lastIndexOf("});") + 1)));
    }

    static Map a()
    {
        return a;
    }

    static void a(String s, InputToolsInput inputtoolsinput, Runnable runnable)
    {
        if (b.containsKey(s))
        {
            inputtoolsinput.b = (e)b.get(s);
            runnable.run();
        } else
        if (a.containsKey(s))
        {
            (new c(s, inputtoolsinput, runnable)).a(new Void[0]);
            return;
        }
    }

    static Object b()
    {
        return c;
    }

    static Map c()
    {
        return b;
    }

    static 
    {
        a = Maps.b();
        a.put("bn", "bn_phone");
        a.put("gu", "gu_phone");
        a.put("hi", "deva_phone");
        a.put("kn", "kn_phone");
        a.put("mr", "deva_phone");
        a.put("pa", "guru_phone");
        a.put("ta", "ta_phone");
        a.put("te", "te_phone");
    }
}
