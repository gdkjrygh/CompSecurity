// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.content_public.browser.NavigationEntry;

public class XWalkNavigationItemInternal
    implements Cloneable
{

    private NavigationEntry mEntry;

    XWalkNavigationItemInternal()
    {
        mEntry = null;
    }

    XWalkNavigationItemInternal(NavigationEntry navigationentry)
    {
        mEntry = navigationentry;
    }

    XWalkNavigationItemInternal(XWalkNavigationItemInternal xwalknavigationiteminternal)
    {
        mEntry = xwalknavigationiteminternal.mEntry;
    }

    protected volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    protected XWalkNavigationItemInternal clone()
    {
        this;
        JVM INSTR monitorenter ;
        XWalkNavigationItemInternal xwalknavigationiteminternal = new XWalkNavigationItemInternal(this);
        this;
        JVM INSTR monitorexit ;
        return xwalknavigationiteminternal;
        Exception exception;
        exception;
        throw exception;
    }

    public String getOriginalUrl()
    {
        return mEntry.getOriginalUrl();
    }

    public String getTitle()
    {
        return mEntry.getTitle();
    }

    public String getUrl()
    {
        return mEntry.getUrl();
    }
}
