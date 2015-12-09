// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

// Referenced classes of package com.nuance.b.b:
//            fk, fj, fr

final class fi
{

    final String a;
    final fj b;
    final SharedPreferences c;

    fi(Context context, fj fj1)
    {
        Object obj;
        b = fj1;
        c = context.getSharedPreferences("NinaCorePrefs", 0);
        obj = fk.c;
        context = c.getString("device_id", null);
        if (context != null) goto _L2; else goto _L1
_L1:
        obj = UUID.randomUUID().toString();
        context = fk.b;
        if (!fj1.a()) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        String s;
        obj2 = fj1.a("device_id");
        obj1 = context;
        if (obj2 != null)
        {
            obj1 = fk.a;
            obj = obj2;
        }
        s = fj1.a("install_type");
        obj2 = obj;
        context = ((Context) (obj1));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        context = (fk)Enum.valueOf(com/nuance/b/b/fk, s);
        obj2 = obj;
_L8:
        a = ((String) (obj2));
        obj = c.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("device_id", a);
        ((android.content.SharedPreferences.Editor) (obj)).putString("install_type", context.toString());
        ((android.content.SharedPreferences.Editor) (obj)).commit();
_L6:
        fj1.a("device_id", a);
        if (fk.b == context)
        {
            fj1.a("install_type", context.toString());
        }
        fj1.b();
        return;
_L4:
        fr.d("Unable to determine install-type re-install -- Insufficient permissions");
        obj2 = obj;
        continue; /* Loop/switch isn't completed */
_L2:
        a = context;
        obj1 = c.getString("install_type", null);
        context = ((Context) (obj));
        if (obj1 != null)
        {
            try
            {
                context = (fk)Enum.valueOf(com/nuance/b/b/fk, ((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = ((Context) (obj));
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        context;
        obj2 = obj;
        context = ((Context) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
    }
}
