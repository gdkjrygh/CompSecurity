// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.widget.AccessibleAutoCompleteTextView;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFragment

final class val.username
    implements Runnable
{

    final UnifiedSignInFragment this$0;
    final String val$username;

    public final void run()
    {
        userIdEdit.setText(val$username);
    }

    ew()
    {
        this$0 = final_unifiedsigninfragment;
        val$username = String.this;
        super();
    }
}
