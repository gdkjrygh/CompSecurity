// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            FAQFragment

class this._cls0 extends ClickableSpan
{

    final FAQFragment this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "liveextra@nbcolympics.com", null));
        startActivity(Intent.createChooser(view, "Send email..."));
    }

    ()
    {
        this$0 = FAQFragment.this;
        super();
    }
}
