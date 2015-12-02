// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;

import com.facebook.reflex.Countable;
import com.facebook.reflex.Widget;

// Referenced classes of package com.facebook.reflex.animation:
//            SystemConfig, Change

public final class System extends Countable
{

    public System(SystemConfig systemconfig)
    {
        a(initialize(systemconfig));
    }

    private native int initialize(SystemConfig systemconfig);

    public native void applyChange(Change change);

    public native void bindWidget(String s, Widget widget);
}
