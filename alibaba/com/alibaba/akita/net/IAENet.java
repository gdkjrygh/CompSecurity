// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net;

import id;
import java.util.HashMap;

// Referenced classes of package com.alibaba.akita.net:
//            NetScene

public interface IAENet
{
    public static class Factory
    {

        public static HashMap sAENetMaps = new HashMap();

        public static IAENet getNet()
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

        public static IAENet getNet(String s)
        {
            com/alibaba/akita/net/IAENet$Factory;
            JVM INSTR monitorenter ;
            IAENet iaenet = (IAENet)sAENetMaps.get(s);
            if (iaenet == null) goto _L2; else goto _L1
_L1:
            IAENet iaenet1 = iaenet;
_L4:
            com/alibaba/akita/net/IAENet$Factory;
            JVM INSTR monitorexit ;
            return iaenet1;
_L2:
            iaenet1 = (IAENet)Class.forName(s).newInstance();
            iaenet = iaenet1;
_L5:
            iaenet1 = iaenet;
            if (iaenet == null) goto _L4; else goto _L3
_L3:
            sAENetMaps.put(s, iaenet);
            iaenet1 = iaenet;
              goto _L4
            s;
            throw s;
            Exception exception;
            exception;
            exception.printStackTrace();
              goto _L5
        }


        public Factory()
        {
        }
    }


    public static final String AENetApiMockProfile = "com.alibaba.api.base.mock.AEMockNetImpl";
    public static final String AENetApiProfile = "com.alibaba.akita.net.AENetApiImpl";
    public static final String AENetPhotoProfile = "com.alibaba.akita.net.AENetPhotoImpl";

    public abstract Object request(NetScene netscene)
        throws id;
}
