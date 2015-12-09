// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;

import java.lang.annotation.Annotation;

// Referenced classes of package butterknife.internal:
//            ListenerMethod

public interface ListenerClass
    extends Annotation
{

    public abstract Class callbacks();

    public abstract int genericArguments();

    public abstract ListenerMethod[] method();

    public abstract String setter();

    public abstract String targetType();

    public abstract String type();
}
