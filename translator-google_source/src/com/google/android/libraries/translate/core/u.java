// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.text.TextUtils;
import com.google.android.libraries.translate.e.c;

// Referenced classes of package com.google.android.libraries.translate.core:
//            t, Singleton

public final class u
{

    public static c a(String s, boolean flag)
    {
        StringBuilder stringbuilder = t.a();
        stringbuilder.append("/translate_a/sg?client=");
        stringbuilder.append(com.google.android.libraries.translate.core.Singleton.c());
        stringbuilder.append("&cm=");
        stringbuilder.append(s);
        s = new c(stringbuilder.toString());
        s.b = true;
        if (flag)
        {
            s.a("process=sync");
        }
        return s;
    }

    public static void a(c c1, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            c1.a("tk", s);
        }
    }
}
