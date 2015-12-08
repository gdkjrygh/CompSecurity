// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class dbg
{

    private final Context a;

    public dbg(Context context)
    {
        a = context;
    }

    private static String a(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append(s1).append(s2).toString();
    }

    public final String a(String s)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        String s1;
        obj1 = a.getSharedPreferences("rxc", 0);
        s1 = ((SharedPreferences) (obj1)).getString("TUH", null);
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        a();
        s = obj;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (!s1.equals(s))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj1 = ((SharedPreferences) (obj1)).getString("DBy", null);
        s = ((String) (obj1));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            continue; /* Loop/switch isn't completed */
        }
        a();
        s = obj;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String a(String s, String s1, String s2, String s3, String s4)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        String s5 = obj;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        boolean flag = TextUtils.isEmpty(s1);
        if (!flag) goto _L4; else goto _L3
_L3:
        s5 = obj;
_L2:
        this;
        JVM INSTR monitorexit ;
        return s5;
_L4:
        SharedPreferences sharedpreferences;
        String s6;
        String s7;
        sharedpreferences = a.getSharedPreferences("rxc", 0);
        s6 = sharedpreferences.getString("TUH", null);
        s7 = sharedpreferences.getString("DBy", null);
        if (TextUtils.isEmpty(s6) || TextUtils.isEmpty(s7))
        {
            a();
        }
        s5 = obj;
        if (!s.equals(s6))
        {
            continue; /* Loop/switch isn't completed */
        }
        s5 = obj;
        if (!s1.equals(s7))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = sharedpreferences.getString(a(s2, s3, s4), null);
        s5 = obj;
        if (TextUtils.isEmpty(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = sharedpreferences.getInt("HL2", -1);
        s1 = dbe.a(a, i);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        s5 = s1.b(s);
        s1.a();
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        a();
        s5 = obj;
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean a()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = a.getSharedPreferences("rxc", 0);
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        flag = ((android.content.SharedPreferences.Editor) (obj)).commit();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L3
_L3:
        flag = TextUtils.isEmpty(s5);
        if (!flag) goto _L5; else goto _L4
_L4:
        flag = flag1;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        dbd dbd1 = dbe.a(a, 1);
        flag = flag1;
        if (dbd1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s5 = dbd1.a(s5);
        dbd1.a();
        s2 = a(s2, s3, s4);
        s3 = a.getSharedPreferences("rxc", 0).edit();
        s3.putString("TUH", s);
        s3.putString("DBy", s1);
        s3.putString(s2, s5);
        s3.putInt("HL2", 1);
        flag = s3.commit();
        if (true) goto _L2; else goto _L6
_L6:
        s;
        throw s;
    }

    public final boolean b(String s)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = a.getSharedPreferences("rxc", 0);
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag2;
_L2:
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L6:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = a();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((SharedPreferences) (obj)).getString("TUH", null);
        flag = flag1;
        boolean flag3;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag3 = ((String) (obj)).equals(s);
        flag = flag1;
        if (flag3)
        {
            flag = false;
        }
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
        if (true) goto _L1; else goto _L7
_L7:
    }
}
