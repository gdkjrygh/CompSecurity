// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.graphics.Color;
import android.os.Bundle;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxGotItCardAdapter

private final class <init> extends LayoutSlot
{

    final this._cls0 this$0;

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        this._cls0.this.<init>.setVisibility(4);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        Bundle bundle = appcontentannotation.getModifiers();
        if (bundle.containsKey("backgroundColor"))
        {
            _fld0.setBackgroundColor(Color.parseColor(bundle.getString("backgroundColor")));
        }
        _fld0.setImageResource(AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId()));
        _fld0.setVisibility(0);
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
