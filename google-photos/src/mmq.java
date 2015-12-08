// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class mmq
    implements Comparator
{

    private final mmv a;

    public mmq(mmv mmv1)
    {
        a = mmv1;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        obj = a.a(((Integer) (obj)).intValue());
        obj1 = a.a(((Integer) (obj1)).intValue());
        boolean flag = ((mmx) (obj)).c("is_managed_account");
        boolean flag1 = ((mmx) (obj1)).c("is_managed_account");
        if (flag && !flag1)
        {
            return 1;
        }
        if (!flag && flag1)
        {
            return -1;
        } else
        {
            return ((mmx) (obj)).b("account_name").compareToIgnoreCase(((mmx) (obj1)).b("account_name"));
        }
    }
}
