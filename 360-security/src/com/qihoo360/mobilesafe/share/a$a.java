// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            a, IpcPrefJni

public final class c
    implements android.content.edPreferences.Editor
{

    final a a;
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

    public android.content.edPreferences.Editor clear()
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

    public android.content.edPreferences.Editor putBoolean(String s, boolean flag)
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

    public android.content.edPreferences.Editor putFloat(String s, float f)
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

    public android.content.edPreferences.Editor putInt(String s, int i)
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

    public android.content.edPreferences.Editor putLong(String s, long l)
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

    public android.content.edPreferences.Editor putString(String s, String s1)
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

    public android.content.edPreferences.Editor putStringSet(String s, Set set)
    {
        throw new RuntimeException("Not supported OnSharedPreferenceChangeListener");
    }

    public android.content.edPreferences.Editor remove(String s)
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

    public Editor(a a1)
    {
        a = a1;
        super();
        c = false;
    }
}
