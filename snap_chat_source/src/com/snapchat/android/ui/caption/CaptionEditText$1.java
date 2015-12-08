// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.ui.caption:
//            CaptionEditText

final class a
    implements android.widget.ctionListener
{

    private CaptionEditText a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 0 || i == 6)
        {
            a.b(true);
        }
        return false;
    }

    (CaptionEditText captionedittext)
    {
        a = captionedittext;
        super();
    }
}
