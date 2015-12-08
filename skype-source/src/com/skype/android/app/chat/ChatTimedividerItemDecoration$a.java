// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.chat:
//            ChatTimedividerItemDecoration

private static final class lineRight
{

    TextView dividerTextView;
    View lineLeft;
    View lineRight;

    public final void update(String s, boolean flag)
    {
        boolean flag1 = false;
        dividerTextView.setText(s);
        s = lineLeft;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        s.setVisibility(i);
        s = lineRight;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 4;
        }
        s.setVisibility(i);
    }

    public (View view)
    {
        dividerTextView = (TextView)view.findViewById(0x7f1002cb);
        lineLeft = view.findViewById(0x7f1002cd);
        lineRight = view.findViewById(0x7f1002cc);
    }
}
