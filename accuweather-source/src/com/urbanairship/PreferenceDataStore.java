// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.urbanairship:
//            UrbanAirshipResolver, Logger, UrbanAirshipProvider

public final class PreferenceDataStore
{
    private class Preference
    {

        private final String key;
        final PreferenceDataStore this$0;
        private String value;

        private void registerObserver()
        {
            ContentObserver contentobserver = new ContentObserver(null) {

                final Preference this$1;

                public void onChange(boolean flag)
                {
                    super.onChange(flag);
                    Logger.verbose((new StringBuilder()).append("Preference updated:").append(key).toString());
                    executor.execute(new Runnable() {

                        final Preference._cls2 this$2;

                        public void run()
                        {
                            syncValue();
                        }

            
            {
                this$2 = Preference._cls2.this;
                super();
            }
                    });
                }

            
            {
                this$1 = Preference.this;
                super(handler);
            }
            };
            Uri uri = Uri.withAppendedPath(UrbanAirshipProvider.getPreferencesContentUri(), key);
            resolver.registerContentObserver(uri, true, contentobserver);
        }

        private void setValue(String s)
        {
            this;
            JVM INSTR monitorenter ;
            if (!UAStringUtil.equals(s, value))
            {
                break MISSING_BLOCK_LABEL_16;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            value = s;
            this;
            JVM INSTR monitorexit ;
            onPreferenceChanged(key);
            return;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        private boolean writeValue(String s)
        {
            boolean flag1 = true;
            boolean flag = true;
            this;
            JVM INSTR monitorenter ;
            if (s != null)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            Logger.verbose((new StringBuilder()).append("Removing preference: ").append(key).toString());
            ContentValues contentvalues;
            if (resolver.delete(UrbanAirshipProvider.getPreferencesContentUri(), "_id = ?", new String[] {
        key
    }) < 0)
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Logger.verbose((new StringBuilder()).append("Saving preference: ").append(key).append(" value: ").append(s).toString());
            contentvalues = new ContentValues();
            contentvalues.put("_id", key);
            contentvalues.put("value", s);
            if (resolver.insert(UrbanAirshipProvider.getPreferencesContentUri(), contentvalues) != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        String get()
        {
            this;
            JVM INSTR monitorenter ;
            String s = value;
            this;
            JVM INSTR monitorexit ;
            return s;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        void put(String s)
        {
            setValue(s);
            executor.execute(s. new Runnable() {

                final Preference this$1;
                final String val$value;

                public void run()
                {
                    writeValue(value);
                }

            
            {
                this$1 = final_preference;
                value = String.this;
                super();
            }
            });
        }

        boolean putSync(String s)
        {
            this;
            JVM INSTR monitorenter ;
            if (!writeValue(s))
            {
                break MISSING_BLOCK_LABEL_19;
            }
            setValue(s);
            return true;
            this;
            JVM INSTR monitorexit ;
            return false;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        void syncValue()
        {
            Object obj = null;
            Object obj1 = null;
            this;
            JVM INSTR monitorenter ;
            obj = obj1;
            Object obj2 = resolver;
            obj = obj1;
            Uri uri = UrbanAirshipProvider.getPreferencesContentUri();
            obj = obj1;
            String s = key;
            obj = obj1;
            obj1 = ((UrbanAirshipResolver) (obj2)).query(uri, new String[] {
                "value"
            }, "_id = ?", new String[] {
                s
            }, null);
            obj = obj1;
            this;
            JVM INSTR monitorexit ;
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            obj = obj1;
            if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L3
_L3:
            obj = obj1;
            obj2 = ((Cursor) (obj1)).getString(0);
_L5:
            obj = obj1;
            setValue(((String) (obj2)));
_L6:
            if (obj1 != null)
            {
                ((Cursor) (obj1)).close();
            }
            return;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            throw obj1;
_L4:
            obj2 = null;
              goto _L5
_L2:
            obj = obj1;
            Logger.warn((new StringBuilder()).append("Unable to get preference ").append(key).append(" from").append(" database. Falling back to cached value.").toString());
              goto _L6
        }



        Preference(String s, String s1)
        {
            this$0 = PreferenceDataStore.this;
            super();
            key = s;
            value = s1;
            registerObserver();
        }
    }

    public static interface PreferenceChangeListener
    {

        public abstract void onPreferenceChange(String s);
    }


    private static final int MODE_MULTI_PROCESS = 4;
    private static final String WHERE_CLAUSE_KEY = "_id = ?";
    Executor executor;
    private final List listeners;
    private final Map preferences;
    private UrbanAirshipResolver resolver;

    PreferenceDataStore(Context context)
    {
        this(new UrbanAirshipResolver(context));
    }

    PreferenceDataStore(UrbanAirshipResolver urbanairshipresolver)
    {
        executor = Executors.newSingleThreadExecutor();
        preferences = new HashMap();
        listeners = new ArrayList();
        resolver = urbanairshipresolver;
    }

    private Preference getPreference(String s)
    {
        Map map = preferences;
        map;
        JVM INSTR monitorenter ;
        if (!preferences.containsKey(s)) goto _L2; else goto _L1
_L1:
        s = (Preference)preferences.get(s);
_L4:
        return s;
_L2:
        Preference preference;
        preference = new Preference(s, null);
        preferences.put(s, preference);
        s = preference;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void migratePreferencesFromFileToDb(Context context, String s)
    {
        Logger.verbose((new StringBuilder()).append("Migrating ").append(s).toString());
        context = context.getSharedPreferences(s, 4);
        Map map = context.getAll();
        Logger.verbose((new StringBuilder()).append("Found ").append(map.size()).append(" preferences to migrate.").toString());
        if (map.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Logger.verbose((new StringBuilder()).append("Adding ").append((String)entry.getKey()).append(":").append(entry.getValue()).append(" to the insert.").toString());
            synchronized (preferences)
            {
                Preference preference = new Preference((String)entry.getKey(), String.valueOf(entry.getValue()));
                preferences.put(entry.getKey(), preference);
            }
        }

        break MISSING_BLOCK_LABEL_229;
        context;
        map1;
        JVM INSTR monitorexit ;
        throw context;
        Logger.verbose((new StringBuilder()).append("Migration finished, deleting ").append(s).toString());
        context.edit().clear().commit();
    }

    private void onPreferenceChanged(String s)
    {
        List list = listeners;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PreferenceChangeListener)iterator.next()).onPreferenceChange(s)) { }
        break MISSING_BLOCK_LABEL_49;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
        list;
        JVM INSTR monitorexit ;
    }

    public void addListener(PreferenceChangeListener preferencechangelistener)
    {
        if (preferencechangelistener != null)
        {
            synchronized (listeners)
            {
                listeners.add(preferencechangelistener);
            }
            return;
        } else
        {
            return;
        }
        preferencechangelistener;
        list;
        JVM INSTR monitorexit ;
        throw preferencechangelistener;
    }

    public boolean getBoolean(String s, boolean flag)
    {
        s = getPreference(s).get();
        if (s == null)
        {
            return flag;
        } else
        {
            return Boolean.valueOf(s).booleanValue();
        }
    }

    public float getFloat(String s, float f)
    {
        s = getPreference(s).get();
        if (s == null)
        {
            return f;
        }
        float f1;
        try
        {
            f1 = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return f;
        }
        return f1;
    }

    public int getInt(String s, int i)
    {
        s = getPreference(s).get();
        if (s == null)
        {
            return i;
        }
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public long getLong(String s, long l)
    {
        s = getPreference(s).get();
        if (s == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public String getString(String s, String s1)
    {
        s = getPreference(s).get();
        if (s == null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    void loadAll()
    {
        Cursor cursor = resolver.query(UrbanAirshipProvider.getPreferencesContentUri(), null, null, null, null);
        if (cursor == null)
        {
            return;
        }
        int i = cursor.getColumnIndex("_id");
        int j = cursor.getColumnIndex("value");
        String s;
        String s1;
        for (; cursor.moveToNext(); preferences.put(s, new Preference(s, s1)))
        {
            s = cursor.getString(i);
            s1 = cursor.getString(j);
        }

        cursor.close();
    }

    void migrateSharedPreferences(Context context)
    {
        migratePreferencesFromFileToDb(context, "com.urbanairship.user");
        migratePreferencesFromFileToDb(context, "com.urbanairship.push");
    }

    public void put(String s, Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        getPreference(s).put(((String) (obj)));
    }

    public boolean putSync(String s, Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = String.valueOf(obj);
        }
        return getPreference(s).putSync(((String) (obj)));
    }

    public void remove(String s)
    {
        put(s, null);
    }

    public void removeListener(PreferenceChangeListener preferencechangelistener)
    {
        synchronized (listeners)
        {
            listeners.remove(preferencechangelistener);
        }
        return;
        preferencechangelistener;
        list;
        JVM INSTR monitorexit ;
        throw preferencechangelistener;
    }

    public boolean removeSync(String s)
    {
        return putSync(s, null);
    }


}
