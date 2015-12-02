// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;


// Referenced classes of package com.facebook.reflex.animation:
//            b

public final class PropertyName
{

    private final int mNativePtr;

    public PropertyName(PropertyName propertyname, b b1)
    {
        mNativePtr = fromField(propertyname, b1.ordinal());
    }

    public PropertyName(String s)
    {
        mNativePtr = fromString(s);
    }

    public PropertyName(String s, b b1)
    {
        this(new PropertyName(s), b1);
    }

    private native int fromField(PropertyName propertyname, int i);

    private native int fromString(String s);

    private native int withParent(PropertyName propertyname, String s);

    public boolean equals(Object obj)
    {
        return mNativePtr == ((PropertyName)obj).mNativePtr;
    }
}
