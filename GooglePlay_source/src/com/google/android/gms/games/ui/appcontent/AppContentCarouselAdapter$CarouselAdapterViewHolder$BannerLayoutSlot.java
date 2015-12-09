// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.layouts.LayoutSlot;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentCarouselAdapter, AppContentUtils, CarouselViewPager

private final class <init> extends LayoutSlot
{

    final eOnResize this$0;

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        this._cls0.this.<init>.setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        float f;
        Object obj;
        f = 0.8F;
        super.setAnnotation(appcontentannotation);
        obj = this._cls0.this;
        if (appcontentannotation.getModifiers() != null) goto _L2; else goto _L1
_L1:
        obj._fld0 = f;
        obj = appcontentannotation.getImageUri();
        int i = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
        if (obj != null || i > 0)
        {
            _fld0.loadUri$3329f911(((android.net.Uri) (obj)), i, true);
            eOnResize = true;
            eOnResize.requestLayout();
        }
        return;
_L2:
        String s = appcontentannotation.getModifiers().getString("height");
        if (!TextUtils.isEmpty(s))
        {
            f = Float.parseFloat(s);
        }
        if (true) goto _L1; else goto _L3
_L3:
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
