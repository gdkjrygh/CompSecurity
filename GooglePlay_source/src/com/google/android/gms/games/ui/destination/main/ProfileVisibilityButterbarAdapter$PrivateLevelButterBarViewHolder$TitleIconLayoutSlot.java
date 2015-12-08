// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.widget.ImageView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            ProfileVisibilityButterbarAdapter

private final class <init> extends LayoutSlot
{

    final this._cls0 this$0;

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        <init>(this._cls0.this).setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        this._mth0(this._cls0.this).setVisibility(0);
        this._mth0(this._cls0.this).setImageResource(AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId()));
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
