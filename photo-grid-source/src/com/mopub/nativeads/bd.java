// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.graphics.Rect;
import android.view.View;

final class bd
{

    private final Rect a = new Rect();

    bd()
    {
    }

    final boolean a(View view, int i)
    {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null && view.getGlobalVisibleRect(a))
        {
            long l = a.height();
            long l1 = a.width();
            long l2 = (long)view.getHeight() * (long)view.getWidth();
            if (l2 > 0L && l * l1 * 100L >= l2 * (long)i)
            {
                return true;
            }
        }
        return false;
    }
}
