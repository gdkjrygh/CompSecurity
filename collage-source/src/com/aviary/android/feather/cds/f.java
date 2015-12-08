// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.aviary.android.feather.cds:
//            e, b

public final class f
{
    public static abstract class a
    {

        com.aviary.android.feather.common.a.a.c b;
        final a.b c;

        public abstract boolean a(Context context, long l, File file, boolean flag)
            throws AssertionError;

        public a(a.b b1)
        {
            b = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/cds/f.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
            c = b1;
        }
    }


    public f()
    {
    }

    public static a a(a.a a1, a.b b1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.cds.a.a.values().length];
                try
                {
                    a[a.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new e(b1);

        case 2: // '\002'
            return new b(b1);
        }
    }
}
