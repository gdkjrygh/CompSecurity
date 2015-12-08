// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            v, t, s, AppCompatDelegateImplV7, 
//            o, a

public abstract class p
{

    p()
    {
    }

    static p a(Context context, Window window, o o)
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 23)
        {
            return new v(context, window, o);
        }
        if (j >= 14)
        {
            return new t(context, window, o);
        }
        if (j >= 11)
        {
            return new s(context, window, o);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, o);
        }
    }

    public abstract a a();

    public abstract void a(int j);

    public abstract void a(Configuration configuration);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract boolean b(int j);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();
}
