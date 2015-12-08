// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import com.dominos.android.sdk.common.LogUtil;
import com.samsung.multiscreen.a.c;
import com.samsung.multiscreen.b.a;
import com.samsung.multiscreen.device.Device;
import java.util.HashMap;
import java.util.Map;

public class SamsungTVManager
{

    private static final String CHANNEL_ID = "com.dominos.tracker";
    private static final String TAG = "SamsungTV";
    private static final String TV_APP_TITLE = "DominosTracker";
    private long NOT_FOUND;

    public SamsungTVManager()
    {
        NOT_FOUND = 404L;
    }

    private void connectToChannel(Device device, String s, String s1, String s2, final OnOpenAppListener callback)
    {
        LogUtil.d("Channel", "connectToChannel()", new Object[0]);
        if (device == null)
        {
            callback.onOpenFailed();
            return;
        } else
        {
            LogUtil.d("ConnectChannel", (new StringBuilder("connectToChannel() userName: ")).append(s1).toString(), new Object[0]);
            HashMap hashmap = new HashMap();
            hashmap.put("PhoneId", s1);
            hashmap.put("OrderId", s2);
            device.a(s, hashmap, new _cls4());
            return;
        }
    }

    private void disconnectChannel(a a1)
    {
        if (a1 != null)
        {
            a1.a(null);
            a1.c();
        }
    }

    private c getApplicationState(com.samsung.multiscreen.a.a a1)
    {
        if (a1 == null)
        {
            return null;
        } else
        {
            return a1.a();
        }
    }

    private void launchApplication(final Device device, com.samsung.multiscreen.a.a a1, final String phone, final String orderId, final OnOpenAppListener callback)
    {
        if (device == null)
        {
            LogUtil.d("SamsungTV", "No device Selected", new Object[0]);
            callback.onOpenFailed();
            return;
        }
        if (a1 == null)
        {
            LogUtil.d("SamsungTV", "No application Selected", new Object[0]);
            callback.onOpenFailed();
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("launcher", "android");
            a1.a(hashmap, new _cls3());
            return;
        }
    }

    public void findLocalDevices(final OnLocalDevicesSearchListener callback)
    {
        LogUtil.d("SamsungTV", "findLocalDevices()", new Object[0]);
        Device.a(new _cls1());
    }

    public void openTVApp(final Device device, final String phone, final String orderId, final OnOpenAppListener callback)
    {
        if (device == null)
        {
            LogUtil.d("SamsungTV", "Device not found", new Object[0]);
            callback.onConnectFailed();
            return;
        } else
        {
            device.a("DominosTracker", new _cls2());
            return;
        }
    }






    private class OnOpenAppListener
    {

        public abstract void onAppNotFound();

        public abstract void onConnectFailed();

        public abstract void onOpenFailed();

        public abstract void onOpenSuccess();
    }


    private class _cls4
        implements f
    {

        final SamsungTVManager this$0;
        final OnOpenAppListener val$callback;

        public void onError(g g1)
        {
            LogUtil.d("SamsungTV", (new StringBuilder("Could not connect to channel: ")).append(g1.b()).toString(), new Object[0]);
            callback.onConnectFailed();
        }

        public void onResult(a a1)
        {
            a1.a(new ChannelListener());
            disconnectChannel(a1);
            callback.onOpenSuccess();
        }

        public volatile void onResult(Object obj)
        {
            onResult((a)obj);
        }

        _cls4()
        {
            this$0 = SamsungTVManager.this;
            callback = onopenapplistener;
            super();
        }
    }


    private class _cls3
        implements d
    {

        final SamsungTVManager this$0;
        final OnOpenAppListener val$callback;
        final Device val$device;
        final String val$orderId;
        final String val$phone;

        public void onError(e e)
        {
            callback.onOpenFailed();
        }

        public void onResult(Boolean boolean1)
        {
            if (boolean1.booleanValue())
            {
                connectToChannel(device, "com.dominos.tracker", phone, orderId, callback);
                return;
            } else
            {
                callback.onOpenFailed();
                return;
            }
        }

        public volatile void onResult(Object obj)
        {
            onResult((Boolean)obj);
        }

        _cls3()
        {
            this$0 = SamsungTVManager.this;
            device = device1;
            phone = s;
            orderId = s1;
            callback = onopenapplistener;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final SamsungTVManager this$0;
        final OnLocalDevicesSearchListener val$callback;

        public void onError(g g1)
        {
            LogUtil.d("SamsungTV", g1.b(), new Object[0]);
            callback.onDevicesNotFound();
        }

        public volatile void onResult(Object obj)
        {
            onResult((List)obj);
        }

        public void onResult(List list)
        {
            LogUtil.d("Device Finder", (new StringBuilder("findLocalDevices() -> DONE: count: ")).append(list.size()).toString(), new Object[0]);
            if (list.size() > 0)
            {
                callback.onDevicesFound(list);
                return;
            } else
            {
                callback.onDevicesNotFound();
                return;
            }
        }

        _cls1()
        {
            this$0 = SamsungTVManager.this;
            callback = onlocaldevicessearchlistener;
            super();
        }

        private class OnLocalDevicesSearchListener
        {

            public abstract void onDevicesFound(List list);

            public abstract void onDevicesNotFound();
        }

    }


    private class _cls2
        implements f
    {

        final SamsungTVManager this$0;
        final OnOpenAppListener val$callback;
        final Device val$device;
        final String val$orderId;
        final String val$phone;

        public void onError(g g1)
        {
            LogUtil.d("SamsungTV", g1.b(), new Object[0]);
            if (g1.a() == NOT_FOUND)
            {
                callback.onAppNotFound();
            }
        }

        public void onResult(com.samsung.multiscreen.a.a a1)
        {
            LogUtil.d("SamsungTV", "Loaded Application: DominosTracker", new Object[0]);
            getApplicationState(a1);
            launchApplication(device, a1, phone, orderId, callback);
        }

        public volatile void onResult(Object obj)
        {
            onResult((com.samsung.multiscreen.a.a)obj);
        }

        _cls2()
        {
            this$0 = SamsungTVManager.this;
            device = device1;
            phone = s;
            orderId = s1;
            callback = onopenapplistener;
            super();
        }
    }

}
