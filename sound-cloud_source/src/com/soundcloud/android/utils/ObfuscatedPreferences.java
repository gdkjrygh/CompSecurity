// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.SharedPreferences;
import com.soundcloud.android.crypto.Obfuscator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class ObfuscatedPreferences
    implements SharedPreferences
{
    public class ObfuscatedEditor
        implements android.content.SharedPreferences.Editor
    {

        final ObfuscatedPreferences this$0;
        private final android.content.SharedPreferences.Editor wrappedEditor;

        public void apply()
        {
            wrappedEditor.apply();
        }

        public android.content.SharedPreferences.Editor clear()
        {
            return wrappedEditor.clear();
        }

        public boolean commit()
        {
            return wrappedEditor.commit();
        }

        public android.content.SharedPreferences.Editor putBoolean(String s, boolean flag)
        {
            wrappedEditor.putString(obfuscator.obfuscate(s), obfuscator.obfuscate(flag));
            return this;
        }

        public android.content.SharedPreferences.Editor putFloat(String s, float f)
        {
            throw notImplemented();
        }

        public android.content.SharedPreferences.Editor putInt(String s, int i)
        {
            throw notImplemented();
        }

        public android.content.SharedPreferences.Editor putLong(String s, long l)
        {
            throw notImplemented();
        }

        public android.content.SharedPreferences.Editor putString(String s, String s1)
        {
            wrappedEditor.putString(obfuscator.obfuscate(s), obfuscator.obfuscate(s1));
            return this;
        }

        public android.content.SharedPreferences.Editor putStringSet(String s, Set set)
        {
            HashSet hashset = new HashSet();
            String s1;
            for (set = set.iterator(); set.hasNext(); hashset.add(obfuscator.obfuscate(s1)))
            {
                s1 = (String)set.next();
            }

            wrappedEditor.putStringSet(obfuscator.obfuscate(s), hashset);
            return this;
        }

        public android.content.SharedPreferences.Editor remove(String s)
        {
            return wrappedEditor.remove(obfuscator.obfuscate(s));
        }

        public ObfuscatedEditor()
        {
            this$0 = ObfuscatedPreferences.this;
            super();
            wrappedEditor = wrappedPrefs.edit();
        }
    }

    public class ObfuscatedOnSharedPreferenceChangeListener
        implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
    {

        final ObfuscatedPreferences this$0;
        private final android.content.SharedPreferences.OnSharedPreferenceChangeListener wrappedListener;

        public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            wrappedListener.onSharedPreferenceChanged(ObfuscatedPreferences.this, obfuscator.deobfuscateString(s));
        }

        public ObfuscatedOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
        {
            this$0 = ObfuscatedPreferences.this;
            super();
            wrappedListener = onsharedpreferencechangelistener;
        }
    }


    private final WeakHashMap listeners = new WeakHashMap();
    private final Obfuscator obfuscator;
    private final SharedPreferences wrappedPrefs;

    public ObfuscatedPreferences(SharedPreferences sharedpreferences, Obfuscator obfuscator1)
    {
        wrappedPrefs = sharedpreferences;
        obfuscator = obfuscator1;
    }

    private RuntimeException notImplemented()
    {
        return new UnsupportedOperationException((new StringBuilder("Not implemented in ")).append(getClass().getSimpleName()).toString());
    }

    private boolean toBoolean(String s, boolean flag)
    {
        if (s == null)
        {
            return flag;
        } else
        {
            return obfuscator.deobfuscateBoolean(s);
        }
    }

    public boolean contains(String s)
    {
        return wrappedPrefs.contains(obfuscator.obfuscate(s));
    }

    public android.content.SharedPreferences.Editor edit()
    {
        return new ObfuscatedEditor();
    }

    public Map getAll()
    {
        throw notImplemented();
    }

    public boolean getBoolean(String s, boolean flag)
    {
        return toBoolean(wrappedPrefs.getString(obfuscator.obfuscate(s), null), flag);
    }

    public float getFloat(String s, float f)
    {
        throw notImplemented();
    }

    public int getInt(String s, int i)
    {
        throw notImplemented();
    }

    public long getLong(String s, long l)
    {
        throw notImplemented();
    }

    public String getString(String s, String s1)
    {
        s = wrappedPrefs.getString(obfuscator.obfuscate(s), null);
        if (s == null)
        {
            return s1;
        } else
        {
            return obfuscator.deobfuscateString(s);
        }
    }

    public Set getStringSet(String s, Set set)
    {
        HashSet hashset = new HashSet();
        s = wrappedPrefs.getStringSet(obfuscator.obfuscate(s), null);
        if (s == null)
        {
            return set;
        }
        for (s = s.iterator(); s.hasNext(); hashset.add(obfuscator.deobfuscateString(set)))
        {
            set = (String)s.next();
        }

        return hashset;
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        this;
        JVM INSTR monitorenter ;
        ObfuscatedOnSharedPreferenceChangeListener obfuscatedonsharedpreferencechangelistener = new ObfuscatedOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        listeners.put(onsharedpreferencechangelistener, obfuscatedonsharedpreferencechangelistener);
        wrappedPrefs.registerOnSharedPreferenceChangeListener(obfuscatedonsharedpreferencechangelistener);
        this;
        JVM INSTR monitorexit ;
        return;
        onsharedpreferencechangelistener;
        this;
        JVM INSTR monitorexit ;
        throw onsharedpreferencechangelistener;
    }

    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = listeners.entrySet().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (!((android.content.SharedPreferences.OnSharedPreferenceChangeListener)entry.getKey()).equals(onsharedpreferencechangelistener)) goto _L4; else goto _L3
_L3:
        obj = (android.content.SharedPreferences.OnSharedPreferenceChangeListener)entry.getKey();
        onsharedpreferencechangelistener = (ObfuscatedOnSharedPreferenceChangeListener)entry.getValue();
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        listeners.remove(obj);
        if (onsharedpreferencechangelistener == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        wrappedPrefs.unregisterOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
        this;
        JVM INSTR monitorexit ;
        return;
        onsharedpreferencechangelistener;
        this;
        JVM INSTR monitorexit ;
        throw onsharedpreferencechangelistener;
_L2:
        onsharedpreferencechangelistener = null;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }



}
