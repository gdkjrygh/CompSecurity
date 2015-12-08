// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.htc.lib2.activeservice.exception.ActiveNotConnectedException;
import com.htc.lib2.activeservice.exception.ActiveNotFoundException;
import com.htc.lib2.activeservice.exception.ActiveRemoteException;
import java.util.ArrayList;

// Referenced classes of package com.htc.lib2.activeservice:
//            Log, IActiveService, ServiceConnectionListener, ITransportModeListener, 
//            TransportModeRecord, TransportRecordsQueryResult, TransportModeListener

public class HtcActiveManager
{

    public static final String ACTION_BIND_ACTIVE_SERVICE = "com.htc.sense.hsp.activeservice.action_service_bind";
    private static final int MSG_TRANSPORT = 0;
    private static final String NAME_ACTIVE_SERVICE_CLASS = "com.htc.sense.hsp.activeservice.HtcActiveService";
    private static final String NAME_HSP_PACKAGE = "com.htc.sense.hsp";
    private static final String TAG = "HtcActiveManager";
    private boolean isConnected;
    private boolean isITransportModeRegistered;
    private ServiceConnection mConnection;
    private ServiceConnectionListener mConnectionListener;
    private Context mContext;
    private ITransportModeListener mITransportModeListener;
    private IActiveService mService;
    private ArrayList mTransportModeListeners;
    private Handler mUiHandler;

    public HtcActiveManager(Context context)
    {
        mService = null;
        mContext = null;
        mTransportModeListeners = new ArrayList();
        isITransportModeRegistered = false;
        isConnected = false;
        mConnection = new ServiceConnection() {

            final HtcActiveManager this$0;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                Log.d("HtcActiveManager", (new StringBuilder()).append(componentname).append(" connected time = ").append(System.currentTimeMillis()).toString());
                isConnected = true;
                mService = IActiveService.Stub.asInterface(ibinder);
                if (mConnectionListener != null)
                {
                    mConnectionListener.onConnected();
                }
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                Log.d("HtcActiveManager", (new StringBuilder()).append(componentname).append(" disconnected").toString());
                isConnected = false;
                if (mConnectionListener != null)
                {
                    mConnectionListener.onDisconnected();
                }
            }

            
            {
                this$0 = HtcActiveManager.this;
                super();
            }
        };
        mITransportModeListener = new ITransportModeListener.Stub() {

            final HtcActiveManager this$0;

            public void onTransportModeChanged(TransportModeRecord transportmoderecord)
                throws RemoteException
            {
                Message message = mUiHandler.obtainMessage(0, transportmoderecord);
                Log.d("HtcActiveManager", (new StringBuilder()).append("Post MSG_TRANSPORT(").append(transportmoderecord.getTimestamp()).append(") to handler").toString());
                mUiHandler.sendMessage(message);
            }

            
            {
                this$0 = HtcActiveManager.this;
                super();
            }
        };
        mContext = context.getApplicationContext();
        mTransportModeListeners = new ArrayList();
        mUiHandler = new Handler(context.getMainLooper()) {

            final HtcActiveManager this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 0 0: default 24
            //                           0 25;
                   goto _L1 _L2
_L1:
                return;
_L2:
                int j = mTransportModeListeners.size();
                if (j != 0)
                {
                    Log.d("HtcActiveManager", (new StringBuilder()).append("onTransportMode(), ").append(j).append(", ").append(((TransportModeRecord)message.obj).getTimestamp()).toString());
                }
                int i = 0;
                while (i < j) 
                {
                    ((TransportModeListener)mTransportModeListeners.get(i)).onTransportModeChanged((TransportModeRecord)message.obj);
                    i++;
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = HtcActiveManager.this;
                super(looper);
            }
        };
    }

    private void bindActiveService()
        throws ActiveNotFoundException
    {
        if (mService == null && !isServiceConnected())
        {
            Intent intent = new Intent("com.htc.sense.hsp.activeservice.action_service_bind");
            intent.setClassName("com.htc.sense.hsp", "com.htc.sense.hsp.activeservice.HtcActiveService");
            boolean flag = mContext.bindService(intent, mConnection, 1);
            Log.d("HtcActiveManager", (new StringBuilder()).append("bindService, result = ").append(flag).toString());
            if (!flag)
            {
                throw new ActiveNotFoundException();
            }
        }
    }

    private boolean registerITranportModeListener()
    {
        if (mService == null)
        {
            throw new ActiveNotConnectedException();
        }
        if (mTransportModeListeners.size() <= 0 || isITransportModeRegistered)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (mService != null && mITransportModeListener != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.e("HtcActiveManager", "Service or ITransportModeListener shouldn't be null when register listener");
        return false;
        boolean flag;
        try
        {
            isITransportModeRegistered = mService.registerTransportModeListener(mITransportModeListener);
            flag = isITransportModeRegistered;
        }
        catch (RemoteException remoteexception)
        {
            isITransportModeRegistered = false;
            remoteexception.printStackTrace();
            throw new ActiveRemoteException();
        }
        return flag;
        return true;
    }

    private void unbindActiveService()
    {
        if (mService != null && isServiceConnected())
        {
            Log.d("HtcActiveManager", "unbindService");
            if (isITransportModeRegistered)
            {
                unregisterITransportModeListener();
            }
            mContext.unbindService(mConnection);
            isConnected = false;
            mService = null;
        }
    }

    private void unregisterITransportModeListener()
    {
        if (mService == null || !isITransportModeRegistered)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mService.unregisterTransportModeListener(mITransportModeListener);
        isITransportModeRegistered = false;
        return;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        throw new ActiveRemoteException();
    }

    public void connect(ServiceConnectionListener serviceconnectionlistener)
        throws ActiveNotFoundException
    {
        Log.d("HtcActiveManager", (new StringBuilder()).append("connect() time = ").append(System.currentTimeMillis()).toString());
        mConnectionListener = serviceconnectionlistener;
        bindActiveService();
    }

    public boolean disableWithPermission()
    {
        Log.d("HtcActiveManager", "disableWithPermission()");
        if (isServiceConnected())
        {
            boolean flag;
            try
            {
                flag = mService.disableWithPermission();
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return flag;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public void disconnect()
    {
        Log.d("HtcActiveManager", "disconnect()");
        unbindActiveService();
    }

    public boolean enableWithPermission()
    {
        Log.d("HtcActiveManager", "enableWithPermission()");
        if (isServiceConnected())
        {
            boolean flag;
            try
            {
                flag = mService.enableWithPermission();
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return flag;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public TransportModeRecord getLatestTransportModeRecord()
    {
        Log.d("HtcActiveManager", "getLatestTransportMode()");
        if (mService != null)
        {
            TransportModeRecord transportmoderecord;
            try
            {
                transportmoderecord = mService.getLatestTransportMode();
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return transportmoderecord;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public boolean isEnabled()
    {
        if (isServiceConnected())
        {
            boolean flag;
            try
            {
                flag = mService.isEnabled();
                Log.d("HtcActiveManager", (new StringBuilder()).append("HtcActiveService isEnabled = ").append(flag).toString());
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return flag;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public boolean isServiceConnected()
    {
        return isConnected && mService != null;
    }

    public boolean isSupported()
    {
        if (isServiceConnected())
        {
            boolean flag;
            try
            {
                flag = mService.isSupported();
                Log.d("HtcActiveManager", (new StringBuilder()).append("HtcActiveService isSupported = ").append(flag).toString());
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return flag;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public TransportRecordsQueryResult queryTransportModeRecords(long l, long l1)
    {
        Log.d("HtcActiveManager", (new StringBuilder()).append("queryTransportMode() startT = ").append(l).append(" endT = ").append(l1).toString());
        if (isServiceConnected())
        {
            TransportRecordsQueryResult transportrecordsqueryresult;
            try
            {
                transportrecordsqueryresult = mService.queryTransportModeRecords(l, l1);
            }
            catch (RemoteException remoteexception)
            {
                remoteexception.printStackTrace();
                throw new ActiveRemoteException();
            }
            return transportrecordsqueryresult;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public boolean registerTransportModeListener(TransportModeListener transportmodelistener)
    {
        Log.d("HtcActiveManager", "regTransportMode()");
        if (isServiceConnected())
        {
            if (!mTransportModeListeners.contains(transportmodelistener))
            {
                mTransportModeListeners.add(transportmodelistener);
                Log.d("HtcActiveManager", (new StringBuilder()).append("registered listeners(").append(mTransportModeListeners.size()).append(")").toString());
            } else
            {
                Log.w("HtcActiveManager", "The listener has registered before");
            }
            if (!isITransportModeRegistered)
            {
                return registerITranportModeListener();
            } else
            {
                return true;
            }
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }

    public void unregisterTransportModeListener(TransportModeListener transportmodelistener)
    {
        Log.d("HtcActiveManager", "unregTransportMode()");
        if (isServiceConnected())
        {
            if (mTransportModeListeners.contains(transportmodelistener))
            {
                mTransportModeListeners.remove(transportmodelistener);
                Log.d("HtcActiveManager", (new StringBuilder()).append("remaining listeners(").append(mTransportModeListeners.size()).append(")").toString());
                if (mTransportModeListeners.size() == 0)
                {
                    unregisterITransportModeListener();
                }
            }
            return;
        } else
        {
            throw new ActiveNotConnectedException();
        }
    }



/*
    static boolean access$102(HtcActiveManager htcactivemanager, boolean flag)
    {
        htcactivemanager.isConnected = flag;
        return flag;
    }

*/


/*
    static IActiveService access$202(HtcActiveManager htcactivemanager, IActiveService iactiveservice)
    {
        htcactivemanager.mService = iactiveservice;
        return iactiveservice;
    }

*/


}
