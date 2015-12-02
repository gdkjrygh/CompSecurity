// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.a;

import com.facebook.analytics.cb;
import com.facebook.analytics.cm;
import java.util.Map;

public class a
{

    public a()
    {
    }

    public static cb a(String s, String s1, Map map)
    {
        return cm.a("push_reg_c2dm", s, map, "registration_id", s1);
    }
}
