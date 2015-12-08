// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import com.jcp.model.rewards.Certificate;
import java.util.Comparator;

public class b
    implements Comparator
{

    public b()
    {
    }

    public int a(Certificate certificate, Certificate certificate1)
    {
        return certificate.getDaysLeft().intValue() - certificate1.getDaysLeft().intValue();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Certificate)obj, (Certificate)obj1);
    }
}
