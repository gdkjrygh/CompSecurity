// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.common;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.au;

public class e extends DialogFragment
{

    public e()
    {
        setStyle(0, au.a);
        setCancelable(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.O, viewgroup, false);
        if (layoutinflater != null)
        {
            layoutinflater.setVisibility(0);
        }
        return layoutinflater;
    }
}
