// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.net.Uri;
import com.facebook.prefs.shared.ae;

public class n
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    private static final ae d;

    public n()
    {
    }

    static 
    {
        d = (ae)com.facebook.orca.prefs.n.a.c(Uri.encode("background/"));
        a = (ae)d.c(Uri.encode("top_groups/"));
        b = (ae)a.c(Uri.encode("last_fetch_time_ms"));
        c = (ae)a.c(Uri.encode("num_fetched"));
    }
}
