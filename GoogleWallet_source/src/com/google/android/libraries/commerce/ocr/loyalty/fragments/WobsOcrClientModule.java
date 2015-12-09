// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;

public class WobsOcrClientModule
{

    private final WobsOcrClient wobsOcrClient;

    final WobsOcrClient provideWobsOcrClient()
    {
        return wobsOcrClient;
    }
}
