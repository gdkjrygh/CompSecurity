// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import com.fitbit.dncs.domain.CategoryID;
import com.fitbit.dncs.domain.EventFlag;
import com.fitbit.dncs.domain.NotificationAttributeId;
import com.fitbit.dncs.domain.a;
import com.fitbit.dncs.domain.c;
import java.io.Serializable;
import java.util.UUID;

public final class Notification extends c
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String appId;
    private CategoryID category;
    private byte flags;

    public Notification()
    {
        flags = EventFlag.b.a();
        category = CategoryID.a;
        a(Integer.valueOf((int)UUID.randomUUID().getLeastSignificantBits()));
    }

    public byte a()
    {
        return flags;
    }

    public void a(byte byte0)
    {
        flags = byte0;
    }

    public void a(CategoryID categoryid)
    {
        category = categoryid;
    }

    public void a(String s)
    {
        appId = s;
        a(new a(NotificationAttributeId.a, s));
    }

    public CategoryID b()
    {
        return category;
    }

    public String c()
    {
        return appId;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Notification[").append(e()).append(", ").append(b()).append("]").toString();
    }
}
