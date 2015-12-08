// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.feedback;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.mj;

// Referenced classes of package com.google.android.gms.feedback:
//            Feedback, FeedbackOptions

static final class Client extends Client
{

    final FeedbackOptions afP;

    private void a(mj mj1)
    {
        N(mj1.a(afP));
    }

    protected final volatile void a(com.google.android.gms.common.api.P p)
        throws RemoteException
    {
        a((mj)p);
    }

    Client(GoogleApiClient googleapiclient, FeedbackOptions feedbackoptions)
    {
        afP = feedbackoptions;
        super(googleapiclient);
    }
}
