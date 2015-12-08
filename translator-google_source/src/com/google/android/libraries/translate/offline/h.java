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
//            x, LocationProfile

public class h extends k
    implements f
{

    public static final String a;
    private final boolean b;

    public h(boolean flag)
    {
        if (flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public final Object a(String s)
    {
        return com.google.android.libraries.translate.offline.LocationProfile.a(new JSONObject(s));
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new b(a);
        if (b)
        {
            aobj = new g("https://dl.google.com/translate/offline/locations.json", ((com.google.android.libraries.translate.d.d) (aobj)));
        }
        a a1 = new a(a);
        return (LocationProfile)(new com.google.android.libraries.translate.d.e(this)).a(new c[] {
            aobj, a1
        });
    }

    static 
    {
        String s = e.a.a();
        a = (new StringBuilder(String.valueOf(s).length() + 14)).append("locations").append(s).append(".json").toString();
    }
}
