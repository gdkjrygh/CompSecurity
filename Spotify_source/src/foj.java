// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.spotify.mobile.android.ui.ActionBarTitle;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.reflect.Field;

class foj extends fok
{

    protected Class a;
    protected android.support.v4.app.Fragment.SavedState b;
    protected Bundle c;
    private fog e;

    public foj(fog fog1, Bundle bundle)
    {
        e = fog1;
        super(fog1.d, bundle);
        bundle.setClassLoader(fog1.d.getClassLoader());
        a = (Class)bundle.getSerializable("class");
        b = (android.support.v4.app.Fragment.SavedState)bundle.getParcelable("saved_state");
        c = (Bundle)bundle.getParcelable("arguments");
        try
        {
            bundle = android/support/v4/app/Fragment$SavedState.getDeclaredField("a");
            bundle.setAccessible(true);
            ((Bundle)bundle.get(b)).setClassLoader(fog1.d.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fog fog1)
        {
            Logger.b(fog1, "", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fog fog1)
        {
            Logger.b(fog1, "", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fog fog1)
        {
            Logger.b(fog1, "", new Object[0]);
        }
    }

    public foj(fog fog1, Fragment fragment, ActionBarTitle actionbartitle)
    {
        e = fog1;
        super(actionbartitle);
        a = fragment.getClass();
        b = fog1.a.a(fragment);
        c = fragment.g();
    }

    public foj(fog fog1, Class class1, android.support.v4.app.Fragment.SavedState savedstate, Bundle bundle, ActionBarTitle actionbartitle)
    {
        e = fog1;
        super(actionbartitle);
        a = class1;
        b = savedstate;
        c = bundle;
    }

    public int a()
    {
        return 0;
    }

    public foj a(ah ah)
    {
        return this;
    }

    public View b()
    {
        return null;
    }

    public foh b(ah ah)
    {
        return new foh(e, ah, a, b, c, super.d);
    }

    public final Class c()
    {
        return a;
    }

    public final Bundle d()
    {
        Bundle bundle = super.d();
        bundle.putSerializable("class", a);
        bundle.putParcelable("saved_state", b);
        bundle.putParcelable("arguments", c);
        return bundle;
    }

    public String toString()
    {
        return (new StringBuilder("Inactive: ")).append(a.getName()).toString();
    }
}
