// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.model;

import java.util.HashMap;

final class splayMode extends HashMap
{

    public final splayMode get(Object obj)
    {
        splayMode splaymode = (splayMode)super.get(obj);
        obj = splaymode;
        if (splaymode == null)
        {
            obj = splayMode.DEFAULT;
        }
        return ((splayMode) (obj));
    }

    public final volatile Object get(Object obj)
    {
        return get(obj);
    }

    splayMode()
    {
    }
}
