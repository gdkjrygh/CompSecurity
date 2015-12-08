// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth.policy;


// Referenced classes of package com.amazonaws.auth.policy:
//            a

public final class STSActions extends Enum
    implements a
{

    public static final STSActions a;
    public static final STSActions b;
    private static final STSActions c[];
    private final String action;

    private STSActions(String s, int i, String s1)
    {
        super(s, i);
        action = s1;
    }

    public static STSActions valueOf(String s)
    {
        return (STSActions)Enum.valueOf(com/amazonaws/auth/policy/STSActions, s);
    }

    public static STSActions[] values()
    {
        return (STSActions[])c.clone();
    }

    public String a()
    {
        return action;
    }

    static 
    {
        a = new STSActions("AssumeRole", 0, "sts:AssumeRole");
        b = new STSActions("AssumeRoleWithWebIdentity", 1, "sts:AssumeRoleWithWebIdentity");
        c = (new STSActions[] {
            a, b
        });
    }
}
