// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.support.v4.app.m;
import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.cw.c;
import p.df.a;

public class n extends m
{

    public n()
    {
    }

    protected void a(String s1)
    {
        p.df.a.c("BaseListFragment", "FRAGMENT [%d] %s", new Object[] {
            Integer.valueOf(hashCode()), s1
        });
    }

    public void onDestroyView()
    {
        if (getView() != null)
        {
            b.a.b().c(this);
            b.a.e().b(this);
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (s.u())
        {
            super.onSaveInstanceState(bundle);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        b.a.b().b(this);
        b.a.e().c(this);
        super.onViewCreated(view, bundle);
    }
}
