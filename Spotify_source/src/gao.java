// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.spotify.mobile.android.util.Assertion;

public final class gao
    implements gax
{

    private View a;
    private Context b;

    public gao(Context context, View view)
    {
        Assertion.a(context, "Don't pass null context to constructor");
        Assertion.a(view, "Don't pass null views to constructor");
        b = context;
        a = view;
    }

    public final void a()
    {
        a.setVisibility(0);
    }

    public final long b()
    {
        return (long)b.getResources().getInteger(0x7f0e0011);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gao)
        {
            flag = flag1;
            if (((gao)obj).a == a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
