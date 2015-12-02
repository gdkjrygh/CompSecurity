// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.View;
import com.facebook.widget.l;

public class ea
    implements l
{

    private final View a;

    public ea(View view)
    {
        a = view;
    }

    public void setX(float f)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
        marginlayoutparams.leftMargin = (int)f;
        a.setLayoutParams(marginlayoutparams);
    }

    public void setY(float f)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
        marginlayoutparams.topMargin = (int)f;
        a.setLayoutParams(marginlayoutparams);
    }
}
