// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.content.DialogInterface;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class val.pictureUrl
    implements android.content.e.OnClickListener
{

    final AmobeeView this$0;
    private final String val$pictureUrl;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        (new nloadPicture(AmobeeView.this)).execute(new String[] {
            val$pictureUrl
        });
    }

    nloadPicture()
    {
        this$0 = final_amobeeview;
        val$pictureUrl = String.this;
        super();
    }
}
