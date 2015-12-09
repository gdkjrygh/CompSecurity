// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.api;

import java.io.IOException;

public interface WobsOcrClient
{

    public abstract com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse recognize(com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest recognizewobdatarequest)
        throws IOException;
}
