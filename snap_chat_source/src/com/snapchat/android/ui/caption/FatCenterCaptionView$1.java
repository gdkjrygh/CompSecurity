// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.ViewTreeObserver;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCenterCaptionView, FatCaptionEditText

final class a
    implements android.view.rawListener
{

    private ViewTreeObserver a;
    private FatCenterCaptionView b;

    public final boolean onPreDraw()
    {
        int i = ((FatCaptionEditText)b.a).getWidth();
        b.a((b.c - i) / 2);
        if (a.isAlive())
        {
            a.removeOnPreDrawListener(this);
        }
        return false;
    }

    (FatCenterCaptionView fatcentercaptionview, ViewTreeObserver viewtreeobserver)
    {
        b = fatcentercaptionview;
        a = viewtreeobserver;
        super();
    }
}
