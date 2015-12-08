// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.internal:
//            cm, cj

final class bc extends Enum
{

    private static bc a;
    private static bc b;
    private static bc c;
    private static bc d;
    private static bc e;
    private static bc f;
    private static bc g;
    private static bc h;
    private static bc i;
    private static bc j;
    private static final Map k;
    private static final bc l[];

    private bc(String s, int i1)
    {
        super(s, i1);
    }

    static bc a()
    {
        Object obj = Build.CPU_ABI;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            cm.a().b().a("Crashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
            obj = h;
        } else
        {
            obj = ((String) (obj)).toLowerCase(Locale.US);
            bc bc1 = (bc)k.get(obj);
            obj = bc1;
            if (bc1 == null)
            {
                return h;
            }
        }
        return ((bc) (obj));
    }

    public static bc valueOf(String s)
    {
        return (bc)Enum.valueOf(com/crashlytics/android/internal/bc, s);
    }

    public static bc[] values()
    {
        return (bc[])l.clone();
    }

    static 
    {
        a = new bc("X86_32", 0);
        b = new bc("X86_64", 1);
        c = new bc("ARM_UNKNOWN", 2);
        d = new bc("PPC", 3);
        e = new bc("PPC64", 4);
        f = new bc("ARMV6", 5);
        g = new bc("ARMV7", 6);
        h = new bc("UNKNOWN", 7);
        i = new bc("ARMV7S", 8);
        j = new bc("ARM64", 9);
        l = (new bc[] {
            a, b, c, d, e, f, g, h, i, j
        });
        HashMap hashmap = new HashMap(4);
        k = hashmap;
        hashmap.put("armeabi-v7a", g);
        k.put("armeabi", f);
        k.put("x86", a);
    }
}
