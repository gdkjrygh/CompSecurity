// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.leanplum:
//            a

public class ActionArgs
{

    private List a;

    public ActionArgs()
    {
        a = new ArrayList();
    }

    final List a()
    {
        return a;
    }

    public ActionArgs with(String s, Object obj)
    {
        a.add(com.leanplum.a.a(s, obj));
        return this;
    }

    public ActionArgs withAction(String s, String s1)
    {
        a.add(com.leanplum.a.e(s, s1));
        return this;
    }

    public ActionArgs withAsset(String s, String s1)
    {
        a.add(com.leanplum.a.d(s, s1));
        return this;
    }

    public ActionArgs withColor(String s, int i)
    {
        a.add(com.leanplum.a.a(s, i));
        return this;
    }

    public ActionArgs withFile(String s, String s1)
    {
        a.add(com.leanplum.a.c(s, s1));
        return this;
    }
}
