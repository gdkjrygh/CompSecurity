// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.Activity;
import com.facebook.base.activity.a;
import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;
import com.google.common.base.Optional;

public class at extends a
{

    private final Optional a;
    private Activity b;

    public at(Optional optional)
    {
        a = optional;
    }

    public Activity a()
    {
        return b;
    }

    public void b(Activity activity)
    {
        b = activity;
        if (a.isPresent())
        {
            ((f)a.get()).a(d.n, Boolean.valueOf(true));
        }
    }

    public void c(Activity activity)
    {
        b = null;
        if (a.isPresent())
        {
            ((f)a.get()).a(d.n, Boolean.valueOf(false));
        }
    }
}
