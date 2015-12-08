// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.constraintvalidation;


public final class ValidationTarget extends Enum
{

    private static final ValidationTarget $VALUES[];
    private static ValidationTarget ANNOTATED_ELEMENT;
    private static ValidationTarget PARAMETERS;

    private ValidationTarget(String s, int i)
    {
        super(s, i);
    }

    public static ValidationTarget valueOf(String s)
    {
        return (ValidationTarget)Enum.valueOf(javax/validation/constraintvalidation/ValidationTarget, s);
    }

    public static ValidationTarget[] values()
    {
        return (ValidationTarget[])$VALUES.clone();
    }

    static 
    {
        ANNOTATED_ELEMENT = new ValidationTarget("ANNOTATED_ELEMENT", 0);
        PARAMETERS = new ValidationTarget("PARAMETERS", 1);
        $VALUES = (new ValidationTarget[] {
            ANNOTATED_ELEMENT, PARAMETERS
        });
    }
}
