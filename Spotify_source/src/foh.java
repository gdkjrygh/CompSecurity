// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.spotify.mobile.android.ui.ActionBarTitle;

public final class foh extends fok
{

    public Fragment a;
    private fog b;

    public foh(fog fog1, ah ah1, Fragment fragment, ActionBarTitle actionbartitle)
    {
        b = fog1;
        super(actionbartitle);
        a = fragment;
        ah1.a(fog1.b, a);
    }

    public foh(fog fog1, ah ah1, Class class1, android.support.v4.app.Fragment.SavedState savedstate, Bundle bundle, ActionBarTitle actionbartitle)
    {
        b = fog1;
        super(actionbartitle);
        try
        {
            a = (Fragment)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (fog fog1)
        {
            throw new RuntimeException(fog1);
        }
        // Misplaced declaration of an exception variable
        catch (fog fog1)
        {
            throw new RuntimeException(fog1);
        }
        a.a(savedstate);
        a.f(bundle);
        ah1.a(fog1.b, a);
    }

    public foh(fog fog1, Bundle bundle)
    {
        b = fog1;
        super(fog1.d, bundle);
        a = fog1.a.a(bundle, "fragment");
    }

    public final int a()
    {
        return 2;
    }

    public final foj a(ah ah1)
    {
        c(ah1);
        return new foj(b, a, super.d);
    }

    public final View b()
    {
        return a.y();
    }

    public final foh b(ah ah1)
    {
        return this;
    }

    public final Class c()
    {
        return a.getClass();
    }

    public final void c(ah ah1)
    {
        ah1.a(a);
    }

    public final Bundle d()
    {
        Bundle bundle = super.d();
        b.a.a(bundle, "fragment", a);
        return bundle;
    }

    public final String toString()
    {
        return (new StringBuilder("Active: ")).append(a.getClass().getName()).toString();
    }
}
