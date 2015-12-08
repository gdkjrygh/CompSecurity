// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//            d, f

public final class android.support.v4.text.e
{
    private static final class a
        implements c
    {

        public static final a a = new a(true);
        public static final a b = new a(false);
        private final boolean c;

        public final int a(CharSequence charsequence, int i)
        {
            boolean flag;
            int j;
            flag = false;
            j = 0;
_L6:
            if (j >= i + 0) goto _L2; else goto _L1
_L1:
            android.support.v4.text.e.b(Character.getDirectionality(charsequence.charAt(j)));
            JVM INSTR tableswitch 0 1: default 48
        //                       0 57
        //                       1 71;
               goto _L3 _L4 _L5
_L3:
            j++;
              goto _L6
_L4:
            if (!c) goto _L8; else goto _L7
_L7:
            return 0;
_L8:
            flag = true;
              goto _L3
_L5:
            if (!c)
            {
                return 1;
            }
            flag = true;
              goto _L3
_L2:
            if (!flag) goto _L10; else goto _L9
_L9:
            if (c)
            {
                return 1;
            }
              goto _L7
_L10:
            return 2;
              goto _L3
        }


        private a(boolean flag)
        {
            c = flag;
        }
    }

    private static final class b
        implements c
    {

        public static final b a = new b();

        public final int a(CharSequence charsequence, int i)
        {
            int k = 2;
            for (int j = 0; j < i + 0 && k == 2; j++)
            {
                k = android.support.v4.text.e.a(Character.getDirectionality(charsequence.charAt(j)));
            }

            return k;
        }


        private b()
        {
        }
    }

    private static interface c
    {

        public abstract int a(CharSequence charsequence, int i);
    }

    private static abstract class d
        implements android.support.v4.text.d
    {

        private final c a;

        protected abstract boolean a();

        public final boolean a(CharSequence charsequence, int i)
        {
            if (charsequence == null || i < 0 || charsequence.length() - i < 0)
            {
                throw new IllegalArgumentException();
            }
            if (a == null)
            {
                return a();
            }
            switch (a.a(charsequence, i))
            {
            default:
                return a();

            case 0: // '\0'
                return true;

            case 1: // '\001'
                return false;
            }
        }

        public d(c c1)
        {
            a = c1;
        }
    }

    private static final class e extends d
    {

        private final boolean a;

        protected final boolean a()
        {
            return a;
        }

        private e(c c1, boolean flag)
        {
            super(c1);
            a = flag;
        }

        e(c c1, boolean flag, byte byte0)
        {
            this(c1, flag);
        }
    }

    private static final class f extends d
    {

        public static final f a = new f();

        protected final boolean a()
        {
            return android.support.v4.text.f.a(Locale.getDefault()) == 1;
        }


        public f()
        {
            super(null);
        }
    }


    public static final android.support.v4.text.d a = new e(null, false, (byte)0);
    public static final android.support.v4.text.d b = new e(null, true, (byte)0);
    public static final android.support.v4.text.d c;
    public static final android.support.v4.text.d d;
    public static final android.support.v4.text.d e;
    public static final android.support.v4.text.d f;

    static int a(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
        case 14: // '\016'
        case 15: // '\017'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
        case 16: // '\020'
        case 17: // '\021'
            return 0;
        }
    }

    static int b(int i)
    {
        switch (i)
        {
        default:
            return 2;

        case 0: // '\0'
            return 1;

        case 1: // '\001'
        case 2: // '\002'
            return 0;
        }
    }

    static 
    {
        c = new e(b.a, false, (byte)0);
        d = new e(b.a, true, (byte)0);
        e = new e(a.a, false, (byte)0);
        f = f.a;
    }
}
