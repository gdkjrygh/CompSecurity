// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.chromium.base.CollectionUtil;
import org.chromium.base.ThreadUtils;

class DeviceSensors
    implements SensorEventListener
{
    static interface SensorManagerProxy
    {

        public abstract boolean registerListener(SensorEventListener sensoreventlistener, int i, int j, Handler handler);

        public abstract void unregisterListener(SensorEventListener sensoreventlistener, int i);
    }

    static class SensorManagerProxyImpl
        implements SensorManagerProxy
    {

        private final SensorManager mSensorManager;

        public boolean registerListener(SensorEventListener sensoreventlistener, int i, int j, Handler handler)
        {
            List list = mSensorManager.getSensorList(i);
            if (list.isEmpty())
            {
                return false;
            } else
            {
                return mSensorManager.registerListener(sensoreventlistener, (Sensor)list.get(0), j, handler);
            }
        }

        public void unregisterListener(SensorEventListener sensoreventlistener, int i)
        {
            List list = mSensorManager.getSensorList(i);
            if (!list.isEmpty())
            {
                mSensorManager.unregisterListener(sensoreventlistener, (Sensor)list.get(0));
            }
        }

        SensorManagerProxyImpl(SensorManager sensormanager)
        {
            mSensorManager = sensormanager;
        }
    }


    static final int DEVICE_LIGHT = 2;
    static final Set DEVICE_LIGHT_SENSORS = CollectionUtil.newHashSet(new Integer[] {
        Integer.valueOf(5)
    });
    static final int DEVICE_MOTION = 1;
    static final Set DEVICE_MOTION_SENSORS = CollectionUtil.newHashSet(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(10), Integer.valueOf(4)
    });
    static final int DEVICE_ORIENTATION = 0;
    static final Set DEVICE_ORIENTATION_SENSORS = CollectionUtil.newHashSet(new Integer[] {
        Integer.valueOf(11)
    });
    private static final String TAG = "DeviceSensors";
    private static DeviceSensors sSingleton;
    private static Object sSingletonLock = new Object();
    final Set mActiveSensors = new HashSet();
    private final Context mAppContext;
    boolean mDeviceLightIsActive;
    boolean mDeviceMotionIsActive;
    boolean mDeviceOrientationIsActive;
    private Handler mHandler;
    private final Object mHandlerLock = new Object();
    private long mNativePtr;
    private final Object mNativePtrLock = new Object();
    private SensorManagerProxy mSensorManagerProxy;
    private Thread mThread;
    private float mTruncatedRotationVector[];

    protected DeviceSensors(Context context)
    {
        mDeviceLightIsActive = false;
        mDeviceMotionIsActive = false;
        mDeviceOrientationIsActive = false;
        mAppContext = context.getApplicationContext();
    }

    public static double[] computeDeviceOrientationFromRotationMatrix(float af[], double ad[])
    {
        if (af.length == 9)
        {
            if (af[8] > 0.0F)
            {
                ad[0] = Math.atan2(-af[1], af[4]);
                ad[1] = Math.asin(af[7]);
                ad[2] = Math.atan2(-af[6], af[8]);
            } else
            if (af[8] < 0.0F)
            {
                ad[0] = Math.atan2(af[1], -af[4]);
                ad[1] = -Math.asin(af[7]);
                double d3 = ad[1];
                double d;
                if (ad[1] >= 0.0D)
                {
                    d = -3.1415926535897931D;
                } else
                {
                    d = 3.1415926535897931D;
                }
                ad[1] = d + d3;
                ad[2] = Math.atan2(af[6], -af[8]);
            } else
            if (af[6] > 0.0F)
            {
                ad[0] = Math.atan2(-af[1], af[4]);
                ad[1] = Math.asin(af[7]);
                ad[2] = -1.5707963267948966D;
            } else
            if (af[6] < 0.0F)
            {
                ad[0] = Math.atan2(af[1], -af[4]);
                ad[1] = -Math.asin(af[7]);
                double d4 = ad[1];
                double d1;
                if (ad[1] >= 0.0D)
                {
                    d1 = -3.1415926535897931D;
                } else
                {
                    d1 = 3.1415926535897931D;
                }
                ad[1] = d1 + d4;
                ad[2] = -1.5707963267948966D;
            } else
            {
                ad[0] = Math.atan2(af[3], af[0]);
                double d2;
                if (af[7] > 0.0F)
                {
                    d2 = 1.5707963267948966D;
                } else
                {
                    d2 = -1.5707963267948966D;
                }
                ad[1] = d2;
                ad[2] = 0.0D;
            }
            if (ad[0] < 0.0D)
            {
                ad[0] = ad[0] + 6.2831853071795862D;
                return ad;
            }
        }
        return ad;
    }

    private Handler getHandler()
    {
        Handler handler;
        synchronized (mHandlerLock)
        {
            if (mHandler == null)
            {
                HandlerThread handlerthread = new HandlerThread("DeviceMotionAndOrientation");
                handlerthread.start();
                mHandler = new Handler(handlerthread.getLooper());
            }
            handler = mHandler;
        }
        return handler;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static DeviceSensors getInstance(Context context)
    {
        synchronized (sSingletonLock)
        {
            if (sSingleton == null)
            {
                sSingleton = new DeviceSensors(context);
            }
            context = sSingleton;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void getOrientationFromRotationVector(float af[])
    {
        float af1[] = new float[9];
        SensorManager.getRotationMatrixFromVector(af1, af);
        af = new double[3];
        computeDeviceOrientationFromRotationMatrix(af1, af);
        gotOrientation(Math.toDegrees(af[0]), Math.toDegrees(af[1]), Math.toDegrees(af[2]));
    }

    private SensorManagerProxy getSensorManagerProxy()
    {
        if (mSensorManagerProxy != null)
        {
            return mSensorManagerProxy;
        }
        SensorManager sensormanager = (SensorManager)ThreadUtils.runOnUiThreadBlockingNoException(new Callable() {

            final DeviceSensors this$0;

            public SensorManager call()
            {
                return (SensorManager)mAppContext.getSystemService("sensor");
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = DeviceSensors.this;
                super();
            }
        });
        if (sensormanager != null)
        {
            mSensorManagerProxy = new SensorManagerProxyImpl(sensormanager);
        }
        return mSensorManagerProxy;
    }

    private native void nativeGotAcceleration(long l, double d, double d1, double d2);

    private native void nativeGotAccelerationIncludingGravity(long l, double d, double d1, double d2);

    private native void nativeGotLight(long l, double d);

    private native void nativeGotOrientation(long l, double d, double d1, double d2);

    private native void nativeGotRotationRate(long l, double d, double d1, double d2);

    private boolean registerForSensorType(int i, int j)
    {
        SensorManagerProxy sensormanagerproxy = getSensorManagerProxy();
        if (sensormanagerproxy == null)
        {
            return false;
        } else
        {
            return sensormanagerproxy.registerListener(this, i, j * 1000, getHandler());
        }
    }

    private boolean registerSensors(Set set, int i, boolean flag)
    {
        set = new HashSet(set);
        set.removeAll(mActiveSensors);
        boolean flag1 = false;
        Iterator iterator = set.iterator();
        do
        {
            Integer integer;
            boolean flag2;
label0:
            {
                flag2 = flag1;
                if (iterator.hasNext())
                {
                    integer = (Integer)iterator.next();
                    flag2 = registerForSensorType(integer.intValue(), i);
                    if (flag2 || !flag)
                    {
                        break label0;
                    }
                    unregisterSensors(set);
                    flag2 = false;
                }
                return flag2;
            }
            if (flag2)
            {
                mActiveSensors.add(integer);
                flag1 = true;
            }
        } while (true);
    }

    private void setEventTypeActive(int i, boolean flag)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            mDeviceOrientationIsActive = flag;
            return;

        case 1: // '\001'
            mDeviceMotionIsActive = flag;
            return;

        case 2: // '\002'
            mDeviceLightIsActive = flag;
            break;
        }
    }

    private void unregisterSensors(Iterable iterable)
    {
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterable.next();
            if (mActiveSensors.contains(integer))
            {
                getSensorManagerProxy().unregisterListener(this, integer.intValue());
                mActiveSensors.remove(integer);
            }
        } while (true);
    }

    public int getNumberActiveDeviceMotionSensors()
    {
        HashSet hashset = new HashSet(DEVICE_MOTION_SENSORS);
        hashset.removeAll(mActiveSensors);
        return DEVICE_MOTION_SENSORS.size() - hashset.size();
    }

    protected void gotAcceleration(double d, double d1, double d2)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotAcceleration(mNativePtr, d, d1, d2);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gotAccelerationIncludingGravity(double d, double d1, double d2)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotAccelerationIncludingGravity(mNativePtr, d, d1, d2);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gotLight(double d)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotLight(mNativePtr, d);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gotOrientation(double d, double d1, double d2)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotOrientation(mNativePtr, d, d1, d2);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void gotRotationRate(double d, double d1, double d2)
    {
        synchronized (mNativePtrLock)
        {
            if (mNativePtr != 0L)
            {
                nativeGotRotationRate(mNativePtr, d, d1, d2);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        sensorChanged(sensorevent.sensor.getType(), sensorevent.values);
    }

    void sensorChanged(int i, float af[])
    {
        i;
        JVM INSTR tableswitch 1 11: default 60
    //                   1 61
    //                   2 60
    //                   3 60
    //                   4 109
    //                   5 186
    //                   6 60
    //                   7 60
    //                   8 60
    //                   9 60
    //                   10 85
    //                   11 133;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L1 _L1 _L1 _L1 _L5 _L6
_L1:
        return;
_L2:
        if (mDeviceMotionIsActive)
        {
            gotAccelerationIncludingGravity(af[0], af[1], af[2]);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (mDeviceMotionIsActive)
        {
            gotAcceleration(af[0], af[1], af[2]);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mDeviceMotionIsActive)
        {
            gotRotationRate(af[0], af[1], af[2]);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (mDeviceOrientationIsActive)
        {
            if (af.length > 4)
            {
                if (mTruncatedRotationVector == null)
                {
                    mTruncatedRotationVector = new float[4];
                }
                System.arraycopy(af, 0, mTruncatedRotationVector, 0, 4);
                getOrientationFromRotationVector(mTruncatedRotationVector);
                return;
            } else
            {
                getOrientationFromRotationVector(af);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mDeviceLightIsActive)
        {
            gotLight(af[0]);
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    void setSensorManagerProxy(SensorManagerProxy sensormanagerproxy)
    {
        mSensorManagerProxy = sensormanagerproxy;
    }

    public boolean start(long l, int i, int j)
    {
        Object obj = mNativePtrLock;
        obj;
        JVM INSTR monitorenter ;
        i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 67
    //                   1 101
    //                   2 116;
           goto _L1 _L2 _L3 _L4
_L1:
        Log.e("DeviceSensors", (new StringBuilder()).append("Unknown event type: ").append(i).toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
_L2:
        boolean flag = registerSensors(DEVICE_ORIENTATION_SENSORS, j, true);
_L8:
        if (!flag) goto _L6; else goto _L5
_L5:
        mNativePtr = l;
        setEventTypeActive(i, true);
_L6:
        obj;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = registerSensors(DEVICE_MOTION_SENSORS, j, false);
        continue; /* Loop/switch isn't completed */
_L4:
        flag = registerSensors(DEVICE_LIGHT_SENSORS, j, true);
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop(int i)
    {
        Object obj1 = new HashSet();
        Object obj = mNativePtrLock;
        obj;
        JVM INSTR monitorenter ;
        i;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 73
    //                   1 166
    //                   2 203;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_203;
_L1:
        Log.e("DeviceSensors", (new StringBuilder()).append("Unknown event type: ").append(i).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (mDeviceMotionIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_MOTION_SENSORS);
        }
        if (mDeviceLightIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_LIGHT_SENSORS);
        }
_L5:
        HashSet hashset = new HashSet(mActiveSensors);
        hashset.removeAll(((java.util.Collection) (obj1)));
        unregisterSensors(hashset);
        setEventTypeActive(i, false);
        if (mActiveSensors.isEmpty())
        {
            mNativePtr = 0L;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L3:
        if (mDeviceOrientationIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_ORIENTATION_SENSORS);
        }
        if (mDeviceLightIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_LIGHT_SENSORS);
        }
          goto _L5
        if (mDeviceMotionIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_MOTION_SENSORS);
        }
        if (mDeviceOrientationIsActive)
        {
            ((Set) (obj1)).addAll(DEVICE_ORIENTATION_SENSORS);
        }
          goto _L5
    }


}
