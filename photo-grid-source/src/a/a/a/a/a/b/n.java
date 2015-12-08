// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    private static final Map k;
    private static final n l[];

    private n(String s, int i1)
    {
        super(s, i1);
    }

    static n a()
    {
        Object obj = Build.CPU_ABI;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            a.a.a.a.f.d();
            obj = h;
        } else
        {
            obj = ((String) (obj)).toLowerCase(Locale.US);
            n n1 = (n)k.get(obj);
            obj = n1;
            if (n1 == null)
            {
                return h;
            }
        }
        return ((n) (obj));
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(a/a/a/a/a/b/n, s);
    }

    public static n[] values()
    {
        return (n[])l.clone();
    }

    static 
    {
        a = new n("X86_32", 0);
        b = new n("X86_64", 1);
        c = new n("ARM_UNKNOWN", 2);
        d = new n("PPC", 3);
        e = new n("PPC64", 4);
        f = new n("ARMV6", 5);
        g = new n("ARMV7", 6);
        h = new n("UNKNOWN", 7);
        i = new n("ARMV7S", 8);
        j = new n("ARM64", 9);
        l = (new n[] {
            a, b, c, d, e, f, g, h, i, j
        });
        HashMap hashmap = new HashMap(4);
        k = hashmap;
        hashmap.put("armeabi-v7a", g);
        k.put("armeabi", f);
        k.put("x86", a);
    }
}
