// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.styles;

import android.graphics.Typeface;
import android.widget.TextView;
import com.fsr.tracker.layouts.InviteViewParams;

// Referenced classes of package com.fsr.tracker.styles:
//            FsrStyles

private static class <init> extends <init>
{

    public void apply(TextView textview, InviteViewParams inviteviewparams)
    {
        super.ly(textview, inviteviewparams);
        textview.setTextSize(0, inviteviewparams.getInviteHeadingTextSize());
        textview.setTypeface(Typeface.DEFAULT_BOLD);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
