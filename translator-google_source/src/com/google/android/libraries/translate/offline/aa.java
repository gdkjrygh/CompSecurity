// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import com.google.android.libraries.translate.b.e;
import com.google.android.libraries.translate.d.a;
import com.google.android.libraries.translate.d.b;
import com.google.android.libraries.translate.d.c;
import com.google.android.libraries.translate.d.f;
import com.google.android.libraries.translate.d.g;
import com.google.android.libraries.translate.e.k;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ab, PackageType, x, ProfileManagerV2Profile

public class aa extends k
    implements f
{

    private final String a;
    private final PackageType b;
    private final boolean c;

    public aa(String s, boolean flag, PackageType packagetype)
    {
        a = s;
        b = packagetype;
        if (flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private static String a(PackageType packagetype)
    {
        switch (com.google.android.libraries.translate.offline.ab.a[packagetype.ordinal()])
        {
        default:
            packagetype = String.valueOf("profiles");
            String s = e.a.a();
            return (new StringBuilder(String.valueOf(packagetype).length() + 5 + String.valueOf(s).length())).append(packagetype).append(s).append(".json").toString();

        case 1: // '\001'
            packagetype = String.valueOf("profiles_wl");
            break;
        }
        String s1 = e.b.a();
        return (new StringBuilder(String.valueOf(packagetype).length() + 5 + String.valueOf(s1).length())).append(packagetype).append(s1).append(".json").toString();
    }

    public final Object a(String s)
    {
        return com.google.android.libraries.translate.offline.ProfileManagerV2Profile.a(new JSONObject(s));
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new b(a(b));
        if (c)
        {
            aobj = new g(a, ((com.google.android.libraries.translate.d.d) (aobj)));
        }
        a a1 = new a(a(b));
        return (ProfileManagerV2Profile)(new com.google.android.libraries.translate.d.e(this)).a(new c[] {
            aobj, a1
        });
    }
}
