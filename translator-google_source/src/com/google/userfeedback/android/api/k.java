// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.os.Binder;

// Referenced classes of package com.google.userfeedback.android.api:
//            SendUserFeedbackService

public final class k extends Binder
{

    final SendUserFeedbackService a;

    public k(SendUserFeedbackService senduserfeedbackservice)
    {
        a = senduserfeedbackservice;
        super();
    }
}
