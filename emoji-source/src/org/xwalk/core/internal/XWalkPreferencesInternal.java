// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class XWalkPreferencesInternal
{
    static interface KeyValueChangeListener
    {

        public abstract void onKeyValueChanged(String s, PreferenceValue preferencevalue);
    }

    static class PreferenceValue
    {

        static final int PREFERENCE_TYPE_BOOLEAN = 1;
        static final int PREFERENCE_TYPE_INTEGER = 2;
        static final int PREFERENCE_TYPE_STRING = 3;
        int mType;
        Object mValue;

        boolean getBooleanValue()
        {
            if (mType != 1)
            {
                return false;
            } else
            {
                return ((Boolean)mValue).booleanValue();
            }
        }

        int getIntegerValue()
        {
            if (mType != 2)
            {
                return -1;
            } else
            {
                return ((Integer)mValue).intValue();
            }
        }

        String getStringValue()
        {
            if (mType != 3)
            {
                return null;
            } else
            {
                return (String)mValue;
            }
        }

        int getType()
        {
            return mType;
        }

        PreferenceValue(int i)
        {
            mType = 2;
            mValue = Integer.valueOf(i);
        }

        PreferenceValue(String s)
        {
            mType = 3;
            mValue = s;
        }

        PreferenceValue(boolean flag)
        {
            mType = 1;
            mValue = Boolean.valueOf(flag);
        }
    }


    public static final String ALLOW_UNIVERSAL_ACCESS_FROM_FILE = "allow-universal-access-from-file";
    public static final String ANIMATABLE_XWALK_VIEW = "animatable-xwalk-view";
    static final String ENABLE_EXTENSIONS = "enable-extensions";
    static final String ENABLE_JAVASCRIPT = "enable-javascript";
    public static final String JAVASCRIPT_CAN_OPEN_WINDOW = "javascript-can-open-window";
    public static final String PROFILE_NAME = "profile-name";
    public static final String REMOTE_DEBUGGING = "remote-debugging";
    public static final String SUPPORT_MULTIPLE_WINDOWS = "support-multiple-windows";
    private static ArrayList sListeners = new ArrayList();
    private static HashMap sPrefMap;
    private static ReferenceQueue sRefQueue = new ReferenceQueue();

    public XWalkPreferencesInternal()
    {
    }

    private static void checkKey(String s)
        throws RuntimeException
    {
        removeEnqueuedReference();
        if (!sPrefMap.containsKey(s))
        {
            throw new RuntimeException((new StringBuilder()).append("Warning: the preference key ").append(s).append(" is not supported by Crosswalk.").toString());
        } else
        {
            return;
        }
    }

    public static boolean getBooleanValue(String s)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        boolean flag;
        checkKey(s);
        flag = ((PreferenceValue)sPrefMap.get(s)).getBooleanValue();
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    public static int getIntegerValue(String s)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        int i;
        checkKey(s);
        i = ((PreferenceValue)sPrefMap.get(s)).getIntegerValue();
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    public static String getStringValue(String s)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        checkKey(s);
        s = ((PreferenceValue)sPrefMap.get(s)).getStringValue();
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static boolean getValue(String s)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        boolean flag;
        checkKey(s);
        flag = ((PreferenceValue)sPrefMap.get(s)).getBooleanValue();
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    static void load(KeyValueChangeListener keyvaluechangelistener)
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = sPrefMap.entrySet().iterator(); iterator.hasNext(); keyvaluechangelistener.onKeyValueChanged((String)entry.getKey(), (PreferenceValue)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_67;
        keyvaluechangelistener;
        throw keyvaluechangelistener;
        registerListener(keyvaluechangelistener);
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
    }

    private static void onKeyValueChanged(String s, PreferenceValue preferencevalue)
    {
        Iterator iterator = sListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            KeyValueChangeListener keyvaluechangelistener = (KeyValueChangeListener)((WeakReference)iterator.next()).get();
            if (keyvaluechangelistener != null)
            {
                keyvaluechangelistener.onKeyValueChanged(s, preferencevalue);
            }
        } while (true);
    }

    private static void registerListener(KeyValueChangeListener keyvaluechangelistener)
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        removeEnqueuedReference();
        keyvaluechangelistener = new WeakReference(keyvaluechangelistener, sRefQueue);
        sListeners.add(keyvaluechangelistener);
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return;
        keyvaluechangelistener;
        throw keyvaluechangelistener;
    }

    private static void removeEnqueuedReference()
    {
        do
        {
            WeakReference weakreference = (WeakReference)sRefQueue.poll();
            if (weakreference != null)
            {
                sListeners.remove(weakreference);
            } else
            {
                return;
            }
        } while (true);
    }

    public static void setValue(String s, int i)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        checkKey(s);
        if (s != "animatable-xwalk-view")
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!sListeners.isEmpty())
        {
            throw new RuntimeException((new StringBuilder()).append("Warning: the preference key ").append(s).append(" can not be set if the preference is already loaded by Crosswalk").toString());
        }
        break MISSING_BLOCK_LABEL_60;
        s;
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        throw s;
        if (((PreferenceValue)sPrefMap.get(s)).getIntegerValue() != i)
        {
            PreferenceValue preferencevalue = new PreferenceValue(i);
            sPrefMap.put(s, preferencevalue);
            onKeyValueChanged(s, preferencevalue);
        }
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
    }

    public static void setValue(String s, String s1)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        checkKey(s);
        if (s != "animatable-xwalk-view")
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!sListeners.isEmpty())
        {
            throw new RuntimeException((new StringBuilder()).append("Warning: the preference key ").append(s).append(" can not be set if the preference is already loaded by Crosswalk").toString());
        }
        break MISSING_BLOCK_LABEL_60;
        s;
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        throw s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (!s1.equals(((PreferenceValue)sPrefMap.get(s)).getStringValue()))
        {
            s1 = new PreferenceValue(s1);
            sPrefMap.put(s, s1);
            onKeyValueChanged(s, s1);
        }
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
    }

    public static void setValue(String s, boolean flag)
        throws RuntimeException
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        checkKey(s);
        if (s != "animatable-xwalk-view")
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!sListeners.isEmpty())
        {
            throw new RuntimeException((new StringBuilder()).append("Warning: the preference key ").append(s).append(" can not be set if the preference is already loaded by Crosswalk").toString());
        }
        break MISSING_BLOCK_LABEL_60;
        s;
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        throw s;
        if (((PreferenceValue)sPrefMap.get(s)).getBooleanValue() != flag)
        {
            PreferenceValue preferencevalue = new PreferenceValue(flag);
            sPrefMap.put(s, preferencevalue);
            onKeyValueChanged(s, preferencevalue);
        }
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
    }

    static void unload(KeyValueChangeListener keyvaluechangelistener)
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        unregisterListener(keyvaluechangelistener);
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return;
        keyvaluechangelistener;
        throw keyvaluechangelistener;
    }

    private static void unregisterListener(KeyValueChangeListener keyvaluechangelistener)
    {
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorenter ;
        removeEnqueuedReference();
        Iterator iterator = sListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (weakreference.get() != keyvaluechangelistener)
            {
                continue;
            }
            sListeners.remove(weakreference);
            break;
        } while (true);
        org/xwalk/core/internal/XWalkPreferencesInternal;
        JVM INSTR monitorexit ;
        return;
        keyvaluechangelistener;
        throw keyvaluechangelistener;
    }

    static 
    {
        sPrefMap = new HashMap();
        sPrefMap.put("remote-debugging", new PreferenceValue(false));
        sPrefMap.put("animatable-xwalk-view", new PreferenceValue(true));
        sPrefMap.put("enable-javascript", new PreferenceValue(true));
        sPrefMap.put("javascript-can-open-window", new PreferenceValue(true));
        sPrefMap.put("allow-universal-access-from-file", new PreferenceValue(false));
        sPrefMap.put("support-multiple-windows", new PreferenceValue(true));
        sPrefMap.put("enable-extensions", new PreferenceValue(true));
        sPrefMap.put("profile-name", new PreferenceValue("Default"));
    }
}
