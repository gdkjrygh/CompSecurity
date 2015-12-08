// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.aj;
import android.support.v4.app.ax;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.jcp.fragments.LPOAddressFragment;
import com.jcp.fragments.UnitedAddressFragment;

public class r extends ax
{

    private Bundle a;
    private SparseArray b;

    public r(aj aj, Bundle bundle)
    {
        super(aj);
        b = new SparseArray();
        a = bundle;
    }

    public int a(Object obj)
    {
        return -2;
    }

    public Parcelable a()
    {
        return null;
    }

    public Fragment a(int i)
    {
        Object obj = null;
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 34
    //                   1 45;
           goto _L1 _L2 _L3
_L1:
        ((Fragment) (obj)).g(a);
        return ((Fragment) (obj));
_L2:
        obj = new UnitedAddressFragment();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new LPOAddressFragment();
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Object a(ViewGroup viewgroup, int i)
    {
        viewgroup = (Fragment)super.a(viewgroup, i);
        b.put(i, viewgroup);
        return viewgroup;
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        b.remove(i);
        super.a(viewgroup, i, obj);
    }

    public int b()
    {
        return 2;
    }

    public Fragment b(int i)
    {
        return (Fragment)b.get(i);
    }
}
