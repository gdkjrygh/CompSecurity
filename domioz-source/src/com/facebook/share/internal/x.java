// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.res.Resources;
import com.facebook.av;
import com.facebook.ay;
import com.facebook.j;

public final class x extends j
{

    public final void setSelected(boolean flag)
    {
        super.setSelected(flag);
        if (isSelected())
        {
            setCompoundDrawablesWithIntrinsicBounds(av.b, 0, 0, 0);
            setText(getResources().getString(ay.c));
            return;
        } else
        {
            setCompoundDrawablesWithIntrinsicBounds(av.a, 0, 0, 0);
            setText(getResources().getString(ay.d));
            return;
        }
    }
}
