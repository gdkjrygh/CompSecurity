// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

public abstract class dxj extends Fragment
{

    private dxh a;

    public dxj()
    {
    }

    public boolean G()
    {
        return false;
    }

    public final dxk H()
    {
        ctz.a(a);
        return (dxk)a.a_().a("FlowLogicFragmentTag");
    }

    public void a(Activity activity)
    {
        super.a(activity);
        a = (dxh)activity;
    }

    public void c(int i)
    {
    }

    public void t_()
    {
        a = null;
        super.t_();
    }

    public void z()
    {
        super.z();
        Assertion.a(H(), "A FlowLogicFragment must be set before the FlowFragment can be used.");
    }
}
