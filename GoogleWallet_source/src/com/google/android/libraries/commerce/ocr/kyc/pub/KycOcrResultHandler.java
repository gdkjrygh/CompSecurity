// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.pub;


// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.pub:
//            KycOcrResult

public interface KycOcrResultHandler
{

    public abstract void onError(int i, KycOcrResult kycocrresult);

    public abstract void onRecognized(KycOcrResult kycocrresult);

    public abstract void onSkipped(KycOcrResult kycocrresult);
}
