// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class yk
{

    public static List a;
    public static List b;

    static 
    {
        a = new ArrayList();
        b = new ArrayList();
        a.add("buyerDonotwantOrder");
        a.add("freightCommitDayNotMatch");
        a.add("sellerRiseOrderAmount");
        a.add("sellerDidnotuseBuyerLogisticType");
        a.add("buyerCannotContactSeller");
        a.add("productNotEnough");
        a.add("otherReasons");
        b.add("buyerDonotwantOrder");
        b.add("buyerWantChangeProduct");
        b.add("buyerChangeMailAddress");
        b.add("buyerChangeCoupon");
        b.add("buyerChangeLogistic");
        b.add("buyerCannotPayment");
        b.add("otherReasons");
    }
}
