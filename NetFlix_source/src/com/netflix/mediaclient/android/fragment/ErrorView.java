// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.view.LayoutInflater;
import android.view.View;
import com.netflix.mediaclient.android.widget.ErrorWrapper;

public class ErrorView
{

    private ErrorView()
    {
    }

    public static View create(LayoutInflater layoutinflater, com.netflix.mediaclient.android.widget.ErrorWrapper.Callback callback)
    {
        layoutinflater = layoutinflater.inflate(0x7f03002a, null);
        new ErrorWrapper(layoutinflater, callback);
        return layoutinflater;
    }
}
