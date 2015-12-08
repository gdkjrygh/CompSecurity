// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.os.Bundle;

// Referenced classes of package com.fitbit.challenges.ui:
//            IncomingInvitationFragment_, IncomingInvitationFragment

public static class <init>
{

    private Bundle a;

    public IncomingInvitationFragment a()
    {
        IncomingInvitationFragment_ incominginvitationfragment_ = new IncomingInvitationFragment_();
        incominginvitationfragment_.setArguments(a);
        return incominginvitationfragment_;
    }

    public a a(String s)
    {
        a.putString("challengeId", s);
        return this;
    }

    private ()
    {
        a = new Bundle();
    }

    a(a a1)
    {
        this();
    }
}
