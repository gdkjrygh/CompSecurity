// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.appboy.f;
import java.util.UUID;

// Referenced classes of package a.a:
//            bb, bx

public class aq
    implements bb
{

    private static final String a;
    private final Context b;

    public aq(Context context)
    {
        b = context;
    }

    public final bx a()
    {
        return new bx(Build.SERIAL, b());
    }

    public final String b()
    {
        SharedPreferences sharedpreferences = b.getSharedPreferences("com.appboy.device", 0);
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

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/aq.getName()
        });
    }
}
