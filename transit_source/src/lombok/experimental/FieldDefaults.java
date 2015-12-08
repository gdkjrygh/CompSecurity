// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package lombok.experimental;

import java.lang.annotation.Annotation;
import lombok.AccessLevel;

public interface FieldDefaults
    extends Annotation
{

    public abstract AccessLevel level();

    public abstract boolean makeFinal();
}
