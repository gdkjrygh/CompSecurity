// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.plugins;

import android.content.SharedPreferences;

public interface ISharedPreferences
{

    public abstract SharedPreferences getDefaultSharedPreferences();

    public abstract SharedPreferences getSharedPreferences(String s);
}
