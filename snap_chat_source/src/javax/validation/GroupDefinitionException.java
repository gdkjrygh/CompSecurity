// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            ValidationException

public final class GroupDefinitionException extends ValidationException
{

    public GroupDefinitionException()
    {
    }

    private GroupDefinitionException(String s)
    {
        super(s);
    }

    private GroupDefinitionException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    private GroupDefinitionException(Throwable throwable)
    {
        super(throwable);
    }
}
