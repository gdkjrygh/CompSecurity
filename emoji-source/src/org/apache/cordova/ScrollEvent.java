// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.view.View;

public class ScrollEvent
{

    public int l;
    public int nl;
    public int nt;
    public int t;
    private View targetView;

    ScrollEvent(int i, int j, int k, int i1, View view)
    {
        l = k;
        k = t;
        nl = i;
        nt = j;
        targetView = view;
    }

    public int dl()
    {
        return nl - l;
    }

    public int dt()
    {
        return nt - t;
    }

    public View getTargetView()
    {
        return targetView;
    }
}
