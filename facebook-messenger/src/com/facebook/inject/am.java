// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.hq;
import java.util.List;

final class am extends ThreadLocal
{

    am()
    {
    }

    protected List a()
    {
        return hq.a();
    }

    protected Object initialValue()
    {
        return a();
    }
}
