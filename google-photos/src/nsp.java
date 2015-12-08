// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.IOException;

public class nsp
{

    private static final String a = ntn.a(nsp);
    private final String b;
    private final SharedPreferences c;
    private final mbr d;

    public nsp(Context context)
    {
        d = (mbr)olm.a(context, mbr);
        c = context.getSharedPreferences("com.google.android.libraries.social.notifications.GCM", 0);
        b = ((nqz)olm.a(context, nqz)).c();
    }

    public final String a()
    {
        return c.getString("reg_id", null);
    }

    public final boolean a(boolean flag)
    {
        Object obj1;
        long l;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag3 = false;
        obj1 = c.getString("reg_id", null);
        l = c.getLong("reg_timestamp", 0L);
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        boolean flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))) || System.currentTimeMillis() - l > 0x5265c00L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s = a;
        if (flag1)
        {
            obj = "stale";
        } else
        {
            obj = "not-stale";
        }
        ntn.a(s, String.format("GCM Registration is %s.", new Object[] {
            obj
        }));
        if (!flag1) goto _L3; else goto _L2
_L2:
        ntn.a(a, (new StringBuilder(39)).append("Try to register with GCM, force = ").append(flag).toString());
        obj = d.a(b);
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        flag2 = ((String) (obj)).equals(obj1);
        if (flag2) goto _L6; else goto _L5
_L5:
        flag = true;
_L8:
        d.a();
        flag2 = flag;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = c.edit();
            ((android.content.SharedPreferences.Editor) (obj1)).putString("reg_id", ((String) (obj)));
            ((android.content.SharedPreferences.Editor) (obj1)).putLong("reg_timestamp", System.currentTimeMillis());
            ((android.content.SharedPreferences.Editor) (obj1)).commit();
            flag2 = flag;
        }
_L3:
        return flag2;
        obj;
        ntn.a(a, (new StringBuilder(49)).append("Exception during register with GCM, force = ").append(flag).toString(), ((Throwable) (obj)));
        d.a();
        return false;
        obj;
        d.a();
        throw obj;
_L6:
        obj = obj1;
        flag = flag3;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
