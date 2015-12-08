// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.util.AndroidUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class GamesSharedPrefs
{

    private static final Pattern ACCOUNT_HASH_CODE_SEPARATOR_PATTERN = Pattern.compile(";");

    public static void addDataStoreName(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        ArrayList arraylist = getDataStoreNames(context);
        if (!arraylist.contains(s))
        {
            arraylist.add(s);
        }
        context = getSharedPrefs(context).edit();
        context.putString("account_hash_code_joined", TextUtils.join(";", arraylist));
        SharedPreferencesCompat.apply(context);
    }

    public static ArrayList getDataStoreNames(Context context)
    {
        context = getSharedPrefs(context).getString("account_hash_code_joined", null);
        if (context == null)
        {
            return new ArrayList();
        } else
        {
            return new ArrayList(Arrays.asList(TextUtils.split(context, ACCOUNT_HASH_CODE_SEPARATOR_PATTERN)));
        }
    }

    public static int getPersistedVersionCode(Context context)
    {
        return getSharedPrefs(context).getInt("gmsCoreVersionCode", -1);
    }

    public static SharedPreferences getSharedPrefs(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
        return context.getSharedPreferences("games.shared_prefs", 0);
    }

    public static void persistVersionCode(Context context, int i)
    {
        context = getSharedPrefs(context).edit();
        context.putInt("gmsCoreVersionCode", i);
        SharedPreferencesCompat.apply(context);
    }

}
