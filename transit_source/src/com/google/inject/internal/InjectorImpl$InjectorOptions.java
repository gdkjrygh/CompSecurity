// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Stage;
import com.google.inject.internal.util.$ToStringBuilder;

// Referenced classes of package com.google.inject.internal:
//            InjectorImpl

static class disableCircularProxies
{

    final boolean disableCircularProxies;
    final boolean jitDisabled;
    final Stage stage;

    public String toString()
    {
        return (new $ToStringBuilder(getClass())).add("stage", stage).add("jitDisabled", Boolean.valueOf(jitDisabled)).add("disableCircularProxies", Boolean.valueOf(disableCircularProxies)).toString();
    }

    (Stage stage1, boolean flag, boolean flag1)
    {
        stage = stage1;
        jitDisabled = flag;
        disableCircularProxies = flag1;
    }
}
