// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;


public interface Processor
{

    public abstract void discard(Object obj);

    public abstract boolean isProcessingNeeded(Object obj);

    public abstract Object process(Object obj);

    public abstract void shutdown();
}
