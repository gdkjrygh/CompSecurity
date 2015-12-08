// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.dl;
import com.fitbit.data.bl.s;
import com.fitbit.util.az;

// Referenced classes of package com.fitbit.friends.ui:
//            MessagesFragment

private static class  extends az
{

    protected boolean a(String s1)
    {
        return s1.equals(s.a(getContext()).a());
    }

    protected Intent[] a()
    {
        return (new Intent[] {
            dl.a(getContext(), true, true), cw.a(getContext(), true)
        });
    }

    protected void b()
    {
        s.a(getContext()).a(this);
    }

    protected void d()
    {
        s.a(getContext()).b(this);
    }

    public getContext e()
    {
        getContext getcontext = new <init>();
        a(getcontext, ah.a().b());
        b(getcontext, s.a(getContext()).d());
        a(getcontext, ah.a().d());
        return getcontext;
    }

    public Object f_()
    {
        return e();
    }

    public (Context context)
    {
        super(context, dl.d());
    }
}
