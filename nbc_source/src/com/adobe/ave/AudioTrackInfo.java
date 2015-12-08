// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public class AudioTrackInfo
{

    public String description;
    public boolean isAutoSelect;
    public boolean isDefault;
    public boolean isForced;
    public String language;

    AudioTrackInfo(String s, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        description = s;
        language = s1;
        isDefault = flag;
        isAutoSelect = flag1;
        isForced = flag2;
    }
}
