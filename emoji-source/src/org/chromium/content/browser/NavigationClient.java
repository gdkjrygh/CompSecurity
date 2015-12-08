// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.content_public.browser.NavigationHistory;

public interface NavigationClient
{

    public abstract NavigationHistory getDirectedNavigationHistory(boolean flag, int i);

    public abstract void goToNavigationIndex(int i);
}
