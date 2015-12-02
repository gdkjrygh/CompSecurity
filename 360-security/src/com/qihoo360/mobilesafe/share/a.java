// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.util.Log;
import com.qihoo360.i.v1.main.IIpcPref;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            IpcPrefJni

public class com.qihoo360.mobilesafe.share.a
    implements IIpcPref
{
    public final class a
        implements android.content.SharedPreferences.Editor
    {

        final com.qihoo360.mobilesafe.share.a a;
        private final Map b = new HashMap();
        private boolean c;

        private void a()
        {
        }

        private byte[] b()
        {
            this;
            JVM INSTR monitorenter ;
            if (c || !b.isEmpty())
            {
                break MISSING_BLOCK_LABEL_25;
            }
            this;
            JVM INSTR monitorexit ;
            return null;
            ByteArrayOutputStream bytearrayoutputstream;
            DataOutputStream dataoutputstream;
            bytearrayoutputstream = new ByteArrayOutputStream();
            dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeBoolean(c);
            com.qihoo360.mobilesafe.share.a.a(dataoutputstream, b);
            byte abyte0[];
            c = false;
            b.clear();
            abyte0 = bytearrayoutputstream.toByteArray();
            this;
            JVM INSTR monitorexit ;
            return abyte0;
            Object obj;
            obj;
            this;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            throw new IllegalArgumentException((new StringBuilder()).append(((IOException) (obj)).getMessage()).append(": write editor to stream fail").toString());
        }

        public void apply()
        {
            a();
            byte abyte0[] = b();
            if (abyte0 == null)
            {
                return;
            } else
            {
                IpcPrefJni.prefApply(com.qihoo360.mobilesafe.share.a.a(a), abyte0);
                return;
            }
        }

        public android.content.SharedPreferences.Editor clear()
        {
            this;
            JVM INSTR monitorenter ;
            c = true;
            this;
            JVM INSTR monitorexit ;
            return this;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean commit()
        {
            a();
            byte abyte0[] = b();
            if (abyte0 == null)
            {
                return true;
            } else
            {
                IpcPrefJni.prefApply(com.qihoo360.mobilesafe.share.a.a(a), abyte0);
                return true;
            }
        }

        public android.content.SharedPreferences.Editor putBoolean(String s, boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(s, (new StringBuilder()).append('2').append(Boolean.toString(flag)).toString());
            this;
            JVM INSTR monitorexit ;
            return this;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public android.content.SharedPreferences.Editor putFloat(String s, float f)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(s, (new StringBuilder()).append('3').append(Float.toString(f)).toString());
            this;
            JVM INSTR monitorexit ;
            return this;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public android.content.SharedPreferences.Editor putInt(String s, int i)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(s, (new StringBuilder()).append('4').append(Integer.toString(i)).toString());
            this;
            JVM INSTR monitorexit ;
            return this;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public android.content.SharedPreferences.Editor putLong(String s, long l)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(s, (new StringBuilder()).append('5').append(Long.toString(l)).toString());
            this;
            JVM INSTR monitorexit ;
            return this;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public android.content.SharedPreferences.Editor putString(String s, String s1)
        {
            this;
            JVM INSTR monitorenter ;
            Map map = b;
            if (s1 != null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            s1 = Character.toString('0');
_L1:
            map.put(s, s1);
            this;
            JVM INSTR monitorexit ;
            return this;
            s1 = (new StringBuilder()).append('6').append(s1).toString();
              goto _L1
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public android.content.SharedPreferences.Editor putStringSet(String s, Set set)
        {
            throw new RuntimeException("Not supported OnSharedPreferenceChangeListener");
        }

        public android.content.SharedPreferences.Editor remove(String s)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(s, "1");
            this;
            JVM INSTR monitorexit ;
            return this;
            s;
            this;
            JVM INSTR monitorexit ;
            throw s;
        }

        public a()
        {
            a = com.qihoo360.mobilesafe.share.a.this;
            super();
            c = false;
        }
    }


    private final int a;
    private final String b;

    com.qihoo360.mobilesafe.share.a(File file, String s)
    {
        b = s;
        a = IpcPrefJni.prefOpen((new File(file, (new StringBuilder()).append(s).append(".xml").toString())).getAbsolutePath(), 0);
    }

    static int a(com.qihoo360.mobilesafe.share.a a1)
    {
        return a1.a;
    }

    private static Object a(DataInputStream datainputstream)
        throws IOException
    {
        datainputstream = b(datainputstream);
        char c = datainputstream.charAt(0);
        datainputstream = datainputstream.substring(1);
        if (c == '2')
        {
            datainputstream = Boolean.valueOf(datainputstream);
        } else
        {
            if (c == '3')
            {
                return Float.valueOf(datainputstream);
            }
            if (c == '4')
            {
                return Integer.valueOf(datainputstream);
            }
            if (c == '5')
            {
                return Long.valueOf(datainputstream);
            }
            if (c != '6')
            {
                if (c == '0')
                {
                    return null;
                } else
                {
                    throw new RuntimeException((new StringBuilder()).append("Not supported type ").append(c).toString());
                }
            }
        }
        return datainputstream;
    }

    private Object a(String s, char c)
    {
        try
        {
            s = ((String) (a(new DataInputStream(new ByteArrayInputStream(IpcPrefJni.prefGet(a, s))))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        c;
        JVM INSTR tableswitch 50 54: default 102
    //                   50 60
    //                   51 68
    //                   52 76
    //                   53 84
    //                   54 92;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        return Boolean.valueOf(s.toString());
_L3:
        return Float.valueOf(s.toString());
_L4:
        return Integer.valueOf(s.toString());
_L5:
        return Long.valueOf(s.toString());
_L6:
        s = s.toString();
        return s;
_L1:
        return null;
    }

    private static HashMap a(byte abyte0[])
    {
        HashMap hashmap = new HashMap();
        abyte0 = new DataInputStream(new ByteArrayInputStream(abyte0));
        int i;
        int j;
        try
        {
            j = abyte0.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap.put(b(abyte0), a(((DataInputStream) (abyte0))));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return hashmap;
    }

    private static final void a(DataOutputStream dataoutputstream, String s)
        throws IOException
    {
        s = s.getBytes("UTF-8");
        dataoutputstream.writeInt(s.length);
        dataoutputstream.write(s);
    }

    static void a(DataOutputStream dataoutputstream, Map map)
        throws IOException
    {
        b(dataoutputstream, map);
    }

    private static final String b(DataInputStream datainputstream)
        throws IOException
    {
        int i = datainputstream.readInt();
        byte abyte0[] = new byte[i];
        datainputstream.readFully(abyte0, 0, i);
        return new String(abyte0, "UTF-8");
    }

    private static void b(DataOutputStream dataoutputstream, Map map)
        throws IOException
    {
        dataoutputstream.writeInt(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a(dataoutputstream, (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
            a(dataoutputstream, (String)entry.getKey());
        }

    }

    public boolean contains(String s)
    {
        return IpcPrefJni.prefContains(a, s);
    }

    public android.content.SharedPreferences.Editor edit()
    {
        return new a();
    }

    public Map getAll()
    {
        return a(IpcPrefJni.prefGetAll(a));
    }

    public boolean getBoolean(String s, boolean flag)
    {
        boolean flag1;
        try
        {
            s = (Boolean)a(s, '2');
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IpcPref", " fail to cast to Boolean ", s);
            return flag;
        }
        flag1 = flag;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        flag1 = s.booleanValue();
        return flag1;
    }

    public float getFloat(String s, float f)
    {
        float f1;
        try
        {
            s = (Float)a(s, '3');
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IpcPref", " fail to cast to Float ", s);
            return f;
        }
        f1 = f;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        f1 = s.floatValue();
        return f1;
    }

    public int getInt(String s, int i)
    {
        int j;
        try
        {
            s = (Integer)a(s, '4');
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IpcPref", " fail to cast to Integer  ", s);
            return i;
        }
        j = i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        j = s.intValue();
        return j;
    }

    public long getLong(String s, long l)
    {
        long l1;
        try
        {
            s = (Long)a(s, '5');
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IpcPref", " fail to cast to Long ", s);
            return l;
        }
        l1 = l;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        l1 = s.longValue();
        return l1;
    }

    public String getString(String s, String s1)
    {
        try
        {
            s = (String)a(s, '6');
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("IpcPref", " fail to cast to String ", s);
            return s1;
        }
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public Set getStringSet(String s, Set set)
    {
        throw new RuntimeException("Not supported getStringSet");
    }

    public transient Object invoke(Object aobj[])
    {
        throw new RuntimeException("Not supported");
    }

    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new RuntimeException("Not supported OnSharedPreferenceChangeListener");
    }

    public boolean reload(String s)
    {
        return IpcPrefJni.prefReload(a, s);
    }

    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onsharedpreferencechangelistener)
    {
        throw new RuntimeException("Not supported OnSharedPreferenceChangeListener");
    }
}
