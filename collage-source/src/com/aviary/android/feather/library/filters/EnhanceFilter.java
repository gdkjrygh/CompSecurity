// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import java.util.Locale;

public class EnhanceFilter extends NativeFilter
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/library/filters/EnhanceFilter$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("HiDef", 0);
            b = new a("Illuminate", 1);
            c = new a("ColorFix", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    EnhanceFilter()
    {
        super(new String[] {
            "enhance"
        });
        a(a.a);
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(0).a("name", a1.name().toLowerCase(Locale.US));
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }
}
