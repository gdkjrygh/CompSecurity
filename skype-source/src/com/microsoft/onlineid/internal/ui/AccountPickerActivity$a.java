// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;


// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            AccountPickerActivity

private static final class  extends Enum
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/onlineid/internal/ui/AccountPickerActivity$a, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    public final String a()
    {
        return (new StringBuilder("com.microsoft.msa.authenticator.")).append(name()).toString();
    }

    static 
    {
        a = new <init>("CidsToExclude");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
