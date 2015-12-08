// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;


// Referenced classes of package me.lyft.android.domain.payment:
//            LineItem, NullMoney

public class  extends LineItem
{

    private static final LineItem INSTANCE = new <init>();

    public boolean isNull()
    {
        return true;
    }



    public ()
    {
        super(NullMoney.getInstance(), "");
    }
}
