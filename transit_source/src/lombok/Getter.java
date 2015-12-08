// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package lombok;

import java.lang.annotation.Annotation;

// Referenced classes of package lombok:
//            AccessLevel

public interface Getter
    extends Annotation
{
    public static interface AnyAnnotation
        extends Annotation
    {
    }


    public abstract boolean lazy();

    public abstract AnyAnnotation[] onMethod();

    public abstract AccessLevel value();
}
