// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;

final class ovm extends Property
{

    public ovm()
    {
        super(Float.TYPE, "revealState");
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(ovl.a((ovl)obj));
    }

    public final void set(Object obj, Object obj1)
    {
        obj = (ovl)obj;
        ovl.a(((ovl) (obj)), ((Float)obj1).floatValue());
        ((ovl) (obj)).invalidateSelf();
    }
}
