// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.a.b;
import com.appboy.f;

// Referenced classes of package a.a:
//            bd, du

public class be
    implements bd
{

    private static final String a;
    private final b b;
    private final SharedPreferences c;

    public be(Context context, b b1)
    {
        b = b1;
        c = context.getSharedPreferences("com.appboy.push_registration", 0);
    }

    public final String a()
    {
        String s = null;
        this;
        JVM INSTR monitorenter ;
        if (!c.contains("version_code")) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = b.k();
        j = c.getInt("version_code", 0x80000000);
        if (i == j) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = c.getString("registration_id", null);
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        du.a(s);
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("registration_id", s);
        editor.putInt("version_code", b.k());
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("registration_id", "");
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/be.getName()
        });
    }
}
