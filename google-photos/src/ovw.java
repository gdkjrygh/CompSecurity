// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;

final class ovw extends Property
{

    private ovu a;

    public ovw(ovu ovu1)
    {
        a = ovu1;
        super(Float.TYPE, "value");
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(((ovv)obj).a);
    }

    public final void set(Object obj, Object obj1)
    {
        ((ovv)obj).a = ((Float)obj1).floatValue();
        a.invalidateSelf();
    }
}
