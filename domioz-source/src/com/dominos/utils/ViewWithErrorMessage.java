// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.view.View;

public class ViewWithErrorMessage
{

    private String inputRequiredErrorMessage;
    private View view;

    public ViewWithErrorMessage(View view1, String s)
    {
        view = view1;
        inputRequiredErrorMessage = s;
    }

    public String getInputRequiredErrorMessage()
    {
        return inputRequiredErrorMessage;
    }

    public View getView()
    {
        return view;
    }
}
