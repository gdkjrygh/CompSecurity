// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import android.widget.CompoundButton;
import com.snapchat.android.ui.SnapEditorView;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.widget.edChangeListener
{

    private SnapPreviewFragment a;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = SnapPreviewFragment.f(a);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        compoundbutton.setAudible(flag);
    }

    er(SnapPreviewFragment snappreviewfragment)
    {
        a = snappreviewfragment;
        super();
    }
}
