// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.Context;
import com.facebook.common.w.q;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.widget.c.d;
import java.util.HashMap;
import java.util.Set;

public class an extends d
{

    private static final ae a;
    private static final HashMap b;

    public an(Context context)
    {
        super(context);
        context = new CharSequence[b.size()];
        b.keySet().toArray(context);
        setDialogTitle("Reflex settings");
        setEntries(context);
        setEntryValues(context);
        setTitle("Enable/Disable Reflex in ThreadList");
        setSummary("Restart is required for settings to take effect");
        setNegativeButtonText("Cancel");
        a(a);
    }

    public static q a(com.facebook.prefs.shared.d d1)
    {
        String s = "Use GateKeeper settings";
        try
        {
            d1 = d1.a(a, "Use GateKeeper settings");
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.prefs.shared.d d1)
        {
            d1 = s;
        }
        return (q)b.get(d1);
    }

    static 
    {
        a = (ae)aj.b.c("reflex_thread_list_state");
        b = new HashMap();
        b.put("Use GateKeeper settings", q.UNSET);
        b.put("Force enable", q.YES);
        b.put("Force disable", q.NO);
    }
}
