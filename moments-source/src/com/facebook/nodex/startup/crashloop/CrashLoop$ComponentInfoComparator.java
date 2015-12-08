// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.crashloop;

import android.content.pm.ComponentInfo;
import java.util.Comparator;

class <init>
    implements Comparator
{

    private static int a(ComponentInfo componentinfo, ComponentInfo componentinfo1)
    {
        return componentinfo.name.compareTo(componentinfo1.name);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ComponentInfo)obj, (ComponentInfo)obj1);
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
