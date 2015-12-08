// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;

public final class cp
{

    Context a;

    public cp(Context context)
    {
        a = context;
    }

    public final StateListDrawable a(int i, int j)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        android.graphics.drawable.Drawable drawable = a.getResources().getDrawable(j);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, drawable);
        drawable = a.getResources().getDrawable(j);
        statelistdrawable.addState(new int[] {
            0x10100a1
        }, drawable);
        drawable = a.getResources().getDrawable(j);
        statelistdrawable.addState(new int[] {
            0x101009c
        }, drawable);
        drawable = a.getResources().getDrawable(i);
        statelistdrawable.addState(new int[0], drawable);
        return statelistdrawable;
    }
}
