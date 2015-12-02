// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;

import java.util.HashMap;

// Referenced classes of package com.facebook.reflex.animation:
//            a, PropertyName, Transition

public final class Change
{

    private final HashMap a = new HashMap();
    private int mNativePtr;

    public Change()
    {
        mNativePtr = initialize();
    }

    static void a(Change change, PropertyName propertyname, float f)
    {
        change.changeTo(propertyname, f);
    }

    static void a(Change change, PropertyName propertyname, Transition transition)
    {
        change.changeWith(propertyname, transition);
    }

    private native void changeTo(PropertyName propertyname, float f);

    private native void changeWith(PropertyName propertyname, Transition transition);

    private native void destroy();

    private native int initialize();

    private native void setPausedState(PropertyName propertyname, boolean flag);

    public a a(PropertyName propertyname)
    {
        a a1 = (a)a.get(propertyname);
        if (a1 != null)
        {
            return a1;
        } else
        {
            a a2 = new a(this, propertyname);
            a.put(propertyname, a2);
            return a2;
        }
    }

    public void a()
    {
        if (mNativePtr != 0)
        {
            destroy();
            mNativePtr = 0;
        }
    }

    protected void finalize()
    {
        a();
        super.finalize();
    }
}
