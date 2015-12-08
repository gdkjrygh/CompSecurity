// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.nielsen.app.sdk:
//            AppCryptoManager

class AppPreferencesManager extends AppCryptoManager
{

    public static final char c = 73;
    public static final char d = 76;
    public static final char e = 66;
    public static final char f = 70;
    public static final char g = 68;
    public static final char h = 83;
    public static final char i = 85;
    private String a;
    private SharedPreferences b;
    private EditorManager j;

    public AppPreferencesManager(Context context)
    {
        a = "";
        b = null;
        j = null;
        a = getClass().getPackage().getName();
        b = context.getSharedPreferences(a, 0);
    }

    static SharedPreferences a(AppPreferencesManager apppreferencesmanager)
    {
        return apppreferencesmanager.b;
    }

    public char a(String s)
    {
        String s1 = encrypt((new StringBuilder("B")).append(s).toString(), 1);
        if (b.contains(s1))
        {
            return 'B';
        }
        s1 = encrypt((new StringBuilder("F")).append(s).toString(), 1);
        if (b.contains(s1))
        {
            return 'F';
        }
        s1 = encrypt((new StringBuilder("D")).append(s).toString(), 1);
        if (b.contains(s1))
        {
            return 'D';
        }
        s1 = encrypt((new StringBuilder("I")).append(s).toString(), 1);
        if (b.contains(s1))
        {
            return 'I';
        }
        s1 = encrypt((new StringBuilder("L")).append(s).toString(), 1);
        if (b.contains(s1))
        {
            return 'L';
        }
        s = encrypt((new StringBuilder("S")).append(s).toString(), 1);
        return !b.contains(s) ? 'U' : 'S';
    }

    public double a(String s, double d1)
    {
        s = encrypt((new StringBuilder("D")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            d1 = Double.parseDouble(decrypt(s, 0));
        }
        return d1;
    }

    public float a(String s, float f1)
    {
        s = encrypt((new StringBuilder("F")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            f1 = Float.parseFloat(decrypt(s, 0));
        }
        return f1;
    }

    public int a(String s, int k)
    {
        s = encrypt((new StringBuilder("I")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            k = Integer.parseInt(decrypt(s, 0));
        }
        return k;
    }

    public EditorManager a()
    {
        if (j == null)
        {
            j = new EditorManager();
        }
        return j;
    }

    public Map a(Set set)
    {
        TreeMap treemap;
        Object aobj[];
        int k;
        int l;
        Map map = b.getAll();
        if (map.isEmpty())
        {
            return null;
        }
        treemap = new TreeMap();
        aobj = map.keySet().toArray();
        l = aobj.length;
        k = 0;
_L5:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        obj = decrypt((String)aobj[k], 1);
        s = ((String) (obj)).substring(1);
        if (set == null) goto _L4; else goto _L3
_L3:
        char c1;
        Iterator iterator = set.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_352;
            }
        } while (!((String)iterator.next()).equals(s));
        c1 = '\001';
_L6:
        if (c1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        c1 = (char)((String) (obj)).getBytes()[0];
        if (c1 == 'B')
        {
            obj = new ValuePair('B', Boolean.valueOf(a(s, Boolean.FALSE.booleanValue())));
        } else
        if (c1 == 'F')
        {
            obj = new ValuePair('F', Float.valueOf(a(s, 3.402823E+38F)));
        } else
        if (c1 == 'D')
        {
            obj = new ValuePair('D', Double.valueOf(a(s, 1.7976931348623157E+308D)));
        } else
        if (c1 == 'L')
        {
            obj = new ValuePair('L', Long.valueOf(c(s, 0x7fffffffffffffffL)));
        } else
        if (c1 == 'I')
        {
            obj = new ValuePair('I', Integer.valueOf(a(s, 0x7fffffff)));
        } else
        if (c1 == 'S')
        {
            obj = new ValuePair('S', c(s, ((String) (null))));
        } else
        {
            obj = null;
        }
        treemap.put(s, obj);
        k++;
          goto _L5
_L2:
        return treemap;
        c1 = '\0';
          goto _L6
    }

    public void a(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        b.registerOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }

    public boolean a(String s, boolean flag)
    {
        s = encrypt((new StringBuilder("B")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            flag = Boolean.parseBoolean(decrypt(s, 0));
        }
        return flag;
    }

    public boolean a(Map map)
    {
        if (map == null)
        {
            return false;
        }
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = (ValuePair)map.get(s);
            char c1 = ((ValuePair) (obj)).a();
            obj = ((ValuePair) (obj)).b();
            if (c1 == 'B')
            {
                a().putBoolean(s, ((Boolean)obj).booleanValue()).commit();
            } else
            if (c1 == 'F')
            {
                a().putFloat(s, ((Float)obj).floatValue()).commit();
            } else
            if (c1 == 'D')
            {
                a().putDouble(s, ((Double)obj).doubleValue()).commit();
            } else
            if (c1 == 'L')
            {
                a().putLong(s, ((Long)obj).longValue()).commit();
            } else
            if (c1 == 'I')
            {
                a().putInt(s, ((Integer)obj).intValue()).commit();
            } else
            if (c1 == 'S')
            {
                a().putString(s, (String)obj).commit();
            } else
            {
                return false;
            }
        }

        return true;
    }

    public void b(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        b.unregisterOnSharedPreferenceChangeListener(onsharedpreferencechangelistener);
    }

    public long c(String s, long l)
    {
        s = encrypt((new StringBuilder("L")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            l = Long.parseLong(decrypt(s, 0));
        }
        return l;
    }

    public String c(String s, String s1)
    {
        s = encrypt((new StringBuilder("S")).append(s).toString(), 1);
        s = b.getString(s, null);
        if (s != null)
        {
            s1 = decrypt(s, 0);
        }
        return s1;
    }

    private class EditorManager extends AppCryptoManager
    {

        final AppPreferencesManager a;
        private android.content.SharedPreferences.Editor b;

        public void apply()
        {
            b.apply();
        }

        public EditorManager clear()
        {
            b.clear();
            return this;
        }

        public boolean commit()
        {
            return b.commit();
        }

        public volatile String decrypt(String s, int k)
        {
            return super.decrypt(s, k);
        }

        public volatile String encrypt(String s, int k)
        {
            return super.encrypt(s, k);
        }

        public EditorManager putBoolean(String s, boolean flag)
        {
            b.putString(encrypt((new StringBuilder("B")).append(s).toString(), 1), encrypt(Boolean.toString(flag), 0));
            return this;
        }

        public EditorManager putDouble(String s, double d1)
        {
            b.putString(encrypt((new StringBuilder("D")).append(s).toString(), 1), encrypt(Double.toString(d1), 0));
            return this;
        }

        public EditorManager putFloat(String s, float f1)
        {
            b.putString(encrypt((new StringBuilder("F")).append(s).toString(), 1), encrypt(Float.toString(f1), 0));
            return this;
        }

        public EditorManager putInt(String s, int k)
        {
            b.putString(encrypt((new StringBuilder("I")).append(s).toString(), 1), encrypt(Integer.toString(k), 0));
            return this;
        }

        public EditorManager putLong(String s, long l)
        {
            b.putString(encrypt((new StringBuilder("L")).append(s).toString(), 1), encrypt(Long.toString(l), 0));
            return this;
        }

        public EditorManager putString(String s, String s1)
        {
            s = encrypt((new StringBuilder("S")).append(s).toString(), 1);
            s1 = encrypt(s1, 0);
            b.putString(s, s1);
            return this;
        }

        public EditorManager remove(String s)
        {
            char c1 = a.a(s);
            if (c1 != 'U')
            {
                b.remove(encrypt((new StringBuilder()).append(c1).append(s).toString(), 1));
            }
            return this;
        }

        public EditorManager remove(String s, char c1)
        {
            s = encrypt((new StringBuilder()).append(c1).append(s).toString(), 1);
            if (AppPreferencesManager.a(a).contains(s))
            {
                b.remove(s);
            }
            return this;
        }

        public EditorManager()
        {
            a = AppPreferencesManager.this;
            super();
            b = null;
            if (b == null)
            {
                b = AppPreferencesManager.a(AppPreferencesManager.this).edit();
            }
        }
    }


    private class ValuePair
    {

        final AppPreferencesManager a;
        public char mType;
        public Object mValue;

        char a()
        {
            return mType;
        }

        void a(char c1)
        {
            mType = c1;
        }

        void a(Object obj)
        {
            mValue = obj;
        }

        Object b()
        {
            return mValue;
        }

        ValuePair(char c1, Object obj)
        {
            a = AppPreferencesManager.this;
            super();
            mType = 'U';
            mValue = null;
            mType = c1;
            mValue = obj;
        }
    }

}
