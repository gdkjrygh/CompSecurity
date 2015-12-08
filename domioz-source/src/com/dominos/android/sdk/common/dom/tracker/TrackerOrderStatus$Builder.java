// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;

// Referenced classes of package com.dominos.android.sdk.common.dom.tracker:
//            OrderStatus, OrderSource, TrackerOrderStatus

public class takeTime
{

    private Ts advancedOrderTime;
    private Ts deliveryTime;
    private String driverId;
    private String driverName;
    private Ts makeTime;
    private Integer makeTimeSecs;
    private String makerId;
    private String makerName;
    private String orderDescription;
    private String orderId;
    private String orderKey;
    private OrderSource orderSource;
    private OrderStatus orderStatus;
    private Ts ovenTime;
    private Integer ovenTimeSecs;
    private String phone;
    private Ts rackTime;
    private Integer rackTimeSecs;
    private Ts routeTime;
    private Integer routeTimeSecs;
    private ServiceMethod serviceMethod;
    private Ts storeAsOfTime;
    private String storeId;
    private Ts takeTime;
    private Integer takeTimeSecs;
    private String takerId;
    private String takerName;

    public TrackerOrderStatus build()
    {
        return new TrackerOrderStatus(storeId, storeAsOfTime, orderId, orderKey, phone, serviceMethod, advancedOrderTime, orderDescription, takeTime, takeTimeSecs, takerName, takerId, orderStatus, orderSource, makeTime, makeTimeSecs, makerName, makerId, ovenTime, ovenTimeSecs, rackTime, rackTimeSecs, routeTime, routeTimeSecs, driverName, driverId, deliveryTime, null);
    }

    public deliveryTime setAdvancedOrderTime(Ts ts)
    {
        advancedOrderTime = ts;
        return this;
    }

    public advancedOrderTime setDeliveryTime(Ts ts)
    {
        deliveryTime = ts;
        return this;
    }

    public deliveryTime setDriverId(String s)
    {
        driverId = s;
        return this;
    }

    public driverId setDriverName(String s)
    {
        driverName = s;
        return this;
    }

    public driverName setMakeTime(Ts ts)
    {
        makeTime = ts;
        return this;
    }

    public makeTime setMakeTimeSecs(Integer integer)
    {
        makeTimeSecs = integer;
        return this;
    }

    public makeTimeSecs setMakerId(String s)
    {
        makerId = s;
        return this;
    }

    public makerId setMakerName(String s)
    {
        makerName = s;
        return this;
    }

    public makerName setOrderDescription(String s)
    {
        orderDescription = s;
        return this;
    }

    public orderDescription setOrderId(String s)
    {
        orderId = s;
        return this;
    }

    public orderId setOrderKey(String s)
    {
        orderKey = s;
        return this;
    }

    public orderKey setOrderSource(OrderSource ordersource)
    {
        orderSource = ordersource;
        return this;
    }

    public orderSource setOrderStatus(OrderStatus orderstatus)
    {
        orderStatus = orderstatus;
        return this;
    }

    public orderStatus setOvenTime(Ts ts)
    {
        ovenTime = ts;
        return this;
    }

    public ovenTime setOvenTimeSecs(Integer integer)
    {
        ovenTimeSecs = integer;
        return this;
    }

    public ovenTimeSecs setPhone(String s)
    {
        phone = s;
        return this;
    }

    public phone setRackTime(Ts ts)
    {
        rackTime = ts;
        return this;
    }

    public rackTime setRackTimeSecs(Integer integer)
    {
        rackTimeSecs = integer;
        return this;
    }

    public rackTimeSecs setRouteTime(Ts ts)
    {
        routeTime = ts;
        return this;
    }

    public routeTime setRouteTimeSecs(Integer integer)
    {
        routeTimeSecs = integer;
        return this;
    }

    public routeTimeSecs setServiceMethod(ServiceMethod servicemethod)
    {
        serviceMethod = servicemethod;
        return this;
    }

    public serviceMethod setStoreAsOfTime(Ts ts)
    {
        storeAsOfTime = ts;
        return this;
    }

    public storeAsOfTime setStoreId(String s)
    {
        storeId = s;
        return this;
    }

    public storeId setTakeCompleteTime(Ts ts)
    {
        takeTime = ts;
        return this;
    }

    public takeTime setTakeTimeSecs(Integer integer)
    {
        takeTimeSecs = integer;
        return this;
    }

    public takeTimeSecs setTakerId(String s)
    {
        takerId = s;
        return this;
    }

    public takerId setTakerName(String s)
    {
        takerName = s;
        return this;
    }

    public ()
    {
        deliveryTime = Ts.EMPTY;
        driverName = "";
        driverId = "";
        makerName = "";
        makerId = "";
        makeTime = Ts.EMPTY;
        orderDescription = "";
        orderId = "";
        orderStatus = OrderStatus.UNKNOWN;
        orderSource = OrderSource.UNKNOWN;
        ovenTime = Ts.EMPTY;
        phone = "";
        rackTime = Ts.EMPTY;
        routeTime = Ts.EMPTY;
        serviceMethod = ServiceMethod.UNKNOWN;
        advancedOrderTime = Ts.EMPTY;
        storeAsOfTime = Ts.EMPTY;
        takerName = "";
        takerId = "";
        takeTime = Ts.EMPTY;
    }
}
