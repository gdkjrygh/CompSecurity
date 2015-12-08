// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration.features;

import android.content.SharedPreferences;
import com.soundcloud.android.rx.PreferenceChangeOnSubscribe;
import com.soundcloud.java.collections.Lists;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration.features:
//            Feature

public class FeatureStorage
{

    private static final String ENABLED_POSTFIX = "_enabled";
    private static final String PLANS_POSTFIX = "_plans";
    private final SharedPreferences sharedPreferences;
    private final f toValue = new _cls1();

    public FeatureStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    private f isFeature(final String name)
    {
        return new _cls2();
    }

    private void updateEnabled(String s, boolean flag)
    {
        sharedPreferences.edit().putBoolean((new StringBuilder()).append(s).append("_enabled").toString(), flag).apply();
    }

    private void updatePlans(String s, List list)
    {
        sharedPreferences.edit().putStringSet((new StringBuilder()).append(s).append("_plans").toString(), new HashSet(list)).apply();
    }

    public void clear()
    {
        sharedPreferences.edit().clear().apply();
    }

    public List getPlans(String s)
    {
        return Lists.newArrayList(sharedPreferences.getStringSet((new StringBuilder()).append(s).append("_plans").toString(), Collections.emptySet()));
    }

    public b getUpdates(String s)
    {
        return b.create(new PreferenceChangeOnSubscribe(sharedPreferences)).filter(isFeature(s)).map(toValue);
    }

    public boolean isEnabled(String s, boolean flag)
    {
        return sharedPreferences.getBoolean((new StringBuilder()).append(s).append("_enabled").toString(), flag);
    }

    public void update(Feature feature)
    {
        updateEnabled(feature.name, feature.enabled);
        updatePlans(feature.name, feature.plans);
    }

    public void update(List list)
    {
        for (list = list.iterator(); list.hasNext(); update((Feature)list.next())) { }
    }


    private class _cls1
        implements f
    {

        final FeatureStorage this$0;

        public Boolean call(String s)
        {
            return Boolean.valueOf(sharedPreferences.getBoolean(s, false));
        }

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        _cls1()
        {
            this$0 = FeatureStorage.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final FeatureStorage this$0;
        final String val$name;

        public Boolean call(String s)
        {
            return Boolean.valueOf(s.equals((new StringBuilder()).append(name).append("_enabled").toString()));
        }

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        _cls2()
        {
            this$0 = FeatureStorage.this;
            name = s;
            super();
        }
    }

}
