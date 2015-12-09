// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;


// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.fragments:
//            ImageCaptureFragment

public static interface 
{

    public abstract void onBarcodeCaptured(com.google.commerce.ocr.definitions.ode ode, com.google.android.libraries.commerce.ocr.kyc.pub.tener tener);

    public abstract void onError(int i, com.google.android.libraries.commerce.ocr.kyc.pub.tener tener);

    public abstract void onImageCaptured(com.google.android.libraries.commerce.ocr.kyc.pub.tener tener, com.google.android.libraries.commerce.ocr.kyc.pub.tener tener1);

    public abstract void onSkipped(com.google.android.libraries.commerce.ocr.kyc.pub.tener tener);
}
