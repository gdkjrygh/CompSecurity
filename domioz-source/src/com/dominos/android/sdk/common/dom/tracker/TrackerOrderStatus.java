// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Ts;
import com.dominos.android.sdk.common.core.Util;
import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import java.util.Map;
import org.a.a.a.i;

// Referenced classes of package com.dominos.android.sdk.common.dom.tracker:
//            OrderStatus, OrderSource

public class TrackerOrderStatus
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final Ts advancedOrderTime;
    private final Ts deliveryTime;
    private final String driverId;
    private final String driverName;
    private final Ts makeTime;
    private final Integer makeTimeSecs;
    private final String makerId;
    private final String makerName;
    private final String orderDescription;
    private final String orderId;
    private final String orderKey;
    private final OrderSource orderSource;
    private final OrderStatus orderStatus;
    private final Ts ovenTime;
    private final Integer ovenTimeSecs;
    private final String phone;
    private final Ts rackTime;
    private final Integer rackTimeSecs;
    private final Ts routeTime;
    private final Integer routeTimeSecs;
    private final ServiceMethod serviceMethod;
    private final Ts storeAsOfTime;
    private final String storeId;
    private final Ts takeTime;
    private final Integer takeTimeSecs;
    private final String takerId;
    private final String takerName;

    private TrackerOrderStatus(Parcel parcel)
    {
        driverName = parcel.readString();
        driverId = parcel.readString();
        makerName = parcel.readString();
        makerId = parcel.readString();
        orderDescription = parcel.readString();
        orderId = parcel.readString();
        orderKey = parcel.readString();
        phone = parcel.readString();
        storeId = parcel.readString();
        takerName = parcel.readString();
        takerId = parcel.readString();
        makeTimeSecs = Integer.valueOf(parcel.readInt());
        ovenTimeSecs = Integer.valueOf(parcel.readInt());
        rackTimeSecs = Integer.valueOf(parcel.readInt());
        routeTimeSecs = Integer.valueOf(parcel.readInt());
        takeTimeSecs = Integer.valueOf(parcel.readInt());
        serviceMethod = ServiceMethod.values()[parcel.readInt()];
        orderStatus = OrderStatus.values()[parcel.readInt()];
        orderSource = OrderSource.values()[parcel.readInt()];
        deliveryTime = new Ts(parcel.readLong());
        makeTime = new Ts(parcel.readLong());
        ovenTime = new Ts(parcel.readLong());
        rackTime = new Ts(parcel.readLong());
        routeTime = new Ts(parcel.readLong());
        advancedOrderTime = new Ts(parcel.readLong());
        storeAsOfTime = new Ts(parcel.readLong());
        takeTime = new Ts(parcel.readLong());
    }

    TrackerOrderStatus(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private TrackerOrderStatus(String s, Ts ts, String s1, String s2, String s3, ServiceMethod servicemethod, Ts ts1, 
            String s4, Ts ts2, Integer integer, String s5, String s6, OrderStatus orderstatus, OrderSource ordersource, 
            Ts ts3, Integer integer1, String s7, String s8, Ts ts4, Integer integer2, Ts ts5, 
            Integer integer3, Ts ts6, Integer integer4, String s9, String s10, Ts ts7)
    {
        storeId = Util.notEmpty(s);
        storeAsOfTime = (Ts)Util.notNull(ts);
        orderId = (String)Util.notNull(s1);
        orderKey = Util.notEmpty(s2);
        phone = (String)Util.notNull(s3);
        serviceMethod = (ServiceMethod)Util.notNull(servicemethod);
        advancedOrderTime = (Ts)Util.notNull(ts1);
        orderDescription = (String)Util.notNull(s4);
        takeTime = (Ts)Util.notNull(ts2);
        takeTimeSecs = integer;
        takerName = (String)Util.notNull(s5);
        takerId = (String)Util.notNull(s6);
        orderStatus = (OrderStatus)Util.notNull(orderstatus);
        orderSource = (OrderSource)Util.notNull(ordersource);
        makeTime = (Ts)Util.notNull(ts3);
        makeTimeSecs = integer1;
        makerName = (String)Util.notNull(s7);
        makerId = (String)Util.notNull(s8);
        ovenTime = (Ts)Util.notNull(ts4);
        ovenTimeSecs = integer2;
        rackTime = (Ts)Util.notNull(ts5);
        rackTimeSecs = integer3;
        routeTime = (Ts)Util.notNull(ts6);
        routeTimeSecs = integer4;
        driverName = (String)Util.notNull(s9);
        driverId = (String)Util.notNull(s10);
        deliveryTime = (Ts)Util.notNull(ts7);
    }

    TrackerOrderStatus(String s, Ts ts, String s1, String s2, String s3, ServiceMethod servicemethod, Ts ts1, 
            String s4, Ts ts2, Integer integer, String s5, String s6, OrderStatus orderstatus, OrderSource ordersource, 
            Ts ts3, Integer integer1, String s7, String s8, Ts ts4, Integer integer2, Ts ts5, 
            Integer integer3, Ts ts6, Integer integer4, String s9, String s10, Ts ts7, _cls1 _pcls1)
    {
        this(s, ts, s1, s2, s3, servicemethod, ts1, s4, ts2, integer, s5, s6, orderstatus, ordersource, ts3, integer1, s7, s8, ts4, integer2, ts5, integer3, ts6, integer4, s9, s10, ts7);
    }

    private static Ts extractTs(MapNode mapnode, String s)
    {
        return (Ts)i.a(Ts.create(mapnode.getText(s)), Ts.EMPTY);
    }

    public static TrackerOrderStatus from(Map map)
    {
        map = new MapNode(map);
        return (new Builder()).setStoreId(map.getText("StoreID")).setStoreAsOfTime(extractTs(map, "StoreAsOfTime")).setOrderId(StringHelper.defaultString(map.getText("OrderID"))).setOrderKey(map.getText("OrderKey")).setPhone(StringHelper.defaultString(map.getText("Phone"))).setServiceMethod(ServiceMethod.fromString(map.getText("ServiceMethod"))).setAdvancedOrderTime(extractTs(map, "AdvancedOrderTime")).setOrderDescription(StringHelper.defaultString(map.getText("OrderDescription"))).setOrderStatus(OrderStatus.fromString(map.getText("OrderStatus"))).setOrderSource(OrderSource.fromString(map.getText("OrderSourceCode"))).setTakeCompleteTime(extractTs(map, "OrderTakeCompleteTime")).setTakeTimeSecs(map.getInt("TakeTimeSecs")).setTakerName(StringHelper.defaultString(map.getText("CsrName"))).setTakerId(StringHelper.defaultString(map.getText("CsrID"))).setMakeTime(extractTs(map, "StartTime")).setMakeTimeSecs(map.getInt("MakeTimeSecs")).setMakerName(StringHelper.defaultString(map.getText("ManagerName"))).setMakerId(StringHelper.defaultString(map.getText("ManagerID"))).setOvenTime(extractTs(map, "OvenTime")).setOvenTimeSecs(map.getInt("OvenTimeSecs")).setRackTime(extractTs(map, "RackTime")).setRackTimeSecs(map.getInt("RackTimeSecs")).setRouteTime(extractTs(map, "RouteTime")).setRouteTimeSecs(map.getInt("OrderDeliveryTimeSecs")).setDriverName(StringHelper.defaultString(map.getText("DriverName"))).setDriverId(StringHelper.defaultString(map.getText("DriverID"))).setDeliveryTime(extractTs(map, "DeliveryTime")).build();
    }

    public int describeContents()
    {
        return 0;
    }

    public Ts getAdvancedOrderTime()
    {
        return advancedOrderTime;
    }

    public Ts getDeliveryTime()
    {
        return deliveryTime;
    }

    public String getDriverId()
    {
        return driverId;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public Ts getMakeTime()
    {
        return makeTime;
    }

    public Integer getMakeTimeSecs()
    {
        return makeTimeSecs;
    }

    public String getMakerId()
    {
        return makerId;
    }

    public String getMakerName()
    {
        return makerName;
    }

    public String getOrderDescription()
    {
        return orderDescription;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public String getOrderKey()
    {
        return orderKey;
    }

    public OrderSource getOrderSource()
    {
        return orderSource;
    }

    public OrderStatus getOrderStatus()
    {
        return orderStatus;
    }

    public Ts getOvenTime()
    {
        return ovenTime;
    }

    public Integer getOvenTimeSecs()
    {
        return ovenTimeSecs;
    }

    public String getPhone()
    {
        return phone;
    }

    public Ts getRackTime()
    {
        return rackTime;
    }

    public Integer getRackTimeSecs()
    {
        return rackTimeSecs;
    }

    public Ts getRouteTime()
    {
        return routeTime;
    }

    public Integer getRouteTimeSecs()
    {
        return routeTimeSecs;
    }

    public ServiceMethod getServiceMethod()
    {
        return serviceMethod;
    }

    public Ts getStoreAsOfTime()
    {
        return storeAsOfTime;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public Ts getTakeCompleteTime()
    {
        return takeTime;
    }

    public Integer getTakeTimeSecs()
    {
        return takeTimeSecs;
    }

    public String getTakerId()
    {
        return takerId;
    }

    public String getTakerName()
    {
        return takerName;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        byte byte0 = -1;
        parcel.writeString(driverName);
        parcel.writeString(driverId);
        parcel.writeString(makerName);
        parcel.writeString(makerId);
        parcel.writeString(orderDescription);
        parcel.writeString(orderId);
        parcel.writeString(orderKey);
        parcel.writeString(phone);
        parcel.writeString(storeId);
        parcel.writeString(takerName);
        parcel.writeString(takerId);
        if (makeTimeSecs == null)
        {
            j = -1;
        } else
        {
            j = makeTimeSecs.intValue();
        }
        parcel.writeInt(j);
        if (ovenTimeSecs == null)
        {
            j = -1;
        } else
        {
            j = ovenTimeSecs.intValue();
        }
        parcel.writeInt(j);
        if (rackTimeSecs == null)
        {
            j = -1;
        } else
        {
            j = rackTimeSecs.intValue();
        }
        parcel.writeInt(j);
        if (routeTimeSecs == null)
        {
            j = -1;
        } else
        {
            j = routeTimeSecs.intValue();
        }
        parcel.writeInt(j);
        if (takeTimeSecs == null)
        {
            j = byte0;
        } else
        {
            j = takeTimeSecs.intValue();
        }
        parcel.writeInt(j);
        parcel.writeInt(serviceMethod.ordinal());
        parcel.writeInt(orderStatus.ordinal());
        parcel.writeInt(orderSource.ordinal());
        parcel.writeLong(deliveryTime.toMillis());
        parcel.writeLong(makeTime.toMillis());
        parcel.writeLong(ovenTime.toMillis());
        parcel.writeLong(rackTime.toMillis());
        parcel.writeLong(routeTime.toMillis());
        parcel.writeLong(advancedOrderTime.toMillis());
        parcel.writeLong(storeAsOfTime.toMillis());
        parcel.writeLong(takeTime.toMillis());
    }


    private class Builder
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

        public Builder setAdvancedOrderTime(Ts ts)
        {
            advancedOrderTime = ts;
            return this;
        }

        public Builder setDeliveryTime(Ts ts)
        {
            deliveryTime = ts;
            return this;
        }

        public Builder setDriverId(String s)
        {
            driverId = s;
            return this;
        }

        public Builder setDriverName(String s)
        {
            driverName = s;
            return this;
        }

        public Builder setMakeTime(Ts ts)
        {
            makeTime = ts;
            return this;
        }

        public Builder setMakeTimeSecs(Integer integer)
        {
            makeTimeSecs = integer;
            return this;
        }

        public Builder setMakerId(String s)
        {
            makerId = s;
            return this;
        }

        public Builder setMakerName(String s)
        {
            makerName = s;
            return this;
        }

        public Builder setOrderDescription(String s)
        {
            orderDescription = s;
            return this;
        }

        public Builder setOrderId(String s)
        {
            orderId = s;
            return this;
        }

        public Builder setOrderKey(String s)
        {
            orderKey = s;
            return this;
        }

        public Builder setOrderSource(OrderSource ordersource)
        {
            orderSource = ordersource;
            return this;
        }

        public Builder setOrderStatus(OrderStatus orderstatus)
        {
            orderStatus = orderstatus;
            return this;
        }

        public Builder setOvenTime(Ts ts)
        {
            ovenTime = ts;
            return this;
        }

        public Builder setOvenTimeSecs(Integer integer)
        {
            ovenTimeSecs = integer;
            return this;
        }

        public Builder setPhone(String s)
        {
            phone = s;
            return this;
        }

        public Builder setRackTime(Ts ts)
        {
            rackTime = ts;
            return this;
        }

        public Builder setRackTimeSecs(Integer integer)
        {
            rackTimeSecs = integer;
            return this;
        }

        public Builder setRouteTime(Ts ts)
        {
            routeTime = ts;
            return this;
        }

        public Builder setRouteTimeSecs(Integer integer)
        {
            routeTimeSecs = integer;
            return this;
        }

        public Builder setServiceMethod(ServiceMethod servicemethod)
        {
            serviceMethod = servicemethod;
            return this;
        }

        public Builder setStoreAsOfTime(Ts ts)
        {
            storeAsOfTime = ts;
            return this;
        }

        public Builder setStoreId(String s)
        {
            storeId = s;
            return this;
        }

        public Builder setTakeCompleteTime(Ts ts)
        {
            takeTime = ts;
            return this;
        }

        public Builder setTakeTimeSecs(Integer integer)
        {
            takeTimeSecs = integer;
            return this;
        }

        public Builder setTakerId(String s)
        {
            takerId = s;
            return this;
        }

        public Builder setTakerName(String s)
        {
            takerName = s;
            return this;
        }

        public Builder()
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


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final TrackerOrderStatus createFromParcel(Parcel parcel)
        {
            return new TrackerOrderStatus(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TrackerOrderStatus[] newArray(int j)
        {
            return new TrackerOrderStatus[j];
        }

        public final volatile Object[] newArray(int j)
        {
            return newArray(j);
        }

        _cls1()
        {
        }
    }

}
