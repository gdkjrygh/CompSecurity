// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

class ViewGroupCompatJellybeanMR2
{

    ViewGroupCompatJellybeanMR2()
    {
    }

    public static int getLayoutMode(ViewGroup viewgroup)
    {
        return viewgroup.getLayoutMode();
    }

    public static void setLayoutMode(ViewGroup viewgroup, int i)
    {
        viewgroup.setLayoutMode(i);
    }
}
