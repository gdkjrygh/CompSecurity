// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFragment

final class lt
    implements Runnable
{

    final UnifiedSignInFragment this$0;
    final lt val$result;

    public final void run()
    {
        if (val$result == lt.NO_ACCOUNT)
        {
            UnifiedSignInFragment.access$000(UnifiedSignInFragment.this, true);
        }
        UnifiedSignInFragment.access$100(UnifiedSignInFragment.this, false);
    }

    lt()
    {
        this$0 = final_unifiedsigninfragment;
        val$result = lt.this;
        super();
    }
}
