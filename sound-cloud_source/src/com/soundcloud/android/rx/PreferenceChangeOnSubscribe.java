// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import android.content.SharedPreferences;
import rx.X;
import rx.h.f;

public class PreferenceChangeOnSubscribe
    implements rx.b.f
{

    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new _cls1();
    private final SharedPreferences sharedPreferences;
    private X subscriber;

    public PreferenceChangeOnSubscribe(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    public volatile void call(Object obj)
    {
        call((X)obj);
    }

    public void call(X x)
    {
        subscriber = x;
        x.add(f.a(new _cls2()));
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }




    private class _cls1
        implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
    {

        final PreferenceChangeOnSubscribe this$0;

        public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            subscriber.onNext(s);
        }

        _cls1()
        {
            this$0 = PreferenceChangeOnSubscribe.this;
            super();
        }
    }


    private class _cls2
        implements a
    {

        final PreferenceChangeOnSubscribe this$0;

        public void call()
        {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }

        _cls2()
        {
            this$0 = PreferenceChangeOnSubscribe.this;
            super();
        }
    }

}
