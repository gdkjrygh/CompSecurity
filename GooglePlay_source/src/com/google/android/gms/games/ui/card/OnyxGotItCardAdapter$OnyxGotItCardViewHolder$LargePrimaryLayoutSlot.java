// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.widget.Button;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxGotItCardAdapter

private final class this._cls0 extends TextViewLayoutSlot
{

    final this._cls0 this$0;

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        _fld0.setVisibility(8);
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        _fld0.setVisibility(0);
    }

    public ()
    {
        this$0 = this._cls0.this;
        super(this._mth0(this._cls0.this), _fld0);
    }
}
