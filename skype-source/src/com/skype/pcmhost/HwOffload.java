// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;

// Referenced classes of package com.skype.pcmhost:
//            jniInput_HwOffload

public class HwOffload
    implements jniInput_HwOffload
{

    private static final int OFFLOAD_AEC = 1;
    private static final int OFFLOAD_AGC = 2;
    private static final int OFFLOAD_NS = 4;
    private static final int OFFLOAD_SP = 8;
    private static final String TAG = "HwOffload";
    private static AcousticEchoCanceler aec;
    private static AutomaticGainControl agc;
    private static NoiseSuppressor ns;
    private int audioOffloadCapabilityMask;
    private int gCaptureSessionID;
    private int gHwOffload;
    public int recorderID;

    public HwOffload()
    {
        recorderID = 0;
        audioOffloadCapabilityMask = 0;
        gCaptureSessionID = 0;
        gHwOffload = 0;
    }

    private void cleanRecorder(AudioRecord audiorecord)
    {
        if (audiorecord != null)
        {
            audiorecord.release();
        }
    }

    private int getFakeAudioRecordSessionID(int i, int j, int k)
    {
        j = AudioRecord.getMinBufferSize(i, 16, 2);
        if (j == -2)
        {
            return 0;
        }
        if (j == -1)
        {
            Log.e("HwOffload", "Open failed, device is busy.");
            return 0;
        }
        if (j < 0)
        {
            Log.e("HwOffload", "Open failed, unknown error.");
            return 0;
        }
        Object obj;
        try
        {
            obj = new AudioRecord(k, i, 16, 2, j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("HwOffload", "Exception occured in new AudioRecord(): ", ((Throwable) (obj)));
            return 0;
        }
        if (((AudioRecord) (obj)).getState() != 1)
        {
            Log.e("HwOffload", "AudioRecorder failed to initialize, no audio session ID!");
            cleanRecorder(((AudioRecord) (obj)));
            return 0;
        } else
        {
            i = ((AudioRecord) (obj)).getAudioSessionId();
            cleanRecorder(((AudioRecord) (obj)));
            return i;
        }
    }

    public int enableAudioEffects(int i, int j)
    {
        Object obj;
        int k;
        boolean flag;
        boolean flag1;
        flag = true;
        (new StringBuilder("EnableAudioEffect ID(")).append(i).append(") AEC(").append(j).append(")");
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return 0;
        }
        gCaptureSessionID = i;
        gHwOffload = j;
        k = ((flag) ? 1 : 0);
        if ((audioOffloadCapabilityMask & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (aec != null)
        {
            aec.release();
            aec = null;
        }
        aec = AcousticEchoCanceler.create(i);
        if ((j & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        aec.setEnabled(flag1);
        (new StringBuilder(" AEC has been ")).append(((String) (obj))).append("- status IsEnabled(): ").append(aec.getEnabled());
        k = ((flag) ? 1 : 0);
_L1:
        flag = k;
        if ((audioOffloadCapabilityMask & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        if (ns != null)
        {
            ns.release();
            ns = null;
        }
        ns = NoiseSuppressor.create(i);
        if ((j & 4) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        ns.setEnabled(flag1);
        (new StringBuilder(" NS has been ")).append(((String) (obj))).append("- status IsEnabled(): ").append(ns.getEnabled());
        flag = k;
_L2:
        k = ((flag) ? 1 : 0);
        if ((audioOffloadCapabilityMask & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        if (agc != null)
        {
            agc.release();
            agc = null;
        }
        agc = AutomaticGainControl.create(i);
        if ((j & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        agc.setEnabled(flag1);
        (new StringBuilder(" AGC has been ")).append(((String) (obj))).append("- status IsEnabled(): ").append(agc.getEnabled());
        k = ((flag) ? 1 : 0);
_L3:
        return k;
        obj;
        Log.e("HwOffload", (new StringBuilder("Exception occured in AEC.setEnabled(")).append(flag1).append("): ").toString(), ((Throwable) (obj)));
        k = 0;
          goto _L1
        obj;
        Log.e("HwOffload", (new StringBuilder("Exception occured in NS.setEnabled(")).append(flag1).append("): ").toString(), ((Throwable) (obj)));
        flag = false;
          goto _L2
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e("HwOffload", (new StringBuilder("Exception occured in AGC.setEnabled(")).append(flag1).append("): ").toString(), runtimeexception);
        k = 0;
          goto _L3
    }

    public int getAudioRecordSessionID(int i, int j, boolean flag)
    {
        boolean flag1 = false;
        byte byte0;
        int k;
        int l;
        int i1;
        if (flag)
        {
            byte0 = 7;
        } else
        {
            byte0 = 0;
        }
        i1 = getFakeAudioRecordSessionID(i, j, byte0);
        l = getFakeAudioRecordSessionID(i, j, byte0);
        k = ((flag1) ? 1 : 0);
        if (i1 != 0)
        {
            k = ((flag1) ? 1 : 0);
            if (l != 0)
            {
                k = ((flag1) ? 1 : 0);
                if (i1 != l)
                {
                    i1 = l - i1;
                    recorderID = l + i1;
                    k = ((flag1) ? 1 : 0);
                    if (getFakeAudioRecordSessionID(i, j, byte0) == recorderID)
                    {
                        recorderID = recorderID + i1;
                        (new StringBuilder("Successfully got record sessionID=")).append(recorderID);
                        k = recorderID;
                    }
                }
            }
        }
        return k;
    }

    public int getDefaultBuiltinEffect(int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            boolean flag;
            try
            {
                flag = AcousticEchoCanceler.isAvailable();
            }
            catch (RuntimeException runtimeexception)
            {
                Log.e("HwOffload", "Exception occured in AcousticEchoCanceler.isAvailable(): ", runtimeexception);
                audioOffloadCapabilityMask = 0;
                return 0;
            }
            if (flag)
            {
                boolean flag1;
                try
                {
                    aec = AcousticEchoCanceler.create(i);
                }
                catch (RuntimeException runtimeexception1)
                {
                    Log.e("HwOffload", "Exception occured in AcousticEchoCanceler.create(): ", runtimeexception1);
                    audioOffloadCapabilityMask = 0;
                    return 0;
                }
                if (aec == null)
                {
                    Log.w("HwOffload", "AcousticEchoCanceler.create() returned null");
                } else
                {
                    (new StringBuilder(" AEC offload isAvailable: isEnabledDefault()=")).append(aec.getEnabled()).append(" isControlling=").append(aec.hasControl());
                    aec.release();
                    aec = null;
                    audioOffloadCapabilityMask = audioOffloadCapabilityMask | 1;
                }
            }
            try
            {
                flag1 = NoiseSuppressor.isAvailable();
            }
            catch (RuntimeException runtimeexception2)
            {
                Log.e("HwOffload", "Exception occured in NoiseSuppressor.isAvailable(): ", runtimeexception2);
                audioOffloadCapabilityMask = 0;
                return 0;
            }
            if (flag1)
            {
                try
                {
                    ns = NoiseSuppressor.create(i);
                }
                catch (RuntimeException runtimeexception3)
                {
                    Log.e("HwOffload", "Exception occured in NoiseSuppressor.create(): ", runtimeexception3);
                    audioOffloadCapabilityMask = 0;
                    return 0;
                }
                if (ns == null)
                {
                    Log.w("HwOffload", "NoiseSuppressor.create() returned null");
                } else
                {
                    (new StringBuilder(" NS offload isAvailable: isEnabledDefault()=")).append(ns.getEnabled()).append(" isControlling ").append(ns.hasControl());
                    ns.release();
                    ns = null;
                    audioOffloadCapabilityMask = audioOffloadCapabilityMask | 4;
                }
            }
            try
            {
                flag1 = AutomaticGainControl.isAvailable();
            }
            catch (RuntimeException runtimeexception4)
            {
                Log.e("HwOffload", "Exception occured in AutomaticGainControl.isAvailable(): ", runtimeexception4);
                audioOffloadCapabilityMask = 0;
                return 0;
            }
            if (flag1)
            {
                try
                {
                    agc = AutomaticGainControl.create(i);
                }
                catch (RuntimeException runtimeexception5)
                {
                    Log.e("HwOffload", "Exception occured in AutomaticGainControl.create(): ", runtimeexception5);
                    audioOffloadCapabilityMask = 0;
                    return 0;
                }
                if (agc == null)
                {
                    Log.w("HwOffload", "AutomaticGainControl.create() returned null");
                    return 0;
                } else
                {
                    (new StringBuilder(" AGC offload isAvailable: isEnabledDefault()=")).append(agc.getEnabled()).append(" isControlling ").append(agc.hasControl());
                    agc.release();
                    agc = null;
                    audioOffloadCapabilityMask = audioOffloadCapabilityMask | 2;
                    return 0;
                }
            }
        }
        return 0;
    }

    public void resetAudioEffects()
    {
        if ((gHwOffload & 8) != 0)
        {
            enableAudioEffects(gCaptureSessionID, gHwOffload);
        }
    }
}
