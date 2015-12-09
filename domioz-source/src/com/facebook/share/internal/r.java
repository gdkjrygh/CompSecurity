// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//            a

final class r
    implements Runnable
{

    private static ArrayList a = new ArrayList();
    private String b;
    private boolean c;

    r(String s, boolean flag)
    {
        b = s;
        c = flag;
    }

    public final void run()
    {
        if (b != null)
        {
            a.remove(b);
            a.add(0, b);
        }
        if (c && a.size() >= 128)
        {
            String s;
            for (; 64 < a.size(); com.facebook.share.internal.a.g().remove(s))
            {
                s = (String)a.remove(a.size() - 1);
            }

        }
    }

}
