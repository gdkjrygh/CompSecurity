// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

final class this._cls0
    implements android.content.Listener
{

    final VideoCaptureFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (getActivity() != null)
        {
            getActivity().finish();
        }
    }

    ()
    {
        this$0 = VideoCaptureFragment.this;
        super();
    }
}
