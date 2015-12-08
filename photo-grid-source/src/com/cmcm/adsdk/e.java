// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import java.util.Map;

public final class e
{

    Map a;

    public final boolean a()
    {
        if (a != null)
        {
            Object obj = a.get("picks_loop");
            if (obj != null)
            {
                return Boolean.valueOf(obj.toString()).booleanValue();
            }
        }
        return true;
    }

    public final boolean b()
    {
        if (a != null)
        {
            Object obj = a.get("ignore_view");
            if (obj != null)
            {
                return Boolean.valueOf(obj.toString()).booleanValue();
            }
        }
        return false;
    }

    public final boolean c()
    {
        if (a != null)
        {
            Object obj = a.get("report_show_ignore_view");
            if (obj != null)
            {
                return Boolean.valueOf(obj.toString()).booleanValue();
            }
        }
        return false;
    }

    public final boolean d()
    {
        if (a != null)
        {
            Object obj = a.get("picks_load_by_page");
            if (obj != null)
            {
                return Boolean.valueOf(obj.toString()).booleanValue();
            }
        }
        return false;
    }
}
