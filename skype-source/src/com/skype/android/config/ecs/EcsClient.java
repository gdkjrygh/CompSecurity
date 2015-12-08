// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;


public interface EcsClient
{

    public abstract void addQueryParameter(String s, String s1, String s2);

    public abstract String getETag();

    public abstract boolean getSettingAsBool(String s, String s1, boolean flag);

    public abstract int getSettingAsInt(String s, String s1, int i);

    public abstract String getSettingAsString(String s, String s1, String s2);

    public abstract void removeQueryParameter(String s, String s1);

    public abstract void removeQueryParameterByNamespace(String s);
}
