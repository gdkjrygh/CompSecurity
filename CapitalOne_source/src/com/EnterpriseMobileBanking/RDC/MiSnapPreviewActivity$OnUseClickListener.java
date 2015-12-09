// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.RDC;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking.RDC:
//            MiSnapPreviewActivity

private class <init>
    implements android.view.OnUseClickListener
{

    final MiSnapPreviewActivity this$0;

    public void onClick(View view)
    {
        setResult(0x631198, getIntent());
        finish();
    }

    private ()
    {
        this$0 = MiSnapPreviewActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
