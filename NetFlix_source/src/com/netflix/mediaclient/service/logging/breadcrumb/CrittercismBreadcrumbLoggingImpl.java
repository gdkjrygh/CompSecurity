// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.breadcrumb;

import com.crittercism.app.Crittercism;
import com.netflix.mediaclient.servicemgr.BreadcrumbLogging;

public final class CrittercismBreadcrumbLoggingImpl
    implements BreadcrumbLogging
{

    public CrittercismBreadcrumbLoggingImpl()
    {
    }

    public void leaveBreadcrumb(String s)
    {
        Crittercism.leaveBreadcrumb(s);
    }
}
