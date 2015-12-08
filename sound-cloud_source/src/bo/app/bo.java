// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.UUID;

// Referenced classes of package bo.app:
//            ca, cw

public final class bo
    implements ca
{

    private final Context a;

    public bo(Context context)
    {
        a = context;
    }

    public final cw a()
    {
        return new cw(Build.SERIAL, b());
    }

    public final String b()
    {
        SharedPreferences sharedpreferences = a.getSharedPreferences("com.appboy.device", 0);
        String s1 = sharedpreferences.getString("device_id", null);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString();
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("device_id", s);
            editor.apply();
        }
        return s;
    }
}
