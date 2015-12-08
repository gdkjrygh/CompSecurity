// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import com.jcp.e.f;
import java.lang.ref.WeakReference;

public class b
{

    private WeakReference a;
    private WeakReference b;

    public b()
    {
        a = new WeakReference(null);
        b = new WeakReference(null);
    }

    protected void a(Context context)
    {
        a = new WeakReference(context);
    }

    protected void a(f f1)
    {
        b = new WeakReference(f1);
    }

    protected Context b()
    {
        if (a == null)
        {
            throw new NullPointerException("BaseController.mContext is null. Did you forget to call setContext?");
        } else
        {
            return (Context)a.get();
        }
    }

    protected f c()
    {
        if (b == null)
        {
            throw new NullPointerException("BaseController.mListener is null. Did you forget to call setListener?");
        } else
        {
            return (f)b.get();
        }
    }
}
