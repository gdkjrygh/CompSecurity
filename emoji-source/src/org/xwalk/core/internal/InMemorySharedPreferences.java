// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class InMemorySharedPreferences
    implements SharedPreferences
{
    private class InMemoryEditor
        implements android.content.SharedPreferences.Editor
    {

        private volatile boolean mApplyCalled;
        private final Map mChanges;
        private boolean mClearCalled;
        final InMemorySharedPreferences this$0;

        public void apply()
        {
            Map map = mData;
            map;
            JVM INSTR monitorenter ;
            Object obj = mChanges;
            obj;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_42;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            obj;
            map;
            JVM INSTR monitorexit ;
            throw obj;
            Iterator iterator;
            if (mClearCalled)
            {
                mData.clear();
            }
            iterator = mChanges.entrySet().iterator();
_L1:
            String s;
            Object obj1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_161;
            }
            obj1 = (java.util.Map.Entry)iterator.next();
            s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj1 != this)
            {
                break MISSING_BLOCK_LABEL_141;
            }
            mData.remove(s);
              goto _L1
            mData.put(s, obj1);
              goto _L1
            mApplyCalled = true;
            obj;
            JVM INSTR monitorexit ;
            map;
            JVM INSTR monitorexit ;
        }

        public android.content.SharedPreferences.Editor clear()
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
            mClearCalled = true;
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public boolean commit()
        {
            apply();
            return true;
        }

        public android.content.SharedPreferences.Editor putBoolean(String s, boolean flag)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, Boolean.valueOf(flag));
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor putFloat(String s, float f)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, Float.valueOf(f));
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor putInt(String s, int i)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, Integer.valueOf(i));
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor putLong(String s, long l)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_30;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, Long.valueOf(l));
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor putString(String s, String s1)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, s1);
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor putStringSet(String s, Set set)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, set);
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        public android.content.SharedPreferences.Editor remove(String s)
        {
            Map map = mChanges;
            map;
            JVM INSTR monitorenter ;
            if (mApplyCalled)
            {
                throw new IllegalStateException();
            }
            break MISSING_BLOCK_LABEL_27;
            s;
            map;
            JVM INSTR monitorexit ;
            throw s;
            mChanges.put(s, this);
            map;
            JVM INSTR monitorexit ;
            return this;
        }

        private InMemoryEditor()
        {
            this$0 = InMemorySharedPreferences.this;
            super();
            mChanges = new HashMap();
        }

    }


    private final Map mData;

    public InMemorySharedPreferences()
    {
        mData = new HashMap();
    }

    public InMemorySharedPreferences(Map map)
    {
        mData = map;
    }

    public boolean contains(String s)
    {
        boolean flag;
        synchronized (mData)
        {
            flag = mData.containsKey(s);
        }
        return flag;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public android.content.SharedPreferences.Editor edit()
    {
        return new InMemoryEditor();
    }

    public Map getAll()
    {
        Map map1;
        synchronized (mData)
        {
            map1 = Collections.unmodifiableMap(mData);
        }
        return map1;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean getBoolean(String s, boolean flag)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        flag = ((Boolean)mData.get(s)).booleanValue();
        return flag;
        map;
        JVM INSTR monitorexit ;
        return flag;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public float getFloat(String s, float f)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        f = ((Float)mData.get(s)).floatValue();
        return f;
        map;
        JVM INSTR monitorexit ;
        return f;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int getInt(String s, int i)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        i = ((Integer)mData.get(s)).intValue();
        return i;
        map;
        JVM INSTR monitorexit ;
        return i;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public long getLong(String s, long l)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        l = ((Long)mData.get(s)).longValue();
        return l;
        map;
        JVM INSTR monitorexit ;
        return l;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public String getString(String s, String s1)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s = (String)mData.get(s);
        return s;
        map;
        JVM INSTR monitorexit ;
        return s1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Set getStringSet(String s, Set set)
    {
        Map map = mData;
        map;
        JVM INSTR monitorenter ;
        if (!mData.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        s = Collections.unmodifiableSet((Set)mData.get(s));
        return s;
        map;
        JVM INSTR monitorexit ;
        return set;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new UnsupportedOperationException();
    }

    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new UnsupportedOperationException();
    }

}
