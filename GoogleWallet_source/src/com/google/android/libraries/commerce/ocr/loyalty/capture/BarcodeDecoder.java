// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.util.Map;

public interface BarcodeDecoder
{

    public abstract Result decodeWithState(BinaryBitmap binarybitmap)
        throws NotFoundException;

    public abstract void reset();

    public abstract void setHint(Map map);
}
