// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;

// Referenced classes of package com.ta.utdid2.device:
//            Device, UTUtdid

public class DeviceInfo
{

    static final Object CREATE_DEVICE_METADATA_LOCK = new Object();
    static String HMAC_KEY = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";
    static final byte UTDID_VERSION_CODE = 1;
    private static Device mDevice = null;

    public DeviceInfo()
    {
    }

    private static Device _initDeviceMetadata(Context context)
    {
label0:
        {
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            new Device();
            Device device;
            synchronized (CREATE_DEVICE_METADATA_LOCK)
            {
                String s = UTUtdid.instance(context).getValue();
                if (StringUtils.isEmpty(s))
                {
                    break label0;
                }
                if (s.endsWith("\n"))
                {
                    s = s.substring(0, s.length() - 1);
                }
                device = new Device();
                long l = System.currentTimeMillis();
                String s1 = PhoneInfoUtils.getImei(context);
                context = PhoneInfoUtils.getImsi(context);
                device.setDeviceId(s1);
                device.setImei(s1);
                device.setCreateTimestamp(l);
                device.setImsi(context);
                device.setUtdid(s);
                device.setCheckSum(getMetadataCheckSum(device));
            }
            return device;
        }
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_131;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        return null;
    }

    public static Device getDevice(Context context)
    {
        com/ta/utdid2/device/DeviceInfo;
        JVM INSTR monitorenter ;
        if (mDevice == null) goto _L2; else goto _L1
_L1:
        context = mDevice;
_L4:
        com/ta/utdid2/device/DeviceInfo;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = _initDeviceMetadata(context);
        mDevice = context;
        continue; /* Loop/switch isn't completed */
        context;
        throw context;
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static long getMetadataCheckSum(Device device)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

}
