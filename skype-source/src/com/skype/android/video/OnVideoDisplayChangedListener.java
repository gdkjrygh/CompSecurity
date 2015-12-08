// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;


public interface OnVideoDisplayChangedListener
{

    public abstract void onOverlayLayoutChanged(int i, int j);

    public abstract void onVideoDisplayChanged(String s, com.skype.Video.STATUS status);
}
