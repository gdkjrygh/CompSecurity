// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Filter;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ActivityLogInfo;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.bf;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.e.a;
import com.fitbit.ui.a.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            a

private static class a extends Filter
{

    private final c a;

    private List a()
    {
        new IntentFilter("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK");
        Object obj = FitBitApplication.a();
        ((Context) (obj)).startService(bf.a(((Context) (obj))));
        Object obj1 = ActivityBusinessLogic.a().e();
        ((List) (obj1)).addAll(ActivityBusinessLogic.a().g());
        obj = new ArrayList();
        LongSparseArray longsparsearray = new LongSparseArray();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ActivityLogInfo activityloginfo = (ActivityLogInfo)((Iterator) (obj1)).next();
            if (!((Boolean)longsparsearray.get(activityloginfo.c(), Boolean.FALSE)).booleanValue())
            {
                ActivityItem activityitem = new ActivityItem();
                activityitem.setServerId(activityloginfo.c());
                activityitem.a(activityloginfo.a());
                ((ArrayList) (obj)).add(activityitem);
                longsparsearray.put(activityloginfo.c(), Boolean.valueOf(true));
            }
        } while (true);
        return ((List) (obj));
    }

    public CharSequence convertResultToString(Object obj)
    {
        if (obj instanceof ActivityItem)
        {
            return ((ActivityItem)obj).a();
        } else
        {
            return obj.getClass().getName();
        }
    }

    protected android.widget.er.FilterResults performFiltering(CharSequence charsequence)
    {
        List list = Collections.emptyList();
        if (TextUtils.isEmpty(charsequence) && TextUtils.getTrimmedLength(charsequence) <= 0) goto _L2; else goto _L1
_L1:
        Object obj = ActivityBusinessLogic.a().a(String.valueOf(charsequence));
        list = ((List) (obj));
_L4:
        obj = new android.widget.er.FilterResults();
        obj.count = list.size();
        obj.values = Pair.create(charsequence, list);
        return ((android.widget.er.FilterResults) (obj));
_L2:
        obj = a();
        list = ((List) (obj));
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        com.fitbit.e.a.f("Search", "Error", exception, new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void publishResults(CharSequence charsequence, android.widget.er.FilterResults filterresults)
    {
        filterresults = (Pair)filterresults.values;
        String s = (String)((Pair) (filterresults)).first;
        TreeSet treeset = new TreeSet(new <init>(charsequence.toString()));
        if (TextUtils.equals(charsequence, s))
        {
            a.clear();
            treeset.addAll((Collection)((Pair) (filterresults)).second);
            a.addAll(treeset);
            a.notifyDataSetChanged();
        }
    }

    public (c c1)
    {
        a = c1;
    }
}
