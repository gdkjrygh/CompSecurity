// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public class cw
{

    public cw()
    {
    }

    public static boolean a()
    {
        boolean flag = false;
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.maps.MapActivity");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        if (class1 != null)
        {
            flag = true;
        }
        return flag;
    }

    public static Class b()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.facebook.orca.threadview.ThreadViewMapActivityImpl");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return null;
        }
        return class1;
    }
}
