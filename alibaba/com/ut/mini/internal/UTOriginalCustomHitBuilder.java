// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.internal;

import com.ut.mini.d.n;
import java.util.Map;

public class UTOriginalCustomHitBuilder extends com.ut.mini.UTHitBuilders.UTHitBuilder
{

    public UTOriginalCustomHitBuilder(String s, int i, String s1, String s2, String s3, Map map)
    {
        if (!n.a(s))
        {
            super.setProperty("_field_page", s);
        }
        super.setProperty("_field_event_id", (new StringBuilder()).append("").append(i).toString());
        if (!n.a(s1))
        {
            super.setProperty("_field_arg1", s1);
        }
        if (!n.a(s2))
        {
            super.setProperty("_field_arg2", s2);
        }
        if (!n.a(s3))
        {
            super.setProperty("_field_arg3", s3);
        }
        super.setProperties(map);
    }
}
