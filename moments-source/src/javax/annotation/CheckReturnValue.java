// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;
import javax.annotation.meta.When;

public interface CheckReturnValue
    extends Annotation
{

    public abstract When when();
}
