// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.q;
import android.support.v7.app.AppCompatActivity;
import com.tinder.utils.v;
import java.lang.ref.WeakReference;

public final class e
{

    protected boolean a;
    protected WeakReference b;
    protected int c;
    protected q d;

    public e(AppCompatActivity appcompatactivity)
    {
        a = true;
        c = -1;
        b = new WeakReference(appcompatactivity);
    }

    private q c()
    {
        Object obj;
        if (d != null)
        {
            obj = d;
        } else
        {
            obj = b();
            if (obj != null)
            {
                q q1 = ((AppCompatActivity) (obj)).getSupportFragmentManager().a();
                obj = q1;
                if (!a)
                {
                    d = q1;
                    return q1;
                }
            } else
            {
                return null;
            }
        }
        return ((q) (obj));
    }

    public final void a()
    {
        c = 0x7f0e020d;
    }

    public final void a(Fragment fragment)
    {
        if (fragment == null)
        {
            v.b("Attempted to add a NULL fragment!");
            v.b();
        } else
        {
            if (c == -1)
            {
                v.b("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
                v.b();
                return;
            }
            q q1 = c();
            if (q1 != null)
            {
                q1.a(c, fragment);
                if (a)
                {
                    q1.c();
                    return;
                }
            } else
            {
                v.a((new StringBuilder("Attempted to add fragment but failed to start a transaction (")).append(fragment.getClass().toString()).append(')').toString());
                v.b();
                return;
            }
        }
    }

    public final void a(Fragment fragment, String s)
    {
        if (fragment == null)
        {
            v.b("Attempted to add a NULL fragment!");
            v.b();
        } else
        {
            if (c == -1)
            {
                v.b("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
                v.b();
                return;
            }
            q q1 = c();
            if (q1 != null)
            {
                q1.a(c, fragment, s);
                if (a)
                {
                    q1.c();
                    return;
                }
            } else
            {
                v.a((new StringBuilder("Attempted to add fragment but failed to start a transaction (")).append(fragment.getClass().toString()).append(')').toString());
                v.b();
                return;
            }
        }
    }

    final AppCompatActivity b()
    {
        if (b != null)
        {
            AppCompatActivity appcompatactivity = (AppCompatActivity)b.get();
            if (appcompatactivity != null && !appcompatactivity.isFinishing())
            {
                return appcompatactivity;
            }
        }
        return null;
    }

    public final void b(Fragment fragment)
    {
        if (fragment == null)
        {
            v.b("Attempted to add a NULL fragment!");
            v.b();
        } else
        {
            if (c == -1)
            {
                v.b("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
                v.b();
                return;
            }
            q q1 = c();
            if (q1 != null)
            {
                q1.a(c, fragment).a(null);
                if (a)
                {
                    q1.c();
                    return;
                }
            } else
            {
                v.a((new StringBuilder("Attempted to add fragment but failed to start a transaction (")).append(fragment.getClass().toString()).append(')').toString());
                v.b();
                return;
            }
        }
    }

    public final void b(Fragment fragment, String s)
    {
        if (fragment == null)
        {
            v.b("Attempted to add a NULL fragment!");
            v.b();
        } else
        {
            if (c == -1)
            {
                v.b("Attempted to add a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
                v.b();
                return;
            }
            q q1 = c();
            if (q1 != null)
            {
                q1.a();
                q1.a(c, fragment, s).a(s);
                if (a)
                {
                    q1.c();
                    return;
                }
            } else
            {
                v.a((new StringBuilder("Attempted to add fragment but failed to start a transaction (")).append(fragment.getClass().toString()).append(')').toString());
                v.b();
                return;
            }
        }
    }

    public final void c(Fragment fragment)
    {
        if (fragment == null)
        {
            v.b("Attempted to replace with a NULL fragment!");
            v.b();
        } else
        {
            if (c == -1)
            {
                v.b("Attempted to replace a fragment, but the default container has not been set. Set it using FragmentHelper.setDefaultContainer(int)");
                v.b();
                return;
            }
            if (b != null && b.get() != null)
            {
                ((AppCompatActivity)b.get()).getSupportFragmentManager().d();
            }
            q q1 = c();
            if (q1 != null)
            {
                q1.b(c, fragment);
                if (a)
                {
                    q1.c();
                    return;
                }
            } else
            {
                v.a((new StringBuilder("Attempted to replace fragment but failed to start a transaction (")).append(fragment.getClass().toString()).append(')').toString());
                v.b();
                return;
            }
        }
    }
}
