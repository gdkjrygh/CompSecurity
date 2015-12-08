// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import java.util.List;

public interface OcrCaptureListener
{

    public abstract void onRecognized(List list, int i, DebugInfo debuginfo);

    public abstract void onUnrecognized(int i, DebugInfo debuginfo);
}
