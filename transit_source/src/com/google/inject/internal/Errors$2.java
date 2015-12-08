// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            Errors

static final class nverter extends nverter
{

    public String toString(Class class1)
    {
        return class1.getName();
    }

    public volatile String toString(Object obj)
    {
        return toString((Class)obj);
    }

    nverter(Class class1)
    {
        super(class1);
    }
}
