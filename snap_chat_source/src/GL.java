// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class GL
{
    public static final class a
    {

        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int j, int k, int l)
        {
            a = i;
            b = j;
            c = k;
            d = l;
        }
    }


    public final Fh a;
    public View b;
    public boolean c;

    public GL(Fh fh)
    {
        a = fh;
    }

    public static int a(int i, boolean flag)
    {
        switch (i % 10)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid input: ")).append(i).toString());

        case 0: // '\0'
            return 0x7f0200e4;

        case 1: // '\001'
            return !flag ? 0x7f0200e5 : 0x7f0200e6;

        case 2: // '\002'
            return 0x7f0200e7;

        case 3: // '\003'
            return 0x7f0200e8;

        case 4: // '\004'
            return 0x7f0200e9;

        case 5: // '\005'
            return 0x7f0200ea;

        case 6: // '\006'
            return 0x7f0200eb;

        case 7: // '\007'
            return 0x7f0200ec;

        case 8: // '\b'
            return 0x7f0200ed;

        case 9: // '\t'
            return 0x7f0200ee;
        }
    }
}
