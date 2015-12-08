// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ObserverList;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

public class NetworkChangeNotifier
{
    public static interface ConnectionTypeObserver
    {

        public abstract void onConnectionTypeChanged(int i);
    }


    static final boolean $assertionsDisabled;
    public static final int CONNECTION_2G = 3;
    public static final int CONNECTION_3G = 4;
    public static final int CONNECTION_4G = 5;
    public static final int CONNECTION_BLUETOOTH = 7;
    public static final int CONNECTION_ETHERNET = 1;
    public static final int CONNECTION_NONE = 6;
    public static final int CONNECTION_UNKNOWN = 0;
    public static final int CONNECTION_WIFI = 2;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private final ObserverList mConnectionTypeObservers = new ObserverList();
    private final Context mContext;
    private int mCurrentConnectionType;
    private final ArrayList mNativeChangeNotifiers = new ArrayList();

    private NetworkChangeNotifier(Context context)
    {
        mCurrentConnectionType = 0;
        mContext = context.getApplicationContext();
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectiontypeobserver)
    {
        getInstance().addConnectionTypeObserverInternal(connectiontypeobserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectiontypeobserver)
    {
        mConnectionTypeObservers.addObserver(connectiontypeobserver);
    }

    private void destroyAutoDetector()
    {
        if (mAutoDetector != null)
        {
            mAutoDetector.destroy();
            mAutoDetector = null;
        }
    }

    public static void forceConnectivityState(boolean flag)
    {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(flag);
    }

    private void forceConnectivityStateInternal(boolean flag)
    {
        int i = 0;
        boolean flag1;
        if (mCurrentConnectionType != 6)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != flag)
        {
            if (!flag)
            {
                i = 6;
            }
            updateCurrentConnectionType(i);
        }
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest()
    {
        return getInstance().mAutoDetector;
    }

    public static NetworkChangeNotifier getInstance()
    {
        if (!$assertionsDisabled && sInstance == null)
        {
            throw new AssertionError();
        } else
        {
            return sInstance;
        }
    }

    public static NetworkChangeNotifier init(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new NetworkChangeNotifier(context);
        }
        return sInstance;
    }

    public static boolean isInitialized()
    {
        return sInstance != null;
    }

    public static boolean isOnline()
    {
        int i = getInstance().getCurrentConnectionType();
        return i != 0 && i != 6;
    }

    private native void nativeNotifyConnectionTypeChanged(long l, int i);

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectiontypeobserver)
    {
        getInstance().removeConnectionTypeObserverInternal(connectiontypeobserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectiontypeobserver)
    {
        mConnectionTypeObservers.removeObserver(connectiontypeobserver);
    }

    static void resetInstanceForTests(Context context)
    {
        sInstance = new NetworkChangeNotifier(context);
    }

    public static void setAutoDetectConnectivityState(boolean flag)
    {
        getInstance().setAutoDetectConnectivityStateInternal(flag);
    }

    private void setAutoDetectConnectivityStateInternal(boolean flag)
    {
        if (flag)
        {
            if (mAutoDetector == null)
            {
                mAutoDetector = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.Observer() {

                    final NetworkChangeNotifier this$0;

                    public void onConnectionTypeChanged(int i)
                    {
                        updateCurrentConnectionType(i);
                    }

            
            {
                this$0 = NetworkChangeNotifier.this;
                super();
            }
                }, mContext);
                updateCurrentConnectionType(mAutoDetector.getCurrentConnectionType());
            }
            return;
        } else
        {
            destroyAutoDetector();
            return;
        }
    }

    private void updateCurrentConnectionType(int i)
    {
        mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    public void addNativeObserver(long l)
    {
        mNativeChangeNotifiers.add(Long.valueOf(l));
    }

    public int getCurrentConnectionType()
    {
        return mCurrentConnectionType;
    }

    void notifyObserversOfConnectionTypeChange(int i)
    {
        for (Iterator iterator = mNativeChangeNotifiers.iterator(); iterator.hasNext(); nativeNotifyConnectionTypeChanged(((Long)iterator.next()).longValue(), i)) { }
        for (Iterator iterator1 = mConnectionTypeObservers.iterator(); iterator1.hasNext(); ((ConnectionTypeObserver)iterator1.next()).onConnectionTypeChanged(i)) { }
    }

    public void removeNativeObserver(long l)
    {
        mNativeChangeNotifiers.remove(Long.valueOf(l));
    }

    static 
    {
        boolean flag;
        if (!org/chromium/net/NetworkChangeNotifier.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
