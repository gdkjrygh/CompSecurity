// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;

final class ao extends ThreadLocal
{

    ao()
    {
    }

    protected ArrayList a()
    {
        return new ArrayList();
    }

    protected Object initialValue()
    {
        return a();
    }
}
