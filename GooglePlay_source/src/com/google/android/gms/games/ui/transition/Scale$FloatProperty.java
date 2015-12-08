// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.util.Property;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            Scale

public static abstract class  extends Property
{

    public volatile void set(Object obj, Object obj1)
    {
        setValue(obj, ((Float)obj1).intValue());
    }

    public abstract void setValue(Object obj, float f);

    public (String s)
    {
        super(java/lang/Float, s);
    }
}
