// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.maps;


public interface MapListener
{

    public abstract void onFrameUpdate(String s, int i, int j);

    public abstract void onMapLoadComplete();

    public abstract void onOpacityChanged(int i);

    public abstract void processMessage(String s);
}
