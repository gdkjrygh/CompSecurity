// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.app.Activity;
import com.google.wallet.wobl.intermediaterepresentation.ActionIr;
import com.google.wallet.wobl.intermediaterepresentation.BarcodeIr;
import com.google.wallet.wobl.intermediaterepresentation.ImageIr;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;
import com.google.wallet.wobl.renderer.android.AndroidRenderer;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl:
//            ActionTagRenderer, BarcodeTagRenderer, ImageTagRenderer, EllipsizingTextTagRenderer

public class WalletWoblRenderer extends AndroidRenderer
{

    public WalletWoblRenderer(Activity activity)
    {
        super(activity);
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/ActionIr, new ActionTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/BarcodeIr, new BarcodeTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/ImageIr, new ImageTagRenderer(this));
        registerTagRenderer(com/google/wallet/wobl/intermediaterepresentation/TextIr, new EllipsizingTextTagRenderer(this));
    }
}
