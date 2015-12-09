// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import com.google.android.libraries.commerce.ocr.cv.SafePoolable;

public final class SessionSafePoolable extends SafePoolable
{

    private final Object sessionData;

    public SessionSafePoolable(SafePoolable safepoolable, Object obj)
    {
        super(safepoolable);
        sessionData = obj;
    }

    public final Object getSessionData()
    {
        return sessionData;
    }
}
