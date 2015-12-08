// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics.a;

import com.taplytics.bw;
import com.taplytics.gs;

// Referenced classes of package com.taplytics.a:
//            k

public final class j
{

    public Object a;
    public k b;

    public j(String s, Object obj)
    {
        this(s, obj, null);
    }

    public j(String s, Object obj, k k)
    {
        try
        {
            b = k;
            a = bw.a().a(s, obj, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a = obj;
        }
        gs.b("exception starting TaplyticsVar", s);
    }
}
