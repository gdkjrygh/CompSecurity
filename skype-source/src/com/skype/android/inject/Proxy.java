// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import com.skype.android.event.EventFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.skype.android.inject:
//            b, LifecycleState, ProxyEventListener

public class Proxy
{

    private LifecycleState defaultLifecycleState;
    private Map filters;
    private Boolean isVisualElement;
    private Set listeners;
    private Object target;
    private b viewFinder;

    public Proxy(Object obj)
    {
        target = obj;
        listeners = new HashSet();
        filters = new HashMap();
    }

    protected void addFilter(Class class1, EventFilter eventfilter)
    {
        Set set = (Set)filters.get(class1);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            filters.put(class1, obj);
        }
        ((Set) (obj)).add(eventfilter);
    }

    protected void addListener(ProxyEventListener proxyeventlistener)
    {
        listeners.add(proxyeventlistener);
    }

    public void clearViews()
    {
    }

    protected View findViewById(int i)
    {
        if (viewFinder == null)
        {
            viewFinder = new b(getTarget());
        }
        return viewFinder.find(i);
    }

    LifecycleState getDefaultLifecycleState()
    {
        return defaultLifecycleState;
    }

    Set getFilters(Class class1)
    {
        return (Set)filters.get(class1);
    }

    Set getListeners()
    {
        return listeners;
    }

    public Object getTarget()
    {
        return target;
    }

    public void injectViews()
    {
    }

    boolean isVisualElement()
    {
        if (isVisualElement == null)
        {
            boolean flag;
            if ((target instanceof Activity) || (target instanceof Fragment) || (target instanceof android.support.v4.app.Fragment) || (target instanceof View))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isVisualElement = Boolean.valueOf(flag);
        }
        return isVisualElement.booleanValue();
    }

    protected void setDefaultLifecycleState(LifecycleState lifecyclestate)
    {
        defaultLifecycleState = lifecyclestate;
    }
}
