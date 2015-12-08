// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.view.View;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private abstract class mLayoutId
{

    int mId;
    boolean mIsEnabled;
    int mLayoutId;
    int mType;
    final GamesSettingsFragment this$0;

    public void onBindView(View view)
    {
    }

    public (int i, int j, boolean flag)
    {
        this$0 = GamesSettingsFragment.this;
        super();
        mId = i;
        mType = j;
        j;
        JVM INSTR tableswitch 0 4: default 56
    //                   0 68
    //                   1 77
    //                   2 86
    //                   3 56
    //                   4 95;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        Asserts.fail("Invalid view type");
_L7:
        mIsEnabled = flag;
        return;
_L2:
        mLayoutId = 0x7f0400ba;
        continue; /* Loop/switch isn't completed */
_L3:
        mLayoutId = 0x7f0400d0;
        continue; /* Loop/switch isn't completed */
_L4:
        mLayoutId = 0x7f0400d1;
        continue; /* Loop/switch isn't completed */
_L5:
        mLayoutId = 0x7f040085;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
