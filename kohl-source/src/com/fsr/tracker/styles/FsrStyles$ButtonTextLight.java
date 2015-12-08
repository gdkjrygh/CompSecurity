// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.styles;

import android.widget.TextView;
import com.fsr.tracker.layouts.InviteViewParams;

// Referenced classes of package com.fsr.tracker.styles:
//            FsrStyles, FsrColor

private static class <init> extends <init>
{

    public void apply(TextView textview, InviteViewParams inviteviewparams)
    {
        super.(textview, inviteviewparams);
        textview.setShadowLayer(1.5F, 1.0F, 1.5F, FsrColor.DARK_GREY.getColor());
        textview.setTextColor(FsrColor.WHITE.getColor());
    }

    private ()
    {
        super(null);
    }

    >(> >)
    {
        this();
    }
}
