// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;
import android.view.ViewOutlineProvider;

class ViewUtilsLollipop
{

    ViewUtilsLollipop()
    {
    }

    static void setBoundsViewOutlineProvider(View view)
    {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
