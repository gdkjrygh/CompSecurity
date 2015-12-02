// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.base.fragment.e;
import com.facebook.c.s;
import com.facebook.inject.t;
import java.lang.reflect.Constructor;

// Referenced classes of package com.facebook.auth.login:
//            c, AuthFragmentConfig, AuthStateMachineConfig, AuthNavigationController

public abstract class AuthFragmentBase extends AbstractNavigableFragment
    implements c
{

    private AuthStateMachineConfig a;
    private Class c;
    private boolean d;

    public AuthFragmentBase()
    {
    }

    private Class a()
    {
        if (c == null)
        {
            c = d().a;
        }
        return c;
    }

    public boolean O()
    {
        return d;
    }

    protected void P()
    {
        d((new e(c().c())).b().c());
    }

    protected View a(Class class1, ViewGroup viewgroup)
    {
        try
        {
            class1 = (View)a().getConstructor(new Class[] {
                android/content/Context, class1
            }).newInstance(new Object[] {
                n(), this
            });
            class1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Unable to create ");
            if (c != null)
            {
                class1 = c.getName();
            } else
            {
                class1 = "<unknown class>";
            }
            throw new RuntimeException(stringbuilder.append(class1).toString(), viewgroup);
        }
        return class1;
    }

    public void a(Context context)
    {
        super.a(context);
        d = ((AuthNavigationController)r()).b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        bundle = bundle.getString("viewClassName");
        c = Class.forName(bundle);
        return;
        bundle;
        c = null;
        return;
    }

    public void b(Intent intent)
    {
        ((s)S().a(com/facebook/c/s)).b(intent, n());
    }

    protected boolean b()
    {
        if (super.b())
        {
            return true;
        } else
        {
            P();
            return true;
        }
    }

    public AuthStateMachineConfig c()
    {
        if (a == null)
        {
            a = ((AuthNavigationController)r()).a();
        }
        return a;
    }

    public AuthFragmentConfig d()
    {
        return c().a(getClass());
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (c != null)
        {
            bundle.putString("viewClassName", c.getCanonicalName());
        }
    }
}
