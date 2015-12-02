// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

// Referenced classes of package android.support.v4.view:
//            p, o, q

public class n
{

    static final q a;

    public n()
    {
    }

    public static boolean a(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static boolean a(KeyEvent keyevent, int i)
    {
        return a.a(keyevent.getMetaState(), i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new p();
        } else
        {
            a = new o();
        }
    }
}
