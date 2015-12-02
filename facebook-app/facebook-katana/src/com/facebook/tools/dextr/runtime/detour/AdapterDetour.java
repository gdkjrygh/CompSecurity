// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import android.widget.BaseAdapter;
import com.facebook.loom.logger.Logger;

public class AdapterDetour
{

    public AdapterDetour()
    {
    }

    public static void a(BaseAdapter baseadapter, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.ADAPTER_NOTIFY, i);
        baseadapter.notifyDataSetChanged();
    }

    public static void b(BaseAdapter baseadapter, int i)
    {
        Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.ADAPTER_NOTIFY, i);
        baseadapter.notifyDataSetInvalidated();
    }
}
