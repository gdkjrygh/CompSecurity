// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.view.View;

// Referenced classes of package com.google.android.play.onboard:
//            InterstitialOverlay

final class val.cellTag
    implements 
{

    final InterstitialOverlay this$0;
    final String val$cellTag;

    public final volatile boolean apply(Object obj)
    {
        obj = (View)obj;
        return val$cellTag.equals(((View) (obj)).getTag());
    }

    ()
    {
        this$0 = final_interstitialoverlay;
        val$cellTag = String.this;
        super();
    }
}
