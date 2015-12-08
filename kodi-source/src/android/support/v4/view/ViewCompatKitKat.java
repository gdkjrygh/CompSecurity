// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class ViewCompatKitKat
{

    public static boolean isAttachedToWindow(View view)
    {
        return view.isAttachedToWindow();
    }

    public static boolean isLaidOut(View view)
    {
        return view.isLaidOut();
    }
}
