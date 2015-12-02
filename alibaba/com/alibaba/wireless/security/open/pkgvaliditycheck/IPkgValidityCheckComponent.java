// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.pkgvaliditycheck;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

public interface IPkgValidityCheckComponent
    extends IComponent
{

    public transient abstract int checkEnvAndFiles(String as[])
        throws SecException;
}
