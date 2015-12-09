// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ActivityLogInfo;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.bf;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.ui.a.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

class com.fitbit.activity.ui.activitylog.a extends c
    implements Filterable
{
    private static class a
        implements Comparator
    {

        private final String a;

        private int a(String s)
        {
            int i1 = s.length() + 1;
            int j1 = a.length();
            int ai1[] = new int[i1];
            int ai[] = new int[i1];
            for (int i = 0; i < i1; i++)
            {
                ai1[i] = i;
            }

            int j = 1;
            do
            {
                int ai2[] = ai1;
                if (j < j1 + 1)
                {
                    ai[0] = j;
                    int k = 1;
                    while (k < i1) 
                    {
                        int l;
                        int k1;
                        if (s.charAt(k - 1) == a.charAt(j - 1))
                        {
                            l = 0;
                        } else
                        {
                            l = 1;
                        }
                        k1 = ai2[k - 1];
                        ai[k] = Math.min(Math.min(ai2[k] + 1, ai[k - 1] + 1), l + k1);
                        k++;
                    }
                    j++;
                    ai1 = ai;
                    ai = ai2;
                } else
                {
                    return ai2[i1 - 1];
                }
            } while (true);
        }

        public int a(ActivityItem activityitem, ActivityItem activityitem1)
        {
            int j = a(activityitem.a().toLowerCase(Locale.US)) - a(activityitem1.a().toLowerCase(Locale.US));
            int i = j;
            if (j == 0)
            {
                i = activityitem.a().compareToIgnoreCase(activityitem1.a());
            }
            return i;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((ActivityItem)obj, (ActivityItem)obj1);
        }

        public a(String s)
        {
            a = s.toLowerCase(Locale.US);
        }
    }

    private static class b extends Filter
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

        protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            List list = Collections.emptyList();
            if (TextUtils.isEmpty(charsequence) && TextUtils.getTrimmedLength(charsequence) <= 0) goto _L2; else goto _L1
_L1:
            Object obj = ActivityBusinessLogic.a().a(String.valueOf(charsequence));
            list = ((List) (obj));
_L4:
            obj = new android.widget.Filter.FilterResults();
            obj.count = list.size();
            obj.values = Pair.create(charsequence, list);
            return ((android.widget.Filter.FilterResults) (obj));
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

        protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
            filterresults = (Pair)filterresults.values;
            String s = (String)((Pair) (filterresults)).first;
            TreeSet treeset = new TreeSet(new a(charsequence.toString()));
            if (TextUtils.equals(charsequence, s))
            {
                a.clear();
                treeset.addAll((Collection)((Pair) (filterresults)).second);
                a.addAll(treeset);
                a.notifyDataSetChanged();
            }
        }

        public b(c c1)
        {
            a = c1;
        }
    }


    com.fitbit.activity.ui.activitylog.a()
    {
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return getView(i, view, viewgroup);
    }

    public Filter getFilter()
    {
        return new b(this);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ActivityItem activityitem = (ActivityItem)getItem(i);
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
        }
        view = (TextView)view;
        view.setText(activityitem.a());
        return view;
    }
}
