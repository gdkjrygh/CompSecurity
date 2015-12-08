// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.android.util.p;

// Referenced classes of package com.pandora.android.data:
//            d

public interface n
{
    public static final class a extends Enum
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
        private static final a k[];
        p j;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/data/n$a, s);
        }

        public static a[] values()
        {
            return (a[])k.clone();
        }

        public p a()
        {
            return j;
        }

        static 
        {
            a = new a("findPeople", 0, p.k);
            b = new a("pandoraONe", 1, p.s);
            c = new a("privacySettings", 2, p.t);
            d = new a("accountSettings", 3, p.u);
            e = new a("communicationsSettings", 4, p.v);
            f = new a("advancedSettings", 5, p.w);
            g = new a("devicesSettings", 6, p.z);
            h = new a("emptyFindPeople", 7, null);
            i = new a("fbConnect", 8, null);
            k = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int l, p p1)
        {
            super(s, l);
            j = p1;
        }
    }


    public static final byte a[] = (new String(new char[] {
        'A', 'C', '7', 'I', 'B', 'G', '0', '9', 'A', '3', 
        'D', 'T', 'S', 'Y', 'M', '4', 'R', '4', '1', 'U', 
        'J', 'W', 'L', '0', '7', 'V', 'L', 'N', '8', 'J', 
        'I', '7'
    })).getBytes();
    public static final byte b[] = (new String(new char[] {
        '6', '#', '2', '6', 'F', 'R', 'L', '$', 'Z', 'W', 
        'D'
    })).getBytes();
    public static final byte c[] = (new String(new char[] {
        'R', '=', 'U', '!', 'L', 'H', '$', 'O', '2', 'B', 
        '#'
    })).getBytes();
    public static final String d = d.i;
    public static final String e[] = {
        "sapphire", "dream", "SPH-M900", "hero", "heroc", "morrison", "motus", "sholes", "magic", "umts_sholes", 
        "g7a", "desirec"
    };

}
