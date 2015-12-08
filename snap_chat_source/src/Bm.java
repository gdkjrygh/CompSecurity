// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class Bm
{

    public static final String EMPTY_MAP = "{}";
    private static final String SET_STUDY_SETTINGS_EVENT = "SET_STUDY_SETTINGS";
    private static final String SET_STUDY_SETTINGS_FROM_DISK_EVENT = "SET_STUDY_SETTINGS_FROM_DISK";
    private static final String STUDY_SETTINGS_KEY = "study_settings";
    private static final String TAG = "StudySettings";
    private static final Bm sInstance = new Bm();
    private final BlizzardEventLogger mBlizzardEventLogger = BlizzardEventLogger.a();
    private final Map mStudySettingsBoolean = new HashMap();
    private final Map mStudySettingsFloat = new HashMap();
    private final Map mStudySettingsInteger = new HashMap();
    private final Map mStudySettingsLong = new HashMap();
    public Map mStudySettingsString;

    protected Bm()
    {
    }

    public static Bm a()
    {
        return sInstance;
    }

    private void a(String s)
    {
        if (mStudySettingsString == null)
        {
            java.lang.reflect.Type type = (new TypeToken() {

            }).getType();
            mStudySettingsString = (Map)It.a().fromJson(s, type);
            Timber.b("StudySettings", (new StringBuilder("Applied study settings: ")).append(mStudySettingsString).toString(), new Object[0]);
            if (mStudySettingsString.size() > 0)
            {
                b("SET_STUDY_SETTINGS_FROM_DISK");
            }
        }
    }

    private void b(String s)
    {
        s = new EasyMetric(s);
        a(Bt.aR());
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = mStudySettingsString.entrySet().iterator(); iterator.hasNext(); hashmap.put((String)entry.getKey(), (String)((Map)entry.getValue()).get("experimentId")))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        s.a("study_settings", hashmap).a(false);
    }

    public final float a(String s, String s1, float f)
    {
        Map map1;
        synchronized (mStudySettingsFloat)
        {
            if (!mStudySettingsFloat.containsKey(s))
            {
                mStudySettingsFloat.put(s, new ConcurrentHashMap());
            }
            map1 = (Map)mStudySettingsFloat.get(s);
        }
        if (!map1.containsKey(s1))
        {
            s = Float.valueOf(a(s, s1, Float.toString(f)));
            map1.put(s1, s);
        } else
        {
            s = (Float)map1.get(s1);
        }
        return s.floatValue();
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final int a(String s, String s1, int i)
    {
        Map map1;
        synchronized (mStudySettingsInteger)
        {
            if (!mStudySettingsInteger.containsKey(s))
            {
                mStudySettingsInteger.put(s, new ConcurrentHashMap());
            }
            map1 = (Map)mStudySettingsInteger.get(s);
        }
        if (!map1.containsKey(s1))
        {
            i = Integer.valueOf(a(s, s1, Integer.toString(i))).intValue();
            map1.put(s1, Integer.valueOf(i));
            return i;
        } else
        {
            return ((Integer)map1.get(s1)).intValue();
        }
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final long a(String s, String s1)
    {
        Map map1;
        synchronized (mStudySettingsLong)
        {
            if (!mStudySettingsLong.containsKey(s))
            {
                mStudySettingsLong.put(s, new ConcurrentHashMap());
            }
            map1 = (Map)mStudySettingsLong.get(s);
        }
        if (!map1.containsKey(s1))
        {
            long l = Long.valueOf(a(s, s1, Long.toString(0L))).longValue();
            map1.put(s1, Long.valueOf(l));
            return l;
        } else
        {
            return ((Long)map1.get(s1)).longValue();
        }
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String a(String s, String s1, String s2)
    {
        return a(s, s1, s2, Bt.aR());
    }

    public final String a(String s, String s1, String s2, String s3)
    {
        a(s3);
        if (mStudySettingsString.containsKey(s) && ((Map)mStudySettingsString.get(s)).containsKey(s1))
        {
            return (String)((Map)mStudySettingsString.get(s)).get(s1);
        } else
        {
            return s2;
        }
    }

    public final String a(Map map)
    {
        Object obj = "{}";
        if (map != null)
        {
            obj = new HashMap();
            java.lang.reflect.Type type = (new TypeToken() {

                final Bm this$0;

            
            {
                this$0 = Bm.this;
                super();
            }
            }).getType();
            String s;
            Object obj1;
            for (map = map.entrySet().iterator(); map.hasNext(); ((Map) (obj)).put(s, (Map)It.a().fromJson(((String) (obj1)), type)))
            {
                obj1 = (java.util.Map.Entry)map.next();
                s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
            }

            mStudySettingsString = ((Map) (obj));
            synchronized (mStudySettingsFloat)
            {
                mStudySettingsFloat.clear();
            }
            synchronized (mStudySettingsLong)
            {
                mStudySettingsLong.clear();
            }
            synchronized (mStudySettingsBoolean)
            {
                mStudySettingsBoolean.clear();
            }
            synchronized (mStudySettingsInteger)
            {
                mStudySettingsInteger.clear();
            }
            obj = It.a().toJson(obj);
            b("SET_STUDY_SETTINGS");
        }
        return ((String) (obj));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        map;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        map;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        map;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    public final boolean a(String s, String s1, boolean flag)
    {
        Map map1;
        synchronized (mStudySettingsBoolean)
        {
            if (!mStudySettingsBoolean.containsKey(s))
            {
                mStudySettingsBoolean.put(s, new ConcurrentHashMap());
            }
            map1 = (Map)mStudySettingsBoolean.get(s);
        }
        if (!map1.containsKey(s1))
        {
            s = Boolean.valueOf(a(s, s1, Boolean.toString(flag)));
            map1.put(s1, s);
        } else
        {
            s = (Boolean)map1.get(s1);
        }
        return s.booleanValue();
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void b(String s, String s1)
    {
        ho ho1 = new ho();
        ho1.studyName = s;
        ho1.experimentId = s1;
        mBlizzardEventLogger.a(ho1);
    }

}
