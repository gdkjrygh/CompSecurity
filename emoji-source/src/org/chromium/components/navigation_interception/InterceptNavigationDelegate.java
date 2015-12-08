// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.navigation_interception;


// Referenced classes of package org.chromium.components.navigation_interception:
//            NavigationParams

public interface InterceptNavigationDelegate
{

    public abstract boolean shouldIgnoreNavigation(NavigationParams navigationparams);
}
