// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.Application;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Vibrator;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.android.app.shortcircuit.PromotedSCDContactsInfo;
import com.skype.android.util.DeviceFeatures;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Provider;

public class UserPreferences
{

    public static final long LOGIN_TIMESTAMP_DEFAULT = 0L;
    private static final String RECENT_COUNTRIES_KEY = "recent_countries";
    private BackupManager backupManager;
    private Context context;
    private SharedPreferences sharedPrefs;
    Vibrator vibrator;

    public UserPreferences(Account account, Application application)
    {
        sharedPrefs = application.getSharedPreferences(account.getSkypenameProp(), 0);
        context = application;
        backupManager = new BackupManager(application);
    }

    public UserPreferences(Provider provider, Application application)
    {
        this((Account)provider.get(), application);
    }

    private boolean getBoolean(int i, boolean flag)
    {
        return sharedPrefs.getBoolean(context.getString(i), flag);
    }

    private Date getDate(int i, long l)
    {
        return new Date(sharedPrefs.getLong(context.getString(i), l));
    }

    private Integer getInt(String s, Integer integer)
    {
        int i;
        if (integer == null)
        {
            i = -1;
        } else
        {
            i = integer.intValue();
        }
        i = sharedPrefs.getInt(s, i);
        if (i == -1 && integer == null)
        {
            return null;
        } else
        {
            return Integer.valueOf(i);
        }
    }

    private long getLong(int i, long l)
    {
        return sharedPrefs.getLong(context.getString(i), l);
    }

    private String getString(int i, String s)
    {
        return sharedPrefs.getString(context.getString(i), s);
    }

    public boolean areNotificationsEnabled()
    {
        return getBoolean(0x7f08053e, true);
    }

    public boolean autoDownloadMojisOnWifiOnly()
    {
        return getBoolean(0x7f080531, false);
    }

    public void clearAccountLogoutReason()
    {
        putInt(0x7f080517, -1);
    }

    public com.skype.Account.LOGOUTREASON getAccountLogoutReason()
    {
        Integer integer = getInt(context.getString(0x7f080517), Integer.valueOf(-1));
        if (integer.intValue() != -1)
        {
            return com.skype.Account.LOGOUTREASON.fromInt(integer.intValue());
        } else
        {
            return null;
        }
    }

    public long getBackgroundedTime()
    {
        return getLong(0x7f080547, 0L);
    }

    public BackupManager getBackupManager()
    {
        return backupManager;
    }

    public long getContactsScrapeLastRun()
    {
        return getLong(0x7f08054c, 0L);
    }

    public long getForegroundedTime()
    {
        return getLong(0x7f080548, 0L);
    }

    public Integer getLastContactFilter()
    {
        return getInt(context.getString(0x7f080535), null);
    }

    public String getLastCustomContactFilter()
    {
        return getString(0x7f080534, "");
    }

    public String getLocallyCachedAutoBuddy()
    {
        return getString(0x7f08052c, "");
    }

    public String getLoginAsDisplayName(Account account)
    {
        return getString(0x7f080559, account.getSkypenameProp());
    }

    public long getLoginTimestamp()
    {
        return getLong(0x7f080537, 0L);
    }

    public int getMnvHttpMaxTimeoutCount()
    {
        return getInt(context.getString(0x7f080543), Integer.valueOf(0)).intValue();
    }

    public Date getMnvLastChecked()
    {
        return getDate(0x7f080540, 0L);
    }

    public int getMnvSkipCount()
    {
        return getInt(context.getString(0x7f080541), Integer.valueOf(0)).intValue();
    }

    public Date getMnvSkippedUntil()
    {
        return getDate(0x7f080542, 0L);
    }

    public long getNotificationSnoozeDurationInMillis()
    {
        return getLong(0x7f08053b, 0L);
    }

    public boolean getPlayMarketRecoverableErrorShowed()
    {
        return getBoolean(0x7f080544, false);
    }

    public PromotedSCDContactsInfo getPromotedSCDContactsInfo()
    {
        PromotedSCDContactsInfo promotedscdcontactsinfo = null;
        String s = getString(0x7f080550, null);
        if (s != null)
        {
            promotedscdcontactsinfo = PromotedSCDContactsInfo.newInstanceFromString(s);
        }
        return promotedscdcontactsinfo;
    }

    public LinkedList getRecentCountryCodes()
    {
        LinkedList linkedlist = new LinkedList();
        String as[] = sharedPrefs.getString("recent_countries", "").split(",");
        for (int i = 0; i < as.length; i++)
        {
            if (!TextUtils.isEmpty(as[i]))
            {
                linkedlist.add(as[i]);
            }
        }

        return linkedlist;
    }

    public boolean getShakeDebugEnabled()
    {
        return getBoolean(0x7f08054b, false);
    }

    public boolean getShowAnimatedEmoticons()
    {
        return getBoolean(0x7f08052a, true);
    }

    public boolean getShowBigEmoticons()
    {
        return getBoolean(0x7f08052b, true);
    }

    public int getSignoutEducationScreenCount()
    {
        return getInt(context.getString(0x7f080555), Integer.valueOf(0)).intValue();
    }

    public int getVideoQualityMode()
    {
        return Integer.parseInt(getString(0x7f080532, "0"));
    }

    public boolean hasPromotedSCDContacts()
    {
        return getString(0x7f080550, null) != null;
    }

    public boolean havePropertiesBeenConverted()
    {
        return getBoolean(0x7f080546, false);
    }

    public boolean isAdTargetingAllowed()
    {
        return getBoolean(0x7f08051c, true);
    }

    public boolean isAutoAnswerEnabled()
    {
        return getBoolean(0x7f08055a, false);
    }

    public boolean isAutoBuddyEnabledInLocalCache()
    {
        return getLocallyCachedAutoBuddy().equals("0");
    }

    public boolean isCallTechInfoEnabled()
    {
        return getBoolean(0x7f080553, false);
    }

    public boolean isEventReported()
    {
        return getBoolean(0x7f08054d, false);
    }

    public boolean isMnvCompleted()
    {
        return getBoolean(0x7f08053f, false);
    }

    public boolean isMojiEnabled()
    {
        return getBoolean(0x7f08052d, true);
    }

    public boolean isNewMessageNotificationEnabled()
    {
        return areNotificationsEnabled() && getBoolean(0x7f080538, true);
    }

    public boolean isNewUser()
    {
        return getBoolean(0x7f08054f, false);
    }

    public boolean isNotificationLightEnabled()
    {
        return areNotificationsEnabled() && DeviceFeatures.a() && getBoolean(0x7f080539, true);
    }

    public boolean isNotificationSoundEnabled()
    {
        return areNotificationsEnabled() && getBoolean(0x7f08053c, true);
    }

    public boolean isShowCallQualityFeedbackEnabled()
    {
        return getBoolean(0x7f080551, false);
    }

    public boolean isSkypeStatusNotificationEnabled()
    {
        if (!DeviceFeatures.d()) goto _L2; else goto _L1
_L1:
        if (!areNotificationsEnabled() || !getBoolean(0x7f080556, true)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!areNotificationsEnabled() || !getBoolean(0x7f080556, false))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isSyncContactsEnabled()
    {
        return getBoolean(0x7f08052e, true);
    }

    public boolean isSyncGroupsInBackgroundEnabled()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (areNotificationsEnabled())
        {
            flag = flag1;
            if (getBoolean(0x7f080558, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean isVibrateEnabled()
    {
        return areNotificationsEnabled() && vibrator.hasVibrator() && getBoolean(0x7f08053d, true);
    }

    public boolean isVideoMonitorEnabled()
    {
        return getBoolean(0x7f08055b, true);
    }

    void putBoolean(int i, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putBoolean(context.getString(i), flag);
        editor.apply();
    }

    void putDate(int i, Date date)
    {
        android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putLong(context.getString(i), date.getTime());
        editor.apply();
    }

    void putInt(int i, int j)
    {
        android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putInt(context.getString(i), j);
        editor.apply();
    }

    void putLong(int i, long l)
    {
        android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putLong(context.getString(i), l);
        editor.apply();
    }

    void putString(int i, String s)
    {
        putString(context.getString(i), s);
    }

    void putString(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
        editor.putString(s, s1);
        editor.apply();
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        sharedPrefs.registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }

    public void saveAccountLogoutReason(Account account)
    {
        account = account.getLogoutReasonProp();
        int i;
        if (account != null)
        {
            i = account.toInt();
        } else
        {
            i = -1;
        }
        putInt(0x7f080517, i);
    }

    public void saveLoginAsDisplayName(Account account)
    {
        String s1 = account.getFullnameProp();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = account.getSigninNameProp();
        }
        putString(0x7f080559, s);
    }

    public boolean saveUserPwdOnLogout()
    {
        return getBoolean(0x7f080545, true);
    }

    public void setBackgroundedTime(long l)
    {
        putLong(0x7f080547, l);
    }

    public void setCallTechInfoEnabled(boolean flag)
    {
        putBoolean(0x7f080553, flag);
    }

    public void setEnableSyncContacts(boolean flag)
    {
        putBoolean(0x7f08052e, flag);
    }

    public void setEventReported(boolean flag)
    {
        putBoolean(0x7f08054d, flag);
    }

    public void setForegroundedTime(long l)
    {
        putLong(0x7f080548, l);
    }

    public void setLastContactFilter(int i)
    {
        putInt(0x7f080535, i);
    }

    public void setLastCustomContactFilter(String s)
    {
        putString(0x7f080534, s);
    }

    public void setLocallyCachedAutoBuddy(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "0";
        } else
        {
            s = "1";
        }
        putString(0x7f08052c, s);
    }

    public void setLoginTimestamp(long l)
    {
        putLong(0x7f080537, l);
    }

    public void setMnvCompleted(boolean flag)
    {
        putBoolean(0x7f08053f, flag);
    }

    public void setMnvHttpMaxTimeoutCount(int i)
    {
        putInt(0x7f080543, i);
    }

    public void setMnvLastChecked(Date date)
    {
        putDate(0x7f080540, date);
    }

    public void setMnvSkipCount(int i)
    {
        putInt(0x7f080541, i);
    }

    public void setMnvSkippedUntil(Date date)
    {
        putDate(0x7f080542, date);
    }

    public void setNewUser()
    {
        putBoolean(0x7f08054f, true);
    }

    public void setNotificationSnoozeDuration(long l)
    {
        putLong(0x7f08053b, l);
    }

    public void setNotificationStatus(boolean flag)
    {
        putBoolean(0x7f08053e, flag);
    }

    public void setPlayMarketRecoverableErrorShowed(boolean flag)
    {
        putBoolean(0x7f080544, flag);
    }

    public void setPromotedSCDContactsInfo(PromotedSCDContactsInfo promotedscdcontactsinfo)
    {
        putString(0x7f080550, promotedscdcontactsinfo.toString());
    }

    public void setRecentCountryCodes(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(String.valueOf(list.get(i)));
            if (i != list.size() - 1)
            {
                stringbuilder.append(",");
            }
        }

        putString("recent_countries", stringbuilder.toString());
    }

    public void setSignoutEducatonScreenCount(int i)
    {
        putInt(0x7f080555, i);
    }

    public void setSkypeStatusNotificationEnabled()
    {
        putBoolean(0x7f080556, true);
    }

    public void setVimFiltersAccessed()
    {
        putBoolean(0x7f08055d, true);
    }

    public void setVimPromotionHasBeenShown()
    {
        putBoolean(0x7f08055e, true);
    }

    public void updateContactsScrapeLastRun(long l)
    {
        putLong(0x7f08054c, l);
    }

    public boolean vimFiltersAccessed()
    {
        return getBoolean(0x7f08055d, false);
    }

    public boolean vimPromotionHasBeenShown()
    {
        return getBoolean(0x7f08055e, false);
    }
}
