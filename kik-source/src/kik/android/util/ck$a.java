// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package kik.android.util:
//            ck

private static final class <init>
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    final ArrayList a;
    final HashSet b;
    final Map c;
    int d;

    private a()
    {
        a = new ArrayList();
        b = new HashSet();
        c = new LinkedHashMap();
        d = a.a;
    }

    a.a(byte byte0)
    {
        this();
    }
}
