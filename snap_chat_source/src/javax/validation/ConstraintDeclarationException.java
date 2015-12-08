// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            ValidationException

public class ConstraintDeclarationException extends ValidationException
{

    public ConstraintDeclarationException()
    {
    }

    public ConstraintDeclarationException(String s)
    {
        super(s);
    }

    public ConstraintDeclarationException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ConstraintDeclarationException(Throwable throwable)
    {
        super(throwable);
    }
}
