// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.preference.ListPreference;
import android.text.TextUtils;

public final class SharedPreferencesUtils
{

    private SharedPreferencesUtils()
    {
    }

    public static void listWithLabel(final ListPreference list, final int titleId)
    {
        list.setOnPreferenceChangeListener(new _cls1());
        CharSequence charsequence = list.getEntry();
        if (!TextUtils.isEmpty(charsequence))
        {
            list.setTitle((new StringBuilder()).append(list.getContext().getString(titleId)).append(" (").append(charsequence).append(")").toString());
        }
    }

    private class _cls1
        implements android.preference.Preference.OnPreferenceChangeListener
    {

        final ListPreference val$list;
        final int val$titleId;

        public final boolean onPreferenceChange(Preference preference, Object obj)
        {
            obj = list.getEntries()[list.findIndexOfValue(obj.toString())];
            preference.setTitle((new StringBuilder()).append(list.getContext().getString(titleId)).append(" (").append(obj).append(")").toString());
            return true;
        }

        _cls1()
        {
            list = listpreference;
            titleId = i;
            super();
        }
    }

}
