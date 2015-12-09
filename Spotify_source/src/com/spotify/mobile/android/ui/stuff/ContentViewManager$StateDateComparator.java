// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;

import gac;
import java.io.Serializable;
import java.util.Comparator;

class <init>
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0xcb186378fe5402f3L;

    public volatile int compare(Object obj, Object obj1)
    {
        obj = (gac)obj;
        return ((gac)obj1).a.ty - ((gac) (obj)).a.ty;
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
