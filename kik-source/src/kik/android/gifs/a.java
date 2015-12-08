// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs;

import android.app.ActivityManager;
import android.content.Context;

public abstract class a
{

    public static kik.a.d.a.c a;
    public static kik.a.d.a.c b;
    public static kik.android.gifs.a.f.a c;
    public static kik.android.gifs.a.f.a d;

    public static void a(Context context)
    {
        if (((ActivityManager)context.getSystemService("activity")).getMemoryClass() <= 64)
        {
            a = kik.a.d.a.c.f;
        }
    }

    public static boolean a(kik.a.d.a.a a1)
    {
label0:
        {
            boolean flag2 = false;
            boolean flag1 = a1.b(a);
            boolean flag3 = a1.b(b);
            boolean flag;
            if (a1.h() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag1)
            {
                flag1 = flag2;
                if (!flag3)
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (flag)
            {
                flag1 = true;
            }
        }
        return flag1;
    }

    static 
    {
        a = kik.a.d.a.c.b;
        b = kik.a.d.a.c.f;
        c = kik.android.gifs.a.f.a.c;
        d = kik.android.gifs.a.f.a.g;
    }
}
