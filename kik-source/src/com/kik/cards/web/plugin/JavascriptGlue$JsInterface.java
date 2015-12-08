// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import java.util.LinkedList;

// Referenced classes of package com.kik.cards.web.plugin:
//            JavascriptGlue, h, e

private class <init>
{

    final JavascriptGlue a;

    public String invokeAsyncFunction(String s, String s1, String s2, String s3)
    {
        if (JavascriptGlue.a(a))
        {
            return "";
        }
        if (!JavascriptGlue.c(a))
        {
            JavascriptGlue.d(a);
        }
        return JavascriptGlue.e(a).a(s, s1, s2, s3);
    }

    public String invokeFunction(String s, String s1, String s2)
    {
        if (JavascriptGlue.a(a))
        {
            return "";
        }
        if (!JavascriptGlue.c(a))
        {
            JavascriptGlue.d(a);
        }
        return JavascriptGlue.e(a).a(s, s1, s2);
    }

    public String poll()
    {
        if (JavascriptGlue.a(a))
        {
            return "";
        }
        String s = "";
        synchronized (JavascriptGlue.f(a))
        {
            JavascriptGlue.g(a);
            if (JavascriptGlue.f(a).size() > 0)
            {
                s = (String)JavascriptGlue.f(a).removeFirst();
            }
        }
        return s;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _cls9(JavascriptGlue javascriptglue)
    {
        a = javascriptglue;
        super();
    }

    a(JavascriptGlue javascriptglue, e e)
    {
        this(javascriptglue);
    }
}
