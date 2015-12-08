// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;


public interface MessageEvent
{

    public abstract byte[] getData();

    public abstract String getPath();

    public abstract int getRequestId();

    public abstract String getSourceNodeId();
}
