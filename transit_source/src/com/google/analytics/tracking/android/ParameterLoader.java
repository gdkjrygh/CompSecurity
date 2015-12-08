// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


interface ParameterLoader
{

    public abstract boolean getBoolean(String s);

    public abstract Double getDoubleFromString(String s);

    public abstract int getInt(String s, int i);

    public abstract String getString(String s);

    public abstract boolean isBooleanKeyPresent(String s);
}
