// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import LB;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lL;

public final class SharedPreferenceGroup extends Enum
{

    private static final SharedPreferenceGroup $VALUES[];
    public static final SharedPreferenceGroup DEFAULT_GROUP;
    public static final SharedPreferenceGroup IDENTITY_GROUP;
    public static final int LAST_UPDATED_DATABASE_VERSION = 223;
    private static final String TAG = "SharedPreferenceGroup";
    private SharedPreferences mSharedPreferences;

    private SharedPreferenceGroup(String s, int i)
    {
        super(s, i);
    }

    private android.content.SharedPreferences.Editor a()
    {
        return getSharedPreferences().edit();
    }

    private void a(SharedPreferenceGroup sharedpreferencegroup)
    {
        android.content.SharedPreferences.Editor editor;
        Object obj;
        android.content.SharedPreferences.Editor editor1;
        Iterator iterator;
        if (this == sharedpreferencegroup || sharedpreferencegroup == null)
        {
            return;
        }
        obj = getSharedPreferences();
        editor = ((SharedPreferences) (obj)).edit();
        obj = ((SharedPreferences) (obj)).getAll();
        Timber.c("SharedPreferenceGroup", (new StringBuilder("Migrate shared prefs from ")).append(this).append(" to ").append(sharedpreferencegroup).toString(), new Object[0]);
        editor1 = sharedpreferencegroup.getSharedPreferences().edit();
        iterator = sharedpreferencegroup.getKeys().iterator();
_L10:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        SharedPreferenceKey sharedpreferencekey = (SharedPreferenceKey)iterator.next();
        s = sharedpreferencekey.getKey();
        Timber.c("SharedPreferenceGroup", (new StringBuilder(" > [targetSharedPreferenceKey ")).append(sharedpreferencekey).append("] [sourceValueMap.containsKey(key) ").append(((Map) (obj)).containsKey(s)).append("]").toString(), new Object[0]);
        if (!((Map) (obj)).containsKey(s)) goto _L4; else goto _L3
_L3:
        Object obj1 = ((Map) (obj)).get(s);
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        Timber.c("SharedPreferenceGroup", (new StringBuilder(" >> Move [key ")).append(s).append("] [value ").append(obj1).append("] from ").append(this).append(" to ").append(sharedpreferencegroup).toString(), new Object[0]);
        if (!(obj1 instanceof String)) goto _L8; else goto _L7
_L7:
        editor1.putString(s, (String)obj1);
_L6:
        editor.remove(s);
_L4:
        editor1.apply();
        continue; /* Loop/switch isn't completed */
_L8:
        if (obj1 instanceof Integer)
        {
            editor1.putInt(s, ((Integer)obj1).intValue());
        } else
        if (obj1 instanceof Long)
        {
            editor1.putLong(s, ((Long)obj1).longValue());
        } else
        if (obj1 instanceof Boolean)
        {
            editor1.putBoolean(s, ((Boolean)obj1).booleanValue());
        } else
        if (obj1 instanceof Float)
        {
            editor1.putFloat(s, ((Float)obj1).floatValue());
        } else
        if (obj1 instanceof Set)
        {
            editor1.putStringSet(s, (Set)obj1);
        }
        if (true) goto _L6; else goto _L2
_L2:
        editor.apply();
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static void clearAll()
    {
        SharedPreferenceGroup asharedpreferencegroup[] = values();
        int j = asharedpreferencegroup.length;
        for (int i = 0; i < j; i++)
        {
            asharedpreferencegroup[i].a().clear().apply();
        }

    }

    public static void migrateAcrossGroups()
    {
        Timber.c("SharedPreferenceGroup", "migrateAcrossGroups", new Object[0]);
        LB lb = new LB();
        SharedPreferenceGroup asharedpreferencegroup[] = values();
        int i = 0;
        while (i < asharedpreferencegroup.length) 
        {
            SharedPreferenceGroup sharedpreferencegroup = asharedpreferencegroup[i];
            if (sharedpreferencegroup == null)
            {
                lb.a(new lL(i));
                Timber.e("SharedPreferenceGroup", (new StringBuilder("migrateAcrossGroups() - SharedPreferenceGroup.values() contains null at the index of  ")).append(i).toString(), new Object[0]);
            } else
            {
                int j = 0;
                while (j < asharedpreferencegroup.length) 
                {
                    if (i != j)
                    {
                        SharedPreferenceGroup sharedpreferencegroup1 = asharedpreferencegroup[j];
                        if (sharedpreferencegroup1 == null)
                        {
                            lb.a(new lL(j));
                            Timber.e("SharedPreferenceGroup", (new StringBuilder("migrateAcrossGroups() - SharedPreferenceGroup.values() contains null at the index of  ")).append(j).toString(), new Object[0]);
                        } else
                        {
                            sharedpreferencegroup.a(sharedpreferencegroup1);
                        }
                    }
                    j++;
                }
            }
            i++;
        }
    }

    public static void purgeAll()
    {
        SharedPreferenceGroup asharedpreferencegroup[] = values();
        int j = asharedpreferencegroup.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = asharedpreferencegroup[i];
            Timber.a("SharedPreferenceGroup", (new StringBuilder("purge() ")).append(obj).toString(), new Object[0]);
            android.content.SharedPreferences.Editor editor = ((SharedPreferenceGroup) (obj)).a();
            obj = ((SharedPreferenceGroup) (obj)).getKeys().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                SharedPreferenceKey sharedpreferencekey = (SharedPreferenceKey)((Iterator) (obj)).next();
                if (!sharedpreferencekey.shouldPersistOnLogout())
                {
                    Timber.a("SharedPreferenceGroup", (new StringBuilder("> remove key: ")).append(sharedpreferencekey).toString(), new Object[0]);
                    editor.remove(sharedpreferencekey.getKey());
                }
            } while (true);
            editor.apply();
        }

    }

    public static SharedPreferenceGroup valueOf(String s)
    {
        return (SharedPreferenceGroup)Enum.valueOf(com/snapchat/android/model/SharedPreferenceGroup, s);
    }

    public static SharedPreferenceGroup[] values()
    {
        return (SharedPreferenceGroup[])$VALUES.clone();
    }

    public final Set getKeys()
    {
        Set set1 = (Set)SharedPreferenceKey.GROUP_TO_KEYS.get(this);
        Set set = set1;
        if (set1 == null)
        {
            set = Collections.EMPTY_SET;
        }
        return set;
    }

    public final SharedPreferences getSharedPreferences()
    {
        if (mSharedPreferences == null)
        {
            if (this == DEFAULT_GROUP)
            {
                mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(SnapchatApplication.get());
            } else
            {
                mSharedPreferences = SnapchatApplication.get().getSharedPreferences(name(), 0);
            }
        }
        return mSharedPreferences;
    }

    static 
    {
        DEFAULT_GROUP = new SharedPreferenceGroup("DEFAULT_GROUP", 0);
        IDENTITY_GROUP = new SharedPreferenceGroup("IDENTITY_GROUP", 1);
        $VALUES = (new SharedPreferenceGroup[] {
            DEFAULT_GROUP, IDENTITY_GROUP
        });
    }
}
