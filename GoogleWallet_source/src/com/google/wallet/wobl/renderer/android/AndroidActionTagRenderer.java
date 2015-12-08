// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.google.wallet.wobl.intermediaterepresentation.ActionIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTextTagRenderer, AndroidRenderer

public class AndroidActionTagRenderer extends AndroidTextTagRenderer
{

    public AndroidActionTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((TextView)view, (ActionIr)intermediaterepresentation);
    }

    public void applyIrToView(TextView textview, ActionIr actionir)
    {
        int i;
        super.applyIrToView(textview, actionir);
        i = R.drawable.wobl_ic_globe;
        if (!actionir.getIcon().isPresent()) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon = new int[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.CHECKMARK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.MAIL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.MAP.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.NAVIGATION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.NONE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.PHONE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.RECEIPT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$ActionIr$ActionIcon[com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon.LINK.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon[((com.google.wallet.wobl.intermediaterepresentation.ActionIr.ActionIcon)actionir.getIcon().get()).ordinal()];
        JVM INSTR tableswitch 1 7: default 80
    //                   1 175
    //                   2 182
    //                   3 189
    //                   4 196
    //                   5 217
    //                   6 203
    //                   7 210;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        i = R.drawable.wobl_ic_globe;
_L2:
        textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        textview.setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(R.dimen.wobl_action_icon_padding));
        if (actionir.getAlpha().isPresent())
        {
            int j = convertAlphaToInt(((Float)actionir.getAlpha().get()).floatValue());
            textview = textview.getCompoundDrawables();
            int k = textview.length;
            for (i = 0; i < k; i++)
            {
                actionir = textview[i];
                if (actionir != null)
                {
                    actionir.setAlpha(j);
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        i = R.drawable.wobl_ic_checkmark;
        continue; /* Loop/switch isn't completed */
_L5:
        i = R.drawable.wobl_ic_mail;
        continue; /* Loop/switch isn't completed */
_L6:
        i = R.drawable.wobl_ic_map;
        continue; /* Loop/switch isn't completed */
_L7:
        i = R.drawable.wobl_ic_navigate;
        continue; /* Loop/switch isn't completed */
_L9:
        i = R.drawable.wobl_ic_phone;
        continue; /* Loop/switch isn't completed */
_L10:
        i = R.drawable.wobl_ic_receipt;
        if (true) goto _L2; else goto _L8
_L8:
    }

    public volatile void applyIrToView(TextView textview, TextIr textir)
    {
        applyIrToView(textview, (ActionIr)textir);
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public TextView getViewInstance()
    {
        return new TextView(getContext());
    }
}
