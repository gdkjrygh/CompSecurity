// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import kik.a.f.q;
import kik.android.chat.KikApplication;

public final class cy
{

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return KikApplication.f(0x7f0900ae);

        case 101: // 'e'
            return KikApplication.f(0x7f0900af);
        }
    }

    public static String a(Throwable throwable)
    {
label0:
        {
            String s = a(103);
            if (throwable instanceof q)
            {
                throwable = (q)throwable;
                int i = throwable.a();
                switch (i)
                {
                default:
                    s = a(i);
                    break;

                case 104: // 'h'
                    break label0;
                }
            }
            return s;
        }
        return (String)throwable.b();
    }
}
