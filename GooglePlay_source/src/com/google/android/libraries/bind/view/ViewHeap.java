// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.data.BindingViewGroup;
import com.google.android.libraries.bind.logging.Logd;
import com.google.android.libraries.bind.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class ViewHeap
{

    private static final Logd LOGD = Logd.get(com/google/android/libraries/bind/view/ViewHeap);
    private static final WeakHashMap inUseDebugMap = null;
    public final Context context;
    private final Map heap = new HashMap();
    private int inflatedCount;
    private final LayoutInflater inflater;
    private boolean isDisabledUntilNextGet;
    private final List reclaimViews = new ArrayList();
    private int returnedCount;
    private int reusedCount;

    public ViewHeap(Context context1)
    {
        isDisabledUntilNextGet = false;
        context = context1;
        inflater = (LayoutInflater)context1.getSystemService("layout_inflater");
    }

    private int efficiencyPercent()
    {
        return (reusedCount * 100) / (reusedCount + inflatedCount);
    }

    private void logReuse(int i, boolean flag)
    {
        reusedCount = reusedCount + 1;
        if (!flag)
        {
            returnedCount = returnedCount + 1;
        }
        Logd logd = LOGD;
        Integer.toString(i);
        efficiencyPercent();
    }

    private void tryRecycleChildren(ViewGroup viewgroup)
    {
        int i = viewgroup.getChildCount() - 1;
        while (i >= 0) 
        {
            View view = viewgroup.getChildAt(i);
            if ((view instanceof BindingViewGroup) && !((BindingViewGroup)view).isOwnedByParent())
            {
                viewgroup.removeViewAt(i);
                if ((Integer)view.getTag() != null)
                {
                    if ((view instanceof BindingViewGroup) && !((BindingViewGroup)view).isOwnedByParent())
                    {
                        ((BindingViewGroup)view).prepareForRecycling();
                    }
                    if (view instanceof ViewGroup)
                    {
                        tryRecycleChildren((ViewGroup)view);
                    }
                    if (!(view instanceof BindingViewGroup) || ((BindingViewGroup)view).isOwnedByParent())
                    {
                        view.measure(0, 0);
                    }
                    Object obj;
                    Object obj1;
                    Integer integer;
                    boolean flag;
                    if (view.getParent() == null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Util.checkPrecondition(flag);
                    integer = (Integer)view.getTag();
                    obj1 = (List)heap.get(integer);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(view);
                    obj1 = LOGD;
                    Integer.toString(integer.intValue());
                    ((List) (obj)).size();
                    heap.put(integer, obj);
                    returnedCount = returnedCount + 1;
                }
            } else
            if (view instanceof ViewGroup)
            {
                tryRecycleChildren((ViewGroup)view);
            }
            i--;
        }
    }

    public final View get(int i, View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        Integer integer = null;
        Util.checkPrecondition(true);
        isDisabledUntilNextGet = false;
        Object obj;
        if (view != null)
        {
            integer = (Integer)view.getTag();
        }
        obj = LOGD;
        if (integer == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.toString(integer.intValue());
        }
        if (integer != null)
        {
            if (view instanceof ViewGroup)
            {
                obj = LOGD;
                tryRecycleChildren((ViewGroup)view);
            }
            if (i == integer.intValue())
            {
                logReuse(i, false);
                view.setLayoutParams(layoutparams);
                return view;
            }
        }
        obj = (List)heap.get(Integer.valueOf(i));
        integer = null;
        view = integer;
        if (obj != null)
        {
            view = integer;
            if (((List) (obj)).size() > 0)
            {
                view = (View)((List) (obj)).remove(((List) (obj)).size() - 1);
            }
        }
        if (view == null)
        {
            Logd logd;
            try
            {
                view = inflater.inflate(i, null, false);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                LOGD.e("Failed to inflate view resource: %s", new Object[] {
                    Util.getResourceName(i)
                });
                throw view;
            }
            view.setTag(Integer.valueOf(i));
            inflatedCount = inflatedCount + 1;
            logd = LOGD;
            Integer.toString(i);
            efficiencyPercent();
        } else
        {
            logReuse(i, true);
        }
        view.setLayoutParams(layoutparams);
        return view;
    }

}
