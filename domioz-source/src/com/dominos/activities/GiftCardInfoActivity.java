// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import com.dominos.android.sdk.common.FontManager;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class GiftCardInfoActivity extends BaseActivity
{

    public GiftCardInfoActivity()
    {
    }

    void afterViews()
    {
        FontManager.applyDominosFont(this);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
