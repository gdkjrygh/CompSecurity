// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.Intent;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvActivity

public class MnvAddNumberActivity extends MnvActivity
{

    public MnvAddNumberActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 0 && j == -1)
        {
            finish();
        }
    }
}
