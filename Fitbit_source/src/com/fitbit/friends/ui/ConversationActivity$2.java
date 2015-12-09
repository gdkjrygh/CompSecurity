// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.app.FragmentActivity;
import android.widget.LinearLayout;

// Referenced classes of package com.fitbit.friends.ui:
//            b, ConversationActivity

class a extends b
{

    final ConversationActivity a;

    protected void c()
    {
        a.e.setEnabled(true);
    }

    protected void d()
    {
        super.d();
        a.finish();
    }

    (ConversationActivity conversationactivity, FragmentActivity fragmentactivity, String s, String s1, com.fitbit.data.domain. , String s2, String s3)
    {
        a = conversationactivity;
        super(fragmentactivity, s, s1, , s2, s3);
    }
}
