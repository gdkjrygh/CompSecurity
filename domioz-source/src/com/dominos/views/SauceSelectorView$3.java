// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import com.dominos.android.sdk.core.models.LabsProductLine;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView

class bsProductLine
    implements android.view.
{

    final SauceSelectorView this$0;
    final LabsProductLine val$productLine;

    public void onClick(View view)
    {
        incrementSauceAmount(val$productLine);
    }

    bsProductLine()
    {
        this$0 = final_sauceselectorview;
        val$productLine = LabsProductLine.this;
        super();
    }
}
