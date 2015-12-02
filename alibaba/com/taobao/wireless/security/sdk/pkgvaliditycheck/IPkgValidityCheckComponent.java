// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.pkgvaliditycheck;

import com.taobao.wireless.security.sdk.IComponent;

public interface IPkgValidityCheckComponent
    extends IComponent
{

    public transient abstract int checkEnvAndFiles(String as[]);

    public abstract String getDexHash(String s, String s1, int i);

    public abstract boolean isPackageValid(String s);
}
