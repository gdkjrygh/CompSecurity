// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.settings:
//            LegalFragment

public class LegalActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;

    public LegalActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentFragment(LegalFragment.create());
    }

    public boolean onNavigateUp()
    {
        finish();
        return true;
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }
}
