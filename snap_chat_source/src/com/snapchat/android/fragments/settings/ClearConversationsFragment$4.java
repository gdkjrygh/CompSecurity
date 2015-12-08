// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.util.AlertDialogUtils;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            ClearConversationsFragment

final class a
    implements Runnable
{

    private ClearConversationsFragment a;

    public final void run()
    {
        ClearConversationsFragment.a(a).setEnabled(true);
        ClearConversationsFragment.b(a).setVisibility(8);
        AlertDialogUtils.a(a.getString(0x7f080260), a.getActivity());
    }

    (ClearConversationsFragment clearconversationsfragment)
    {
        a = clearconversationsfragment;
        super();
    }
}
