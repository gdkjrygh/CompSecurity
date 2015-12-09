// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            r, q, AppCompatDelegateImplV7, m, 
//            ActionBar

public abstract class n
{

    n()
    {
    }

    public static n a(Activity activity, m m)
    {
        return a(((Context) (activity)), activity.getWindow(), m);
    }

    public static n a(Dialog dialog, m m)
    {
        return a(dialog.getContext(), dialog.getWindow(), m);
    }

    private static n a(Context context, Window window, m m)
    {
        int k = android.os.Build.VERSION.SDK_INT;
        if (k >= 14)
        {
            return new r(context, window, m);
        }
        if (k >= 11)
        {
            return new q(context, window, m);
        } else
        {
            return new AppCompatDelegateImplV7(context, window, m);
        }
    }

    public abstract ActionBar a();

    public abstract void a(int k);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void a(CharSequence charsequence);

    public abstract MenuInflater b();

    public abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract boolean i();

    public abstract void j();
}
