// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;

// Referenced classes of package com.facebook:
//            Session

class val.fragment
    implements val.fragment
{

    final yForResult this$1;
    private final Fragment val$fragment;

    public Activity getActivityContext()
    {
        return val$fragment.getActivity();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        val$fragment.startActivityForResult(intent, i);
    }

    ()
    {
        this$1 = final_;
        val$fragment = Fragment.this;
        super();
    }
}
