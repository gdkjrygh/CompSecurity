// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Rect;

public interface FitWindowsViewGroup
{
    public static interface OnFitSystemWindowsListener
    {

        public abstract void onFitSystemWindows(Rect rect);
    }


    public abstract void setOnFitSystemWindowsListener(OnFitSystemWindowsListener onfitsystemwindowslistener);
}
