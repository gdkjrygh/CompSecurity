// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import com.google.common.base.Preconditions;

public final class SessionData
{

    public final Object data;
    public final Object session;

    public SessionData(Object obj, Object obj1)
    {
        data = Preconditions.checkNotNull(obj);
        session = Preconditions.checkNotNull(obj1);
    }
}
