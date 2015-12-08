// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import Bj;
import Bt;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import java.util.List;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.content.Listener
{

    private View a;
    private SnapPreviewFragment b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag = false;
        if (b.getActivity() == null)
        {
            return;
        }
        dialoginterface = (CheckBox)a.findViewById(0x7f0d03bf);
        Bt.a();
        if (!dialoginterface.isChecked())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (Bt.U() && i == 0)
        {
            Bt.a(OnboardingTooltip.POST_STORY);
        }
        dialoginterface = SharedPreferenceKey.HAS_SEEN_POST_STORY_DIALOG;
        if (i == 0)
        {
            flag = true;
        }
        dialoginterface.putBoolean(flag);
        if (SnapPreviewFragment.v(b).e().size() > 1)
        {
            SnapPreviewFragment.w(b);
            return;
        } else
        {
            SnapPreviewFragment.x(b);
            return;
        }
    }

    _cls9(SnapPreviewFragment snappreviewfragment, View view)
    {
        b = snappreviewfragment;
        a = view;
        super();
    }
}
