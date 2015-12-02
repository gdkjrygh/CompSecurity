// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.b;


// Referenced classes of package com.a.b:
//            c

public abstract class a extends c
{

    public a(String s)
    {
        super(java/lang/Float, s);
    }

    public abstract void a(Object obj, float f);

    public final void a(Object obj, Float float1)
    {
        a(obj, float1.floatValue());
    }

    public volatile void a(Object obj, Object obj1)
    {
        a(obj, (Float)obj1);
    }
}
