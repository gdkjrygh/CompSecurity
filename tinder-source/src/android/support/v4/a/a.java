// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.view.View;

// Referenced classes of package android.support.v4.a:
//            f, e, c, g

public abstract class a
{

    static c a;

    public static g a()
    {
        return a.a();
    }

    public static void a(View view)
    {
        a.a(view);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            a = new f();
        } else
        {
            a = new e();
        }
    }
}
