// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import com.facebook.common.h.a;
import com.facebook.inject.t;
import java.util.UUID;

public class FbFragment extends Fragment
{

    private final String a = com.facebook.common.h.a.a().toString();

    public FbFragment()
    {
    }

    public t S()
    {
        return t.a(n());
    }

    protected View a(View view, int i)
    {
        return view.findViewById(i);
    }

    protected View d(int i)
    {
        return z().findViewById(i);
    }
}
