// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            x, v, y

public final class u
{

    static final y a;

    public static boolean a(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static boolean b(KeyEvent keyevent)
    {
        return a.c(keyevent.getMetaState());
    }

    public static void c(KeyEvent keyevent)
    {
        a.a(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new x();
        } else
        {
            a = new v();
        }
    }
}
