// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import android.content.SharedPreferences;
import com.soundcloud.android.rx.PreferenceChangeOnSubscribe;
import com.soundcloud.java.collections.Lists;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import rx.b;

public class PlanStorage
{

    private static final String PLAN = "plan";
    private static final String UPSELLS = "upsells";
    private final SharedPreferences sharedPreferences;

    public PlanStorage(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public void clear()
    {
        sharedPreferences.edit().clear().apply();
    }

    public String getPlan()
    {
        return sharedPreferences.getString("plan", "none");
    }

    public b getUpsellUpdates()
    {
        return b.create(new PreferenceChangeOnSubscribe(sharedPreferences)).filter(new _cls2()).map(new _cls1());
    }

    public List getUpsells()
    {
        return Lists.newArrayList(sharedPreferences.getStringSet("upsells", Collections.emptySet()));
    }

    public void updatePlan(String s)
    {
        sharedPreferences.edit().putString("plan", s).apply();
    }

    public void updateUpsells(List list)
    {
        sharedPreferences.edit().putStringSet("upsells", new HashSet(list)).apply();
    }

    private class _cls2
        implements f
    {

        final PlanStorage this$0;

        public Boolean call(String s)
        {
            return Boolean.valueOf(s.equals("upsells"));
        }

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        _cls2()
        {
            this$0 = PlanStorage.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final PlanStorage this$0;

        public volatile Object call(Object obj)
        {
            return call((String)obj);
        }

        public List call(String s)
        {
            return getUpsells();
        }

        _cls1()
        {
            this$0 = PlanStorage.this;
            super();
        }
    }

}
