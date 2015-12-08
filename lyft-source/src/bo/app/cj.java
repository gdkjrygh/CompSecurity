// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.Constants;
import com.appboy.configuration.XmlAppConfigurationProvider;

// Referenced classes of package bo.app:
//            ci, ff

public class cj
    implements ci
{

    private static final String a;
    private final XmlAppConfigurationProvider b;
    private final SharedPreferences c;

    public cj(Context context, XmlAppConfigurationProvider xmlappconfigurationprovider)
    {
        b = xmlappconfigurationprovider;
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
        i = b.getVersionCode();
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
        ff.a(s);
        android.content.SharedPreferences.Editor editor = c.edit();
        editor.putString("registration_id", s);
        editor.putInt("version_code", b.getVersionCode());
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cj.getName()
        });
    }
}
