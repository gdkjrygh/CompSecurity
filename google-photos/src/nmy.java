// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class nmy extends ThreadLocal
{

    nmy()
    {
    }

    protected final Object initialValue()
    {
        return new ArrayList(8);
    }
}
