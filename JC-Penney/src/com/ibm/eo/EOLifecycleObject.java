// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo;

import java.util.HashMap;

// Referenced classes of package com.ibm.eo:
//            EOLifecycleObjectName

public interface EOLifecycleObject
    extends EOLifecycleObjectName
{

    public abstract boolean disable();

    public abstract boolean enable();

    public abstract HashMap httpHeaders();

    public abstract boolean isEnabled();

    public abstract boolean onDestroyEO();

    public abstract boolean onLowMemoryEO();

    public abstract boolean onPauseEO();

    public abstract boolean onResumeEO();

    public abstract boolean onTerminateEO();
}
