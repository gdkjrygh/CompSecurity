// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.components.navigation_interception.NavigationParams;

interface XWalkNavigationHandler
{

    public abstract boolean handleNavigation(NavigationParams navigationparams);
}
