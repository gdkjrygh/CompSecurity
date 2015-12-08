// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.bannerad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

public class CMAdView extends FrameLayout
{

    private static final String a = com/cmcm/adsdk/bannerad/CMAdView.getSimpleName();
    private WeakReference b;

    public CMAdView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CMAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new WeakReference(context);
    }

}
