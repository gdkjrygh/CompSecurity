// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.getpebble.android.kit.a.a;
import com.google.a.a.ac;

public abstract class PebbleCommand extends Enum
{

    private static final PebbleCommand $VALUES[];
    public static final PebbleCommand Error;
    public static final PebbleCommand GetCheckOutInfo;
    public static final PebbleCommand GetConnectionEstablished;
    public static final PebbleCommand GetEasyOrder;
    public static final PebbleCommand GetOrderDetail;
    public static final PebbleCommand GetOrderHistory;
    public static final PebbleCommand GetPebbleAppConnected;
    public static final PebbleCommand GetProductDetail;
    public static final PebbleCommand GetTrackerInfo;
    public static final PebbleCommand GetUserInfo;
    public static final PebbleCommand PlaceOrder;
    public static final PebbleCommand Unknown;
    private static final PebbleCommand values[] = values();

    private PebbleCommand(String s, int i)
    {
        super(s, i);
    }

    PebbleCommand(String s, int i, _cls1 _pcls1)
    {
        this(s, i);
    }

    public static ac getIfPresent(int i)
    {
        ac ac1;
        try
        {
            if (i > values.length)
            {
                return ac.b(Unknown);
            }
            ac1 = ac.b(values[i]);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return ac.b();
        }
        return ac1;
    }

    public static PebbleCommand valueOf(String s)
    {
        return (PebbleCommand)Enum.valueOf(com/dominos/pebble/PebbleCommand, s);
    }

    public static PebbleCommand[] values()
    {
        return (PebbleCommand[])$VALUES.clone();
    }

    public void addCommand(a a1)
    {
        a1.a(0, (byte)(ordinal() & 0xff));
    }

    transient abstract void execute(Context context, int i, Object aobj[]);

    static 
    {
        Error = new _cls1("Error", 0);
        GetUserInfo = new _cls2("GetUserInfo", 1);
        GetOrderHistory = new _cls3("GetOrderHistory", 2);
        GetOrderDetail = new _cls4("GetOrderDetail", 3);
        GetTrackerInfo = new _cls5("GetTrackerInfo", 4);
        PlaceOrder = new _cls6("PlaceOrder", 5);
        GetConnectionEstablished = new _cls7("GetConnectionEstablished", 6);
        GetPebbleAppConnected = new _cls8("GetPebbleAppConnected", 7);
        GetEasyOrder = new _cls9("GetEasyOrder", 8);
        GetCheckOutInfo = new _cls10("GetCheckOutInfo", 9);
        GetProductDetail = new _cls11("GetProductDetail", 10);
        Unknown = new _cls12("Unknown", 11);
        $VALUES = (new PebbleCommand[] {
            Error, GetUserInfo, GetOrderHistory, GetOrderDetail, GetTrackerInfo, PlaceOrder, GetConnectionEstablished, GetPebbleAppConnected, GetEasyOrder, GetCheckOutInfo, 
            GetProductDetail, Unknown
        });
    }

    private class _cls1 extends PebbleCommand
    {

        final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleManager_.getInstance_(context).sendUserInfo();
        }

        _cls1(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls2 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleManager_.getInstance_(context).sendUserInfo();
        }

        _cls2(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls3 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleOrderHandler_.getInstance_(context).sendRecentOrder();
        }

        _cls3(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls4 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            if (aobj.length > 0)
            {
                PebbleKit.a(context, i);
                PebbleOrderHandler_.getInstance_(context).sendOrderInfo(aobj[0].toString());
                return;
            } else
            {
                PebbleKit.b(context, i);
                return;
            }
        }

        _cls4(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls5 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            if (aobj.length > 0)
            {
                PebbleKit.a(context, i);
                PebbleManager_.getInstance_(context).getTrackerInfo(aobj[0].toString());
                return;
            } else
            {
                PebbleKit.b(context, i);
                return;
            }
        }

        _cls5(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls6 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            if (aobj.length > 0)
            {
                PebbleKit.a(context, i);
                PebbleOrderHandler_.getInstance_(context).placeOrder();
                return;
            } else
            {
                PebbleKit.b(context, i);
                return;
            }
        }

        _cls6(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls7 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleManager_.getInstance_(context).connectionAvailable();
        }

        _cls7(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls8 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleManager_.getInstance_(context).setPebbleAppOpen(true);
        }

        _cls8(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls9 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleOrderHandler_.getInstance_(context).sendEasyOrder();
        }

        _cls9(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls10 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleOrderHandler_.getInstance_(context).sendCheckoutInfo();
        }

        _cls10(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls11 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
            PebbleKit.a(context, i);
            PebbleOrderHandler_.getInstance_(context).sendProductDetail(aobj[0].toString());
        }

        _cls11(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls12 extends PebbleCommand
    {

        public final transient void execute(Context context, int i, Object aobj[])
        {
        }

        _cls12(String s, int i)
        {
            super(s, i, null);
        }
    }

}
