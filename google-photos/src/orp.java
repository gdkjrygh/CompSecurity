// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;

final class orp extends Property
{

    public orp()
    {
        super(Float.TYPE, "transitionProgress");
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(((orl)obj).a);
    }

    public final void set(Object obj, Object obj1)
    {
        ((orl)obj).a(((Float)obj1).floatValue());
    }
}
