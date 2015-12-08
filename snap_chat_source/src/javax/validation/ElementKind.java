// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


public final class ElementKind extends Enum
{

    private static final int $VALUES$6b00c557[] = {
        1, 2, 3, 4, 5, 6, 7
    };
    private static int BEAN$3be69c4;
    private static int CONSTRUCTOR$3be69c4;
    private static int CROSS_PARAMETER$3be69c4;
    private static int METHOD$3be69c4;
    private static int PARAMETER$3be69c4;
    private static int PROPERTY$3be69c4;
    private static int RETURN_VALUE$3be69c4;

    private ElementKind(String s, int i)
    {
        super(s, i);
    }

    private static int[] values$1b8f9fca()
    {
        return (int[])$VALUES$6b00c557.clone();
    }

}
