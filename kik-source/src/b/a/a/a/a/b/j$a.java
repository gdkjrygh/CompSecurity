// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.os.Build;
import android.text.TextUtils;
import b.a.a.a.d;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package b.a.a.a.a.b:
//            j

static final class  extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    private static final Map k;
    private static final a l[];

    static  a()
    {
        Object obj = Build.CPU_ABI;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b.a.a.a.d.c();
            obj = h;
        } else
        {
            obj = ((String) (obj)).toLowerCase(Locale.US);
              = (.US)k.get(obj);
            obj = ;
            if ( == null)
            {
                return h;
            }
        }
        return ((h) (obj));
    }

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(b/a/a/a/a/b/j$a, s);
    }

    public static [] values()
    {
        return ([])l.clone();
    }

    static 
    {
        a = new <init>("X86_32", 0);
        b = new <init>("X86_64", 1);
        c = new <init>("ARM_UNKNOWN", 2);
        d = new <init>("PPC", 3);
        e = new <init>("PPC64", 4);
        f = new <init>("ARMV6", 5);
        g = new <init>("ARMV7", 6);
        h = new <init>("UNKNOWN", 7);
        i = new <init>("ARMV7S", 8);
        j = new <init>("ARM64", 9);
        l = (new l[] {
            a, b, c, d, e, f, g, h, i, j
        });
        HashMap hashmap = new HashMap(4);
        k = hashmap;
        hashmap.put("armeabi-v7a", g);
        k.put("armeabi", f);
        k.put("x86", a);
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
