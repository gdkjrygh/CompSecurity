// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import java.io.Serializable;

public abstract class j
    implements Serializable, Cloneable
{

    String g;
    Object h;

    public j()
    {
    }

    public abstract Object a();

    public void a(Object obj)
    {
        h = obj;
    }

    public Object b()
    {
        return h;
    }

    public abstract Object clone();
}
