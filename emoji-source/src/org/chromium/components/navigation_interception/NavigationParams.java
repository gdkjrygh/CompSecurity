// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.components.navigation_interception;


public class NavigationParams
{

    public final boolean hasUserGesture;
    public final boolean isPost;
    public final boolean isRedirect;
    public final int pageTransitionType;
    public final String url;

    public NavigationParams(String s, boolean flag, boolean flag1, int i, boolean flag2)
    {
        url = s;
        isPost = flag;
        hasUserGesture = flag1;
        pageTransitionType = i;
        isRedirect = flag2;
    }

    public static NavigationParams create(String s, boolean flag, boolean flag1, int i, boolean flag2)
    {
        return new NavigationParams(s, flag, flag1, i, flag2);
    }
}
