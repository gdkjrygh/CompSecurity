// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import com.google.android.apps.common.inject.ApplicationModule;
import com.google.android.apps.common.inject.InjectedApplication;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import dagger.ObjectGraph;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            CurrentUserModule

public abstract class UserScopedApplication extends InjectedApplication
{

    private final Map objectGraphsByUser = Maps.newHashMap();

    public UserScopedApplication()
    {
    }

    private String getAccountName()
    {
        return (String)SharedPreference.ACCOUNT_NAME.get(getSharedPreferences("global_prefs", 0));
    }

    public abstract List getActivityModules();

    public final Object getInUserScope(Class class1)
    {
        return getUserObjectGraph().get(class1);
    }

    protected abstract List getUserModules();

    protected final ObjectGraph getUserObjectGraph()
    {
        this;
        JVM INSTR monitorenter ;
        ObjectGraph objectgraph = getUserObjectGraph(getAccountName());
        this;
        JVM INSTR monitorexit ;
        return objectgraph;
        Exception exception;
        exception;
        throw exception;
    }

    public final ObjectGraph getUserObjectGraph(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ObjectGraph objectgraph;
        boolean flag;
        if (!Strings.isNullOrEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        objectgraph = (ObjectGraph)objectGraphsByUser.get(s);
        obj = objectgraph;
        if (objectgraph != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        obj = getUserModules();
        ((List) (obj)).add(new ApplicationModule(this));
        ((List) (obj)).add(new CurrentUserModule(s));
        obj = getApplicationObjectGraph().plus(((List) (obj)).toArray());
        objectGraphsByUser.put(s, obj);
        this;
        JVM INSTR monitorexit ;
        return ((ObjectGraph) (obj));
        s;
        throw s;
    }

    public final boolean hasGraph(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = objectGraphsByUser.containsKey(s);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public final void injectInUserScope(Object obj)
    {
        getUserObjectGraph().inject(obj);
    }
}
