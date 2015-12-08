// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.graphics.drawable.Drawable;

final class AppInfo
    implements Comparable
{

    private final Drawable icon;
    private final String label;
    private final String packageName;

    AppInfo(String s, String s1, Drawable drawable)
    {
        packageName = s;
        label = s1;
        icon = drawable;
    }

    public int compareTo(AppInfo appinfo)
    {
        return label.compareTo(appinfo.label);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AppInfo)obj);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof AppInfo))
        {
            return false;
        } else
        {
            obj = (AppInfo)obj;
            return label.equals(((AppInfo) (obj)).label);
        }
    }

    Drawable getIcon()
    {
        return icon;
    }

    String getLabel()
    {
        return label;
    }

    String getPackageName()
    {
        return packageName;
    }

    public int hashCode()
    {
        return label.hashCode();
    }

    public String toString()
    {
        return label;
    }
}
