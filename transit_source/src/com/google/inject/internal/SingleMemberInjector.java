// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;

// Referenced classes of package com.google.inject.internal:
//            Errors, InternalContext

interface SingleMemberInjector
{

    public abstract InjectionPoint getInjectionPoint();

    public abstract void inject(Errors errors, InternalContext internalcontext, Object obj);
}
