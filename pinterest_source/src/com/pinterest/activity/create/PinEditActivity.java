// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.os.Bundle;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.fragment.PinEditFragment;

// Referenced classes of package com.pinterest.activity.create:
//            RepinActivity

public class PinEditActivity extends RepinActivity
{

    public PinEditActivity()
    {
    }

    protected void init()
    {
        setContentView(0x7f03001f);
        _repinFragment = new PinEditFragment();
        FragmentHelper.replaceFragment(this, _repinFragment, false);
        FragmentHelper.updateFragmentWidth(this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
