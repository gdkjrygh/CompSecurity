// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;

final class val.titleId
    implements android.preference.angeListener
{

    final ListPreference val$list;
    final int val$titleId;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        obj = val$list.getEntries()[val$list.findIndexOfValue(obj.toString())];
        preference.setTitle((new StringBuilder()).append(val$list.getContext().getString(val$titleId)).append(" (").append(obj).append(")").toString());
        return true;
    }

    er()
    {
        val$list = listpreference;
        val$titleId = i;
        super();
    }
}
