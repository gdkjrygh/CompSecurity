// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;

import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.reflex.animation:
//            PropertyName, Change, Transition

public class a
{

    final Change a;
    private PropertyName b;

    a(Change change, PropertyName propertyname)
    {
        a = change;
        super();
        b = (PropertyName)Preconditions.checkNotNull(propertyname);
    }

    public a a(float f)
    {
        Change.a(a, b, f);
        return this;
    }

    public a a(Transition transition)
    {
        Change.a(a, b, transition);
        return this;
    }
}
