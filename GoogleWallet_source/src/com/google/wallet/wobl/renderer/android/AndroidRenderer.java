// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.Context;
import com.google.common.base.Preconditions;
import com.google.wallet.wobl.intermediaterepresentation.ActionIr;
import com.google.wallet.wobl.intermediaterepresentation.BarcodeIr;
import com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr;
import com.google.wallet.wobl.intermediaterepresentation.FieldIr;
import com.google.wallet.wobl.intermediaterepresentation.LineIr;
import com.google.wallet.wobl.intermediaterepresentation.SpinnerIr;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.renderer.AbstractRenderer;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidBarcodeTagRenderer, AndroidColumnLayoutTagRenderer, AndroidFieldTagRenderer, AndroidTextTagRenderer, 
//            AndroidLineTagRenderer, AndroidActionTagRenderer, AndroidSpinnerTagRenderer, RendererClient

public class AndroidRenderer extends AbstractRenderer
{

    private final Context context;
    private RendererClient mRendererClient;

    public AndroidRenderer(Context context1)
    {
        context = (Context)Preconditions.checkNotNull(context1);
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/BarcodeIr, new AndroidBarcodeTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/ColumnLayoutIr, new AndroidColumnLayoutTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/FieldIr, new AndroidFieldTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/TextIr, new AndroidTextTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/LineIr, new AndroidLineTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/ActionIr, new AndroidActionTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/SpinnerIr, new AndroidSpinnerTagRenderer(this));
    }

    public Context getContext()
    {
        return context;
    }

    RendererClient getRendererClient()
    {
        return mRendererClient;
    }

    public void setRendererClient(RendererClient rendererclient)
    {
        mRendererClient = rendererclient;
    }
}
