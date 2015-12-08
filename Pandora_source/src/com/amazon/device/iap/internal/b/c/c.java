// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b.c;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import java.util.Set;

abstract class c extends i
{

    protected final Set a;

    c(e e, String s, Set set)
    {
        super(e, "getItem_data", s);
        a = set;
        a("skus", set);
    }
}
