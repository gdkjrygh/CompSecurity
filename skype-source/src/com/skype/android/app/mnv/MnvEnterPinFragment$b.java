// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.widget.TextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvEnterPinFragment

private final class view
    implements Runnable
{

    final MnvEnterPinFragment this$0;
    private TextView view;

    public final void run()
    {
        if (view != null)
        {
            view.setVisibility(0);
        }
    }

    public (TextView textview)
    {
        this$0 = MnvEnterPinFragment.this;
        super();
        view = textview;
    }
}
