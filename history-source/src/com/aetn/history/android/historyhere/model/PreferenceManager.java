// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

public class PreferenceManager
{
    public static interface OnFavoritesChangedListener
    {

        public abstract void onFavoritesChanged();
    }


    public static final String PREF_FAVORITES = "favorites";
    public static final String PREF_FULL_DB_REFRESH_DATE = "db_refresh_date";
    private static final String PREF_HAS_HAD_FIRST_RUN = "has_had_first_run";
    private static final String PREF_HAS_SHOWN_TOUR_INTRO = "has_shown_tour_intro";
    public static final String PREF_LIMITED_DB_UPDATE_DATE = "db_limited_update_date";
    public static final String PREF_RATE_REMINDER_COUNT = "rate_reminder_count";
    public static final String PREF_RATE_REMINDER_DATE = "remind_me_update_date";
    public static final String PREF_SHOW_RATE_REMINDER = "show_rate_reminder";
    private static final String PREF_UPDATE_REMINDER_LATER_COUNT = "update_remind_later_count";
    private static final String PREF_UPDATE_REMINDER_TF = "update_tf";
    private static final String TAG = com/aetn/history/android/historyhere/model/PreferenceManager.getName();
    private static ArrayList mFavoritesChangedListeners;

    public PreferenceManager()
    {
    }

    public static void addFavorite(Context context, String s)
    {
        Object obj = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        context = ((SharedPreferences) (obj)).edit();
        obj = ((SharedPreferences) (obj)).getString("favorites", "");
        s = (new StringBuilder()).append(((String) (obj))).append(s).append(",").toString();
        context.putString("favorites", s);
        Utils.logger(TAG, (new StringBuilder()).append("addFavorite: the favs are: ").append(s).toString());
        context.commit();
        notifyFavoritesChanged();
    }

    public static String[] getFavorites(Context context)
    {
        String as[] = null;
        String s;
        int i;
        int j;
        try
        {
            context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("favorites", "").split(",");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            break; /* Loop/switch isn't completed */
        }
        as = context;
        j = context.length;
        i = 0;
_L2:
        as = context;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = context[i];
        as = context;
        Utils.logger(TAG, (new StringBuilder()).append("getFavorites(): ").append(s).toString());
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return as;
    }

    public static String getFavoritesString(Context context)
    {
        String s = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("favorites", "");
        context = s;
        if (!s.isEmpty())
        {
            context = (new StringBuilder()).append(",").append(s).toString();
        }
        return context;
    }

    public static String getFullDatabaseRefreshDate(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("db_refresh_date", "");
    }

    public static String getLimitedDatabaseUpdateDate(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("db_limited_update_date", "");
    }

    public static int getRateReminderCount(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt("rate_reminder_count", 1);
    }

    public static String getRateReminderDate(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("remind_me_update_date", Utils.getTodaysDateString());
    }

    public static boolean getShouldShowRateReminder(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("show_rate_reminder", true);
    }

    public static int getUpdateReminderCount(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt("update_remind_later_count", 0);
    }

    public static boolean getUpdateReminderTF(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("update_tf", true);
    }

    public static boolean hasFavorites(Context context)
    {
        return context != null && !android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("favorites", "").isEmpty();
    }

    public static boolean hasHadFirstRun(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_had_first_run", false);
    }

    public static boolean hasShownTourIntro(Context context)
    {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean("has_shown_tour_intro", false);
    }

    public static void incrementUpdateReminderCount(Context context)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        int i = context.getInt("update_remind_later_count", 0);
        Utils.logger(TAG, (new StringBuilder()).append("count starts at:").append(i).toString());
        i++;
        Utils.logger(TAG, (new StringBuilder()).append("count now at:").append(i).toString());
        context = context.edit();
        context.putInt("update_remind_later_count", i);
        context.commit();
    }

    public static boolean isFavorite(Context context, String s)
    {
        boolean flag1 = false;
        context = getFavorites(context);
        Utils.logger(TAG, (new StringBuilder()).append("isFavorite: f:").append(context).toString());
        String s1;
        int i;
        int j;
        boolean flag;
        try
        {
            j = context.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        i = 0;
        flag = flag1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s1 = context[i];
        Utils.logger(TAG, (new StringBuilder()).append("getFavorites(): ").append(s1).toString());
        flag = s1.equalsIgnoreCase(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        flag = true;
        return flag;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_39;
    }

    private static void notifyFavoritesChanged()
    {
        if (mFavoritesChangedListeners != null)
        {
            for (Iterator iterator = mFavoritesChangedListeners.iterator(); iterator.hasNext(); ((OnFavoritesChangedListener)iterator.next()).onFavoritesChanged()) { }
        }
    }

    public static void removeFavorite(Context context, String s)
    {
        Utils.logger(TAG, (new StringBuilder()).append("removeFavorite: id:").append(s).toString());
        SharedPreferences sharedpreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        context = sharedpreferences.edit();
        s = sharedpreferences.getString("favorites", "").replace((new StringBuilder()).append(s).append(",").toString(), "");
        context.putString("favorites", s);
        context.commit();
        Utils.logger(TAG, (new StringBuilder()).append("removeFavorite: favoritesString:").append(s).toString());
        notifyFavoritesChanged();
    }

    public static void removePreferencesChangedListener(OnFavoritesChangedListener onfavoriteschangedlistener)
    {
        if (mFavoritesChangedListeners != null)
        {
            int i = 0;
            while (i < mFavoritesChangedListeners.size()) 
            {
                if ((OnFavoritesChangedListener)mFavoritesChangedListeners.get(i) == onfavoriteschangedlistener)
                {
                    Utils.logger(TAG, "removed listener");
                    mFavoritesChangedListeners.remove(i);
                } else
                {
                    Utils.logger(TAG, "didnt find listener");
                }
                i++;
            }
        }
    }

    public static void setFirstRun(Context context)
    {
        android.content.SharedPreferences.Editor editor = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putBoolean("has_had_first_run", true);
        setRateReminderDate(context, Utils.getTodaysDateString());
        editor.commit();
    }

    public static void setFullDatabaseRefreshDate(Context context, String s)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("db_refresh_date", s);
        context.commit();
    }

    public static void setHasShownTourIntro(Context context)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putBoolean("has_shown_tour_intro", true);
        context.commit();
    }

    public static void setLimitedDatabaseUpdateDate(Context context, String s)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("db_limited_update_date", s);
        context.commit();
    }

    public static void setPreferencesChangedListener(OnFavoritesChangedListener onfavoriteschangedlistener)
    {
        if (mFavoritesChangedListeners == null)
        {
            mFavoritesChangedListeners = new ArrayList();
        }
        mFavoritesChangedListeners.add(onfavoriteschangedlistener);
    }

    public static void setRateReminderCount(Context context, int i)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putInt("rate_reminder_count", i);
        context.commit();
    }

    public static void setRateReminderDate(Context context, String s)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("remind_me_update_date", s);
        context.commit();
    }

    public static void setShouldShowRateReminder(Context context, boolean flag)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putBoolean("show_rate_reminder", flag);
        context.commit();
    }

    public static void setUpdateReminderCount(Context context, int i)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putInt("update_remind_later_count", i);
        context.commit();
    }

    public static void setUpdateReminderTF(Context context, boolean flag)
    {
        context = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putBoolean("update_tf", flag);
        context.commit();
    }

}
