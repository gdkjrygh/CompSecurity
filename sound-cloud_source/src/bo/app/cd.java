// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.a.b;

// Referenced classes of package bo.app:
//            cc, fa

public final class cd
    implements cc
{

    private final b a;
    private final SharedPreferences b;

    public cd(Context context, b b1)
    {
        a = b1;
        b = context.getSharedPreferences("com.appboy.push_registration", 0);
    }

    public final String a()
    {
        String s = null;
        this;
        JVM INSTR monitorenter ;
        if (!b.contains("version_code")) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = a.k();
        j = b.getInt("version_code", 0x80000000);
        if (i == j) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = b.getString("registration_id", null);
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
        fa.a(s);
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("registration_id", s);
        editor.putInt("version_code", a.k());
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
        android.content.SharedPreferences.Editor editor = b.edit();
        editor.putString("registration_id", "");
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
