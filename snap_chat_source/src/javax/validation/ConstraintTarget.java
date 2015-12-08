// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


public final class ConstraintTarget extends Enum
{

    private static final int $VALUES$5aee401f[] = {
        1, 2, 3
    };
    private static int IMPLICIT$5298b61c;
    private static int PARAMETERS$5298b61c;
    private static int RETURN_VALUE$5298b61c;

    private ConstraintTarget(String s, int i)
    {
        super(s, i);
    }

    private static int[] values$24e79e()
    {
        return (int[])$VALUES$5aee401f.clone();
    }

}
