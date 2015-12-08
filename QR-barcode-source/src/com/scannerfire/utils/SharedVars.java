// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

public class SharedVars
{

    private static SharedVars instance;

    public SharedVars()
    {
    }

    public static SharedVars getInstance()
    {
        if (instance == null)
        {
            instance = new SharedVars();
        }
        return instance;
    }

    public void addSavedCode(Context context, String s)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences(context.getResources().getString(0x7f080023), 0).edit();
        editor.putString(context.getResources().getString(0x7f0800b4), (new StringBuilder(String.valueOf(s))).append("[*]").toString());
        editor.commit();
    }

    public String[] getSavedCode(Context context)
    {
        return context.getSharedPreferences(context.getResources().getString(0x7f080023), 0).getString(context.getResources().getString(0x7f0800b4), "").split("[*]");
    }
}
