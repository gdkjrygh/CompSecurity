// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AudioManagerAndroid
{
    private static class AudioDeviceName
    {

        private final int mId;
        private final String mName;

        private String id()
        {
            return String.valueOf(mId);
        }

        private String name()
        {
            return mName;
        }

        private AudioDeviceName(int i, String s)
        {
            mId = i;
            mName = s;
        }

    }

    private static class NonThreadSafe
    {

        private final Long mThreadId = Long.valueOf(0L);

        public boolean calledOnValidThread()
        {
            return true;
        }

        public NonThreadSafe()
        {
        }
    }


    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLING_RATE = 44100;
    private static final int DEVICE_BLUETOOTH_HEADSET = 3;
    private static final int DEVICE_COUNT = 4;
    private static final int DEVICE_DEFAULT = -2;
    private static final int DEVICE_EARPIECE = 2;
    private static final int DEVICE_INVALID = -1;
    private static final String DEVICE_NAMES[] = {
        "Speakerphone", "Wired headset", "Headset earpiece", "Bluetooth headset"
    };
    private static final int DEVICE_SPEAKERPHONE = 0;
    private static final int DEVICE_WIRED_HEADSET = 1;
    private static final int STATE_BLUETOOTH_SCO_INVALID = -1;
    private static final int STATE_BLUETOOTH_SCO_OFF = 0;
    private static final int STATE_BLUETOOTH_SCO_ON = 1;
    private static final int STATE_BLUETOOTH_SCO_TURNING_OFF = 3;
    private static final int STATE_BLUETOOTH_SCO_TURNING_ON = 2;
    private static final String SUPPORTED_AEC_MODELS[] = {
        "GT-I9300", "GT-I9500", "GT-N7105", "Nexus 4", "Nexus 5", "Nexus 7", "SM-N9005", "SM-T310"
    };
    private static final String TAG = "AudioManagerAndroid";
    private static final Integer VALID_DEVICES[] = {
        Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)
    };
    private boolean mAudioDevices[];
    private final AudioManager mAudioManager;
    private BroadcastReceiver mBluetoothHeadsetReceiver;
    private BroadcastReceiver mBluetoothScoReceiver;
    private int mBluetoothScoState;
    private final ContentResolver mContentResolver;
    private final Context mContext;
    private int mCurrentVolume;
    private boolean mHasBluetoothPermission;
    private boolean mHasModifyAudioSettingsPermission;
    private boolean mHasRecordAudioPermission;
    private boolean mIsInitialized;
    private final Object mLock = new Object();
    private final long mNativeAudioManagerAndroid;
    private final NonThreadSafe mNonThreadSafe = new NonThreadSafe();
    private int mRequestedAudioDevice;
    private int mSavedAudioMode;
    private boolean mSavedIsMicrophoneMute;
    private boolean mSavedIsSpeakerphoneOn;
    private ContentObserver mSettingsObserver;
    private HandlerThread mSettingsObserverThread;
    private BroadcastReceiver mWiredHeadsetReceiver;

    private AudioManagerAndroid(Context context, long l)
    {
        mHasModifyAudioSettingsPermission = false;
        mHasRecordAudioPermission = false;
        mHasBluetoothPermission = false;
        mSavedAudioMode = -2;
        mBluetoothScoState = -1;
        mIsInitialized = false;
        mRequestedAudioDevice = -1;
        mAudioDevices = new boolean[4];
        mSettingsObserver = null;
        mSettingsObserverThread = null;
        mContext = context;
        mNativeAudioManagerAndroid = l;
        mAudioManager = (AudioManager)mContext.getSystemService("audio");
        mContentResolver = mContext.getContentResolver();
    }

    private void checkIfCalledOnValidThread()
    {
    }

    private void close()
    {
        checkIfCalledOnValidThread();
        if (!mIsInitialized)
        {
            return;
        } else
        {
            stopObservingVolumeChanges();
            unregisterForWiredHeadsetIntentBroadcast();
            unregisterBluetoothIntentsIfNeeded();
            mIsInitialized = false;
            return;
        }
    }

    private static AudioManagerAndroid createAudioManagerAndroid(Context context, long l)
    {
        return new AudioManagerAndroid(context, l);
    }

    private boolean deviceHasBeenRequested()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (mRequestedAudioDevice != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private AudioDeviceName[] getAudioInputDeviceNames()
    {
        if (mIsInitialized) goto _L2; else goto _L1
_L1:
        aaudiodevicename = null;
_L4:
        return aaudiodevicename;
_L2:
        if (!mHasModifyAudioSettingsPermission || !mHasRecordAudioPermission)
        {
            Log.w("AudioManagerAndroid", "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO");
            Log.w("AudioManagerAndroid", "No audio device will be available for recording");
            return null;
        }
        boolean aflag[];
        synchronized (mLock)
        {
            aflag = (boolean[])mAudioDevices.clone();
        }
        ArrayList arraylist = new ArrayList();
        AudioDeviceName aaudiodevicename1[] = new AudioDeviceName[getNumOfAudioDevices(aflag)];
        int j = 0;
        int i = 0;
        do
        {
            aaudiodevicename = aaudiodevicename1;
            if (i >= 4)
            {
                break;
            }
            int k = j;
            if (aflag[i])
            {
                aaudiodevicename1[j] = new AudioDeviceName(i, DEVICE_NAMES[i]);
                arraylist.add(DEVICE_NAMES[i]);
                k = j + 1;
            }
            i++;
            j = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        aaudiodevicename;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private int getAudioLowLatencyOutputFrameSize()
    {
        String s = mAudioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (s == null)
        {
            return 256;
        } else
        {
            return Integer.parseInt(s);
        }
    }

    private static int getMinInputFrameSize(int i, int j)
    {
        byte byte0;
        if (j == 1)
        {
            byte0 = 16;
        } else
        if (j == 2)
        {
            byte0 = 12;
        } else
        {
            return -1;
        }
        return AudioRecord.getMinBufferSize(i, byte0, 2) / 2 / j;
    }

    private static int getMinOutputFrameSize(int i, int j)
    {
        byte byte0;
        if (j == 1)
        {
            byte0 = 4;
        } else
        if (j == 2)
        {
            byte0 = 12;
        } else
        {
            return -1;
        }
        return AudioTrack.getMinBufferSize(i, byte0, 2) / 2 / j;
    }

    private int getNativeOutputSampleRate()
    {
        String s;
label0:
        {
            if (runningOnJellyBeanMR1OrHigher())
            {
                s = mAudioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                if (s != null)
                {
                    break label0;
                }
            }
            return 44100;
        }
        return Integer.parseInt(s);
    }

    private static int getNumOfAudioDevices(boolean aflag[])
    {
        int j = 0;
        for (int i = 0; i < 4;)
        {
            int k = j;
            if (aflag[i])
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    private boolean hasBluetoothHeadset()
    {
        boolean flag = true;
        if (!mHasBluetoothPermission)
        {
            Log.w("AudioManagerAndroid", "hasBluetoothHeadset() requires BLUETOOTH permission");
        } else
        {
            BluetoothAdapter bluetoothadapter;
            if (runningOnJellyBeanMR2OrHigher())
            {
                bluetoothadapter = ((BluetoothManager)mContext.getSystemService("bluetooth")).getAdapter();
            } else
            {
                bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
            }
            if (bluetoothadapter != null)
            {
                int i = bluetoothadapter.getProfileConnectionState(1);
                if (!bluetoothadapter.isEnabled() || i != 2)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    private boolean hasEarpiece()
    {
        return mContext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean hasPermission(String s)
    {
        return mContext.checkPermission(s, Process.myPid(), Process.myUid()) == 0;
    }

    private boolean hasWiredHeadset()
    {
        return mAudioManager.isWiredHeadsetOn();
    }

    private void init()
    {
        checkIfCalledOnValidThread();
        if (mIsInitialized)
        {
            return;
        } else
        {
            mHasModifyAudioSettingsPermission = hasPermission("android.permission.MODIFY_AUDIO_SETTINGS");
            mHasRecordAudioPermission = hasPermission("android.permission.RECORD_AUDIO");
            mAudioDevices[2] = hasEarpiece();
            mAudioDevices[1] = hasWiredHeadset();
            mAudioDevices[0] = true;
            registerBluetoothIntentsIfNeeded();
            registerForWiredHeadsetIntentBroadcast();
            mIsInitialized = true;
            return;
        }
    }

    private boolean isAudioLowLatencySupported()
    {
        return mContext.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private boolean isMicrophoneMute()
    {
        return mAudioManager.isMicrophoneMute();
    }

    private void logDeviceInfo()
    {
        logd((new StringBuilder()).append("Android SDK: ").append(android.os.Build.VERSION.SDK_INT).append(", ").append("Release: ").append(android.os.Build.VERSION.RELEASE).append(", ").append("Brand: ").append(Build.BRAND).append(", ").append("Device: ").append(Build.DEVICE).append(", ").append("Id: ").append(Build.ID).append(", ").append("Hardware: ").append(Build.HARDWARE).append(", ").append("Manufacturer: ").append(Build.MANUFACTURER).append(", ").append("Model: ").append(Build.MODEL).append(", ").append("Product: ").append(Build.PRODUCT).toString());
    }

    private static void logd(String s)
    {
        Log.d("AudioManagerAndroid", s);
    }

    private static void loge(String s)
    {
        Log.e("AudioManagerAndroid", s);
    }

    private native void nativeSetMute(long l, boolean flag);

    private void registerBluetoothIntentsIfNeeded()
    {
        mHasBluetoothPermission = hasPermission("android.permission.BLUETOOTH");
        if (!mHasBluetoothPermission)
        {
            Log.w("AudioManagerAndroid", "Requires BLUETOOTH permission");
            return;
        } else
        {
            mAudioDevices[3] = hasBluetoothHeadset();
            registerForBluetoothHeadsetIntentBroadcast();
            registerForBluetoothScoIntentBroadcast();
            return;
        }
    }

    private void registerForBluetoothHeadsetIntentBroadcast()
    {
        IntentFilter intentfilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        mBluetoothHeadsetReceiver = new BroadcastReceiver() {

            final AudioManagerAndroid this$0;

            public void onReceive(Context context, Intent intent)
            {
                intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                JVM INSTR tableswitch 0 3: default 36
            //                           0 59
            //                           1 41
            //                           2 89
            //                           3 41;
                   goto _L1 _L2 _L3 _L4 _L3
_L3:
                break; /* Loop/switch isn't completed */
_L1:
                AudioManagerAndroid.loge("Invalid state");
_L6:
                if (deviceHasBeenRequested())
                {
                    updateDeviceActivation();
                }
                return;
_L2:
                synchronized (mLock)
                {
                    mAudioDevices[3] = false;
                }
                continue; /* Loop/switch isn't completed */
                intent;
                context;
                JVM INSTR monitorexit ;
                throw intent;
_L4:
                synchronized (mLock)
                {
                    mAudioDevices[3] = true;
                }
                if (true) goto _L6; else goto _L5
_L5:
                intent;
                context;
                JVM INSTR monitorexit ;
                throw intent;
            }

            
            {
                this$0 = AudioManagerAndroid.this;
                super();
            }
        };
        mContext.registerReceiver(mBluetoothHeadsetReceiver, intentfilter);
    }

    private void registerForBluetoothScoIntentBroadcast()
    {
        IntentFilter intentfilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        mBluetoothScoReceiver = new BroadcastReceiver() {

            final AudioManagerAndroid this$0;

            public void onReceive(Context context, Intent intent)
            {
                switch (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0))
                {
                default:
                    AudioManagerAndroid.loge("Invalid state");
                    // fall through

                case 2: // '\002'
                    return;

                case 1: // '\001'
                    mBluetoothScoState = 1;
                    return;

                case 0: // '\0'
                    mBluetoothScoState = 0;
                    return;
                }
            }

            
            {
                this$0 = AudioManagerAndroid.this;
                super();
            }
        };
        mContext.registerReceiver(mBluetoothScoReceiver, intentfilter);
    }

    private void registerForWiredHeadsetIntentBroadcast()
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        mWiredHeadsetReceiver = new BroadcastReceiver() {

            private static final int HAS_MIC = 1;
            private static final int HAS_NO_MIC = 0;
            private static final int STATE_PLUGGED = 1;
            private static final int STATE_UNPLUGGED = 0;
            final AudioManagerAndroid this$0;

            public void onReceive(Context context, Intent intent)
            {
                intent.getIntExtra("state", 0);
                JVM INSTR tableswitch 0 1: default 28
            //                           0 51
            //                           1 101;
                   goto _L1 _L2 _L3
_L1:
                AudioManagerAndroid.loge("Invalid state");
_L5:
                if (deviceHasBeenRequested())
                {
                    updateDeviceActivation();
                }
                return;
_L2:
                synchronized (mLock)
                {
                    mAudioDevices[1] = false;
                    if (hasEarpiece())
                    {
                        mAudioDevices[2] = true;
                    }
                }
                continue; /* Loop/switch isn't completed */
                intent;
                context;
                JVM INSTR monitorexit ;
                throw intent;
_L3:
                synchronized (mLock)
                {
                    mAudioDevices[1] = true;
                    mAudioDevices[2] = false;
                }
                if (true) goto _L5; else goto _L4
_L4:
                intent;
                context;
                JVM INSTR monitorexit ;
                throw intent;
            }

            
            {
                this$0 = AudioManagerAndroid.this;
                super();
            }
        };
        mContext.registerReceiver(mWiredHeadsetReceiver, intentfilter);
    }

    private void reportUpdate()
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        int i = 0;
_L2:
        if (i >= 4)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (mAudioDevices[i])
        {
            arraylist.add(DEVICE_NAMES[i]);
        }
        break MISSING_BLOCK_LABEL_54;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean runningOnJellyBeanMR1OrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 17;
    }

    private static boolean runningOnJellyBeanMR2OrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 18;
    }

    private static boolean runningOnJellyBeanOrHigher()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    private static int selectDefaultDevice(boolean aflag[])
    {
        if (aflag[1])
        {
            return 1;
        }
        return !aflag[3] ? 0 : 3;
    }

    private void setAudioDevice(int i)
    {
        if (i == 3)
        {
            startBluetoothSco();
        } else
        {
            stopBluetoothSco();
        }
        i;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 58
    //                   1 66
    //                   2 74
    //                   3 46;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        loge("Invalid audio device selection");
_L7:
        reportUpdate();
        return;
_L2:
        setSpeakerphoneOn(true);
        continue; /* Loop/switch isn't completed */
_L3:
        setSpeakerphoneOn(false);
        continue; /* Loop/switch isn't completed */
_L4:
        setSpeakerphoneOn(false);
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void setCommunicationAudioModeOn(boolean flag)
    {
        if (!mHasModifyAudioSettingsPermission)
        {
            Log.w("AudioManagerAndroid", "MODIFY_AUDIO_SETTINGS is missing => client will run with reduced functionality");
            return;
        }
        if (flag)
        {
            if (mSavedAudioMode != -2)
            {
                throw new IllegalStateException("Audio mode has already been set");
            }
            try
            {
                mSavedAudioMode = mAudioManager.getMode();
            }
            catch (SecurityException securityexception)
            {
                logDeviceInfo();
                throw securityexception;
            }
            mSavedIsSpeakerphoneOn = mAudioManager.isSpeakerphoneOn();
            mSavedIsMicrophoneMute = mAudioManager.isMicrophoneMute();
            try
            {
                mAudioManager.setMode(3);
            }
            catch (SecurityException securityexception1)
            {
                logDeviceInfo();
                throw securityexception1;
            }
            startObservingVolumeChanges();
            return;
        }
        if (mSavedAudioMode == -2)
        {
            throw new IllegalStateException("Audio mode has not yet been set");
        }
        stopObservingVolumeChanges();
        setMicrophoneMute(mSavedIsMicrophoneMute);
        setSpeakerphoneOn(mSavedIsSpeakerphoneOn);
        try
        {
            mAudioManager.setMode(mSavedAudioMode);
        }
        catch (SecurityException securityexception2)
        {
            logDeviceInfo();
            throw securityexception2;
        }
        mSavedAudioMode = -2;
    }

    private boolean setDevice(String s)
    {
        if (mIsInitialized) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        if (!mHasModifyAudioSettingsPermission || !mHasRecordAudioPermission)
        {
            Log.w("AudioManagerAndroid", "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO");
            Log.w("AudioManagerAndroid", "Selected device will not be available for recording");
            return false;
        }
        if (s.isEmpty())
        {
            i = -2;
        } else
        {
            i = Integer.parseInt(s);
        }
        if (i == -2)
        {
            boolean aflag[];
            synchronized (mLock)
            {
                aflag = (boolean[])mAudioDevices.clone();
                mRequestedAudioDevice = -2;
            }
            setAudioDevice(selectDefaultDevice(aflag));
            return true;
        }
        continue; /* Loop/switch isn't completed */
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        if (!Arrays.asList(VALID_DEVICES).contains(Integer.valueOf(i)) || !mAudioDevices[i]) goto _L1; else goto _L3
_L3:
        synchronized (mLock)
        {
            mRequestedAudioDevice = i;
        }
        setAudioDevice(i);
        return true;
        exception1;
        s;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void setMicrophoneMute(boolean flag)
    {
        if (mAudioManager.isMicrophoneMute() == flag)
        {
            return;
        } else
        {
            mAudioManager.setMicrophoneMute(flag);
            return;
        }
    }

    private void setSpeakerphoneOn(boolean flag)
    {
        if (mAudioManager.isSpeakerphoneOn() == flag)
        {
            return;
        } else
        {
            mAudioManager.setSpeakerphoneOn(flag);
            return;
        }
    }

    private static boolean shouldUseAcousticEchoCanceler()
    {
        while (!runningOnJellyBeanOrHigher() || !Arrays.asList(SUPPORTED_AEC_MODELS).contains(Build.MODEL)) 
        {
            return false;
        }
        return AcousticEchoCanceler.isAvailable();
    }

    private void startBluetoothSco()
    {
        while (!mHasBluetoothPermission || mBluetoothScoState == 1 || mBluetoothScoState == 2) 
        {
            return;
        }
        if (mAudioManager.isBluetoothScoOn())
        {
            mBluetoothScoState = 1;
            return;
        } else
        {
            mBluetoothScoState = 2;
            mAudioManager.startBluetoothSco();
            return;
        }
    }

    private void startObservingVolumeChanges()
    {
        if (mSettingsObserverThread != null)
        {
            return;
        } else
        {
            mSettingsObserverThread = new HandlerThread("SettingsObserver");
            mSettingsObserverThread.start();
            mSettingsObserver = new ContentObserver(new Handler(mSettingsObserverThread.getLooper())) {

                final AudioManagerAndroid this$0;

                public void onChange(boolean flag)
                {
                    boolean flag1 = false;
                    super.onChange(flag);
                    if (mAudioManager.getMode() != 3)
                    {
                        throw new IllegalStateException("Only enable SettingsObserver in COMM mode");
                    }
                    int i = mAudioManager.getStreamVolume(0);
                    AudioManagerAndroid audiomanagerandroid = AudioManagerAndroid.this;
                    long l = mNativeAudioManagerAndroid;
                    flag = flag1;
                    if (i == 0)
                    {
                        flag = true;
                    }
                    audiomanagerandroid.nativeSetMute(l, flag);
                }

            
            {
                this$0 = AudioManagerAndroid.this;
                super(handler);
            }
            };
            mContentResolver.registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, mSettingsObserver);
            return;
        }
    }

    private void stopBluetoothSco()
    {
        while (!mHasBluetoothPermission || mBluetoothScoState != 1 && mBluetoothScoState != 2) 
        {
            return;
        }
        if (!mAudioManager.isBluetoothScoOn())
        {
            loge("Unable to stop BT SCO since it is already disabled");
            return;
        } else
        {
            mBluetoothScoState = 3;
            mAudioManager.stopBluetoothSco();
            return;
        }
    }

    private void stopObservingVolumeChanges()
    {
        if (mSettingsObserverThread == null)
        {
            return;
        }
        mContentResolver.unregisterContentObserver(mSettingsObserver);
        mSettingsObserver = null;
        mSettingsObserverThread.quit();
        try
        {
            mSettingsObserverThread.join();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("AudioManagerAndroid", "Thread.join() exception: ", interruptedexception);
        }
        mSettingsObserverThread = null;
    }

    private void unregisterBluetoothIntentsIfNeeded()
    {
        if (mHasBluetoothPermission)
        {
            mAudioManager.stopBluetoothSco();
            unregisterForBluetoothHeadsetIntentBroadcast();
            unregisterForBluetoothScoIntentBroadcast();
        }
    }

    private void unregisterForBluetoothHeadsetIntentBroadcast()
    {
        mContext.unregisterReceiver(mBluetoothHeadsetReceiver);
        mBluetoothHeadsetReceiver = null;
    }

    private void unregisterForBluetoothScoIntentBroadcast()
    {
        mContext.unregisterReceiver(mBluetoothScoReceiver);
        mBluetoothScoReceiver = null;
    }

    private void unregisterForWiredHeadsetIntentBroadcast()
    {
        mContext.unregisterReceiver(mWiredHeadsetReceiver);
        mWiredHeadsetReceiver = null;
    }

    private void updateDeviceActivation()
    {
        int i;
        synchronized (mLock)
        {
            i = mRequestedAudioDevice;
            obj1 = (boolean[])mAudioDevices.clone();
        }
        if (i == -1)
        {
            loge("Unable to activate device since no device is selected");
            return;
        }
        break MISSING_BLOCK_LABEL_42;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (i == -2 || !obj1[i])
        {
            setAudioDevice(selectDefaultDevice(((boolean []) (obj1))));
            return;
        } else
        {
            setAudioDevice(i);
            return;
        }
    }










/*
    static int access$702(AudioManagerAndroid audiomanagerandroid, int i)
    {
        audiomanagerandroid.mBluetoothScoState = i;
        return i;
    }

*/


}
