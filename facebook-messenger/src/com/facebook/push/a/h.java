// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.a;

import com.facebook.analytics.cb;
import com.facebook.analytics.cm;

public class h
{

    public h()
    {
    }

    public static cb a(String s, String s1)
    {
        return cm.a("push_unreg_server", s, null, "registration_id", s1);
    }
}
