// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.lang.annotation.Annotation;

public interface BindingBuildInfo
    extends Annotation
{

    public abstract String buildId();

    public abstract boolean enableDebugLogs();

    public abstract String exportClassListTo();

    public abstract boolean isLibrary();

    public abstract String layoutInfoDir();

    public abstract int minSdk();

    public abstract String modulePackage();

    public abstract boolean printEncodedError();

    public abstract String sdkRoot();
}
