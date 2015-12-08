// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.Activity;
import android.view.Window;

// Referenced classes of package com.nbcsports.liveextra.library.ui.systemui:
//            SystemUiHelper

static class mActivity extends mActivity
{

    void hide()
    {
        if (mLevel > 0)
        {
            mActivity.getWindow().addFlags(1024);
            setIsShowing(false);
        }
    }

    void show()
    {
        if (mLevel > 0)
        {
            mActivity.getWindow().clearFlags(1024);
            setIsShowing(true);
        }
    }

    ner(Activity activity, int i, int j, ner ner)
    {
        super(activity, i, j, ner);
        if ((mFlags & 1) != 0)
        {
            mActivity.getWindow().addFlags(768);
        }
    }
}
