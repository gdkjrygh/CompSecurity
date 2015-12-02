// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push.b;

import com.facebook.push.mqtt.ck;
import com.facebook.push.mqtt.t;
import java.util.EnumSet;
import javax.inject.a;

public class i
    implements ck
{

    private final a a;

    public i(a a1)
    {
        a = a1;
    }

    public EnumSet a()
    {
        if (((Boolean)a.b()).booleanValue())
        {
            return EnumSet.of(t.VOIP);
        } else
        {
            return EnumSet.noneOf(com/facebook/push/mqtt/t);
        }
    }
}
