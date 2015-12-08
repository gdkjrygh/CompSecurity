// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.filter.IFilter;

public class NullFilter
    implements IFilter
{

    public NullFilter()
    {
    }

    public boolean matches(Object obj)
    {
        return true;
    }
}
