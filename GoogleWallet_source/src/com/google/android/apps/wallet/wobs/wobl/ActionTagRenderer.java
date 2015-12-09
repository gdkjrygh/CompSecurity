// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.wallet.wobl.intermediaterepresentation.ActionIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.renderer.android.AndroidActionTagRenderer;
import com.google.wallet.wobl.renderer.android.AndroidRenderer;

public final class ActionTagRenderer extends AndroidActionTagRenderer
{

    public ActionTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public final volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((TextView)view, (ActionIr)intermediaterepresentation);
    }

    public final void applyIrToView(TextView textview, ActionIr actionir)
    {
        super.applyIrToView(textview, actionir);
        Views.setLinkContentDescription(textview);
    }

    public final volatile void applyIrToView(TextView textview, TextIr textir)
    {
        applyIrToView(textview, (ActionIr)textir);
    }
}
