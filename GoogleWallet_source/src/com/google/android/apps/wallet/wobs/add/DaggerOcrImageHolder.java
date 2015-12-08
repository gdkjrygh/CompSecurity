// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder;

public class DaggerOcrImageHolder
{

    DaggerOcrImageHolder()
    {
    }

    public static void clear()
    {
        OcrImageHolder.clear();
    }

    public static byte[] get(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side)
    {
        return OcrImageHolder.get(side);
    }
}
