// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.styles;

import android.graphics.Typeface;
import android.widget.TextView;
import com.fsr.tracker.layouts.InviteViewParams;

// Referenced classes of package com.fsr.tracker.styles:
//            FsrColor

public class FsrStyles
{
    private static class ButtonText extends FsrStyle
    {

        public void apply(TextView textview, InviteViewParams inviteviewparams)
        {
            super.apply(textview, inviteviewparams);
            textview.setTextSize(0, inviteviewparams.getInviteButtonTextSize());
            textview.setTypeface(Typeface.DEFAULT_BOLD);
        }

        private ButtonText()
        {
        }

    }

    private static class ButtonTextLight extends ButtonText
    {

        public void apply(TextView textview, InviteViewParams inviteviewparams)
        {
            super.apply(textview, inviteviewparams);
            textview.setShadowLayer(1.5F, 1.0F, 1.5F, FsrColor.DARK_GREY.getColor());
            textview.setTextColor(FsrColor.WHITE.getColor());
        }

        private ButtonTextLight()
        {
        }

    }

    public static class FsrStyle
    {

        public void apply(TextView textview, InviteViewParams inviteviewparams)
        {
            textview.setShadowLayer(1.5F, 1.0F, 1.5F, -1);
            textview.setTextColor(FsrColor.DARK_GREY.getColor());
        }

        public FsrStyle()
        {
        }
    }

    private static class InviteText extends FsrStyle
    {

        public void apply(TextView textview, InviteViewParams inviteviewparams)
        {
            super.apply(textview, inviteviewparams);
            textview.setTextSize(0, inviteviewparams.getInviteBodyTextSize());
        }

        private InviteText()
        {
        }

    }

    private static class InviteTitle extends FsrStyle
    {

        public void apply(TextView textview, InviteViewParams inviteviewparams)
        {
            super.apply(textview, inviteviewparams);
            textview.setTextSize(0, inviteviewparams.getInviteHeadingTextSize());
            textview.setTypeface(Typeface.DEFAULT_BOLD);
        }

        private InviteTitle()
        {
        }

    }


    public static final FsrStyle BUTTON_TEXT = new ButtonText();
    public static final FsrStyle BUTTON_TEXT_LIGHT = new ButtonTextLight();
    public static final FsrStyle FSR_STYLE = new FsrStyle();
    public static final FsrStyle INVITE_TEXT = new InviteText();
    public static final FsrStyle INVITE_TITLE = new InviteTitle();

    public FsrStyles()
    {
    }

}
