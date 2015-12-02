// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.adapter;

import android.content.Context;

public class JNICLibrary
{

    private static JNICLibrary a;

    private JNICLibrary()
    {
    }

    public static JNICLibrary getInstance()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public native boolean addErrorRecord(char c, char c1, char c2, int i, int j);

    public native byte[] analyzeOpenIdNative(String s, String s1, String s2, byte abyte0[], String s3);

    public native byte[] atlasEncrypt(byte abyte0[], byte abyte1[], String s);

    public native int checkEnvAndFilesNative(String as[], int i, Context context);

    public native byte[] encryptSecretData(int i, byte abyte0[], byte abyte1[]);

    public native String getAppKeyByIndex(int i, String s);

    public native byte[] getDexHashNative(String s, String s1, int i);

    public native String getDynamicKeyNative(String s, String s1);

    public native byte[] getDynamicValueNative(String s, String as[]);

    public native byte[] getEncryptedDevAndEnvInfoNative(int i, String s);

    public native String getExtraData(String s, String s1);

    public native int getKeyType(String s, String s1);

    public native byte[] getOrgValueNative(String s, String as[]);

    public native String getSecurityBodyData(String s, String s1);

    public native byte[] getSeed(byte abyte0[]);

    public native String indieKitRequestNative(String as[], int i, String s, int j);

    public native boolean initSecurityBody(String s, String s1);

    public native int initialize(Context context, boolean flag);

    public native boolean isPackageValidNative(String s);

    public native boolean isRootNative();

    public native boolean isSimulator();

    public native boolean putUserActionRecord(String s, String s1, float f, float f1);

    public native boolean putUserTrackRecord(String s);

    public native byte[] saveKeyEncrypt(byte abyte0[], byte abyte1[]);

    public native byte[] seedDecrypt(int i, byte abyte0[], byte abyte1[]);

    public native byte[] seedEncrypt(int i, byte abyte0[], byte abyte1[]);

    public native void setSecurityBodyServer(int i);

    public native String signRequestNative(String as[], int i, String s, int j, String s1);

    public native byte[] staticDecrypt(int i, byte abyte0[], byte abyte1[], String s);

    public native byte[] staticEncrypt(int i, byte abyte0[], byte abyte1[], String s);

    public native int testCpuArchCounterNative();

    public native boolean testDataCollectionAdapterNative();

    public native boolean testDataReportAdapterNative();

    public native void testDynamicUpdateNative();

    public native void updateNickNative();
}
