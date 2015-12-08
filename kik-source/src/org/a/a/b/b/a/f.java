// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

// Referenced classes of package org.a.a.b.b.a:
//            b

public final class f extends b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(org/a/a/b/b/a/f$a, s);
        }

        public static final a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("semiColonRequired", 0);
            b = new a("semiColonOptional", 1);
            c = new a("errorIfNoSemiColon", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private final EnumSet a;

    public transient f()
    {
        a = EnumSet.copyOf(Arrays.asList(new a[] {
            a.a
        }));
    }

    private boolean a(a a1)
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.contains(a1);
        }
    }

    public final int a(CharSequence charsequence, int i, Writer writer)
    {
        int l;
        boolean flag1;
        flag1 = true;
        l = charsequence.length();
        if (charsequence.charAt(i) != '&' || i >= l - 2 || charsequence.charAt(i + 1) != '#') goto _L2; else goto _L1
_L1:
        i += 2;
        char c = charsequence.charAt(i);
        if (c != 'x' && c != 'X')
        {
            break MISSING_BLOCK_LABEL_375;
        }
        i++;
        if (i != l) goto _L3; else goto _L2
_L2:
        return 0;
_L3:
        int k = 1;
_L5:
        int j;
        boolean flag;
        for (j = i; j < l && (charsequence.charAt(j) >= '0' && charsequence.charAt(j) <= '9' || charsequence.charAt(j) >= 'a' && charsequence.charAt(j) <= 'f' || charsequence.charAt(j) >= 'A' && charsequence.charAt(j) <= 'F'); j++) { }
        if (j != l && charsequence.charAt(j) == ';')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (a(a.a)) goto _L2; else goto _L4
_L4:
        if (a(a.c))
        {
            throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        int i1;
        int j1;
        try
        {
            j1 = Integer.parseInt(charsequence.subSequence(i, j).toString(), 16);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            return 0;
        }
        if (j1 > 65535)
        {
            charsequence = Character.toChars(j1);
            writer.write(charsequence[0]);
            writer.write(charsequence[1]);
        } else
        {
            writer.write(j1);
        }
        if (k != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        return k + ((j + 2) - i) + i1;
        j1 = Integer.parseInt(charsequence.subSequence(i, j).toString(), 10);
        break MISSING_BLOCK_LABEL_272;
        k = 0;
          goto _L5
    }
}
