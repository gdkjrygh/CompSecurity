// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.util.Set;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

public interface Validator
{

    public abstract ExecutableValidator forExecutables();

    public abstract BeanDescriptor getConstraintsForClass$2044451b();

    public abstract Object unwrap$659effca();

    public transient abstract Set validate$622610b8();

    public transient abstract Set validateProperty$13cf112e();

    public transient abstract Set validateValue$66b5613b();
}
