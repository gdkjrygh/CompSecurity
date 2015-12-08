// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import java.util.Set;

public final class gxw
{

    public gxx a;
    private final Application b;

    public gxw(Context context)
    {
        b = (Application)context.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new gxx(b);
        }
    }

    public final boolean a(gxy gxy)
    {
        if (a != null)
        {
            gxx gxx1 = a;
            boolean flag;
            if (gxx1.b != null)
            {
                gxy = new gxx._cls1(gxy);
                gxx1.b.registerActivityLifecycleCallbacks(gxy);
                gxx1.a.add(gxy);
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }
}
