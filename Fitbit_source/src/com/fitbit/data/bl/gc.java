// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.Loader;
import com.fitbit.customui.TimeNavigator;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.water.Water;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class gc
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private static final String a = "WaterLogLoaderCallbacks";
    private final Context b;
    private Date c;
    private List d;
    private Water e;
    private TimeNavigator f;

    public gc(Context context)
    {
        this(context, null);
    }

    private gc(Context context, Fragment fragment)
    {
        b = context;
        d = new ArrayList();
        e = new Water(0.0D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
    }

    public Date a()
    {
        return c;
    }

    public void a(Loader loader, List list)
    {
        loader = list.iterator();
        double d1;
        for (d1 = 0.0D; loader.hasNext(); d1 = ((WaterLogEntry)loader.next()).e().a(com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML).b() + d1) { }
        e = new Water(d1, com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
        d = list;
        c();
    }

    public void a(TimeNavigator timenavigator)
    {
        f = timenavigator;
    }

    public void a(Date date)
    {
        c = date;
    }

    public List b()
    {
        return d;
    }

    protected void c()
    {
    }

    public Water d()
    {
        return e;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
    /* block-local class not found */
    class a {}

        a a1 = new a(b);
        if (c != null)
        {
            bundle = c;
        } else
        {
            bundle = f.c();
        }
        a1.a(bundle);
        return a1;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (List)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
