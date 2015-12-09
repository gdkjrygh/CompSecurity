// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;


public interface OcrResultNotifier
{
    public static interface OcrResultCallback
    {

        public abstract void onOcrResult();
    }


    public abstract void setOcrResultCallback(OcrResultCallback ocrresultcallback);
}
