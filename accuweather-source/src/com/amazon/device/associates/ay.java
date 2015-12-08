// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;

// Referenced classes of package com.amazon.device.associates:
//            RequestId, ShoppingServiceRequest, ShoppingServiceResponse

interface ay
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a h[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/amazon/device/associates/ay$a, s);
        }

        public static a[] values()
        {
            return (a[])h.clone();
        }

        static 
        {
            a = new a("GET_SERVICE_STATUS", 0);
            b = new a("GET_RECEIPTS", 1);
            c = new a("SEARCH", 2);
            d = new a("SEARCH_BY_ID", 3);
            e = new a("PURCHASE", 4);
            f = new a("GET_PURCHASE_RESULT", 5);
            g = new a("NOTIFY_RECEIPT_RECEIVED", 6);
            h = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract RequestId a(a a1, RequestId requestid, ShoppingServiceRequest shoppingservicerequest);

    public abstract String a();

    public abstract void a(a a1, ShoppingServiceResponse shoppingserviceresponse);

    public abstract Context b();
}
